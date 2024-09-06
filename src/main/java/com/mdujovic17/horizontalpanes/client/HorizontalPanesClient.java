package com.mdujovic17.horizontalpanes.client;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.common.NeoForge;

import static com.mdujovic17.horizontalpanes.HorizontalPanes.MODID;

@EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HorizontalPanesClient {

    public HorizontalPanesClient() {
        NeoForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public static void clientSetup(final FMLClientSetupEvent event) {
    }
}
