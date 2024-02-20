package net.ube.testmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.ube.testmod.entity.ModEntities;
import net.ube.testmod.entity.client.ModModelLayers;
import net.ube.testmod.entity.client.RobotModel;
import net.ube.testmod.entity.client.RobotRenderer;

public class TestModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {


        EntityRendererRegistry.register(ModEntities.ROBOT, RobotRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.ROBOT, RobotModel::getTexturedModelData);

    }
}
