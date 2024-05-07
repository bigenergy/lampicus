package com.bigenergy.lampicus.init;

import com.bigenergy.lampicus.Lampicus;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class LampicusItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Lampicus.MODID);

    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
