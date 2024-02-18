package net.ube.testmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.ube.testmod.block.ModBlocks;
import net.ube.testmod.entity.ModEntities;
import net.ube.testmod.entity.custom.KizaruEntity;
import net.ube.testmod.entity.custom.PorcupineEntity;
import net.ube.testmod.item.ModItemGroups;
import net.ube.testmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMod implements ModInitializer {
	public static final String MOD_ID = "testmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		FabricDefaultAttributeRegistry.register(ModEntities.PORCUPINE, PorcupineEntity.createPorcupineAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.KIZARU, KizaruEntity.createPorcupineAttributes());
	}
}