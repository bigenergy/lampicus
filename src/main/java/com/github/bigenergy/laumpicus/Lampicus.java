package com.github.bigenergy.laumpicus;

import com.github.bigenergy.laumpicus.init.LampicusBlocks;
import com.github.bigenergy.laumpicus.init.LampicusItems;
import net.minecraft.world.item.*;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.ArrayList;
import java.util.Collection;

@Mod(Lampicus.MODID)
public class Lampicus {
    public static final String MODID = "lampicus";
    public static final Logger LOGGER = LogUtils.getLogger();
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);


    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> LAMPICUS_TAB = CREATIVE_MODE_TABS.register("lampicus_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.lampicus"))
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> new ItemStack(LampicusBlocks.GLOWSTONE_DIAMOND.get()))
            .displayItems((parameters, output) -> {
                output.acceptAll(buildCreativeTabList());
            }).build()
    );

    private static Collection<ItemStack> buildCreativeTabList() {
        Collection<ItemStack> tabEntries = new ArrayList<ItemStack>();
        LampicusItems.ITEMS
                .getEntries()
                .forEach(item -> tabEntries.add(new ItemStack(item.get())));
        return tabEntries;
    }

    public Lampicus(IEventBus modEventBus, ModContainer modContainer) {
        LampicusBlocks.register(modEventBus);
        LampicusItems.register(modEventBus);

        CREATIVE_MODE_TABS.register(modEventBus);

        NeoForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
        LOGGER.info("Starting Lampicus...");
    }

}
