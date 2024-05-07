package com.bigenergy.lampicus;

import com.bigenergy.lampicus.init.LampicusBlocks;
import com.bigenergy.lampicus.init.LampicusItems;
import com.bigenergy.lampicus.tab.LampicusCreativeTab;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Lampicus.MODID)
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = Lampicus.MODID)
public class Lampicus {

    public static final String MODID = "lampicus";

    public static final Logger LOGGER = LogManager.getLogger();

    public Lampicus() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        LampicusBlocks.register(modEventBus);
        LampicusItems.register(modEventBus);

        modEventBus.addListener(LampicusCreativeTab::registerTab);

        MinecraftForge.EVENT_BUS.register(this);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        LOGGER.info("Starting Lampicus...");
    }
}
