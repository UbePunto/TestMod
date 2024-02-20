package net.ube.testmod.entity.client;

import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import net.ube.testmod.TestMod;

public class ModModelLayers {
    public static final EntityModelLayer ROBOT =
            new EntityModelLayer(new Identifier(TestMod.MOD_ID, "robot"), "boss");
}
