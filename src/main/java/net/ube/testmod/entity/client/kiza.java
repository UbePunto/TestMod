package net.ube.testmod.entity.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.ube.testmod.entity.custom.KizaruEntity;
import net.ube.testmod.entity.custom.PorcupineEntity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class kiza<T extends KizaruEntity> extends SinglePartEntityModel<T> {
	private final ModelPart body;

	public kiza(ModelPart root) {
		this.body = root.getChild("body");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create().uv(0, 11).cuboid(-3.7F, -29.0F, -1.1F, 7.2F, 8.0F, 2.2F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-3.5F, -29.0F, -1.3F, 6.8F, 8.0F, 2.6F, new Dilation(0.0F))
		.uv(18, 9).cuboid(-3.9F, -29.0F, -0.9F, 7.6F, 8.0F, 1.8F, new Dilation(0.0F))
		.uv(15, 19).cuboid(-3.5F, -33.6F, -1.3F, 6.9F, 4.6F, 2.6F, new Dilation(0.0F))
		.uv(0, 27).cuboid(-3.7F, -33.7F, -1.1F, 7.3F, 4.7F, 2.2F, new Dilation(0.0F))
		.uv(20, 0).cuboid(-4.0F, -34.2F, -0.9F, 7.8F, 5.2F, 1.8F, new Dilation(0.0F))
		.uv(80, 64).cuboid(-1.1F, -34.9F, -0.7F, 4.0F, 4.9F, 1.4F, new Dilation(0.0F))
		.uv(44, 49).cuboid(0.4F, -35.5F, -0.7F, 1.2F, 4.5F, 1.4F, new Dilation(0.0F))
		.uv(32, 119).cuboid(-0.7F, -36.0F, -0.8F, 1.2F, 1.7F, 1.6F, new Dilation(0.0F))
		.uv(84, 46).cuboid(-0.9F, -34.9F, -0.8F, 3.6F, 4.9F, 1.6F, new Dilation(0.0F))
		.uv(64, 98).cuboid(-0.3F, -35.2F, -0.7F, 2.6F, 4.2F, 1.4F, new Dilation(0.0F))
		.uv(95, 0).cuboid(-0.3F, -35.2F, -0.8F, 2.4F, 4.2F, 1.6F, new Dilation(0.0F))
		.uv(20, 109).cuboid(0.4F, -35.5F, -0.8F, 1.0F, 4.5F, 1.6F, new Dilation(0.0F))
		.uv(45, 0).cuboid(-0.8F, -36.0F, -0.7F, 1.4F, 1.7F, 1.4F, new Dilation(0.0F))
		.uv(9, 21).cuboid(2.7F, -34.3F, -0.7F, 2.4F, 1.3F, 1.4F, new Dilation(0.0F))
		.uv(38, 14).cuboid(2.7F, -34.4F, -0.7F, 1.7F, 1.4F, 1.4F, new Dilation(0.0F))
		.uv(56, 51).cuboid(2.7F, -34.6F, -0.7F, 1.0F, 1.6F, 1.4F, new Dilation(0.0F))
		.uv(119, 67).cuboid(2.7F, -34.6F, -0.8F, 0.9F, 1.6F, 1.6F, new Dilation(0.0F))
		.uv(18, 119).cuboid(2.7F, -34.4F, -0.8F, 1.6F, 1.4F, 1.6F, new Dilation(0.0F))
		.uv(96, 112).cuboid(2.7F, -34.3F, -0.8F, 2.3F, 1.3F, 1.6F, new Dilation(0.0F))
		.uv(78, 82).cuboid(-3.1F, -34.9F, -0.7F, 4.0F, 4.9F, 1.4F, new Dilation(0.0F))
		.uv(8, 41).cuboid(-1.8F, -35.5F, -0.7F, 1.2F, 4.5F, 1.4F, new Dilation(0.0F))
		.uv(44, 85).cuboid(-2.9F, -34.9F, -0.8F, 3.6F, 4.9F, 1.6F, new Dilation(0.0F))
		.uv(0, 100).cuboid(-2.5F, -35.2F, -0.7F, 2.6F, 4.2F, 1.4F, new Dilation(0.0F))
		.uv(96, 47).cuboid(-2.3F, -35.2F, -0.8F, 2.4F, 4.2F, 1.6F, new Dilation(0.0F))
		.uv(26, 109).cuboid(-1.6F, -35.5F, -0.8F, 1.0F, 4.5F, 1.6F, new Dilation(0.0F))
		.uv(24, 7).cuboid(-5.3F, -34.3F, -0.7F, 2.4F, 1.3F, 1.4F, new Dilation(0.0F))
		.uv(30, 7).cuboid(-4.6F, -34.4F, -0.7F, 1.7F, 1.4F, 1.4F, new Dilation(0.0F))
		.uv(57, 0).cuboid(-3.9F, -34.6F, -0.7F, 1.0F, 1.6F, 1.4F, new Dilation(0.0F))
		.uv(96, 119).cuboid(-3.8F, -34.6F, -0.8F, 0.9F, 1.6F, 1.6F, new Dilation(0.0F))
		.uv(6, 119).cuboid(-4.5F, -34.4F, -0.8F, 1.6F, 1.4F, 1.6F, new Dilation(0.0F))
		.uv(112, 109).cuboid(-5.2F, -34.3F, -0.8F, 2.3F, 1.3F, 1.6F, new Dilation(0.0F))
		.uv(32, 32).cuboid(-2.9F, -34.9F, -0.9F, 5.6F, 4.9F, 1.8F, new Dilation(0.0F))
		.uv(0, 34).cuboid(-2.8F, -34.6F, -1.0F, 5.4F, 4.6F, 1.9F, new Dilation(0.0F))
		.uv(18, 27).cuboid(-3.2F, -34.1F, -1.1F, 6.3F, 5.1F, 2.2F, new Dilation(0.0F))
		.uv(90, 43).cuboid(-0.9F, -36.0F, -0.6F, 1.6F, 1.7F, 1.2F, new Dilation(0.0F))
		.uv(44, 104).cuboid(-1.0F, -36.0F, -0.5F, 1.8F, 1.7F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData down_part = body.addChild("down_part", ModelPartBuilder.create().uv(34, 29).cuboid(-3.5F, -21.0F, -1.0F, 4.0F, 1.15F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData left_leg = down_part.addChild("left_leg", ModelPartBuilder.create().uv(82, 36).cuboid(2.0F, -18.0F, -1.0F, 1.5F, 8.2F, 2.0F, new Dilation(0.0F))
		.uv(114, 72).cuboid(1.8F, -18.85F, -0.9F, 1.7F, 1.45F, 1.8F, new Dilation(0.0F))
		.uv(103, 0).cuboid(0.1F, -21.0F, -0.9F, 3.4F, 0.95F, 1.9F, new Dilation(0.0F))
		.uv(54, 98).cuboid(0.2F, -21.0F, -1.0F, 3.3F, 1.15F, 2.0F, new Dilation(0.0F))
		.uv(110, 45).cuboid(1.35F, -20.0F, -0.9F, 2.15F, 1.25F, 1.8F, new Dilation(0.0F))
		.uv(117, 83).cuboid(1.9F, -18.85F, -1.0F, 1.6F, 0.85F, 2.0F, new Dilation(0.0F))
		.uv(36, 81).cuboid(2.0F, -18.0F, -1.0F, 1.5F, 8.2F, 2.0F, new Dilation(0.0F))
		.uv(69, 107).cuboid(1.1F, -21.0F, -0.9F, 2.3F, 1.85F, 1.8F, new Dilation(0.0F))
		.uv(50, 101).cuboid(0.3F, -21.0F, -1.0F, 3.2F, 1.15F, 2.0F, new Dilation(0.0F))
		.uv(56, 46).cuboid(3.5F, -21.1F, -0.9F, 0.1F, 3.15F, 1.8F, new Dilation(0.0F))
		.uv(117, 79).cuboid(1.9F, -18.85F, -1.0F, 1.6F, 0.85F, 2.0F, new Dilation(0.0F))
		.uv(36, 108).cuboid(1.55F, -20.0F, -1.0F, 1.95F, 1.85F, 2.0F, new Dilation(0.0F))
		.uv(68, 103).cuboid(0.7F, -21.0F, -1.0F, 2.7F, 1.55F, 2.0F, new Dilation(0.0F))
		.uv(112, 22).cuboid(1.65F, -20.0F, -1.0F, 1.85F, 1.15F, 2.0F, new Dilation(0.0F))
		.uv(76, 117).cuboid(1.9F, -18.85F, -1.0F, 1.6F, 0.85F, 2.0F, new Dilation(0.0F))
		.uv(50, 55).cuboid(3.5F, -21.1F, -0.9F, 0.1F, 3.15F, 1.8F, new Dilation(0.0F))
		.uv(101, 43).cuboid(0.3F, -21.0F, -1.0F, 3.2F, 1.15F, 2.0F, new Dilation(0.0F))
		.uv(28, 93).cuboid(1.9F, -18.0F, -0.7F, 1.7F, 8.2F, 1.4F, new Dilation(0.0F))
		.uv(108, 99).cuboid(0.9F, -21.0F, -0.9F, 2.5F, 1.35F, 1.8F, new Dilation(0.0F))
		.uv(22, 81).cuboid(2.0F, -18.0F, -1.0F, 1.5F, 8.2F, 2.0F, new Dilation(0.0F))
		.uv(117, 75).cuboid(1.9F, -18.85F, -1.0F, 1.6F, 0.85F, 2.0F, new Dilation(0.0F))
		.uv(114, 48).cuboid(1.55F, -20.0F, -0.9F, 1.95F, 1.05F, 1.8F, new Dilation(0.0F))
		.uv(98, 40).cuboid(0.2F, -21.0F, -1.0F, 3.3F, 1.15F, 2.0F, new Dilation(0.0F))
		.uv(119, 2).cuboid(1.8F, -18.85F, -0.9F, 1.7F, 0.75F, 1.8F, new Dilation(0.0F))
		.uv(81, 16).cuboid(2.0F, -18.0F, -1.0F, 1.5F, 8.2F, 2.0F, new Dilation(0.0F))
		.uv(8, 81).cuboid(2.0F, -18.0F, -1.0F, 1.5F, 8.2F, 2.0F, new Dilation(0.0F))
		.uv(118, 106).cuboid(1.8F, -18.85F, -0.9F, 1.7F, 0.75F, 1.8F, new Dilation(0.0F))
		.uv(8, 102).cuboid(0.1F, -21.0F, -0.9F, 3.4F, 1.05F, 1.9F, new Dilation(0.0F))
		.uv(98, 37).cuboid(0.2F, -21.0F, -1.0F, 3.3F, 1.15F, 2.0F, new Dilation(0.0F))
		.uv(46, 114).cuboid(1.55F, -20.0F, -0.9F, 1.95F, 1.05F, 1.8F, new Dilation(0.0F))
		.uv(68, 117).cuboid(1.9F, -18.85F, -1.0F, 1.6F, 0.85F, 2.0F, new Dilation(0.0F))
		.uv(81, 0).cuboid(2.0F, -18.0F, -1.0F, 1.5F, 8.2F, 2.0F, new Dilation(0.0F))
		.uv(61, 107).cuboid(0.9F, -21.0F, -0.9F, 2.5F, 1.45F, 1.8F, new Dilation(0.0F))
		.uv(12, 93).cuboid(1.9F, -18.0F, -0.7F, 1.7F, 8.2F, 1.4F, new Dilation(0.0F))
		.uv(40, 101).cuboid(0.3F, -21.0F, -1.0F, 3.2F, 1.15F, 2.0F, new Dilation(0.0F))
		.uv(60, 117).cuboid(1.9F, -18.85F, -1.0F, 1.6F, 0.85F, 2.0F, new Dilation(0.0F))
		.uv(111, 92).cuboid(1.65F, -20.0F, -1.0F, 1.85F, 1.15F, 2.0F, new Dilation(0.0F))
		.uv(106, 23).cuboid(1.0F, -21.0F, -1.0F, 2.4F, 1.55F, 2.0F, new Dilation(0.0F))
		.uv(105, 90).cuboid(1.0F, -21.0F, -1.0F, 2.4F, 1.55F, 2.0F, new Dilation(0.0F))
		.uv(90, 111).cuboid(1.65F, -20.0F, -1.0F, 1.85F, 1.15F, 2.0F, new Dilation(0.0F))
		.uv(52, 117).cuboid(1.9F, -18.85F, -1.0F, 1.6F, 0.85F, 2.0F, new Dilation(0.0F))
		.uv(101, 12).cuboid(0.3F, -21.0F, -1.0F, 3.2F, 1.15F, 2.0F, new Dilation(0.0F))
		.uv(107, 54).cuboid(0.9F, -21.0F, -0.9F, 2.5F, 1.45F, 1.8F, new Dilation(0.0F))
		.uv(78, 72).cuboid(2.0F, -18.0F, -1.0F, 1.5F, 8.2F, 2.0F, new Dilation(0.0F))
		.uv(44, 117).cuboid(1.9F, -18.85F, -1.0F, 1.6F, 0.85F, 2.0F, new Dilation(0.0F))
		.uv(114, 39).cuboid(1.55F, -20.0F, -0.9F, 1.95F, 1.05F, 1.8F, new Dilation(0.0F))
		.uv(98, 34).cuboid(0.2F, -21.0F, -1.0F, 3.3F, 1.15F, 2.0F, new Dilation(0.0F))
		.uv(100, 101).cuboid(0.1F, -21.0F, -0.9F, 3.4F, 1.05F, 1.9F, new Dilation(0.0F))
		.uv(90, 118).cuboid(1.8F, -18.85F, -0.9F, 1.7F, 0.75F, 1.8F, new Dilation(0.0F))
		.uv(78, 54).cuboid(2.0F, -18.0F, -1.0F, 1.5F, 8.2F, 2.0F, new Dilation(0.0F))
		.uv(0, 52).cuboid(3.5F, -21.1F, -0.9F, 0.1F, 3.15F, 1.8F, new Dilation(0.0F))
		.uv(78, 26).cuboid(2.0F, -18.0F, -1.0F, 1.5F, 8.2F, 2.0F, new Dilation(0.0F))
		.uv(118, 34).cuboid(1.8F, -18.85F, -0.9F, 1.7F, 0.75F, 1.8F, new Dilation(0.0F))
		.uv(101, 87).cuboid(0.1F, -21.0F, -0.9F, 3.4F, 1.05F, 1.9F, new Dilation(0.0F))
		.uv(98, 25).cuboid(0.2F, -21.0F, -1.0F, 3.3F, 1.15F, 2.0F, new Dilation(0.0F))
		.uv(38, 114).cuboid(1.55F, -20.0F, -0.9F, 1.95F, 1.05F, 1.8F, new Dilation(0.0F))
		.uv(36, 117).cuboid(1.9F, -18.85F, -1.0F, 1.6F, 0.85F, 2.0F, new Dilation(0.0F))
		.uv(0, 77).cuboid(2.0F, -18.0F, -1.0F, 1.5F, 8.2F, 2.0F, new Dilation(0.0F))
		.uv(53, 107).cuboid(0.9F, -21.0F, -0.9F, 2.5F, 1.45F, 1.8F, new Dilation(0.0F))
		.uv(101, 9).cuboid(0.3F, -21.0F, -1.0F, 3.2F, 1.15F, 2.0F, new Dilation(0.0F))
		.uv(12, 117).cuboid(1.9F, -18.85F, -1.0F, 1.6F, 0.85F, 2.0F, new Dilation(0.0F))
		.uv(111, 89).cuboid(1.65F, -20.0F, -1.0F, 1.85F, 1.15F, 2.0F, new Dilation(0.0F))
		.uv(105, 80).cuboid(1.0F, -21.0F, -1.0F, 2.4F, 1.55F, 2.0F, new Dilation(0.0F))
		.uv(24, 105).cuboid(1.0F, -21.0F, -1.0F, 2.4F, 1.55F, 2.0F, new Dilation(0.0F))
		.uv(111, 82).cuboid(1.65F, -20.0F, -1.0F, 1.85F, 1.15F, 2.0F, new Dilation(0.0F))
		.uv(117, 8).cuboid(1.9F, -18.85F, -1.0F, 1.6F, 0.85F, 2.0F, new Dilation(0.0F))
		.uv(100, 98).cuboid(0.3F, -21.0F, -1.0F, 3.2F, 1.15F, 2.0F, new Dilation(0.0F))
		.uv(48, 92).cuboid(1.9F, -18.0F, -0.7F, 1.7F, 8.2F, 1.4F, new Dilation(0.0F))
		.uv(30, 107).cuboid(0.9F, -21.0F, -0.9F, 2.5F, 1.45F, 1.8F, new Dilation(0.0F))
		.uv(76, 44).cuboid(2.0F, -18.0F, -1.0F, 1.5F, 8.2F, 2.0F, new Dilation(0.0F))
		.uv(0, 117).cuboid(1.9F, -18.85F, -1.0F, 1.6F, 0.85F, 2.0F, new Dilation(0.0F))
		.uv(114, 14).cuboid(1.55F, -20.0F, -0.9F, 1.95F, 1.05F, 1.8F, new Dilation(0.0F))
		.uv(92, 97).cuboid(0.2F, -21.0F, -1.0F, 3.3F, 1.15F, 2.0F, new Dilation(0.0F))
		.uv(101, 84).cuboid(0.1F, -21.0F, -0.9F, 3.4F, 1.05F, 1.9F, new Dilation(0.0F))
		.uv(118, 31).cuboid(1.8F, -18.85F, -0.9F, 1.7F, 0.75F, 1.8F, new Dilation(0.0F))
		.uv(58, 75).cuboid(2.0F, -18.0F, -1.0F, 1.5F, 8.2F, 2.0F, new Dilation(0.0F))
		.uv(50, 75).cuboid(2.0F, -18.0F, -1.0F, 1.5F, 8.2F, 2.0F, new Dilation(0.0F))
		.uv(118, 28).cuboid(1.8F, -18.85F, -0.9F, 1.7F, 0.75F, 1.8F, new Dilation(0.0F))
		.uv(82, 97).cuboid(0.2F, -21.0F, -1.0F, 3.3F, 1.15F, 2.0F, new Dilation(0.0F))
		.uv(14, 114).cuboid(1.55F, -20.0F, -0.9F, 1.95F, 1.05F, 1.8F, new Dilation(0.0F))
		.uv(114, 116).cuboid(1.9F, -18.85F, -1.0F, 1.6F, 0.85F, 2.0F, new Dilation(0.0F))
		.uv(75, 8).cuboid(2.0F, -18.0F, -1.0F, 1.5F, 8.2F, 2.0F, new Dilation(0.0F))
		.uv(44, 108).cuboid(0.9F, -21.0F, -0.9F, 2.5F, 1.35F, 1.8F, new Dilation(0.0F))
		.uv(42, 92).cuboid(1.9F, -18.0F, -0.7F, 1.7F, 8.2F, 1.4F, new Dilation(0.0F))
		.uv(92, 100).cuboid(0.3F, -21.0F, -1.0F, 3.2F, 1.15F, 2.0F, new Dilation(0.0F))
		.uv(116, 112).cuboid(1.9F, -18.85F, -1.0F, 1.6F, 0.85F, 2.0F, new Dilation(0.0F))
		.uv(82, 111).cuboid(1.65F, -20.0F, -1.0F, 1.85F, 1.15F, 2.0F, new Dilation(0.0F))
		.uv(58, 103).cuboid(0.7F, -21.0F, -1.0F, 2.7F, 1.55F, 2.0F, new Dilation(0.0F))
		.uv(0, 109).cuboid(1.55F, -20.0F, -1.0F, 1.95F, 1.65F, 2.0F, new Dilation(0.0F))
		.uv(106, 116).cuboid(1.9F, -18.85F, -1.0F, 1.6F, 0.85F, 2.0F, new Dilation(0.0F))
		.uv(82, 100).cuboid(0.3F, -21.0F, -1.0F, 3.2F, 1.15F, 2.0F, new Dilation(0.0F))
		.uv(14, 107).cuboid(1.1F, -21.0F, -0.9F, 2.3F, 1.85F, 1.8F, new Dilation(0.0F))
		.uv(70, 74).cuboid(2.0F, -18.0F, -1.0F, 1.5F, 8.2F, 2.0F, new Dilation(0.0F))
		.uv(116, 103).cuboid(1.9F, -18.85F, -1.0F, 1.6F, 0.85F, 2.0F, new Dilation(0.0F))
		.uv(110, 27).cuboid(1.35F, -20.0F, -0.9F, 2.15F, 1.25F, 1.8F, new Dilation(0.0F))
		.uv(72, 97).cuboid(0.2F, -21.0F, -1.0F, 3.3F, 1.15F, 2.0F, new Dilation(0.0F))
		.uv(102, 46).cuboid(0.1F, -21.0F, -0.9F, 3.4F, 0.95F, 1.9F, new Dilation(0.0F))
		.uv(70, 114).cuboid(1.8F, -18.85F, -0.9F, 1.7F, 1.45F, 1.8F, new Dilation(0.0F))
		.uv(42, 73).cuboid(2.0F, -18.0F, -1.0F, 1.5F, 8.2F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData left_knee = left_leg.addChild("left_knee", ModelPartBuilder.create().uv(24, 65).cuboid(2.0F, -9.8F, -1.0F, 1.5F, 8.3F, 2.0F, new Dilation(0.0F))
		.uv(16, 63).cuboid(2.0F, -9.8F, -1.0F, 1.5F, 8.3F, 2.0F, new Dilation(0.0F))
		.uv(89, 0).cuboid(1.9F, -9.8F, -0.7F, 1.7F, 8.3F, 1.4F, new Dilation(0.0F))
		.uv(62, 56).cuboid(2.0F, -9.8F, -1.0F, 1.5F, 8.3F, 2.0F, new Dilation(0.0F))
		.uv(62, 36).cuboid(2.0F, -9.8F, -1.0F, 1.5F, 8.3F, 2.0F, new Dilation(0.0F))
		.uv(8, 61).cuboid(2.0F, -9.8F, -1.0F, 1.5F, 8.3F, 2.0F, new Dilation(0.0F))
		.uv(61, 0).cuboid(2.0F, -9.8F, -1.0F, 1.5F, 8.3F, 2.0F, new Dilation(0.0F))
		.uv(79, 88).cuboid(1.9F, -9.8F, -0.7F, 1.7F, 8.3F, 1.4F, new Dilation(0.0F))
		.uv(60, 46).cuboid(2.0F, -9.8F, -1.0F, 1.5F, 8.3F, 2.0F, new Dilation(0.0F))
		.uv(60, 18).cuboid(2.0F, -9.8F, -1.0F, 1.5F, 8.3F, 2.0F, new Dilation(0.0F))
		.uv(42, 57).cuboid(2.0F, -9.8F, -1.0F, 1.5F, 8.3F, 2.0F, new Dilation(0.0F))
		.uv(30, 57).cuboid(2.0F, -9.8F, -1.0F, 1.5F, 8.3F, 2.0F, new Dilation(0.0F))
		.uv(62, 88).cuboid(1.9F, -9.8F, -0.7F, 1.7F, 8.3F, 1.4F, new Dilation(0.0F))
		.uv(0, 57).cuboid(2.0F, -9.8F, -1.0F, 1.5F, 8.3F, 2.0F, new Dilation(0.0F))
		.uv(56, 28).cuboid(2.0F, -9.8F, -1.0F, 1.5F, 8.3F, 2.0F, new Dilation(0.0F))
		.uv(54, 55).cuboid(2.0F, -9.8F, -1.0F, 1.5F, 8.3F, 2.0F, new Dilation(0.0F))
		.uv(22, 55).cuboid(2.0F, -9.8F, -1.0F, 1.5F, 8.3F, 2.0F, new Dilation(0.0F))
		.uv(87, 87).cuboid(1.9F, -9.8F, -0.7F, 1.7F, 8.3F, 1.4F, new Dilation(0.0F))
		.uv(55, 8).cuboid(2.0F, -9.8F, -1.0F, 1.5F, 8.3F, 2.0F, new Dilation(0.0F))
		.uv(54, 38).cuboid(2.0F, -9.8F, -1.0F, 1.5F, 8.3F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData left_foot = left_knee.addChild("left_foot", ModelPartBuilder.create().uv(109, 85).cuboid(1.9F, -1.5F, -1.2F, 1.7F, 1.55F, 2.1F, new Dilation(0.0F))
		.uv(90, 103).cuboid(2.1F, -0.9F, -2.0F, 1.3F, 0.95F, 3.1F, new Dilation(0.0F))
		.uv(112, 36).cuboid(1.8F, -0.9F, -1.1F, 1.9F, 0.95F, 2.0F, new Dilation(0.0F))
		.uv(92, 26).cuboid(2.1F, -0.5F, -2.8F, 1.3F, 0.55F, 3.9F, new Dilation(0.0F))
		.uv(92, 57).cuboid(1.9F, -0.7F, -2.3F, 1.7F, 0.75F, 3.4F, new Dilation(0.0F))
		.uv(34, 22).cuboid(1.9F, -0.1F, -3.0F, 1.7F, 0.15F, 1.2F, new Dilation(0.0F))
		.uv(15, 28).cuboid(1.8F, -0.1F, -2.3F, 1.9F, 0.15F, 1.1F, new Dilation(0.0F))
		.uv(18, 7).cuboid(1.7F, -0.1F, -1.2F, 2.1F, 0.15F, 2.5F, new Dilation(0.0F))
		.uv(109, 74).cuboid(2.2F, -1.2F, -1.7F, 1.1F, 1.25F, 2.6F, new Dilation(0.0F))
		.uv(93, 86).cuboid(2.0F, -0.7F, -2.4F, 1.5F, 0.75F, 3.5F, new Dilation(0.0F))
		.uv(110, 18).cuboid(2.3F, -1.3F, -1.6F, 0.9F, 1.35F, 2.6F, new Dilation(0.0F))
		.uv(108, 12).cuboid(2.2F, -1.0F, -1.9F, 1.1F, 1.05F, 2.8F, new Dilation(0.0F))
		.uv(47, 104).cuboid(2.2F, -0.9F, -2.1F, 1.1F, 0.95F, 3.2F, new Dilation(0.0F))
		.uv(64, 93).cuboid(2.2F, -0.6F, -2.7F, 1.1F, 0.65F, 3.8F, new Dilation(0.0F))
		.uv(20, 40).cuboid(2.0F, -1.5F, -1.3F, 1.5F, 1.55F, 2.3F, new Dilation(0.0F))
		.uv(112, 33).cuboid(1.9F, -1.0F, -1.1F, 1.7F, 1.05F, 2.1F, new Dilation(0.0F))
		.uv(0, 27).cuboid(2.2F, -0.8F, 1.1F, 1.1F, 0.85F, 0.1F, new Dilation(0.0F))
		.uv(0, 34).cuboid(2.3F, -0.9F, 1.1F, 0.9F, 0.95F, 0.1F, new Dilation(0.0F))
		.uv(12, 25).cuboid(2.3F, -1.3F, 1.0F, 0.9F, 1.35F, 0.1F, new Dilation(0.0F))
		.uv(17, 2).cuboid(2.2F, -1.2F, 1.0F, 1.1F, 1.25F, 0.1F, new Dilation(0.0F))
		.uv(54, 94).cuboid(2.0F, -0.8F, -2.3F, 1.5F, 0.85F, 3.4F, new Dilation(0.0F))
		.uv(13, 23).cuboid(2.2F, -0.7F, -2.6F, 1.1F, 0.65F, 0.2F, new Dilation(0.0F))
		.uv(32, 20).cuboid(2.3F, -0.7F, -2.7F, 0.9F, 0.65F, 0.2F, new Dilation(0.0F))
		.uv(0, 22).cuboid(2.2F, -0.5F, -2.9F, 1.1F, 0.55F, 0.3F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData right_leg = down_part.addChild("right_leg", ModelPartBuilder.create().uv(30, 73).cuboid(-3.5F, -18.0F, -1.0F, 1.5F, 8.2F, 2.0F, new Dilation(0.0F))
		.uv(62, 114).cuboid(-3.5F, -18.85F, -0.9F, 1.7F, 1.45F, 1.8F, new Dilation(0.0F))
		.uv(102, 28).cuboid(-3.5F, -21.0F, -0.9F, 3.4F, 0.95F, 1.9F, new Dilation(0.0F))
		.uv(109, 57).cuboid(-3.5F, -20.0F, -0.9F, 2.15F, 1.25F, 1.8F, new Dilation(0.0F))
		.uv(98, 116).cuboid(-3.5F, -18.85F, -1.0F, 1.6F, 0.85F, 2.0F, new Dilation(0.0F))
		.uv(16, 73).cuboid(-3.5F, -18.0F, -1.0F, 1.5F, 8.2F, 2.0F, new Dilation(0.0F))
		.uv(106, 38).cuboid(-3.4F, -21.0F, -0.9F, 2.3F, 1.85F, 1.8F, new Dilation(0.0F))
		.uv(72, 100).cuboid(-3.5F, -21.0F, -1.0F, 3.2F, 1.15F, 2.0F, new Dilation(0.0F))
		.uv(50, 41).cuboid(-3.6F, -21.1F, -0.9F, 0.1F, 3.15F, 1.8F, new Dilation(0.0F))
		.uv(116, 43).cuboid(-3.5F, -18.85F, -1.0F, 1.6F, 0.85F, 2.0F, new Dilation(0.0F))
		.uv(90, 107).cuboid(-3.5F, -20.0F, -1.0F, 1.95F, 1.85F, 2.0F, new Dilation(0.0F))
		.uv(32, 103).cuboid(-3.4F, -21.0F, -1.0F, 2.7F, 1.55F, 2.0F, new Dilation(0.0F))
		.uv(111, 78).cuboid(-3.5F, -20.0F, -1.0F, 1.85F, 1.15F, 2.0F, new Dilation(0.0F))
		.uv(116, 25).cuboid(-3.5F, -18.85F, -1.0F, 1.6F, 0.85F, 2.0F, new Dilation(0.0F))
		.uv(50, 38).cuboid(-3.6F, -21.1F, -0.9F, 0.1F, 3.15F, 1.8F, new Dilation(0.0F))
		.uv(32, 100).cuboid(-3.5F, -21.0F, -1.0F, 3.2F, 1.15F, 2.0F, new Dilation(0.0F))
		.uv(91, 61).cuboid(-3.6F, -18.0F, -0.7F, 1.7F, 8.2F, 1.4F, new Dilation(0.0F))
		.uv(107, 95).cuboid(-3.4F, -21.0F, -0.9F, 2.5F, 1.35F, 1.8F, new Dilation(0.0F))
		.uv(72, 64).cuboid(-3.5F, -18.0F, -1.0F, 1.5F, 8.2F, 2.0F, new Dilation(0.0F))
		.uv(20, 116).cuboid(-3.5F, -18.85F, -1.0F, 1.6F, 0.85F, 2.0F, new Dilation(0.0F))
		.uv(110, 113).cuboid(-3.5F, -20.0F, -0.9F, 1.95F, 1.05F, 1.8F, new Dilation(0.0F))
		.uv(97, 61).cuboid(-3.5F, -21.0F, -1.0F, 3.3F, 1.15F, 2.0F, new Dilation(0.0F))
		.uv(26, 118).cuboid(-3.5F, -18.85F, -0.9F, 1.7F, 0.75F, 1.8F, new Dilation(0.0F))
		.uv(72, 34).cuboid(-3.5F, -18.0F, -1.0F, 1.5F, 8.2F, 2.0F, new Dilation(0.0F))
		.uv(72, 18).cuboid(-3.5F, -18.0F, -1.0F, 1.5F, 8.2F, 2.0F, new Dilation(0.0F))
		.uv(118, 20).cuboid(-3.5F, -18.85F, -0.9F, 1.7F, 0.75F, 1.8F, new Dilation(0.0F))
		.uv(101, 77).cuboid(-3.5F, -21.0F, -0.9F, 3.4F, 1.05F, 1.9F, new Dilation(0.0F))
		.uv(97, 22).cuboid(-3.5F, -21.0F, -1.0F, 3.3F, 1.15F, 2.0F, new Dilation(0.0F))
		.uv(102, 113).cuboid(-3.5F, -20.0F, -0.9F, 1.95F, 1.05F, 1.8F, new Dilation(0.0F))
		.uv(6, 116).cuboid(-3.5F, -18.85F, -1.0F, 1.6F, 0.85F, 2.0F, new Dilation(0.0F))
		.uv(8, 71).cuboid(-3.5F, -18.0F, -1.0F, 1.5F, 8.2F, 2.0F, new Dilation(0.0F))
		.uv(106, 35).cuboid(-3.4F, -21.0F, -0.9F, 2.5F, 1.45F, 1.8F, new Dilation(0.0F))
		.uv(36, 91).cuboid(-3.6F, -18.0F, -0.7F, 1.7F, 8.2F, 1.4F, new Dilation(0.0F))
		.uv(16, 100).cuboid(-3.5F, -21.0F, -1.0F, 3.2F, 1.15F, 2.0F, new Dilation(0.0F))
		.uv(92, 115).cuboid(-3.5F, -18.85F, -1.0F, 1.6F, 0.85F, 2.0F, new Dilation(0.0F))
		.uv(74, 111).cuboid(-3.5F, -20.0F, -1.0F, 1.85F, 1.15F, 2.0F, new Dilation(0.0F))
		.uv(105, 17).cuboid(-3.4F, -21.0F, -1.0F, 2.4F, 1.55F, 2.0F, new Dilation(0.0F))
		.uv(8, 105).cuboid(-3.4F, -21.0F, -1.0F, 2.4F, 1.55F, 2.0F, new Dilation(0.0F))
		.uv(66, 111).cuboid(-3.5F, -20.0F, -1.0F, 1.85F, 1.15F, 2.0F, new Dilation(0.0F))
		.uv(115, 64).cuboid(-3.5F, -18.85F, -1.0F, 1.6F, 0.85F, 2.0F, new Dilation(0.0F))
		.uv(99, 94).cuboid(-3.5F, -21.0F, -1.0F, 3.2F, 1.15F, 2.0F, new Dilation(0.0F))
		.uv(105, 60).cuboid(-3.4F, -21.0F, -0.9F, 2.5F, 1.45F, 1.8F, new Dilation(0.0F))
		.uv(70, 54).cuboid(-3.5F, -18.0F, -1.0F, 1.5F, 8.2F, 2.0F, new Dilation(0.0F))
		.uv(115, 58).cuboid(-3.5F, -18.85F, -1.0F, 1.6F, 0.85F, 2.0F, new Dilation(0.0F))
		.uv(113, 96).cuboid(-3.5F, -20.0F, -0.9F, 1.95F, 1.05F, 1.8F, new Dilation(0.0F))
		.uv(97, 19).cuboid(-3.5F, -21.0F, -1.0F, 3.3F, 1.15F, 2.0F, new Dilation(0.0F))
		.uv(101, 74).cuboid(-3.5F, -21.0F, -0.9F, 3.4F, 1.05F, 1.9F, new Dilation(0.0F))
		.uv(117, 93).cuboid(-3.5F, -18.85F, -0.9F, 1.7F, 0.75F, 1.8F, new Dilation(0.0F))
		.uv(69, 0).cuboid(-3.5F, -18.0F, -1.0F, 1.5F, 8.2F, 2.0F, new Dilation(0.0F))
		.uv(40, 20).cuboid(-3.6F, -21.1F, -0.9F, 0.1F, 3.15F, 1.8F, new Dilation(0.0F))
		.uv(68, 44).cuboid(-3.5F, -18.0F, -1.0F, 1.5F, 8.2F, 2.0F, new Dilation(0.0F))
		.uv(117, 90).cuboid(-3.5F, -18.85F, -0.9F, 1.7F, 0.75F, 1.8F, new Dilation(0.0F))
		.uv(101, 67).cuboid(-3.5F, -21.0F, -0.9F, 3.4F, 1.05F, 1.9F, new Dilation(0.0F))
		.uv(97, 16).cuboid(-3.5F, -21.0F, -1.0F, 3.3F, 1.15F, 2.0F, new Dilation(0.0F))
		.uv(113, 69).cuboid(-3.5F, -20.0F, -0.9F, 1.95F, 1.05F, 1.8F, new Dilation(0.0F))
		.uv(115, 55).cuboid(-3.5F, -18.85F, -1.0F, 1.6F, 0.85F, 2.0F, new Dilation(0.0F))
		.uv(0, 67).cuboid(-3.5F, -18.0F, -1.0F, 1.5F, 8.2F, 2.0F, new Dilation(0.0F))
		.uv(103, 3).cuboid(-3.4F, -21.0F, -0.9F, 2.5F, 1.45F, 1.8F, new Dilation(0.0F))
		.uv(99, 71).cuboid(-3.5F, -21.0F, -1.0F, 3.2F, 1.15F, 2.0F, new Dilation(0.0F))
		.uv(115, 52).cuboid(-3.5F, -18.85F, -1.0F, 1.6F, 0.85F, 2.0F, new Dilation(0.0F))
		.uv(111, 61).cuboid(-3.5F, -20.0F, -1.0F, 1.85F, 1.15F, 2.0F, new Dilation(0.0F))
		.uv(0, 105).cuboid(-3.4F, -21.0F, -1.0F, 2.4F, 1.55F, 2.0F, new Dilation(0.0F))
		.uv(104, 49).cuboid(-3.4F, -21.0F, -1.0F, 2.4F, 1.55F, 2.0F, new Dilation(0.0F))
		.uv(42, 111).cuboid(-3.5F, -20.0F, -1.0F, 1.85F, 1.15F, 2.0F, new Dilation(0.0F))
		.uv(30, 115).cuboid(-3.5F, -18.85F, -1.0F, 1.6F, 0.85F, 2.0F, new Dilation(0.0F))
		.uv(99, 57).cuboid(-3.5F, -21.0F, -1.0F, 3.2F, 1.15F, 2.0F, new Dilation(0.0F))
		.uv(22, 91).cuboid(-3.6F, -18.0F, -0.7F, 1.7F, 8.2F, 1.4F, new Dilation(0.0F))
		.uv(23, 34).cuboid(-3.4F, -21.0F, -0.9F, 2.5F, 1.45F, 1.8F, new Dilation(0.0F))
		.uv(64, 66).cuboid(-3.5F, -18.0F, -1.0F, 1.5F, 8.2F, 2.0F, new Dilation(0.0F))
		.uv(115, 17).cuboid(-3.5F, -18.85F, -1.0F, 1.6F, 0.85F, 2.0F, new Dilation(0.0F))
		.uv(113, 11).cuboid(-3.5F, -20.0F, -0.9F, 1.95F, 1.05F, 1.8F, new Dilation(0.0F))
		.uv(96, 31).cuboid(-3.5F, -21.0F, -1.0F, 3.3F, 1.15F, 2.0F, new Dilation(0.0F))
		.uv(101, 64).cuboid(-3.5F, -21.0F, -0.9F, 3.4F, 1.05F, 1.9F, new Dilation(0.0F))
		.uv(117, 86).cuboid(-3.5F, -18.85F, -0.9F, 1.7F, 0.75F, 1.8F, new Dilation(0.0F))
		.uv(66, 26).cuboid(-3.5F, -18.0F, -1.0F, 1.5F, 8.2F, 2.0F, new Dilation(0.0F))
		.uv(66, 10).cuboid(-3.5F, -18.0F, -1.0F, 1.5F, 8.2F, 2.0F, new Dilation(0.0F))
		.uv(84, 117).cuboid(-3.5F, -18.85F, -0.9F, 1.7F, 0.75F, 1.8F, new Dilation(0.0F))
		.uv(95, 91).cuboid(-3.5F, -21.0F, -1.0F, 3.3F, 1.15F, 2.0F, new Dilation(0.0F))
		.uv(8, 113).cuboid(-3.5F, -20.0F, -0.9F, 1.95F, 1.05F, 1.8F, new Dilation(0.0F))
		.uv(115, 5).cuboid(-3.5F, -18.85F, -1.0F, 1.6F, 0.85F, 2.0F, new Dilation(0.0F))
		.uv(56, 65).cuboid(-3.5F, -18.0F, -1.0F, 1.5F, 8.2F, 2.0F, new Dilation(0.0F))
		.uv(107, 70).cuboid(-3.4F, -21.0F, -0.9F, 2.5F, 1.35F, 1.8F, new Dilation(0.0F))
		.uv(6, 91).cuboid(-3.6F, -18.0F, -0.7F, 1.7F, 8.2F, 1.4F, new Dilation(0.0F))
		.uv(99, 53).cuboid(-3.5F, -21.0F, -1.0F, 3.2F, 1.15F, 2.0F, new Dilation(0.0F))
		.uv(114, 100).cuboid(-3.5F, -18.85F, -1.0F, 1.6F, 0.85F, 2.0F, new Dilation(0.0F))
		.uv(110, 106).cuboid(-3.5F, -20.0F, -1.0F, 1.85F, 1.15F, 2.0F, new Dilation(0.0F))
		.uv(16, 103).cuboid(-3.4F, -21.0F, -1.0F, 2.7F, 1.55F, 2.0F, new Dilation(0.0F))
		.uv(108, 102).cuboid(-3.5F, -20.0F, -1.0F, 1.95F, 1.65F, 2.0F, new Dilation(0.0F))
		.uv(86, 114).cuboid(-3.5F, -18.85F, -1.0F, 1.6F, 0.85F, 2.0F, new Dilation(0.0F))
		.uv(99, 6).cuboid(-3.5F, -21.0F, -1.0F, 3.2F, 1.15F, 2.0F, new Dilation(0.0F))
		.uv(106, 31).cuboid(-3.4F, -21.0F, -0.9F, 2.3F, 1.85F, 1.8F, new Dilation(0.0F))
		.uv(48, 65).cuboid(-3.5F, -18.0F, -1.0F, 1.5F, 8.2F, 2.0F, new Dilation(0.0F))
		.uv(78, 114).cuboid(-3.5F, -18.85F, -1.0F, 1.6F, 0.85F, 2.0F, new Dilation(0.0F))
		.uv(109, 42).cuboid(-3.5F, -20.0F, -0.9F, 2.15F, 1.25F, 1.8F, new Dilation(0.0F))
		.uv(95, 81).cuboid(-3.5F, -21.0F, -1.0F, 3.3F, 1.15F, 2.0F, new Dilation(0.0F))
		.uv(24, 102).cuboid(-3.5F, -21.0F, -0.9F, 3.4F, 0.95F, 1.9F, new Dilation(0.0F))
		.uv(54, 114).cuboid(-3.5F, -18.85F, -0.9F, 1.7F, 1.45F, 1.8F, new Dilation(0.0F))
		.uv(36, 65).cuboid(-3.5F, -18.0F, -1.0F, 1.5F, 8.2F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData right_knee = right_leg.addChild("right_knee", ModelPartBuilder.create().uv(14, 53).cuboid(-3.5F, -9.8F, -1.0F, 1.5F, 8.3F, 2.0F, new Dilation(0.0F))
		.uv(52, 18).cuboid(-3.5F, -9.8F, -1.0F, 1.5F, 8.3F, 2.0F, new Dilation(0.0F))
		.uv(87, 74).cuboid(-3.6F, -9.8F, -0.7F, 1.7F, 8.3F, 1.4F, new Dilation(0.0F))
		.uv(36, 49).cuboid(-3.5F, -9.8F, -1.0F, 1.5F, 8.3F, 2.0F, new Dilation(0.0F))
		.uv(6, 49).cuboid(-3.5F, -9.8F, -1.0F, 1.5F, 8.3F, 2.0F, new Dilation(0.0F))
		.uv(49, 0).cuboid(-3.5F, -9.8F, -1.0F, 1.5F, 8.3F, 2.0F, new Dilation(0.0F))
		.uv(48, 47).cuboid(-3.5F, -9.8F, -1.0F, 1.5F, 8.3F, 2.0F, new Dilation(0.0F))
		.uv(73, 87).cuboid(-3.6F, -9.8F, -0.7F, 1.7F, 8.3F, 1.4F, new Dilation(0.0F))
		.uv(48, 30).cuboid(-3.5F, -9.8F, -1.0F, 1.5F, 8.3F, 2.0F, new Dilation(0.0F))
		.uv(28, 47).cuboid(-3.5F, -9.8F, -1.0F, 1.5F, 8.3F, 2.0F, new Dilation(0.0F))
		.uv(20, 45).cuboid(-3.5F, -9.8F, -1.0F, 1.5F, 8.3F, 2.0F, new Dilation(0.0F))
		.uv(45, 10).cuboid(-3.5F, -9.8F, -1.0F, 1.5F, 8.3F, 2.0F, new Dilation(0.0F))
		.uv(0, 87).cuboid(-3.6F, -9.8F, -0.7F, 1.7F, 8.3F, 1.4F, new Dilation(0.0F))
		.uv(44, 20).cuboid(-3.5F, -9.8F, -1.0F, 1.5F, 8.3F, 2.0F, new Dilation(0.0F))
		.uv(42, 39).cuboid(-3.5F, -9.8F, -1.0F, 1.5F, 8.3F, 2.0F, new Dilation(0.0F))
		.uv(0, 41).cuboid(-3.5F, -9.8F, -1.0F, 1.5F, 8.3F, 2.0F, new Dilation(0.0F))
		.uv(12, 40).cuboid(-3.5F, -9.8F, -1.0F, 1.5F, 8.3F, 2.0F, new Dilation(0.0F))
		.uv(86, 53).cuboid(-3.6F, -9.8F, -0.7F, 1.7F, 8.3F, 1.4F, new Dilation(0.0F))
		.uv(34, 39).cuboid(-3.5F, -9.8F, -1.0F, 1.5F, 8.3F, 2.0F, new Dilation(0.0F))
		.uv(26, 37).cuboid(-3.5F, -9.8F, -1.0F, 1.5F, 8.3F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData right_foot = right_knee.addChild("right_foot", ModelPartBuilder.create().uv(109, 65).cuboid(-3.6F, -1.5F, -1.2F, 1.7F, 1.55F, 2.1F, new Dilation(0.0F))
		.uv(40, 0).cuboid(-3.4F, -0.9F, -2.0F, 1.3F, 0.95F, 3.1F, new Dilation(0.0F))
		.uv(32, 112).cuboid(-3.7F, -0.9F, -1.1F, 1.9F, 0.95F, 2.0F, new Dilation(0.0F))
		.uv(89, 81).cuboid(-3.4F, -0.5F, -2.8F, 1.3F, 0.55F, 3.9F, new Dilation(0.0F))
		.uv(92, 53).cuboid(-3.6F, -0.7F, -2.3F, 1.7F, 0.75F, 3.4F, new Dilation(0.0F))
		.uv(11, 34).cuboid(-3.6F, -0.1F, -3.0F, 1.7F, 0.15F, 1.2F, new Dilation(0.0F))
		.uv(15, 27).cuboid(-3.7F, -0.1F, -2.3F, 1.9F, 0.15F, 1.1F, new Dilation(0.0F))
		.uv(15, 0).cuboid(-3.8F, -0.1F, -1.2F, 2.1F, 0.15F, 2.5F, new Dilation(0.0F))
		.uv(109, 50).cuboid(-3.3F, -1.2F, -1.7F, 1.1F, 1.25F, 2.6F, new Dilation(0.0F))
		.uv(93, 66).cuboid(-3.5F, -0.7F, -2.4F, 1.5F, 0.75F, 3.5F, new Dilation(0.0F))
		.uv(107, 109).cuboid(-3.2F, -1.3F, -1.6F, 0.9F, 1.35F, 2.6F, new Dilation(0.0F))
		.uv(108, 3).cuboid(-3.3F, -1.0F, -1.9F, 1.1F, 1.05F, 2.8F, new Dilation(0.0F))
		.uv(39, 104).cuboid(-3.3F, -0.9F, -2.1F, 1.1F, 0.95F, 3.2F, new Dilation(0.0F))
		.uv(89, 92).cuboid(-3.3F, -0.6F, -2.7F, 1.1F, 0.65F, 3.8F, new Dilation(0.0F))
		.uv(38, 10).cuboid(-3.5F, -1.5F, -1.3F, 1.5F, 1.55F, 2.3F, new Dilation(0.0F))
		.uv(112, 30).cuboid(-3.6F, -1.0F, -1.1F, 1.7F, 1.05F, 2.1F, new Dilation(0.0F))
		.uv(12, 26).cuboid(-3.3F, -0.8F, 1.1F, 1.1F, 0.85F, 0.1F, new Dilation(0.0F))
		.uv(32, 21).cuboid(-3.2F, -0.9F, 1.1F, 0.9F, 0.95F, 0.1F, new Dilation(0.0F))
		.uv(12, 24).cuboid(-3.2F, -1.3F, 1.0F, 0.9F, 1.35F, 0.1F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-3.3F, -1.2F, 1.0F, 1.1F, 1.25F, 0.1F, new Dilation(0.0F))
		.uv(94, 43).cuboid(-3.5F, -0.8F, -2.3F, 1.5F, 0.85F, 3.4F, new Dilation(0.0F))
		.uv(0, 23).cuboid(-3.3F, -0.7F, -2.6F, 1.1F, 0.65F, 0.2F, new Dilation(0.0F))
		.uv(32, 19).cuboid(-3.2F, -0.7F, -2.7F, 0.9F, 0.65F, 0.2F, new Dilation(0.0F))
		.uv(0, 21).cuboid(-3.3F, -0.5F, -2.9F, 1.1F, 0.55F, 0.3F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData left_arm = body.addChild("left_arm", ModelPartBuilder.create().uv(0, 96).cuboid(-1.8F, -14.8F, -1.1F, 1.0F, 1.5F, 2.2F, new Dilation(0.0F))
		.uv(30, 83).cuboid(-0.9F, -14.8F, -1.0F, 1.4F, 7.8F, 2.0F, new Dilation(0.0F))
		.uv(90, 33).cuboid(-1.0F, -14.8F, -0.8F, 1.6F, 7.8F, 1.6F, new Dilation(0.0F))
		.uv(58, 110).cuboid(-1.8F, -15.2F, -0.8F, 2.1F, 1.9F, 1.6F, new Dilation(0.0F))
		.uv(8, 109).cuboid(-1.8F, -15.2F, -0.9F, 2.0F, 1.9F, 1.8F, new Dilation(0.0F))
		.uv(0, 51).cuboid(-1.8F, -15.4F, -0.7F, 2.0F, 2.1F, 1.4F, new Dilation(0.0F))
		.uv(84, 103).cuboid(-0.7F, -13.1F, -0.8F, 1.0F, 6.1F, 1.6F, new Dilation(0.0F))
		.uv(113, 0).cuboid(-1.8F, -15.4F, -0.8F, 1.9F, 2.1F, 1.6F, new Dilation(0.0F)), ModelTransform.pivot(5.4F, -18.7F, 0.0F));

		ModelPartData left_elbow = left_arm.addChild("left_elbow", ModelPartBuilder.create().uv(104, 104).cuboid(4.7F, -24.0F, -0.8F, 1.0F, 5.8F, 1.6F, new Dilation(0.0F))
		.uv(93, 72).cuboid(4.4F, -25.7F, -0.8F, 1.6F, 7.5F, 1.6F, new Dilation(0.0F))
		.uv(86, 26).cuboid(4.5F, -25.7F, -1.0F, 1.4F, 7.5F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-5.4F, 18.7F, 0.0F));

		ModelPartData left_hand = left_elbow.addChild("left_hand", ModelPartBuilder.create().uv(14, 111).cuboid(-0.5F, 0.2F, -0.8F, 0.7F, 1.1F, 1.6F, new Dilation(0.0F))
		.uv(38, 59).cuboid(-0.5F, 0.2F, -0.5F, 0.7F, 1.6F, 1.3F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-0.2F, 1.8F, -0.1F, 0.3F, 0.8F, 0.3F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-0.2F, 2.6F, -0.1F, 0.3F, 0.8F, 0.3F, new Dilation(0.0F)), ModelTransform.pivot(5.4F, -18.7F, 0.0F));

		ModelPartData cube_r1 = left_hand.addChild("cube_r1", ModelPartBuilder.create().uv(0, 0).cuboid(-0.3F, 2.4F, 0.1F, 0.3F, 0.6F, 0.3F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-0.3F, 1.8F, 0.1F, 0.3F, 0.6F, 0.3F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.2443F, 0.0F, 0.0F));

		ModelPartData cube_r2 = left_hand.addChild("cube_r2", ModelPartBuilder.create().uv(0, 0).cuboid(-0.2F, 1.5F, 0.1F, 0.3F, 0.7F, 0.3F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-0.2F, 0.8F, 0.1F, 0.3F, 0.7F, 0.3F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.0F, 0.1F, 0.0524F, 0.0F, 0.0F));

		ModelPartData cube_r3 = left_hand.addChild("cube_r3", ModelPartBuilder.create().uv(0, 0).cuboid(-0.2F, 1.5F, -0.5F, 0.3F, 0.7F, 0.3F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-0.2F, 0.8F, -0.5F, 0.3F, 0.7F, 0.3F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.0F, 0.1F, -0.0698F, 0.0F, 0.0F));

		ModelPartData cube_r4 = left_hand.addChild("cube_r4", ModelPartBuilder.create().uv(0, 35).cuboid(-0.3F, 1.3F, -0.8F, 0.5F, 0.7F, 0.3F, new Dilation(0.0F))
		.uv(35, 7).cuboid(-0.3F, 0.6F, -0.8F, 0.5F, 0.7F, 0.3F, new Dilation(0.0F)), ModelTransform.of(-0.1F, 0.6875F, 0.0688F, -0.1047F, 0.0F, 0.0F));

		ModelPartData right_arm = body.addChild("right_arm", ModelPartBuilder.create().uv(24, 75).cuboid(0.8F, -14.8F, -1.1F, 1.0F, 1.5F, 2.2F, new Dilation(0.0F))
		.uv(16, 83).cuboid(-0.5F, -14.8F, -1.0F, 1.4F, 7.8F, 2.0F, new Dilation(0.0F))
		.uv(89, 16).cuboid(-0.6F, -14.8F, -0.8F, 1.6F, 7.8F, 1.6F, new Dilation(0.0F))
		.uv(50, 110).cuboid(-0.3F, -15.2F, -0.8F, 2.1F, 1.9F, 1.6F, new Dilation(0.0F))
		.uv(109, 7).cuboid(-0.2F, -15.2F, -0.9F, 2.0F, 1.9F, 1.8F, new Dilation(0.0F))
		.uv(14, 50).cuboid(-0.2F, -15.4F, -0.7F, 2.0F, 2.1F, 1.4F, new Dilation(0.0F))
		.uv(78, 103).cuboid(-0.3F, -13.1F, -0.8F, 1.0F, 6.1F, 1.6F, new Dilation(0.0F))
		.uv(0, 113).cuboid(-0.1F, -15.4F, -0.8F, 1.9F, 2.1F, 1.6F, new Dilation(0.0F)), ModelTransform.pivot(-5.4F, -18.7F, 0.0F));

		ModelPartData right_elbow = right_arm.addChild("right_elbow", ModelPartBuilder.create().uv(98, 104).cuboid(-5.7F, -24.0F, -0.8F, 1.0F, 5.8F, 1.6F, new Dilation(0.0F))
		.uv(93, 7).cuboid(-6.0F, -25.7F, -0.8F, 1.6F, 7.5F, 1.6F, new Dilation(0.0F))
		.uv(56, 85).cuboid(-5.9F, -25.7F, -1.0F, 1.4F, 7.5F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(5.4F, 18.7F, 0.0F));

		ModelPartData right_hand = right_elbow.addChild("right_hand", ModelPartBuilder.create().uv(52, 104).cuboid(-0.2F, 0.2F, -0.8F, 0.7F, 1.1F, 1.6F, new Dilation(0.0F))
		.uv(57, 3).cuboid(-0.2F, 0.2F, -0.5F, 0.7F, 1.6F, 1.3F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-0.1F, 1.8F, -0.1F, 0.3F, 0.8F, 0.3F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-0.1F, 2.6F, -0.1F, 0.3F, 0.8F, 0.3F, new Dilation(0.0F)), ModelTransform.pivot(-5.4F, -18.7F, 0.0F));

		ModelPartData cube_r5 = right_hand.addChild("cube_r5", ModelPartBuilder.create().uv(0, 0).cuboid(0.0F, 2.4F, 0.1F, 0.3F, 0.6F, 0.3F, new Dilation(0.0F))
		.uv(0, 0).cuboid(0.0F, 1.8F, 0.1F, 0.3F, 0.6F, 0.3F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.2443F, 0.0F, 0.0F));

		ModelPartData cube_r6 = right_hand.addChild("cube_r6", ModelPartBuilder.create().uv(0, 0).cuboid(-0.1F, 1.5F, 0.1F, 0.3F, 0.7F, 0.3F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-0.1F, 0.8F, 0.1F, 0.3F, 0.7F, 0.3F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.0F, 0.1F, 0.0524F, 0.0F, 0.0F));

		ModelPartData cube_r7 = right_hand.addChild("cube_r7", ModelPartBuilder.create().uv(0, 0).cuboid(-0.1F, 1.5F, -0.5F, 0.3F, 0.7F, 0.3F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-0.1F, 0.8F, -0.5F, 0.3F, 0.7F, 0.3F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.0F, 0.1F, -0.0698F, 0.0F, 0.0F));

		ModelPartData cube_r8 = right_hand.addChild("cube_r8", ModelPartBuilder.create().uv(34, 29).cuboid(-0.2F, 1.3F, -0.8F, 0.5F, 0.7F, 0.3F, new Dilation(0.0F))
		.uv(34, 30).cuboid(-0.2F, 0.6F, -0.8F, 0.5F, 0.7F, 0.3F, new Dilation(0.0F)), ModelTransform.of(0.1F, 0.6875F, 0.0688F, -0.1047F, 0.0F, 0.0F));

		ModelPartData head = body.addChild("head", ModelPartBuilder.create().uv(84, 70).cuboid(-1.7F, -39.0F, -1.2F, 3.2F, 2.3F, 2.4F, new Dilation(0.0F))
		.uv(0, 21).cuboid(-1.4F, -39.0F, -1.7F, 2.6F, 2.5F, 3.4F, new Dilation(0.0F))
		.uv(14, 34).cuboid(-1.5F, -39.2F, -1.5F, 2.8F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(83, 10).cuboid(-1.1F, -39.0F, -1.7F, 2.0F, 3.0F, 3.3F, new Dilation(0.0F))
		.uv(37, 4).cuboid(-1.6F, -39.2F, -1.4F, 3.0F, 2.8F, 2.9F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-0.2F, -38.1F, -1.9F, 0.2F, 0.9F, 0.1F, new Dilation(0.0F))
		.uv(32, 23).cuboid(-1.3F, -39.0F, -1.8F, 2.4F, 2.4F, 3.5F, new Dilation(0.009F))
		.uv(35, 16).cuboid(-1.3F, -39.0F, -1.7F, 2.4F, 2.6F, 3.4F, new Dilation(0.0F))
		.uv(0, 0).cuboid(1.5F, -37.8F, -0.8F, 0.1F, 0.4F, 0.3F, new Dilation(0.0F))
		.uv(0, 0).cuboid(1.5F, -38.1F, -0.8F, 0.1F, 0.6F, 0.4F, new Dilation(0.01F))
		.uv(62, 81).cuboid(-1.0F, -39.0F, -1.8F, 1.8F, 2.9F, 3.5F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-0.3F, -37.4F, -1.9F, 0.4F, 0.2F, 0.1F, new Dilation(0.0F))
		.uv(35, 10).cuboid(-1.3F, -39.1F, -1.9F, 2.4F, 0.3F, 0.6F, new Dilation(0.0F))
		.uv(0, 0).cuboid(0.8F, -39.1F, -1.9F, 0.3F, 0.6F, 0.1F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.3F, -39.1F, -1.9F, 0.3F, 0.6F, 0.1F, new Dilation(0.0F))
		.uv(0, 0).cuboid(1.5F, -38.9F, -1.2F, 0.1F, 1.8F, 0.4F, new Dilation(0.0F))
		.uv(9, 21).cuboid(1.5F, -38.9F, -1.2F, 0.1F, 1.2F, 2.3F, new Dilation(0.0F))
		.uv(0, 1).cuboid(1.5F, -38.9F, -0.1F, 0.1F, 1.5F, 1.2F, new Dilation(0.0F))
		.uv(16, 10).cuboid(1.5F, -38.9F, 0.2F, 0.1F, 1.9F, 0.9F, new Dilation(0.0F))
		.uv(14, 19).cuboid(-1.8F, -38.9F, -1.2F, 0.1F, 1.2F, 2.3F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.8F, -38.9F, -1.2F, 0.1F, 1.8F, 0.4F, new Dilation(0.0F))
		.uv(0, 10).cuboid(-1.8F, -38.9F, 0.2F, 0.1F, 1.9F, 0.9F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.8F, -38.9F, -0.1F, 0.1F, 1.5F, 1.2F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.8F, -38.1F, -0.8F, 0.1F, 0.6F, 0.4F, new Dilation(0.01F))
		.uv(0, 0).cuboid(-1.8F, -37.8F, -0.8F, 0.1F, 0.4F, 0.3F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData glasses = head.addChild("glasses", ModelPartBuilder.create().uv(0, 0).cuboid(1.4806F, 4.7863F, 0.5F, 1.1F, 0.4F, 0.0F, new Dilation(0.0F))
		.uv(12, 35).cuboid(1.3806F, 4.2863F, 0.5F, 0.7F, 0.7F, 0.0F, new Dilation(0.0F))
		.uv(29, 7).cuboid(1.3806F, 4.3863F, 0.5F, 1.3F, 0.7F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(1.6237F, 5.135F, 0.5F, 0.8F, 0.1F, 0.1F, new Dilation(0.0F))
		.uv(29, 34).cuboid(1.4806F, 4.3863F, 0.5F, 1.1F, 0.8F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(2.7806F, 4.5863F, 0.5F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-0.7194F, 4.5863F, 0.5F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F))
		.uv(23, 34).cuboid(-0.4194F, 4.3863F, 0.5F, 1.1F, 0.8F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-0.2625F, 5.135F, 0.5F, 0.8F, 0.1F, 0.1F, new Dilation(0.0F))
		.uv(0, 28).cuboid(-0.5194F, 4.3863F, 0.5F, 1.3F, 0.7F, 0.0F, new Dilation(0.0F))
		.uv(14, 35).cuboid(0.0806F, 4.2863F, 0.5F, 0.7F, 0.7F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-0.4194F, 4.7863F, 0.5F, 1.1F, 0.4F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.1806F, -42.6863F, -2.6F));

		ModelPartData cube_r9 = glasses.addChild("cube_r9", ModelPartBuilder.create().uv(0, 0).cuboid(-1.1173F, -0.3868F, 0.0F, 0.3F, 0.1F, 0.1F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.1173F, -0.1868F, 0.0F, 0.3F, 0.1F, 0.1F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-0.7173F, -0.0868F, 0.0F, 1.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(0.0F, 4.3F, 0.5F, 0.0F, 0.0F, 3.1242F));

		ModelPartData cube_r10 = glasses.addChild("cube_r10", ModelPartBuilder.create().uv(38, 0).cuboid(-0.2423F, -0.3669F, 0.0F, 0.5F, 0.6F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.5806F, 4.8863F, 0.5F, 0.0F, 0.0F, -0.6283F));

		ModelPartData cube_r11 = glasses.addChild("cube_r11", ModelPartBuilder.create().uv(0, 0).cuboid(-1.3F, -0.1F, 0.0F, 0.6F, 0.3F, 0.0F, new Dilation(0.0F))
		.uv(23, 35).cuboid(-1.4F, -0.4F, 0.0F, 0.7F, 0.6F, 0.0F, new Dilation(0.0F))
		.uv(14, 36).cuboid(-1.3F, -0.5F, 0.0F, 0.6F, 0.7F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.7806F, 4.6863F, 0.5F, 0.0F, 0.0F, -0.1396F));

		ModelPartData cube_r12 = glasses.addChild("cube_r12", ModelPartBuilder.create().uv(0, 0).cuboid(0.0F, -0.1F, 0.0F, 0.2F, 0.4F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.7806F, 4.6863F, 0.5F, 0.0F, 0.0F, 0.2618F));

		ModelPartData cube_r13 = glasses.addChild("cube_r13", ModelPartBuilder.create().uv(0, 0).cuboid(-0.1F, -0.3F, 0.0F, 0.2F, 0.6F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.7806F, 4.6863F, 0.5F, 0.0F, 0.0F, 0.3316F));

		ModelPartData cube_r14 = glasses.addChild("cube_r14", ModelPartBuilder.create().uv(0, 0).cuboid(1.7625F, 0.3017F, 0.0F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(2.5758F, 4.6923F, 0.5F, 0.0F, 0.0F, -3.1329F));

		ModelPartData cube_r15 = glasses.addChild("cube_r15", ModelPartBuilder.create().uv(0, 0).cuboid(1.6625F, 0.3017F, 0.0F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(2.2915F, 5.3208F, 0.5F, 0.0F, 0.0F, -2.7489F));

		ModelPartData cube_r16 = glasses.addChild("cube_r16", ModelPartBuilder.create().uv(0, 0).cuboid(1.5625F, 0.3017F, 0.0F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(1.5199F, 5.9111F, 0.5F, 0.0F, 0.0F, -2.1729F));

		ModelPartData cube_r17 = glasses.addChild("cube_r17", ModelPartBuilder.create().uv(0, 0).cuboid(1.4625F, 0.3017F, 0.0F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(1.1368F, 6.0001F, 0.5F, 0.0F, 0.0F, -1.9286F));

		ModelPartData cube_r18 = glasses.addChild("cube_r18", ModelPartBuilder.create().uv(0, 0).cuboid(1.3625F, 0.3017F, 0.0F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(0.8198F, 5.9953F, 0.5F, 0.0F, 0.0F, -1.7191F));

		ModelPartData cube_r19 = glasses.addChild("cube_r19", ModelPartBuilder.create().uv(0, 0).cuboid(1.2625F, 0.3017F, 0.0F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(0.555F, 5.9321F, 0.5F, 0.0F, 0.0F, -1.5272F));

		ModelPartData cube_r20 = glasses.addChild("cube_r20", ModelPartBuilder.create().uv(0, 0).cuboid(1.1625F, 0.3017F, 0.0F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(0.4068F, 5.8672F, 0.5F, 0.0F, 0.0F, -1.405F));

		ModelPartData cube_r21 = glasses.addChild("cube_r21", ModelPartBuilder.create().uv(0, 0).cuboid(1.0625F, 0.3017F, 0.0F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(0.3602F, 5.8405F, 0.5F, 0.0F, 0.0F, -1.3614F));

		ModelPartData cube_r22 = glasses.addChild("cube_r22", ModelPartBuilder.create().uv(0, 0).cuboid(0.9625F, 0.3017F, 0.0F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(0.2036F, 5.7194F, 0.5F, 0.0F, 0.0F, -1.1868F));

		ModelPartData cube_r23 = glasses.addChild("cube_r23", ModelPartBuilder.create().uv(0, 0).cuboid(0.8625F, 0.3017F, 0.0F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(0.0859F, 5.5808F, 0.5F, 0.0F, 0.0F, -1.0123F));

		ModelPartData cube_r24 = glasses.addChild("cube_r24", ModelPartBuilder.create().uv(0, 0).cuboid(0.7625F, 0.3017F, 0.0F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(-0.0045F, 5.4036F, 0.5F, 0.0F, 0.0F, -0.8029F));

		ModelPartData cube_r25 = glasses.addChild("cube_r25", ModelPartBuilder.create().uv(0, 0).cuboid(0.6625F, 0.3017F, 0.0F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(-0.0441F, 5.2126F, 0.5F, 0.0F, 0.0F, -0.576F));

		ModelPartData cube_r26 = glasses.addChild("cube_r26", ModelPartBuilder.create().uv(0, 0).cuboid(0.5625F, 0.3017F, 0.0F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(-0.0321F, 5.051F, 0.5F, 0.0F, 0.0F, -0.3665F));

		ModelPartData cube_r27 = glasses.addChild("cube_r27", ModelPartBuilder.create().uv(0, 0).cuboid(1.6827F, -0.0868F, 0.0F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(-1.1374F, 5.3977F, 0.5F, 0.0F, 0.0F, -0.1047F));

		ModelPartData cube_r28 = glasses.addChild("cube_r28", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5173F, -0.0868F, 0.0F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(-0.86F, 4.4205F, 0.5F, 0.0F, 0.0F, 2.9148F));

		ModelPartData cube_r29 = glasses.addChild("cube_r29", ModelPartBuilder.create().uv(0, 0).cuboid(-0.4173F, -0.0868F, 0.0F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(-0.844F, 4.4689F, 0.5F, 0.0F, 0.0F, 2.7926F));

		ModelPartData cube_r30 = glasses.addChild("cube_r30", ModelPartBuilder.create().uv(0, 0).cuboid(-0.3173F, -0.0868F, 0.0F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(-0.7923F, 4.5537F, 0.5F, 0.0F, 0.0F, 2.4785F));

		ModelPartData cube_r31 = glasses.addChild("cube_r31", ModelPartBuilder.create().uv(0, 0).cuboid(-0.2173F, -0.0868F, 0.0F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(-0.7526F, 4.5889F, 0.5F, 0.0F, 0.0F, 2.2341F));

		ModelPartData cube_r32 = glasses.addChild("cube_r32", ModelPartBuilder.create().uv(0, 0).cuboid(-0.1173F, -0.0868F, 0.0F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(-0.7084F, 4.605F, 0.5F, 0.0F, 0.0F, 1.8327F));

		ModelPartData cube_r33 = glasses.addChild("cube_r33", ModelPartBuilder.create().uv(0, 0).cuboid(0.6827F, -0.0868F, 0.0F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(-1.0435F, 5.1808F, 0.5F, 0.0F, 0.0F, 0.0524F));

		ModelPartData cube_r34 = glasses.addChild("cube_r34", ModelPartBuilder.create().uv(0, 0).cuboid(0.4827F, -0.0868F, 0.0F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(-0.9125F, 5.0371F, 0.5F, 0.0F, 0.0F, 0.3142F));

		ModelPartData cube_r35 = glasses.addChild("cube_r35", ModelPartBuilder.create().uv(0, 0).cuboid(0.3827F, -0.0868F, 0.0F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(-0.835F, 4.8978F, 0.5F, 0.0F, 0.0F, 0.6458F));

		ModelPartData cube_r36 = glasses.addChild("cube_r36", ModelPartBuilder.create().uv(0, 0).cuboid(0.1827F, -0.0868F, 0.0F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(-0.724F, 4.8073F, 0.5F, 0.0F, 0.0F, 1.0821F));

		ModelPartData cube_r37 = glasses.addChild("cube_r37", ModelPartBuilder.create().uv(0, 0).cuboid(0.2827F, -0.0868F, 0.0F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(-0.7784F, 4.8411F, 0.5F, 0.0F, 0.0F, 0.8552F));

		ModelPartData cube_r38 = glasses.addChild("cube_r38", ModelPartBuilder.create().uv(0, 0).cuboid(-0.0173F, -0.0868F, 0.0F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(-0.7021F, 4.6995F, 0.5F, 0.0F, 0.0F, 1.4662F));

		ModelPartData cube_r39 = glasses.addChild("cube_r39", ModelPartBuilder.create().uv(0, 0).cuboid(0.0827F, -0.0868F, 0.0F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(-0.6938F, 4.797F, 0.5F, 0.0F, 0.0F, 1.2566F));

		ModelPartData cube_r40 = glasses.addChild("cube_r40", ModelPartBuilder.create().uv(0, 0).cuboid(0.0793F, -0.0609F, 0.0F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(-0.6894F, 4.6964F, 0.5F, 0.0F, 0.0F, 1.309F));

		ModelPartData cube_r41 = glasses.addChild("cube_r41", ModelPartBuilder.create().uv(0, 0).cuboid(-0.1793F, -0.0609F, 0.0F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(2.8506F, 4.6964F, 0.5F, 0.0F, 0.0F, -1.309F));

		ModelPartData cube_r42 = glasses.addChild("cube_r42", ModelPartBuilder.create().uv(0, 0).cuboid(-0.05F, 0.0F, -0.1F, 0.1F, 0.1F, 2.1F, new Dilation(0.009F)), ModelTransform.of(-0.6694F, 4.5863F, 0.6F, 0.0F, 0.0436F, 0.0F));

		ModelPartData cube_r43 = glasses.addChild("cube_r43", ModelPartBuilder.create().uv(0, 0).cuboid(-0.05F, 0.0F, -0.1F, 0.1F, 0.1F, 2.1F, new Dilation(0.009F)), ModelTransform.of(2.8306F, 4.5863F, 0.6F, 0.0F, -0.0436F, 0.0F));

		ModelPartData cube_r44 = glasses.addChild("cube_r44", ModelPartBuilder.create().uv(0, 0).cuboid(-0.1827F, -0.0868F, 0.0F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(2.855F, 4.797F, 0.5F, 0.0F, 0.0F, -1.2566F));

		ModelPartData cube_r45 = glasses.addChild("cube_r45", ModelPartBuilder.create().uv(0, 0).cuboid(-0.0827F, -0.0868F, 0.0F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(2.8633F, 4.6995F, 0.5F, 0.0F, 0.0F, -1.4662F));

		ModelPartData cube_r46 = glasses.addChild("cube_r46", ModelPartBuilder.create().uv(0, 0).cuboid(-0.3827F, -0.0868F, 0.0F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(2.9396F, 4.8411F, 0.5F, 0.0F, 0.0F, -0.8552F));

		ModelPartData cube_r47 = glasses.addChild("cube_r47", ModelPartBuilder.create().uv(0, 0).cuboid(-0.2827F, -0.0868F, 0.0F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(2.8852F, 4.8073F, 0.5F, 0.0F, 0.0F, -1.0821F));

		ModelPartData cube_r48 = glasses.addChild("cube_r48", ModelPartBuilder.create().uv(0, 0).cuboid(-0.4827F, -0.0868F, 0.0F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(2.9962F, 4.8978F, 0.5F, 0.0F, 0.0F, -0.6458F));

		ModelPartData cube_r49 = glasses.addChild("cube_r49", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5827F, -0.0868F, 0.0F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(3.0737F, 5.0371F, 0.5F, 0.0F, 0.0F, -0.3142F));

		ModelPartData cube_r50 = glasses.addChild("cube_r50", ModelPartBuilder.create().uv(0, 0).cuboid(-0.7827F, -0.0868F, 0.0F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(3.2047F, 5.1808F, 0.5F, 0.0F, 0.0F, -0.0524F));

		ModelPartData cube_r51 = glasses.addChild("cube_r51", ModelPartBuilder.create().uv(0, 0).cuboid(0.0173F, -0.0868F, 0.0F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(2.8696F, 4.605F, 0.5F, 0.0F, 0.0F, -1.8327F));

		ModelPartData cube_r52 = glasses.addChild("cube_r52", ModelPartBuilder.create().uv(0, 0).cuboid(0.1173F, -0.0868F, 0.0F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(2.9138F, 4.5889F, 0.5F, 0.0F, 0.0F, -2.2341F));

		ModelPartData cube_r53 = glasses.addChild("cube_r53", ModelPartBuilder.create().uv(0, 0).cuboid(0.2173F, -0.0868F, 0.0F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(2.9535F, 4.5537F, 0.5F, 0.0F, 0.0F, -2.4785F));

		ModelPartData cube_r54 = glasses.addChild("cube_r54", ModelPartBuilder.create().uv(0, 0).cuboid(0.3173F, -0.0868F, 0.0F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(3.0052F, 4.4689F, 0.5F, 0.0F, 0.0F, -2.7926F));

		ModelPartData cube_r55 = glasses.addChild("cube_r55", ModelPartBuilder.create().uv(0, 0).cuboid(0.4173F, -0.0868F, 0.0F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(3.0212F, 4.4205F, 0.5F, 0.0F, 0.0F, -2.9148F));

		ModelPartData cube_r56 = glasses.addChild("cube_r56", ModelPartBuilder.create().uv(0, 0).cuboid(-0.3827F, -0.0868F, 0.0F, 1.1F, 0.1F, 0.1F, new Dilation(0.0F))
		.uv(0, 0).cuboid(0.8173F, -0.1868F, 0.0F, 0.3F, 0.1F, 0.1F, new Dilation(0.0F))
		.uv(0, 0).cuboid(0.8173F, -0.3868F, 0.0F, 0.3F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(2.1612F, 4.3F, 0.5F, 0.0F, 0.0F, -3.1242F));

		ModelPartData cube_r57 = glasses.addChild("cube_r57", ModelPartBuilder.create().uv(0, 0).cuboid(-1.7827F, -0.0868F, 0.0F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(3.2986F, 5.3977F, 0.5F, 0.0F, 0.0F, 0.1047F));

		ModelPartData cube_r58 = glasses.addChild("cube_r58", ModelPartBuilder.create().uv(0, 0).cuboid(-0.6625F, 0.3017F, 0.0F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(2.1933F, 5.051F, 0.5F, 0.0F, 0.0F, 0.3665F));

		ModelPartData cube_r59 = glasses.addChild("cube_r59", ModelPartBuilder.create().uv(0, 0).cuboid(-0.7625F, 0.3017F, 0.0F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(2.2053F, 5.2126F, 0.5F, 0.0F, 0.0F, 0.576F));

		ModelPartData cube_r60 = glasses.addChild("cube_r60", ModelPartBuilder.create().uv(0, 0).cuboid(-0.8625F, 0.3017F, 0.0F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(2.1657F, 5.4036F, 0.5F, 0.0F, 0.0F, 0.8029F));

		ModelPartData cube_r61 = glasses.addChild("cube_r61", ModelPartBuilder.create().uv(0, 0).cuboid(-0.9625F, 0.3017F, 0.0F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(2.0753F, 5.5808F, 0.5F, 0.0F, 0.0F, 1.0123F));

		ModelPartData cube_r62 = glasses.addChild("cube_r62", ModelPartBuilder.create().uv(0, 0).cuboid(-1.0625F, 0.3017F, 0.0F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(1.9576F, 5.7194F, 0.5F, 0.0F, 0.0F, 1.1868F));

		ModelPartData cube_r63 = glasses.addChild("cube_r63", ModelPartBuilder.create().uv(0, 0).cuboid(-1.1625F, 0.3017F, 0.0F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(1.801F, 5.8405F, 0.5F, 0.0F, 0.0F, 1.3614F));

		ModelPartData cube_r64 = glasses.addChild("cube_r64", ModelPartBuilder.create().uv(0, 0).cuboid(-1.2625F, 0.3017F, 0.0F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(1.7544F, 5.8672F, 0.5F, 0.0F, 0.0F, 1.405F));

		ModelPartData cube_r65 = glasses.addChild("cube_r65", ModelPartBuilder.create().uv(0, 0).cuboid(-1.3625F, 0.3017F, 0.0F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(1.6062F, 5.9321F, 0.5F, 0.0F, 0.0F, 1.5272F));

		ModelPartData cube_r66 = glasses.addChild("cube_r66", ModelPartBuilder.create().uv(0, 0).cuboid(-1.4625F, 0.3017F, 0.0F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(1.3414F, 5.9953F, 0.5F, 0.0F, 0.0F, 1.7191F));

		ModelPartData cube_r67 = glasses.addChild("cube_r67", ModelPartBuilder.create().uv(0, 0).cuboid(-1.5625F, 0.3017F, 0.0F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(1.0244F, 6.0001F, 0.5F, 0.0F, 0.0F, 1.9286F));

		ModelPartData cube_r68 = glasses.addChild("cube_r68", ModelPartBuilder.create().uv(0, 0).cuboid(-1.6625F, 0.3017F, 0.0F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(0.6413F, 5.9111F, 0.5F, 0.0F, 0.0F, 2.1729F));

		ModelPartData cube_r69 = glasses.addChild("cube_r69", ModelPartBuilder.create().uv(0, 0).cuboid(-1.7625F, 0.3017F, 0.0F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(-0.1303F, 5.3208F, 0.5F, 0.0F, 0.0F, 2.7489F));

		ModelPartData cube_r70 = glasses.addChild("cube_r70", ModelPartBuilder.create().uv(0, 0).cuboid(-1.8625F, 0.3017F, 0.0F, 0.1F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.of(-0.4146F, 4.6923F, 0.5F, 0.0F, 0.0F, 3.1329F));

		ModelPartData cube_r71 = glasses.addChild("cube_r71", ModelPartBuilder.create().uv(26, 37).cuboid(0.7F, -0.5F, 0.0F, 0.6F, 0.7F, 0.0F, new Dilation(0.0F))
		.uv(29, 35).cuboid(0.7F, -0.4F, 0.0F, 0.7F, 0.6F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(0.7F, -0.1F, 0.0F, 0.6F, 0.3F, 0.0F, new Dilation(0.0F)), ModelTransform.of(1.3806F, 4.6863F, 0.5F, 0.0F, 0.0F, 0.1396F));

		ModelPartData cube_r72 = glasses.addChild("cube_r72", ModelPartBuilder.create().uv(0, 0).cuboid(-0.1F, -0.3F, 0.0F, 0.2F, 0.6F, 0.0F, new Dilation(0.0F)), ModelTransform.of(1.3806F, 4.6863F, 0.5F, 0.0F, 0.0F, -0.3316F));

		ModelPartData cube_r73 = glasses.addChild("cube_r73", ModelPartBuilder.create().uv(0, 0).cuboid(-0.2F, -0.1F, 0.0F, 0.2F, 0.4F, 0.0F, new Dilation(0.0F)), ModelTransform.of(1.3806F, 4.6863F, 0.5F, 0.0F, 0.0F, -0.2618F));

		ModelPartData cube_r74 = glasses.addChild("cube_r74", ModelPartBuilder.create().uv(38, 1).cuboid(-0.2577F, -0.3669F, 0.0F, 0.5F, 0.6F, 0.0F, new Dilation(0.0F)), ModelTransform.of(1.5806F, 4.8863F, 0.5F, 0.0F, 0.0F, 0.6283F));
		return TexturedModelData.of(modelData, 128, 128);
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		body.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return null;
	}

	@Override
	public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

	}
}