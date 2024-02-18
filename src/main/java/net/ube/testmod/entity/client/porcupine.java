package net.ube.testmod.entity.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.ube.testmod.entity.custom.PorcupineEntity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class porcupine<T extends PorcupineEntity> extends SinglePartEntityModel<T> {
	private final ModelPart cuerpo;
	private final ModelPart head;
	public porcupine(ModelPart root) {
		this.cuerpo = root.getChild("cuerpo");
		this.head = cuerpo.getChild("cabeza");


	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData cuerpo = modelPartData.addChild("cuerpo", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData pecho = cuerpo.addChild("pecho", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -3.0F, -1.0F, 8.0F, 7.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -12.0F, 0.0F));

		ModelPartData pezonizq = pecho.addChild("pezonizq", ModelPartBuilder.create().uv(20, 12).cuboid(-1.5F, -0.5F, -1.3F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(3.0F, -1.0F, 0.0F));

		ModelPartData pezonder = pecho.addChild("pezonder", ModelPartBuilder.create().uv(19, 0).cuboid(-2.5F, -1.5F, -1.3F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cabeza = cuerpo.addChild("cabeza", ModelPartBuilder.create().uv(36, 33).cuboid(-2.0F, -19.0F, -1.0F, 4.0F, 4.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData ojos = cabeza.addChild("ojos", ModelPartBuilder.create().uv(58, 18).cuboid(0.5F, -18.0F, -1.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(57, 33).cuboid(-1.5F, -18.0F, -1.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cuerno = cabeza.addChild("cuerno", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r1 = cuerno.addChild("cube_r1", ModelPartBuilder.create().uv(36, 40).cuboid(-0.5F, -3.5F, -1.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -20.0F, 0.5F, 1.5708F, 0.0F, 0.0F));

		ModelPartData bala = cuerno.addChild("bala", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r2 = bala.addChild("cube_r2", ModelPartBuilder.create().uv(1, 1).cuboid(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -19.0F, -2.5F, 1.5708F, 0.0F, 0.0F));

		ModelPartData brazoizq = cuerpo.addChild("brazoizq", ModelPartBuilder.create().uv(14, 20).cuboid(4.0F, -15.0F, -1.0F, 2.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData brazo_r1 = brazoizq.addChild("brazo_r1", ModelPartBuilder.create().uv(18, 26).cuboid(-0.5176F, -2.0681F, -0.5F, 1.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(9.0F, -9.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		ModelPartData antebrazo_r1 = brazoizq.addChild("antebrazo_r1", ModelPartBuilder.create().uv(16, 15).cuboid(-3.266F, -0.8572F, -1.5F, 5.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(7.5F, -12.0F, 0.5F, 0.0F, 0.0F, 0.6981F));

		ModelPartData brazoder = cuerpo.addChild("brazoder", ModelPartBuilder.create().uv(19, 7).cuboid(-6.0F, -15.0F, -1.0F, 2.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData brazo_r2 = brazoder.addChild("brazo_r2", ModelPartBuilder.create().uv(12, 25).cuboid(-0.3671F, -2.0474F, -0.5F, 1.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-9.0F, -9.0F, 0.0F, 0.0F, 0.0F, 0.2182F));

		ModelPartData antebrazo_r2 = brazoder.addChild("antebrazo_r2", ModelPartBuilder.create().uv(0, 15).cuboid(-2.5F, -1.5F, -1.5F, 5.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-6.5F, -12.0F, 0.5F, 0.0F, 0.0F, -0.6545F));

		ModelPartData cadera = cuerpo.addChild("cadera", ModelPartBuilder.create().uv(0, 10).cuboid(-4.0F, -8.0F, -1.0F, 8.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData piernaizq = cuerpo.addChild("piernaizq", ModelPartBuilder.create().uv(22, 23).cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F))
		.uv(11, 20).cuboid(-0.5F, 1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, -3.0F, 0.0F));

		ModelPartData piernader = cuerpo.addChild("piernader", ModelPartBuilder.create().uv(22, 0).cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F))
		.uv(13, 15).cuboid(-0.5F, 1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(2.0F, -3.0F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void setAngles(PorcupineEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		cuerpo.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return cuerpo;
	}
}