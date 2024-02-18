package net.ube.testmod.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.ube.testmod.TestMod;
import net.ube.testmod.entity.custom.KizaruEntity;
import net.ube.testmod.entity.custom.PorcupineEntity;

public class ModEntities {

    public static final EntityType<PorcupineEntity> PORCUPINE = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(TestMod.MOD_ID, "porcupine"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE,PorcupineEntity::new)
                    .dimensions(EntityDimensions.fixed(1f,2f)).build());

    public static final EntityType<KizaruEntity> KIZARU = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(TestMod.MOD_ID, "kizaru"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, KizaruEntity::new)
                    .dimensions(EntityDimensions.fixed(1f,2f)).build());


}
