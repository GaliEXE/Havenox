package net.gali.havenox;

import net.fabricmc.api.ModInitializer;

import net.gali.havenox.block.ModBlocks;
import net.gali.havenox.item.ModItemGroups;
import net.gali.havenox.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Havenox implements ModInitializer {
	public static final String MOD_ID = "havenoxsmp";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}