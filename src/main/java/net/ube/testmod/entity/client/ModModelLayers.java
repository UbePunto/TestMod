package net.ube.testmod.entity.client;

import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import net.ube.testmod.TestMod;

public class ModModelLayers {

    public static final EntityModelLayer PORCUPINE =
            new EntityModelLayer(new Identifier(TestMod.MOD_ID, "porcupine"), "main");

    public static final EntityModelLayer KIZA =
            new EntityModelLayer(new Identifier(TestMod.MOD_ID, "kizaru"), "Kizaru");

}
