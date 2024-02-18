package net.ube.testmod.entity.client;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.ube.testmod.TestMod;
import net.ube.testmod.entity.custom.PorcupineEntity;

public class PorcupineRenderer extends MobEntityRenderer<PorcupineEntity, porcupine<PorcupineEntity>> {

    private static final Identifier TEXTURE = new Identifier(TestMod.MOD_ID,"textures/entity/porcupine.png");

    public PorcupineRenderer(EntityRendererFactory.Context context) {
        super(context,new porcupine<>(context.getPart(ModModelLayers.PORCUPINE)),0.6f);
    }

    @Override
    public Identifier getTexture(PorcupineEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(PorcupineEntity mobEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {

        if (mobEntity.isBaby()){

            matrixStack.scale(0.5f,0.5f,0.5f);
        }else {

            matrixStack.scale(2f,2.5f,2f);

        }

        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
