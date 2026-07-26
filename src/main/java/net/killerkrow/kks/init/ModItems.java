package net.killerkrow.kks.init;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.killerkrow.kks.KillerSShenanigans;
import net.killerkrow.kks.item.CandleSword;
import net.killerkrow.kks.item.DryWall;
import net.killerkrow.kks.item.ExperienceLump;
import net.killerkrow.kks.item.GreaterExperience;
import net.killerkrow.kks.util.ModFoodComponents;
import net.killerkrow.kks.util.ModdedToolMaterials;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item DRY_WALL = registerItem("dry_wall",
            new DryWall(new FabricItemSettings().food(ModFoodComponents.NON_EDIBLE)));
    public static final Item EXPERIENCE_LUMP = registerItem("experience_lump",
            new ExperienceLump(new FabricItemSettings()));
    public static final Item GREATER_EXPERIENCE_BOTTLE = registerItem("greater_experience_bottle",
            new GreaterExperience(new FabricItemSettings()));
    public static final Item CANDLE_SWORD = registerItem("candle_sword",
            new CandleSword(ModdedToolMaterials.CANDLE_SWORD, 7, -2.8f, new Item.Settings().food(ModFoodComponents.NON_EDIBLE)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(KillerSShenanigans.MOD_ID, name), item);
    }

    public static void registerModItems() {
        KillerSShenanigans.LOGGER.info("Registering Mod Items for " + KillerSShenanigans.MOD_ID);
    }
}