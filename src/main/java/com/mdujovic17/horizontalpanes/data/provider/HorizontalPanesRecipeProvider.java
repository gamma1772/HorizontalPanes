package com.mdujovic17.horizontalpanes.data.provider;

import com.mdujovic17.horizontalpanes.data.recipe.HorizontalPanesRecipes;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.concurrent.CompletableFuture;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public class HorizontalPanesRecipeProvider extends RecipeProvider {
    public HorizontalPanesRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        HorizontalPanesRecipes.registerRecipes(recipeOutput);
    }
}
