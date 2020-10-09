package com.codenamerevy.horizontalpanes.content.blocks;

import com.codenamerevy.horizontalpanes.HorizontalPanes;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.DyeColor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks
{
    //Deferred Registry for Blocks
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, HorizontalPanes.MODID);

    public static final RegistryObject<Block> HORIZONTAL_PANE           = BLOCKS.register("horizontal_pane",                    () -> new HorizontalPaneBlock(Block.Properties.create(Material.GLASS)));

    public static final RegistryObject<Block> GLASS_PANE                = BLOCKS.register("horizontal_glass_pane",              () -> new HorizontalPaneBlock(Block.Properties.create(Material.GLASS)));

    public static final RegistryObject<Block> WHITE_STAINED_PANE        = BLOCKS.register("horizontal_stained_white_pane",      () -> new HorizontalStainedPaneBlock(DyeColor.WHITE, Block.Properties.create(Material.GLASS, MaterialColor.SNOW)));
    public static final RegistryObject<Block> RED_STAINED_PANE          = BLOCKS.register("horizontal_stained_red_pane",        () -> new HorizontalStainedPaneBlock(DyeColor.RED, Block.Properties.create(Material.GLASS, MaterialColor.RED)));
    public static final RegistryObject<Block> ORANGE_STAINED_PANE       = BLOCKS.register("horizontal_stained_orange_pane",     () -> new HorizontalStainedPaneBlock(DyeColor.ORANGE, Block.Properties.create(Material.GLASS, MaterialColor.ADOBE)));
    public static final RegistryObject<Block> PINK_STAINED_PANE         = BLOCKS.register("horizontal_stained_pink_pane",       () -> new HorizontalStainedPaneBlock(DyeColor.PINK, Block.Properties.create(Material.GLASS, MaterialColor.PINK)));
    public static final RegistryObject<Block> YELLOW_STAINED_PANE       = BLOCKS.register("horizontal_stained_yellow_pane",     () -> new HorizontalStainedPaneBlock(DyeColor.YELLOW, Block.Properties.create(Material.GLASS, MaterialColor.YELLOW)));
    public static final RegistryObject<Block> LIME_STAINED_PANE         = BLOCKS.register("horizontal_stained_lime_pane",       () -> new HorizontalStainedPaneBlock(DyeColor.LIME, Block.Properties.create(Material.GLASS, MaterialColor.LIME)));
    public static final RegistryObject<Block> GREEN_STAINED_PANE        = BLOCKS.register("horizontal_stained_green_pane",      () -> new HorizontalStainedPaneBlock(DyeColor.GREEN, Block.Properties.create(Material.GLASS, MaterialColor.GREEN)));
    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_PANE   = BLOCKS.register("horizontal_stained_light_blue_pane", () -> new HorizontalStainedPaneBlock(DyeColor.LIGHT_BLUE, Block.Properties.create(Material.GLASS, MaterialColor.LIGHT_BLUE)));
    public static final RegistryObject<Block> CYAN_STAINED_PANE         = BLOCKS.register("horizontal_stained_cyan_pane",       () -> new HorizontalStainedPaneBlock(DyeColor.CYAN, Block.Properties.create(Material.GLASS, MaterialColor.CYAN)));
    public static final RegistryObject<Block> BLUE_STAINED_PANE         = BLOCKS.register("horizontal_stained_blue_pane",       () -> new HorizontalStainedPaneBlock(DyeColor.BLUE, Block.Properties.create(Material.GLASS, MaterialColor.BLUE)));
    public static final RegistryObject<Block> MAGENTA_STAINED_PANE      = BLOCKS.register("horizontal_stained_magenta_pane",    () -> new HorizontalStainedPaneBlock(DyeColor.MAGENTA, Block.Properties.create(Material.GLASS, MaterialColor.MAGENTA)));
    public static final RegistryObject<Block> PURPLE_STAINED_PANE       = BLOCKS.register("horizontal_stained_purple_pane",     () -> new HorizontalStainedPaneBlock(DyeColor.PURPLE, Block.Properties.create(Material.GLASS, MaterialColor.PURPLE)));
    public static final RegistryObject<Block> BROWN_STAINED_PANE        = BLOCKS.register("horizontal_stained_brown_pane",      () -> new HorizontalStainedPaneBlock(DyeColor.BROWN, Block.Properties.create(Material.GLASS, MaterialColor.BROWN)));
    public static final RegistryObject<Block> GRAY_STAINED_PANE         = BLOCKS.register("horizontal_stained_gray_pane",       () -> new HorizontalStainedPaneBlock(DyeColor.GRAY, Block.Properties.create(Material.GLASS, MaterialColor.GRAY)));
    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_PANE   = BLOCKS.register("horizontal_stained_light_gray_pane", () -> new HorizontalStainedPaneBlock(DyeColor.LIGHT_GRAY, Block.Properties.create(Material.GLASS, MaterialColor.LIGHT_GRAY)));
    public static final RegistryObject<Block> BLACK_STAINED_PANE        = BLOCKS.register("horizontal_stained_black_pane",      () -> new HorizontalStainedPaneBlock(DyeColor.BLACK, Block.Properties.create(Material.GLASS, MaterialColor.BLACK)));

}