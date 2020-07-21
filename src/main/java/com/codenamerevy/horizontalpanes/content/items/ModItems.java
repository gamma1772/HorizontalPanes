package com.codenamerevy.horizontalpanes.content.items;

import com.codenamerevy.horizontalpanes.HorizontalPanes;
import com.codenamerevy.horizontalpanes.content.blocks.ModBlocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems
{
    //Deferred Registry for Items
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, HorizontalPanes.MODID);

    public static final RegistryObject<Item> HORIZONTAL_PANE            = ITEMS.register("horizontal_pane",                       () -> new BlockItem(ModBlocks.HORIZONTAL_PANE.get(),            new Item.Properties()));

    public static final RegistryObject<Item> GLASS_PANE                 = ITEMS.register("horizontal_glass_pane",                            () -> new BlockItem(ModBlocks.HORIZONTAL_PANE.get(),            new Item.Properties().group(ItemGroup.DECORATIONS)));

    public static final RegistryObject<Item> WHITE_STAINED_PANE         = ITEMS.register("horizontal_stained_white_pane",         () -> new BlockItem(ModBlocks.WHITE_STAINED_PANE.get(),         new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> RED_STAINED_PANE           = ITEMS.register("horizontal_stained_red_pane",           () -> new BlockItem(ModBlocks.RED_STAINED_PANE.get(),           new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> ORANGE_STAINED_PANE        = ITEMS.register("horizontal_stained_orange_pane",        () -> new BlockItem(ModBlocks.ORANGE_STAINED_PANE.get(),        new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> PINK_STAINED_PANE          = ITEMS.register("horizontal_stained_pink_pane",          () -> new BlockItem(ModBlocks.PINK_STAINED_PANE.get(),          new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> YELLOW_STAINED_PANE        = ITEMS.register("horizontal_stained_yellow_pane",        () -> new BlockItem(ModBlocks.YELLOW_STAINED_PANE.get(),        new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> LIME_STAINED_PANE          = ITEMS.register("horizontal_stained_lime_pane",          () -> new BlockItem(ModBlocks.LIME_STAINED_PANE.get(),          new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> GREEN_STAINED_PANE         = ITEMS.register("horizontal_stained_green_pane",         () -> new BlockItem(ModBlocks.GREEN_STAINED_PANE.get(),         new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> LIGHT_BLUE_STAINED_PANE    = ITEMS.register("horizontal_stained_light_blue_pane",    () -> new BlockItem(ModBlocks.LIGHT_BLUE_STAINED_PANE.get(),    new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> CYAN_STAINED_PANE          = ITEMS.register("horizontal_stained_cyan_pane",          () -> new BlockItem(ModBlocks.CYAN_STAINED_PANE.get(),          new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> BLUE_STAINED_PANE          = ITEMS.register("horizontal_stained_blue_pane",          () -> new BlockItem(ModBlocks.BLUE_STAINED_PANE.get(),          new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> MAGENTA_STAINED_PANE       = ITEMS.register("horizontal_stained_magenta_pane",       () -> new BlockItem(ModBlocks.MAGENTA_STAINED_PANE.get(),       new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> PURPLE_STAINED_PANE        = ITEMS.register("horizontal_stained_purple_pane",        () -> new BlockItem(ModBlocks.PURPLE_STAINED_PANE.get(),        new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> BROWN_STAINED_PANE         = ITEMS.register("horizontal_stained_brown_pane",         () -> new BlockItem(ModBlocks.BROWN_STAINED_PANE.get(),         new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> GRAY_STAINED_PANE          = ITEMS.register("horizontal_stained_gray_pane",          () -> new BlockItem(ModBlocks.GRAY_STAINED_PANE.get(),          new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> LIGHT_GRAY_STAINED_PANE    = ITEMS.register("horizontal_stained_light_gray_pane",    () -> new BlockItem(ModBlocks.LIGHT_GRAY_STAINED_PANE.get(),    new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> BLACK_STAINED_PANE         = ITEMS.register("horizontal_stained_black_pane",         () -> new BlockItem(ModBlocks.BLACK_STAINED_PANE.get(),         new Item.Properties().group(ItemGroup.DECORATIONS)));

}
