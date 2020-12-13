package com.codenamerevy.horizontalpanes;

import com.codenamerevy.horizontalpanes.content.blocks.ModBlocks;
import com.codenamerevy.horizontalpanes.content.items.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("horizontalpanes")
public class HorizontalPanes
{
    public static final String MODID = "horizontalpanes";

    public HorizontalPanes()
    {
        //final ModLoadingContext modLoadingContext = ModLoadingContext.get();
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::clientSetup);

        //Registering deferred registers
        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent commonSetupEvent)
    {

    }

    private void clientSetup(final FMLClientSetupEvent clientSetupEvent)
    {

    }
}
