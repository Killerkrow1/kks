package net.killerkrow.kks;

import net.fabricmc.api.ClientModInitializer;
import net.killerkrow.kks.init.ModItems;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.util.Identifier;

public class KillerSShenanigansClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModelPredicateProviderRegistry.register(
                ModItems.CANDLE_SWORD,
                new Identifier("damage"),
                (stack, world, entity, seed) -> {
                    if (!stack.isDamageable()) return 0.0F;
                    return (float) stack.getDamage() / (float) stack.getMaxDamage();
                }
        );
    }
}