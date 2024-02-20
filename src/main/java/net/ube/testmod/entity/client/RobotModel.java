package net.ube.testmod.entity.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;
import net.ube.testmod.entity.animation.ModAnimations;
import net.ube.testmod.entity.custom.RobotEntity;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class RobotModel<T extends RobotEntity> extends SinglePartEntityModel<T> {

	private final ModelPart boss;
	private final ModelPart cabeza;


	public RobotModel(ModelPart root) {
        this.boss = root.getChild("boss");
        this.cabeza = root.getChild("boss").getChild("cabeza");
    }


	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData boss = modelPartData.addChild("boss", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 6.6F, 0.0F));

		ModelPartData rueda = boss.addChild("rueda", ModelPartBuilder.create().uv(31, 23).cuboid(-2.5F, -6.5F, -4.5F, 5.0F, 13.0F, 9.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.5F, 8.5F, 1.5F));

		ModelPartData cabeza = boss.addChild("cabeza", ModelPartBuilder.create().uv(59, 27).cuboid(-4.0F, -23.0F, -1.0F, 5.0F, 5.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData ojo = cabeza.addChild("ojo", ModelPartBuilder.create().uv(11, 32).cuboid(-3.0F, -22.0F, -2.0F, 3.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(-2.0F, -21.0F, -2.5F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData antena = cabeza.addChild("antena", ModelPartBuilder.create().uv(19, 34).cuboid(-7.0F, -21.0F, 1.0F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(19, 32).cuboid(1.0F, -21.0F, 1.0F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData torso = boss.addChild("torso", ModelPartBuilder.create().uv(0, 0).cuboid(-9.0F, -18.0F, -2.0F, 15.0F, 11.0F, 7.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData brazo = boss.addChild("brazo", ModelPartBuilder.create().uv(16, 40).cuboid(7.5F, 2.5F, -1.5F, 3.0F, 17.0F, 5.0F, new Dilation(0.0F))
				.uv(0, 32).cuboid(-10.5F, 2.5F, -1.5F, 3.0F, 17.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.5F, -15.5F, 0.5F));

		ModelPartData mano = boss.addChild("mano", ModelPartBuilder.create().uv(44, 0).cuboid(5.0F, 20.0F, -4.0F, 5.0F, 4.0F, 7.0F, new Dilation(0.0F))
				.uv(37, 11).cuboid(-13.0F, 20.0F, -4.0F, 5.0F, 4.0F, 7.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -16.0F, 2.0F));

		ModelPartData hombro = boss.addChild("hombro", ModelPartBuilder.create().uv(0, 55).cuboid(7.5F, -2.5F, -3.5F, 3.0F, 5.0F, 7.0F, new Dilation(0.0F))
				.uv(54, 15).cuboid(-10.5F, -2.5F, -3.5F, 3.0F, 5.0F, 7.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.5F, -15.5F, 1.5F));

		ModelPartData cadera = boss.addChild("cadera", ModelPartBuilder.create().uv(0, 18).cuboid(-8.0F, -15.4F, -2.0F, 13.0F, 7.0F, 7.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 8.4F, 0.0F));

		ModelPartData piernas = boss.addChild("piernas", ModelPartBuilder.create().uv(48, 45).cuboid(-7.0F, 0.0F, -1.0F, 3.0F, 13.0F, 5.0F, new Dilation(0.0F))
				.uv(32, 45).cuboid(1.0F, 0.0F, -1.0F, 3.0F, 13.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 128, 128);
	}

	public void setAngles(RobotEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
//		this.setHeadAngles(netHeadYaw, headPitch);

//		this.animateMovement(ModAnimations.ANDAR, limbSwing, limbSwingAmount, 2f, 2.5f);
//		this.updateAnimation(entity.idleAnimationState, ModAnimations.QUIETO, ageInTicks, 1f);
	}

	private void setHeadAngles(float headYaw, float headPitch) {
		headYaw = MathHelper.clamp(headYaw, -30.0F, 30.0F);
		headPitch = MathHelper.clamp(headPitch, -25.0F, 45.0F);

		this.cabeza.yaw = headYaw * 0.017453292F;
		this.cabeza.pitch = headPitch * 0.017453292F;
	}

	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		boss.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
//		cabeza.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}


	public ModelPart getPart() {
		return null;
	}


}

