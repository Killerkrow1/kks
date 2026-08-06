package net.killerkrow.kks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.killerkrow.kks.KillerSShenanigans;
import net.killerkrow.kks.init.ModItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

import java.util.List;
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

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.DRY_WALL, 2)
                .input(Items.WATER_BUCKET)
                .input(Items.PAPER)
                .input(Blocks.MUD)
                .criterion(hasItem(Items.PAPER), conditionsFromItem(Items.PAPER))
                .offerTo(exporter, new Identifier(KillerSShenanigans.MOD_ID, "dry_wall"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.BLACK_CANDLE_SWORD)
                .input(ModItems.CANDLE_SWORD)
                .input(Items.BLACK_DYE)
                .criterion(hasItem(ModItems.CANDLE_SWORD), conditionsFromItem(ModItems.CANDLE_SWORD))
                .offerTo(exporter, new Identifier(KillerSShenanigans.MOD_ID, "black_candle_sword"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.BLUE_CANDLE_SWORD)
                .input(ModItems.CANDLE_SWORD)
                .input(Items.BLUE_DYE)
                .criterion(hasItem(ModItems.CANDLE_SWORD), conditionsFromItem(ModItems.CANDLE_SWORD))
                .offerTo(exporter, new Identifier(KillerSShenanigans.MOD_ID, "blue_candle_sword"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.BROWN_CANDLE_SWORD)
                .input(ModItems.CANDLE_SWORD)
                .input(Items.BROWN_DYE)
                .criterion(hasItem(ModItems.CANDLE_SWORD), conditionsFromItem(ModItems.CANDLE_SWORD))
                .offerTo(exporter, new Identifier(KillerSShenanigans.MOD_ID, "brown_candle_sword"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.CYAN_CANDLE_SWORD)
                .input(ModItems.CANDLE_SWORD)
                .input(Items.CYAN_DYE)
                .criterion(hasItem(ModItems.CANDLE_SWORD), conditionsFromItem(ModItems.CANDLE_SWORD))
                .offerTo(exporter, new Identifier(KillerSShenanigans.MOD_ID, "cyan_candle_sword"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.GRAY_CANDLE_SWORD)
                .input(ModItems.CANDLE_SWORD)
                .input(Items.GRAY_DYE)
                .criterion(hasItem(ModItems.CANDLE_SWORD), conditionsFromItem(ModItems.CANDLE_SWORD))
                .offerTo(exporter, new Identifier(KillerSShenanigans.MOD_ID, "gray_candle_sword"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.GREEN_CANDLE_SWORD)
                .input(ModItems.CANDLE_SWORD)
                .input(Items.GREEN_DYE)
                .criterion(hasItem(ModItems.CANDLE_SWORD), conditionsFromItem(ModItems.CANDLE_SWORD))
                .offerTo(exporter, new Identifier(KillerSShenanigans.MOD_ID, "green_candle_sword"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.LIGHT_BLUE_CANDLE_SWORD)
                .input(ModItems.CANDLE_SWORD)
                .input(Items.LIGHT_BLUE_DYE)
                .criterion(hasItem(ModItems.CANDLE_SWORD), conditionsFromItem(ModItems.CANDLE_SWORD))
                .offerTo(exporter, new Identifier(KillerSShenanigans.MOD_ID, "light_blue_candle_sword"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.LIGHT_GRAY_CANDLE_SWORD)
                .input(ModItems.CANDLE_SWORD)
                .input(Items.LIGHT_GRAY_DYE)
                .criterion(hasItem(ModItems.CANDLE_SWORD), conditionsFromItem(ModItems.CANDLE_SWORD))
                .offerTo(exporter, new Identifier(KillerSShenanigans.MOD_ID, "light_gray_candle_sword"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.LIME_CANDLE_SWORD)
                .input(ModItems.CANDLE_SWORD)
                .input(Items.LIME_DYE)
                .criterion(hasItem(ModItems.CANDLE_SWORD), conditionsFromItem(ModItems.CANDLE_SWORD))
                .offerTo(exporter, new Identifier(KillerSShenanigans.MOD_ID, "lime_candle_sword"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.MAGENTA_CANDLE_SWORD)
                .input(ModItems.CANDLE_SWORD)
                .input(Items.MAGENTA_DYE)
                .criterion(hasItem(ModItems.CANDLE_SWORD), conditionsFromItem(ModItems.CANDLE_SWORD))
                .offerTo(exporter, new Identifier(KillerSShenanigans.MOD_ID, "magenta_candle_sword"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ORANGE_CANDLE_SWORD)
                .input(ModItems.CANDLE_SWORD)
                .input(Items.ORANGE_DYE)
                .criterion(hasItem(ModItems.CANDLE_SWORD), conditionsFromItem(ModItems.CANDLE_SWORD))
                .offerTo(exporter, new Identifier(KillerSShenanigans.MOD_ID, "orange_candle_sword"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.PINK_CANDLE_SWORD)
                .input(ModItems.CANDLE_SWORD)
                .input(Items.PINK_DYE)
                .criterion(hasItem(ModItems.CANDLE_SWORD), conditionsFromItem(ModItems.CANDLE_SWORD))
                .offerTo(exporter, new Identifier(KillerSShenanigans.MOD_ID, "pink_candle_sword"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.PURPLE_CANDLE_SWORD)
                .input(ModItems.CANDLE_SWORD)
                .input(Items.PURPLE_DYE)
                .criterion(hasItem(ModItems.CANDLE_SWORD), conditionsFromItem(ModItems.CANDLE_SWORD))
                .offerTo(exporter, new Identifier(KillerSShenanigans.MOD_ID, "purple_candle_sword"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.RED_CANDLE_SWORD)
                .input(ModItems.CANDLE_SWORD)
                .input(Items.RED_DYE)
                .criterion(hasItem(ModItems.CANDLE_SWORD), conditionsFromItem(ModItems.CANDLE_SWORD))
                .offerTo(exporter, new Identifier(KillerSShenanigans.MOD_ID, "red_candle_sword"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.WHITE_CANDLE_SWORD)
                .input(ModItems.CANDLE_SWORD)
                .input(Items.WHITE_DYE)
                .criterion(hasItem(ModItems.CANDLE_SWORD), conditionsFromItem(ModItems.CANDLE_SWORD))
                .offerTo(exporter, new Identifier(KillerSShenanigans.MOD_ID, "white_candle_sword"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.YELLOW_CANDLE_SWORD)
                .input(ModItems.CANDLE_SWORD)
                .input(Items.YELLOW_DYE)
                .criterion(hasItem(ModItems.CANDLE_SWORD), conditionsFromItem(ModItems.CANDLE_SWORD))
                .offerTo(exporter, new Identifier(KillerSShenanigans.MOD_ID, "yellow_candle_sword"));

        ItemConvertible experienceBottle = Items.EXPERIENCE_BOTTLE;
        ItemConvertible experienceLump = ModItems.EXPERIENCE_LUMP;

        offerBlasting(exporter, List.of(experienceBottle), RecipeCategory.MISC, experienceLump, 10.0f,
                1200, "experience_lump");
    }
}