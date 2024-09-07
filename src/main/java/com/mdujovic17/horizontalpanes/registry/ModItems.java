package com.mdujovic17.horizontalpanes.registry;
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
import com.mdujovic17.horizontalpanes.HorizontalPanes;
import net.minecraft.world.item.BlockItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems
{
    //Deferred Registry for Items
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(HorizontalPanes.MODID);

    public static final DeferredItem<BlockItem> GLASS_PANE                 = ITEMS.registerSimpleBlockItem("horizontal_glass_pane", ModBlocks.GLASS_PANE);

    public static final DeferredItem<BlockItem> WHITE_STAINED_PANE         = ITEMS.registerSimpleBlockItem("horizontal_stained_white_pane",         ModBlocks.WHITE_STAINED_PANE);
    public static final DeferredItem<BlockItem> RED_STAINED_PANE           = ITEMS.registerSimpleBlockItem("horizontal_stained_red_pane",           ModBlocks.RED_STAINED_PANE);
    public static final DeferredItem<BlockItem> ORANGE_STAINED_PANE        = ITEMS.registerSimpleBlockItem("horizontal_stained_orange_pane",        ModBlocks.ORANGE_STAINED_PANE);
    public static final DeferredItem<BlockItem> PINK_STAINED_PANE          = ITEMS.registerSimpleBlockItem("horizontal_stained_pink_pane",          ModBlocks.PINK_STAINED_PANE);
    public static final DeferredItem<BlockItem> YELLOW_STAINED_PANE        = ITEMS.registerSimpleBlockItem("horizontal_stained_yellow_pane",        ModBlocks.YELLOW_STAINED_PANE);
    public static final DeferredItem<BlockItem> LIME_STAINED_PANE          = ITEMS.registerSimpleBlockItem("horizontal_stained_lime_pane",          ModBlocks.LIME_STAINED_PANE);
    public static final DeferredItem<BlockItem> GREEN_STAINED_PANE         = ITEMS.registerSimpleBlockItem("horizontal_stained_green_pane",         ModBlocks.GREEN_STAINED_PANE);
    public static final DeferredItem<BlockItem> LIGHT_BLUE_STAINED_PANE    = ITEMS.registerSimpleBlockItem("horizontal_stained_light_blue_pane",    ModBlocks.LIGHT_BLUE_STAINED_PANE);
    public static final DeferredItem<BlockItem> CYAN_STAINED_PANE          = ITEMS.registerSimpleBlockItem("horizontal_stained_cyan_pane",          ModBlocks.CYAN_STAINED_PANE);
    public static final DeferredItem<BlockItem> BLUE_STAINED_PANE          = ITEMS.registerSimpleBlockItem("horizontal_stained_blue_pane",          ModBlocks.BLUE_STAINED_PANE);
    public static final DeferredItem<BlockItem> MAGENTA_STAINED_PANE       = ITEMS.registerSimpleBlockItem("horizontal_stained_magenta_pane",       ModBlocks.MAGENTA_STAINED_PANE);
    public static final DeferredItem<BlockItem> PURPLE_STAINED_PANE        = ITEMS.registerSimpleBlockItem("horizontal_stained_purple_pane",        ModBlocks.PURPLE_STAINED_PANE);
    public static final DeferredItem<BlockItem> BROWN_STAINED_PANE         = ITEMS.registerSimpleBlockItem("horizontal_stained_brown_pane",         ModBlocks.BROWN_STAINED_PANE);
    public static final DeferredItem<BlockItem> GRAY_STAINED_PANE          = ITEMS.registerSimpleBlockItem("horizontal_stained_gray_pane",          ModBlocks.GRAY_STAINED_PANE);
    public static final DeferredItem<BlockItem> LIGHT_GRAY_STAINED_PANE    = ITEMS.registerSimpleBlockItem("horizontal_stained_light_gray_pane",    ModBlocks.LIGHT_GRAY_STAINED_PANE);
    public static final DeferredItem<BlockItem> BLACK_STAINED_PANE         = ITEMS.registerSimpleBlockItem("horizontal_stained_black_pane",         ModBlocks.BLACK_STAINED_PANE);

    public static final DeferredItem<BlockItem> TINTED_GLASS_PANE = ITEMS.registerSimpleBlockItem("horizontal_tinted_glass_pane", ModBlocks.TINTED_GLASS_PANE);
}
