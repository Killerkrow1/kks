package net.killerkrow.kks.util;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent NON_EDIBLE = new FoodComponent.Builder().hunger(5).saturationModifier(0.25f).alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 300), 1)
            .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 300), 1)
            .build();
}