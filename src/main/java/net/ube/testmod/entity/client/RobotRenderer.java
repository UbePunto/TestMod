package net.ube.testmod.entity.client;


import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.ube.testmod.TestMod;
import net.ube.testmod.entity.custom.RobotEntity;

public class RobotRenderer extends MobEntityRenderer<RobotEntity, RobotModel<RobotEntity>> {
    private static final Identifier TEXTURE = new Identifier(TestMod.MOD_ID, "textures/entity/robot_texture.png");

    public RobotRenderer(EntityRendererFactory.Context context) {
        super(context, new RobotModel<>(context.getPart(ModModelLayers.ROBOT)), 0.6f);
    }

    @Override
    public Identifier getTexture(RobotEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(RobotEntity mobEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if(mobEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
