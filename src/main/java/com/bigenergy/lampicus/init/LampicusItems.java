package com.bigenergy.lampicus.init;

import com.bigenergy.lampicus.Lampicus;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class LampicusItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Lampicus.MODID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
