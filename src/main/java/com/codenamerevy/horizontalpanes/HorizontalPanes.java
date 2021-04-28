package com.codenamerevy.horizontalpanes;

import com.codenamerevy.horizontalpanes.content.blocks.ModBlocks;
import com.codenamerevy.horizontalpanes.content.items.ModItems;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
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

    private void commonSetup(final FMLCommonSetupEvent common)
    {

    }
    private void clientSetup(final FMLClientSetupEvent client)
    {

        //Rendering for blocks occurs on the Client side.
        //RenderTypeLookup.setRenderLayer(ModBlocks.HORIZONTAL_PANE.get(), RenderType.getCutout());

        RenderTypeLookup.setRenderLayer(ModBlocks.GLASS_PANE.get(), RenderType.getCutout());

        RenderTypeLookup.setRenderLayer(ModBlocks.WHITE_STAINED_PANE.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.RED_STAINED_PANE.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.ORANGE_STAINED_PANE.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.PINK_STAINED_PANE.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.YELLOW_STAINED_PANE.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIME_STAINED_PANE.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.GREEN_STAINED_PANE.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_BLUE_STAINED_PANE.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.CYAN_STAINED_PANE.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLUE_STAINED_PANE.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.MAGENTA_STAINED_PANE.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.PURPLE_STAINED_PANE.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.BROWN_STAINED_PANE.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.GRAY_STAINED_PANE.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.LIGHT_GRAY_STAINED_PANE.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLACK_STAINED_PANE.get(), RenderType.getTranslucent());
    }
}
