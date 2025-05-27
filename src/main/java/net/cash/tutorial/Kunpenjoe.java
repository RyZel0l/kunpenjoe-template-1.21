package net.cash.tutorial;

import net.cash.tutorial.block.ModBlocks;
import net.cash.tutorial.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
// Very important comment
public class Kunpenjoe implements ModInitializer {
	public static final String MOD_ID = "kunpenjoe";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}