package com.mdujovic17.horizontalpanes.data.loot;

import com.mdujovic17.horizontalpanes.registry.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredHolder;

import java.util.Set;

public class HorizontalPanesBlockLoot extends BlockLootSubProvider {

    public HorizontalPanesBlockLoot(HolderLookup.Provider lookupProvider) {
        super(Set.of(), FeatureFlags.DEFAULT_FLAGS, lookupProvider);
    }

    @Override
    protected void generate() {
        for (DeferredHolder<Block, ? extends Block> b : ModBlocks.BLOCKS.getEntries().stream().toList()) {
            dropSelf(b.get());
        }
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(e -> (Block) e.get()).toList();
    }
}
