package net.killerkrow.kks.init;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.killerkrow.kks.KillerSShenanigans;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup SHENANIGANS_TAB = Registry.register(Registries.ITEM_GROUP,
            new Identifier(KillerSShenanigans.MOD_ID, "shenanigans_tab"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.shenanigans_tab"))
                    .icon(() -> new ItemStack(ModItems.DRY_WALL)).entries((displayContext, entries) -> {

                        entries.add(ModItems.DRY_WALL);
                        entries.add(ModItems.CANDLE_SWORD);
                        entries.add(ModItems.GREATER_EXPERIENCE_BOTTLE);
                        entries.add(ModItems.EXPERIENCE_LUMP);

                    }).build());

    public static void registerItemGroups() {
        KillerSShenanigans.LOGGER.info("Registering Item Groups for " + KillerSShenanigans.MOD_ID);
    }
}