package com.bigenergy.lampicus.tab;

import com.bigenergy.lampicus.Lampicus;
import com.bigenergy.lampicus.init.LampicusBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class LampicusCreativeTab {

    public static final CreativeModeTab LAMPICUS = new CreativeModeTab(Lampicus.MODID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(LampicusBlocks.GLOWSTONE_DIAMOND.get());
        }
    };
}
