package com.github.bigenergy.laumpicus.init;

import com.github.bigenergy.laumpicus.Lampicus;
import com.github.bigenergy.laumpicus.block.InvertedLampBlock;
import com.github.bigenergy.laumpicus.block.LampicusLanternBlock;
import com.github.bigenergy.laumpicus.block.LampicusLightBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import net.minecraft.world.level.block.state.BlockBehaviour;
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

    public static final DeferredBlock<Block> RED_LANTERN = registerBlock("red_lantern",
            () -> new LampicusLanternBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_LANTERN)));
    public static final DeferredBlock<Block> YELLOW_LANTERN = registerBlock("yellow_lantern",
            () -> new LampicusLanternBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_LANTERN)));
    public static final DeferredBlock<Block> GREEN_LANTERN = registerBlock("green_lantern",
            () -> new LampicusLanternBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_LANTERN)));
    public static final DeferredBlock<Block> ORANGE_LANTERN = registerBlock("orange_lantern",
            () -> new LampicusLanternBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_LANTERN)));
    public static final DeferredBlock<Block> LIME_LANTERN = registerBlock("lime_lantern",
            () -> new LampicusLanternBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_LANTERN)));
    public static final DeferredBlock<Block> CYAN_LANTERN = registerBlock("cyan_lantern",
            () -> new LampicusLanternBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_LANTERN)));
    public static final DeferredBlock<Block> BLUE_LANTERN = registerBlock("blue_lantern",
            () -> new LampicusLanternBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_LANTERN)));
    public static final DeferredBlock<Block> LIGHT_BLUE_LANTERN = registerBlock("light_blue_lantern",
            () -> new LampicusLanternBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_LANTERN)));
    public static final DeferredBlock<Block> PURPLE_LANTERN = registerBlock("purple_lantern",
            () -> new LampicusLanternBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_LANTERN)));
    public static final DeferredBlock<Block> MAGENTA_LANTERN = registerBlock("magenta_lantern",
            () -> new LampicusLanternBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_LANTERN)));
    public static final DeferredBlock<Block> PINK_LANTERN = registerBlock("pink_lantern",
            () -> new LampicusLanternBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_LANTERN)));
    public static final DeferredBlock<Block> BROWN_LANTERN = registerBlock("brown_lantern",
            () -> new LampicusLanternBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_LANTERN)));
    public static final DeferredBlock<Block> BLACK_LANTERN = registerBlock("black_lantern",
            () -> new LampicusLanternBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_LANTERN)));
    public static final DeferredBlock<Block> DARK_GRAY_LANTERN = registerBlock("dark_gray_lantern",
            () -> new LampicusLanternBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_LANTERN)));
    public static final DeferredBlock<Block> LIGHT_GRAY_LANTERN = registerBlock("light_gray_lantern",
            () -> new LampicusLanternBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_LANTERN)));
    public static final DeferredBlock<Block> WHITE = registerBlock("white_lantern",
            () -> new LampicusLanternBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_LANTERN)));

    public static final DeferredBlock<Block> TINTED_RED_LANTERN = registerBlock("tinted_red_lantern", () -> new LampicusLanternBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_LANTERN)));
    public static final DeferredBlock<Block> TINTED_YELLOW_LANTERN = registerBlock("tinted_yellow_lantern", () -> new LampicusLanternBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_LANTERN)));
    public static final DeferredBlock<Block> TINTED_GREEN_LANTERN = registerBlock("tinted_green_lantern", () -> new LampicusLanternBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_LANTERN)));
    public static final DeferredBlock<Block> TINTED_ORANGE_LANTERN = registerBlock("tinted_orange_lantern", () -> new LampicusLanternBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_LANTERN)));
    public static final DeferredBlock<Block> TINTED_LIME_LANTERN = registerBlock("tinted_lime_lantern", () -> new LampicusLanternBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_LANTERN)));
    public static final DeferredBlock<Block> TINTED_CYAN_LANTERN = registerBlock("tinted_cyan_lantern", () -> new LampicusLanternBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_LANTERN)));
    public static final DeferredBlock<Block> TINTED_BLUE_LANTERN = registerBlock("tinted_blue_lantern", () -> new LampicusLanternBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_LANTERN)));
    public static final DeferredBlock<Block> TINTED_LIGHT_BLUE_LANTERN = registerBlock("tinted_light_blue_lantern", () -> new LampicusLanternBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_LANTERN)));
    public static final DeferredBlock<Block> TINTED_PURPLE_LANTERN = registerBlock("tinted_purple_lantern", () -> new LampicusLanternBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_LANTERN)));
    public static final DeferredBlock<Block> TINTED_MAGENTA_LANTERN = registerBlock("tinted_magenta_lantern", () -> new LampicusLanternBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_LANTERN)));
    public static final DeferredBlock<Block> TINTED_PINK_LANTERN = registerBlock("tinted_pink_lantern", () -> new LampicusLanternBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_LANTERN)));
    public static final DeferredBlock<Block> TINTED_BROWN_LANTERN = registerBlock("tinted_brown_lantern", () -> new LampicusLanternBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_LANTERN)));
    public static final DeferredBlock<Block> TINTED_BLACK_LANTERN = registerBlock("tinted_black_lantern", () -> new LampicusLanternBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_LANTERN)));
    public static final DeferredBlock<Block> TINTED_DARK_GRAY_LANTERN = registerBlock("tinted_dark_gray_lantern", () -> new LampicusLanternBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_LANTERN)));
    public static final DeferredBlock<Block> TINTED_LIGHT_GRAY_LANTERN = registerBlock("tinted_light_gray_lantern", () -> new LampicusLanternBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_LANTERN)));
    public static final DeferredBlock<Block> TINTED_WHITE = registerBlock("tinted_white_lantern", () -> new LampicusLanternBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_LANTERN)));


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
