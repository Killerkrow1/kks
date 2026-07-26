package net.killerkrow.kks;

import net.fabricmc.api.ModInitializer;

import net.killerkrow.kks.init.ModItemGroups;
import net.killerkrow.kks.init.ModItems;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KillerSShenanigans implements ModInitializer {
	public static final String MOD_ID = "kks";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
	}

	public static Identifier id(String path) {
		return new Identifier(MOD_ID, path);
	}
}
