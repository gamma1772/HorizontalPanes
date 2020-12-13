package com.codenamerevy.horizontalpanes.content.blocks;

import net.minecraft.block.*;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.DyeColor;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class HorizontalStainedPaneBlock extends StainedGlassBlock implements IWaterLoggable
{
    private final DyeColor color;

    private static final double nodeX = 0.0D, nodeY = 6.0D, nodeZ = 0.0D;
    private static final double extX = 16.0D, extY = 8.0D, extZ = 16.0D;

    private static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    private static final VoxelShape SHAPE = Block.makeCuboidShape(nodeX, nodeY, nodeZ, extX, extY, extZ);
    //private final VoxelShape SHAPE_TOP = Block.makeCuboidShape(nodeX, nodeY + 8D, nodeZ, extX, extY + 8D, extZ);

    public HorizontalStainedPaneBlock(DyeColor color, Block.Properties properties) {
        super(color, properties.hardnessAndResistance(0.3F, 0.3F).sound(SoundType.GLASS).variableOpacity()); //notSolid for rendering and hardnessAndResistance to match the glass block.
        this.setDefaultState(this.getStateContainer().getBaseState().with(WATERLOGGED, false));        this.color = color;
    }

    @OnlyIn(Dist.CLIENT)
    public boolean isSideInvisible(BlockState state, BlockState adjacentBlockState, Direction side) {
        return adjacentBlockState.getBlock() == this ? true : super.isSideInvisible(state, adjacentBlockState, side);
    }

    //Returns which side of the block will be invisible and when.
    public DyeColor getColor() {
        return this.color;
    }

    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }

    //Returns the value of light that can pass through the block???
    public float getAmbientOcclusionLightValue(BlockState state, IBlockReader worldIn, BlockPos pos) {
        return 1.0F;
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder)
    {
        builder.add(WATERLOGGED);
    }

    //Returns the type of a fluid that's waterlogging the block.
    @Override
    public FluidState getFluidState(BlockState state)
    {
        return (FluidState) (state.get(WATERLOGGED) ? Fluids.WATER.getStillFluidState(false) : super.getFluidState(state));
    }

    //This is used to update the block state. In this situation updates the block if it's placed in water, or water is placed 'in' the block.
    @Override
    public BlockState updatePostPlacement(BlockState state, Direction facing, BlockState facingState, IWorld world, BlockPos currentPos, BlockPos facingPos)
    {
        if (state.get(WATERLOGGED))
        {
            world.getPendingFluidTicks().scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }
        return super.updatePostPlacement(state, facing, facingState, world, currentPos, facingPos);
    }

    //This forms a block shape from the given values.
    @Override
    public VoxelShape getShape(BlockState state, IBlockReader world, BlockPos pos, ISelectionContext context)
    {
        return SHAPE;
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context)
    {
        FluidState fluidState = (FluidState) context.getWorld().getFluidState(context.getPos());
        return this.getDefaultState().with(WATERLOGGED, Boolean.valueOf(fluidState.isTagged(FluidTags.WATER) && fluidState.getLevel() == 8));
    }


    //This allows the block to be moved by pistons.
    @Override
    public boolean allowsMovement(BlockState state, IBlockReader world, BlockPos pos, PathType path)
    {
        return true;
    }
}
