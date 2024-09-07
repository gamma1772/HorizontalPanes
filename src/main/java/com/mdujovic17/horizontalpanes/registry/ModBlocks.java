/*
 * MIT License
 *
 * Copyright (c) 2021 Marko Dujović
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 * */
package com.mdujovic17.horizontalpanes.registry;

import com.mdujovic17.horizontalpanes.HorizontalPanes;
import com.mdujovic17.horizontalpanes.content.block.HorizontalPaneSlab;
import com.mdujovic17.horizontalpanes.content.block.TintedHorizontalPane;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks
{
    //Deferred Registry for Blocks
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(HorizontalPanes.MODID);

    public static final DeferredBlock<Block> GLASS_PANE                = BLOCKS.register("horizontal_glass_pane", () -> createHorizontalPane(MapColor.NONE));

    public static final DeferredBlock<Block> WHITE_STAINED_PANE        = BLOCKS.register("horizontal_stained_white_pane",      () -> createHorizontalPane(MapColor.SNOW));
    public static final DeferredBlock<Block> RED_STAINED_PANE          = BLOCKS.register("horizontal_stained_red_pane",        () -> createHorizontalPane(MapColor.COLOR_RED));
    public static final DeferredBlock<Block> ORANGE_STAINED_PANE       = BLOCKS.register("horizontal_stained_orange_pane",     () -> createHorizontalPane(MapColor.COLOR_ORANGE));
    public static final DeferredBlock<Block> PINK_STAINED_PANE         = BLOCKS.register("horizontal_stained_pink_pane",       () -> createHorizontalPane(MapColor.COLOR_PINK));
    public static final DeferredBlock<Block> YELLOW_STAINED_PANE       = BLOCKS.register("horizontal_stained_yellow_pane",     () -> createHorizontalPane(MapColor.COLOR_YELLOW));
    public static final DeferredBlock<Block> LIME_STAINED_PANE         = BLOCKS.register("horizontal_stained_lime_pane",       () -> createHorizontalPane(MapColor.COLOR_LIGHT_GREEN));
    public static final DeferredBlock<Block> GREEN_STAINED_PANE        = BLOCKS.register("horizontal_stained_green_pane",      () -> createHorizontalPane(MapColor.COLOR_GREEN));
    public static final DeferredBlock<Block> LIGHT_BLUE_STAINED_PANE   = BLOCKS.register("horizontal_stained_light_blue_pane", () -> createHorizontalPane(MapColor.COLOR_LIGHT_BLUE));
    public static final DeferredBlock<Block> CYAN_STAINED_PANE         = BLOCKS.register("horizontal_stained_cyan_pane",       () -> createHorizontalPane(MapColor.COLOR_CYAN));
    public static final DeferredBlock<Block> BLUE_STAINED_PANE         = BLOCKS.register("horizontal_stained_blue_pane",       () -> createHorizontalPane(MapColor.COLOR_BLUE));
    public static final DeferredBlock<Block> MAGENTA_STAINED_PANE      = BLOCKS.register("horizontal_stained_magenta_pane",    () -> createHorizontalPane(MapColor.COLOR_MAGENTA));
    public static final DeferredBlock<Block> PURPLE_STAINED_PANE       = BLOCKS.register("horizontal_stained_purple_pane",     () -> createHorizontalPane(MapColor.COLOR_PURPLE));
    public static final DeferredBlock<Block> BROWN_STAINED_PANE        = BLOCKS.register("horizontal_stained_brown_pane",      () -> createHorizontalPane(MapColor.COLOR_BROWN));
    public static final DeferredBlock<Block> GRAY_STAINED_PANE         = BLOCKS.register("horizontal_stained_gray_pane",       () -> createHorizontalPane(MapColor.COLOR_GRAY));
    public static final DeferredBlock<Block> LIGHT_GRAY_STAINED_PANE   = BLOCKS.register("horizontal_stained_light_gray_pane", () -> createHorizontalPane(MapColor.COLOR_LIGHT_GRAY));
    public static final DeferredBlock<Block> BLACK_STAINED_PANE        = BLOCKS.register("horizontal_stained_black_pane",      () -> createHorizontalPane(MapColor.COLOR_BLACK));

    public static final DeferredBlock<Block> TINTED_GLASS_PANE = BLOCKS.register("horizontal_tinted_glass_pane", ModBlocks::createTintedPane);

    private static HorizontalPaneSlab createTintedPane() {
        return new TintedHorizontalPane(BlockBehaviour.Properties.of()
                .sound(SoundType.GLASS)
                .mapColor(MapColor.COLOR_BLACK)
                .strength(0.3f, 0.3f)
                .noOcclusion()
                .isViewBlocking(ModBlocks::never)
                .isSuffocating(ModBlocks::never)
                .isValidSpawn(ModBlocks::never)
                .isRedstoneConductor(ModBlocks::never));
    }

    private static HorizontalPaneSlab createHorizontalPane(MapColor color) {
        return new HorizontalPaneSlab(BlockBehaviour.Properties.of()
                .sound(SoundType.GLASS)
                .mapColor(color)
                .strength(0.3f, 0.3f)
                .noOcclusion()
                .isViewBlocking(ModBlocks::never)
                .isSuffocating(ModBlocks::never)
                .isValidSpawn(ModBlocks::never)
                .isRedstoneConductor(ModBlocks::never));
    }

//    private static HorizontalPaneSlab createHorizontalPane(Material material, MaterialColor color, SoundType sound) {
//        return new HorizontalPaneSlab(BlockBehaviour.Properties.of(material, color).noOcclusion().isViewBlocking(ModBlocks::never).isSuffocating(ModBlocks::never).isValidSpawn(ModBlocks::never).isRedstoneConductor(ModBlocks::never).strength(0.3f, 0.3f).sound(sound));
//    }

    private static Boolean never(BlockState blockState, BlockGetter blockView, BlockPos blockPos, EntityType<?> entityType) { return false; }
    private static boolean never(BlockState blockState, BlockGetter blockView, BlockPos blockPos) { return false; }

    private static Boolean always(BlockState blockState, BlockGetter blockView, BlockPos blockPos, EntityType<?> entityType) { return true; }
    private static boolean always(BlockState blockState, BlockGetter blockView, BlockPos blockPos) { return true; }
}