package com.gamma1772.horizontalpanes.content.items;
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
import com.gamma1772.horizontalpanes.HorizontalPanes;
import com.gamma1772.horizontalpanes.content.blocks.ModBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems
{
    //Deferred Registry for Items
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, HorizontalPanes.MODID);

    //public static final RegistryObject<Item> HORIZONTAL_PANE            = ITEMS.register("horizontal_pane",                       () -> new BlockItem(ModBlocks.HORIZONTAL_PANE.get(),            new Item.Properties()));

    public static final RegistryObject<Item> GLASS_PANE                 = ITEMS.register("horizontal_glass_pane",                            () -> new BlockItem(ModBlocks.GLASS_PANE.get(),            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));

    public static final RegistryObject<Item> WHITE_STAINED_PANE         = ITEMS.register("horizontal_stained_white_pane",         () -> new BlockItem(ModBlocks.WHITE_STAINED_PANE.get(),         new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> RED_STAINED_PANE           = ITEMS.register("horizontal_stained_red_pane",           () -> new BlockItem(ModBlocks.RED_STAINED_PANE.get(),           new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> ORANGE_STAINED_PANE        = ITEMS.register("horizontal_stained_orange_pane",        () -> new BlockItem(ModBlocks.ORANGE_STAINED_PANE.get(),        new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> PINK_STAINED_PANE          = ITEMS.register("horizontal_stained_pink_pane",          () -> new BlockItem(ModBlocks.PINK_STAINED_PANE.get(),          new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> YELLOW_STAINED_PANE        = ITEMS.register("horizontal_stained_yellow_pane",        () -> new BlockItem(ModBlocks.YELLOW_STAINED_PANE.get(),        new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> LIME_STAINED_PANE          = ITEMS.register("horizontal_stained_lime_pane",          () -> new BlockItem(ModBlocks.LIME_STAINED_PANE.get(),          new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> GREEN_STAINED_PANE         = ITEMS.register("horizontal_stained_green_pane",         () -> new BlockItem(ModBlocks.GREEN_STAINED_PANE.get(),         new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> LIGHT_BLUE_STAINED_PANE    = ITEMS.register("horizontal_stained_light_blue_pane",    () -> new BlockItem(ModBlocks.LIGHT_BLUE_STAINED_PANE.get(),    new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> CYAN_STAINED_PANE          = ITEMS.register("horizontal_stained_cyan_pane",          () -> new BlockItem(ModBlocks.CYAN_STAINED_PANE.get(),          new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> BLUE_STAINED_PANE          = ITEMS.register("horizontal_stained_blue_pane",          () -> new BlockItem(ModBlocks.BLUE_STAINED_PANE.get(),          new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> MAGENTA_STAINED_PANE       = ITEMS.register("horizontal_stained_magenta_pane",       () -> new BlockItem(ModBlocks.MAGENTA_STAINED_PANE.get(),       new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> PURPLE_STAINED_PANE        = ITEMS.register("horizontal_stained_purple_pane",        () -> new BlockItem(ModBlocks.PURPLE_STAINED_PANE.get(),        new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> BROWN_STAINED_PANE         = ITEMS.register("horizontal_stained_brown_pane",         () -> new BlockItem(ModBlocks.BROWN_STAINED_PANE.get(),         new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> GRAY_STAINED_PANE          = ITEMS.register("horizontal_stained_gray_pane",          () -> new BlockItem(ModBlocks.GRAY_STAINED_PANE.get(),          new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> LIGHT_GRAY_STAINED_PANE    = ITEMS.register("horizontal_stained_light_gray_pane",    () -> new BlockItem(ModBlocks.LIGHT_GRAY_STAINED_PANE.get(),    new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final RegistryObject<Item> BLACK_STAINED_PANE         = ITEMS.register("horizontal_stained_black_pane",         () -> new BlockItem(ModBlocks.BLACK_STAINED_PANE.get(),         new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));

}
