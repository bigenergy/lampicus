package com.bigenergy.lampicus.init;

import com.bigenergy.lampicus.Lampicus;
import com.bigenergy.lampicus.block.LampicusLightBlock;
import com.bigenergy.lampicus.block.InvertedLampBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class LampicusBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Lampicus.MODID);


    // lamps
    public static final DeferredBlock<Block> GLOWSTONE_DIAMOND = registerBlock("glowstone_diamond", () ->
            new LampicusLightBlock(glowstoneProp()));
    public static final DeferredBlock<Block> GLOWSTONE_PURPLE = registerBlock("glowstone_purple", () ->
            new LampicusLightBlock(glowstoneProp()));
    public static final DeferredBlock<Block> GLOWSTONE_WHITE = registerBlock("glowstone_white", () ->
            new LampicusLightBlock(glowstoneProp()));

    // vanilla lamps
    public static final DeferredBlock<Block> REDSTONE_LAMP_INVERTED = registerBlock("redstone_lamp_inverted", () ->
            new InvertedLampBlock(Block.Properties.ofFullCopy(Blocks.REDSTONE_LAMP)));

    // colored wool lamps
    public static final DeferredBlock<Block> COLORLIGHT_BLACK = registerBlock("colorlight_black", () ->
            new LampicusLightBlock(glowstoneProp()));
    public static final DeferredBlock<Block> COLORLIGHT_BLUE = registerBlock("colorlight_blue", () ->
            new LampicusLightBlock(glowstoneProp()));
    public static final DeferredBlock<Block> COLORLIGHT_BROWN = registerBlock("colorlight_brown", () ->
            new LampicusLightBlock(glowstoneProp()));
    public static final DeferredBlock<Block> COLORLIGHT_CYAN = registerBlock("colorlight_cyan", () ->
            new LampicusLightBlock(glowstoneProp()));
    public static final DeferredBlock<Block> COLORLIGHT_GREEN = registerBlock("colorlight_green", () ->
            new LampicusLightBlock(glowstoneProp()));
    public static final DeferredBlock<Block> COLORLIGHT_GRAY = registerBlock("colorlight_gray", () ->
            new LampicusLightBlock(glowstoneProp()));
    public static final DeferredBlock<Block> COLORLIGHT_LIGHTBLUE = registerBlock("colorlight_lightblue", () ->
            new LampicusLightBlock(glowstoneProp()));
    public static final DeferredBlock<Block> COLORLIGHT_LIGHTGRAY = registerBlock("colorlight_lightgray", () ->
            new LampicusLightBlock(glowstoneProp()));
    public static final DeferredBlock<Block> COLORLIGHT_LIME = registerBlock("colorlight_lime", () ->
            new LampicusLightBlock(glowstoneProp()));
    public static final DeferredBlock<Block> COLORLIGHT_MAGENTA = registerBlock("colorlight_magenta", () ->
            new LampicusLightBlock(glowstoneProp()));
    public static final DeferredBlock<Block> COLORLIGHT_ORANGE = registerBlock("colorlight_orange", () ->
            new LampicusLightBlock(glowstoneProp()));
    public static final DeferredBlock<Block> COLORLIGHT_PINK = registerBlock("colorlight_pink", () ->
            new LampicusLightBlock(glowstoneProp()));
    public static final DeferredBlock<Block> COLORLIGHT_PURPLE = registerBlock("colorlight_purple", () ->
            new LampicusLightBlock(glowstoneProp()));
    public static final DeferredBlock<Block> COLORLIGHT_RED = registerBlock("colorlight_red", () ->
            new LampicusLightBlock(glowstoneProp()));
    public static final DeferredBlock<Block> COLORLIGHT_WHITE = registerBlock("colorlight_white", () ->
            new LampicusLightBlock(glowstoneProp()));
    public static final DeferredBlock<Block> COLORLIGHT_YELLOW = registerBlock("colorlight_yellow", () ->
            new LampicusLightBlock(glowstoneProp()));


    private static <R, T> DeferredBlock<Block> registerBlock(
            String name,
            Supplier<Block> block
    ) {
        DeferredBlock<Block> toReturn = BLOCKS.register(
                name,
                block
        );
        LampicusItems.ITEMS.registerSimpleBlockItem(toReturn);
        return toReturn;
    }



    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    private static Block.Properties glowstoneProp() {
        return Block.Properties.ofFullCopy(Blocks.GLOWSTONE);
    }
}
