package com.bigenergy.lampicus.tab;

import com.bigenergy.lampicus.Lampicus;
import com.bigenergy.lampicus.init.LampicusBlocks;
import com.bigenergy.lampicus.init.LampicusItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.RegisterEvent;

public class LampicusCreativeTab {
    public static final ResourceKey<CreativeModeTab> LAMPICUS = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation("lampicus", Lampicus.MODID));

    public static void registerTab(RegisterEvent event) {
        event.register(Registries.CREATIVE_MODE_TAB, helper -> {
            helper.register(LAMPICUS, CreativeModeTab.builder().displayItems((flags, output) -> LampicusItems.ITEMS.getEntries().forEach(o -> output.accept(o.get()))).title(Component.translatable("itemGroup.lampicus")).icon(() -> { return new ItemStack(LampicusBlocks.GLOWSTONE_DIAMOND.get()); }).build());

        });
    }
}
