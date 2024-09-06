package com.mdujovic17.horizontalpanes.content.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class TintedHorizontalPane extends HorizontalPaneSlab {

    public TintedHorizontalPane(Properties properties) {
        super(properties);
    }

    @Override
    public boolean propagatesSkylightDown(@NotNull BlockState state, @NotNull BlockGetter world, @NotNull BlockPos pos) {
        return false;
    }

    @Override
    public int getLightBlock(@NotNull BlockState state, BlockGetter world, @NotNull BlockPos pos) {
        return world.getMaxLightLevel();
    }
}
