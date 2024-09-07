package com.mdujovic17.horizontalpanes.data;

import com.mdujovic17.horizontalpanes.HorizontalPanes;
import com.mdujovic17.horizontalpanes.data.provider.HorizontalPanesLootTableProvider;
import com.mdujovic17.horizontalpanes.data.provider.HorizontalPanesRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

import static com.mdujovic17.horizontalpanes.HorizontalPanes.MODID;

@EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD)
public class HorizontalPanesDataGenerator {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        ExistingFileHelper helper = event.getExistingFileHelper();

        HorizontalPanes.LOGGER.info("Registering Data Providers...");
        generator.addProvider(event.includeServer(), new HorizontalPanesRecipeProvider(output, lookupProvider));
        generator.addProvider(event.includeServer(), new HorizontalPanesLootTableProvider(output, lookupProvider));
    }
}
