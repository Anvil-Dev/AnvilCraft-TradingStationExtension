package dev.anvilcraft.tse.data.recipe;

import dev.anvilcraft.lib.v2.registrum.providers.DataGenContext;
import dev.anvilcraft.lib.v2.registrum.providers.RegistrumRecipeProvider;
import dev.anvilcraft.tse.util.recipe.BetterShapedRecipeBuilder;
import dev.dubhe.anvilcraft.init.item.ModItems;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.world.item.Item;

public class RegistrumItemRecipeLoader {
    public static <T extends Item> void initPermissionCard(DataGenContext<Item, T> ctx, RegistrumRecipeProvider provider) {
        BetterShapedRecipeBuilder.shaped(RecipeCategory.MISC, ctx.get())
            .pattern("B")
            .pattern("D")
            .pattern("C")
            .define('B', ModItems.BRASS_INGOT)
            .define('C', ModItems.CIRCUIT_BOARD)
            .define('D', ModItems.DISK)
            .save(provider);
    }
}
