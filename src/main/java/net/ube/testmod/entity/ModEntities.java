package net.ube.testmod.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.ube.testmod.TestMod;
import net.ube.testmod.entity.custom.RobotEntity;

public class ModEntities {
    public static final EntityType<RobotEntity> ROBOT = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(TestMod.MOD_ID, "robot"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, RobotEntity::new)
                    .dimensions(EntityDimensions.fixed(1.5f, 2.5f)).build());

}
