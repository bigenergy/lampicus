package com.bigenergy.lampicus.init;

import com.bigenergy.lampicus.Lampicus;
import com.bigenergy.lampicus.block.LampicusLightBlock;
import com.bigenergy.lampicus.block.InvertedLampBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class LampicusBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Lampicus.MODID);

    // glasses
    public static final RegistryObject<Block> GLOWSTONE_DIAMOND = registerBlock("glowstone_diamond", () ->
            new LampicusLightBlock(glowstoneProp()));
    public static final RegistryObject<Block> GLOWSTONE_PURPLE = registerBlock("glowstone_purple", () ->
            new LampicusLightBlock(glowstoneProp()));
    public static final RegistryObject<Block> GLOWSTONE_WHITE = registerBlock("glowstone_white", () ->
            new LampicusLightBlock(glowstoneProp()));

    public static final RegistryObject<Block> REDSTONE_LAMP_INVERTED = registerBlock("redstone_lamp_inverted", () ->
            new InvertedLampBlock(Block.Properties.copy(Blocks.REDSTONE_LAMP)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return LampicusItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    private static Block.Properties glowstoneProp() {
        return Block.Properties.copy(Blocks.GLOWSTONE);
    }
}
