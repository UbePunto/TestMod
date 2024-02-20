package net.ube.testmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.ube.testmod.entity.ModEntities;
import net.ube.testmod.entity.custom.RobotEntity;
import net.ube.testmod.item.ModItems;
import net.ube.testmod.item.ModItemsGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMod implements ModInitializer {
	public static final String MOD_ID = "testmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemsGroups.registerItemGroups();
		ModItems.registerModItems();

		FabricDefaultAttributeRegistry.register(ModEntities.ROBOT, RobotEntity.createRobotAttributes());
	}
}