package com.mdujovic17.horizontalpanes.data.recipe;

import com.mdujovic17.horizontalpanes.registry.ModBlocks;
import com.mdujovic17.horizontalpanes.registry.ModItems;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.level.block.Blocks;

public class HorizontalPanesRecipes {
    public static void registerRecipes(RecipeOutput output) {
        registerHorizontalPanesRecipes(output);
        registerTintedGlassPaneRecipes(output);
        registerReversalRecipes(output);
    }

    private static void registerHorizontalPanesRecipes(RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.GLASS_PANE, 3)
                .pattern("PPP")
                .define('P', Blocks.GLASS_PANE)
                .unlockedBy("has_glass_block", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.GLASS))
                .group("horizontal_panes")
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WHITE_STAINED_PANE, 3)
                .pattern("PPP")
                .define('P', Blocks.WHITE_STAINED_GLASS_PANE)
                .unlockedBy("has_glass_block", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.GLASS))
                .group("horizontal_panes")
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.RED_STAINED_PANE, 3)
                .pattern("PPP")
                .define('P', Blocks.RED_STAINED_GLASS_PANE)
                .unlockedBy("has_glass_block", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.GLASS))
                .group("horizontal_panes")
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_STAINED_PANE, 3)
                .pattern("PPP")
                .define('P', Blocks.ORANGE_STAINED_GLASS_PANE)
                .unlockedBy("has_glass_block", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.GLASS))
                .group("horizontal_panes")
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.PINK_STAINED_PANE, 3)
                .pattern("PPP")
                .define('P', Blocks.PINK_STAINED_GLASS_PANE)
                .unlockedBy("has_glass_block", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.GLASS))
                .group("horizontal_panes")
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_STAINED_PANE, 3)
                .pattern("PPP")
                .define('P', Blocks.YELLOW_STAINED_GLASS_PANE)
                .unlockedBy("has_glass_block", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.GLASS))
                .group("horizontal_panes")
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.LIME_STAINED_PANE, 3)
                .pattern("PPP")
                .define('P', Blocks.LIME_STAINED_GLASS_PANE)
                .unlockedBy("has_glass_block", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.GLASS))
                .group("horizontal_panes")
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.GREEN_STAINED_PANE, 3)
                .pattern("PPP")
                .define('P', Blocks.GREEN_STAINED_GLASS_PANE)
                .unlockedBy("has_glass_block", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.GLASS))
                .group("horizontal_panes")
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_STAINED_PANE, 3)
                .pattern("PPP")
                .define('P', Blocks.LIGHT_BLUE_STAINED_GLASS_PANE)
                .unlockedBy("has_glass_block", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.GLASS))
                .group("horizontal_panes")
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.CYAN_STAINED_PANE, 3)
                .pattern("PPP")
                .define('P', Blocks.CYAN_STAINED_GLASS_PANE)
                .unlockedBy("has_glass_block", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.GLASS))
                .group("horizontal_panes")
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BLUE_STAINED_PANE, 3)
                .pattern("PPP")
                .define('P', Blocks.BLUE_STAINED_GLASS_PANE)
                .unlockedBy("has_glass_block", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.GLASS))
                .group("horizontal_panes")
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_STAINED_PANE, 3)
                .pattern("PPP")
                .define('P', Blocks.MAGENTA_STAINED_GLASS_PANE)
                .unlockedBy("has_glass_block", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.GLASS))
                .group("horizontal_panes")
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_STAINED_PANE, 3)
                .pattern("PPP")
                .define('P', Blocks.PURPLE_STAINED_GLASS_PANE)
                .unlockedBy("has_glass_block", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.GLASS))
                .group("horizontal_panes")
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BROWN_STAINED_PANE, 3)
                .pattern("PPP")
                .define('P', Blocks.BROWN_STAINED_GLASS_PANE)
                .unlockedBy("has_glass_block", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.GLASS))
                .group("horizontal_panes")
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.GRAY_STAINED_PANE, 3)
                .pattern("PPP")
                .define('P', Blocks.GRAY_STAINED_GLASS_PANE)
                .unlockedBy("has_glass_block", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.GLASS))
                .group("horizontal_panes")
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_STAINED_PANE, 3)
                .pattern("PPP")
                .define('P', Blocks.LIGHT_GRAY_STAINED_GLASS_PANE)
                .unlockedBy("has_glass_block", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.GLASS))
                .group("horizontal_panes")
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BLACK_STAINED_PANE, 3)
                .pattern("PPP")
                .define('P', Blocks.BLACK_STAINED_GLASS_PANE)
                .unlockedBy("has_glass_block", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.GLASS))
                .group("horizontal_panes")
                .save(output);
    }

    private static void registerTintedGlassPaneRecipes(RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.TINTED_GLASS_PANE, 3)
                .pattern("PPP")
                .pattern("PPP")
                .define('P', Blocks.TINTED_GLASS)
                .unlockedBy("has_tinted_glass_block", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.TINTED_GLASS))
                .group("horizontal_panes")
                .save(output);
    }

    private static void registerReversalRecipes(RecipeOutput output) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Blocks.GLASS_PANE, 1)
                .requires(ModItems.GLASS_PANE, 1)
                .unlockedBy("has_glass_block", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.GLASS))
                .group("glass_panes")
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Blocks.WHITE_STAINED_GLASS_PANE, 1)
                .requires(ModItems.WHITE_STAINED_PANE, 1)
                .unlockedBy("has_glass_block", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.GLASS))
                .group("glass_panes")
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Blocks.RED_STAINED_GLASS_PANE, 1)
                .requires(ModItems.RED_STAINED_PANE, 1)
                .unlockedBy("has_glass_block", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.GLASS))
                .group("glass_panes")
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Blocks.ORANGE_STAINED_GLASS_PANE, 1)
                .requires(ModItems.ORANGE_STAINED_PANE, 1)
                .unlockedBy("has_glass_block", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.GLASS))
                .group("glass_panes")
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Blocks.PINK_STAINED_GLASS_PANE, 1)
                .requires(ModItems.PINK_STAINED_PANE, 1)
                .unlockedBy("has_glass_block", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.GLASS))
                .group("glass_panes")
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Blocks.YELLOW_STAINED_GLASS_PANE, 1)
                .requires(ModItems.YELLOW_STAINED_PANE, 1)
                .unlockedBy("has_glass_block", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.GLASS))
                .group("glass_panes")
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Blocks.LIME_STAINED_GLASS_PANE, 1)
                .requires(ModItems.LIME_STAINED_PANE, 1)
                .unlockedBy("has_glass_block", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.GLASS))
                .group("glass_panes")
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Blocks.GREEN_STAINED_GLASS_PANE, 1)
                .requires(ModItems.GREEN_STAINED_PANE, 1)
                .unlockedBy("has_glass_block", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.GLASS))
                .group("glass_panes")
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Blocks.LIGHT_BLUE_STAINED_GLASS_PANE, 1)
                .requires(ModItems.LIGHT_BLUE_STAINED_PANE, 1)
                .unlockedBy("has_glass_block", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.GLASS))
                .group("glass_panes")
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Blocks.CYAN_STAINED_GLASS_PANE, 1)
                .requires(ModItems.CYAN_STAINED_PANE, 1)
                .unlockedBy("has_glass_block", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.GLASS))
                .group("glass_panes")
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Blocks.BLUE_STAINED_GLASS_PANE, 1)
                .requires(ModItems.BLUE_STAINED_PANE, 1)
                .unlockedBy("has_glass_block", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.GLASS))
                .group("glass_panes")
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Blocks.MAGENTA_STAINED_GLASS_PANE, 1)
                .requires(ModItems.MAGENTA_STAINED_PANE, 1)
                .unlockedBy("has_glass_block", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.GLASS))
                .group("glass_panes")
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Blocks.PURPLE_STAINED_GLASS_PANE, 1)
                .requires(ModItems.PURPLE_STAINED_PANE, 1)
                .unlockedBy("has_glass_block", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.GLASS))
                .group("glass_panes")
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Blocks.BROWN_STAINED_GLASS_PANE, 1)
                .requires(ModItems.BROWN_STAINED_PANE, 1)
                .unlockedBy("has_glass_block", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.GLASS))
                .group("glass_panes")
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Blocks.GRAY_STAINED_GLASS_PANE, 1)
                .requires(ModItems.GRAY_STAINED_PANE, 1)
                .unlockedBy("has_glass_block", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.GLASS))
                .group("glass_panes")
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Blocks.LIGHT_GRAY_STAINED_GLASS_PANE, 1)
                .requires(ModItems.LIGHT_GRAY_STAINED_PANE, 1)
                .unlockedBy("has_glass_block", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.GLASS))
                .group("glass_panes")
                .save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Blocks.BLACK_STAINED_GLASS_PANE, 1)
                .requires(ModItems.BLACK_STAINED_PANE, 1)
                .unlockedBy("has_glass_block", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.GLASS))
                .group("glass_panes")
                .save(output);
    }
}
