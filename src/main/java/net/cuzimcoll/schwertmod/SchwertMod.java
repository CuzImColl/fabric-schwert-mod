package net.cuzimcoll.schwertmod;

import net.cuzimcoll.schwertmod.item.ModBlocks;
import net.cuzimcoll.schwertmod.item.ModItemGroups;
import net.cuzimcoll.schwertmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SchwertMod implements ModInitializer {
	public static final String MOD_ID = "schwertmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.initialize();
		ModItems.initialize();
		ModItemGroups.initialize();
	}

	public static Identifier getID (String path ) {
		return Identifier.of(MOD_ID, path);
	}

	public static void devLogger (String msg) {
		if (FabricLoader.getInstance().isDevelopmentEnvironment()) {
			LOGGER.info("DEV - " + msg );
		}
	}
}