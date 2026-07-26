package net.killerkrow.kks;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.player.UseItemCallback;
import net.killerkrow.kks.init.ModItemGroups;
import net.killerkrow.kks.init.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;

import net.minecraft.util.TypedActionResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KillerSShenanigans implements ModInitializer {
	public static final String MOD_ID = "kks";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();

		UseItemCallback.EVENT.register((player, world, hand) -> {
			if (!world.isClient && hand == Hand.MAIN_HAND) {
				ItemStack mainHandStack = player.getMainHandStack();
				ItemStack offHandStack = player.getOffHandStack();

				if (mainHandStack.isOf(Items.NETHER_STAR) && offHandStack.isOf(ModItems.EXPERIENCE_LUMP)) {
					ItemStack greater = new ItemStack(ModItems.GREATER_EXPERIENCE_BOTTLE, 4);

					if (!player.getInventory().insertStack(greater)) {
						player.dropItem(greater, false);
					}

					if (!player.getAbilities().creativeMode) {
						mainHandStack.decrement(1);
						offHandStack.decrement(1);
					}

					return TypedActionResult.success(mainHandStack);
				}
			}
			return TypedActionResult.pass(player.getStackInHand(hand));
		});
	}

	public static Identifier id(String path) {
		return new Identifier(MOD_ID, path);
	}
}
