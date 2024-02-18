package net.ube.testmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.ube.testmod.entity.ModEntities;
import net.ube.testmod.entity.client.*;

public class TestModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {


        EntityRendererRegistry.register(ModEntities.PORCUPINE, PorcupineRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.PORCUPINE, porcupine::getTexturedModelData);

        EntityRendererRegistry.register(ModEntities.KIZARU, KizaruRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.KIZA, kiza::getTexturedModelData);



    }
}
