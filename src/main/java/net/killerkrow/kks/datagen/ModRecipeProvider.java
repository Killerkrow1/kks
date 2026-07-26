package net.killerkrow.kks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.killerkrow.kks.KillerSShenanigans;
import net.killerkrow.kks.init.ModItems;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CANDLE_SWORD)
                .pattern(" C ")
                .pattern(" C ")
                .pattern("CSC")
                .input('C', ItemTags.CANDLES)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.CANDLE), conditionsFromItem(Items.CANDLE))
                .offerTo(exporter, new Identifier(KillerSShenanigans.MOD_ID, "candle_sword"));
    }
}