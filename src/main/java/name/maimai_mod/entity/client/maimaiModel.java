package name.maimai_mod.entity.client;

import name.maimai_mod.entity.custom.maimaiEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;

// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class maimaiModel<T extends maimaiEntity> extends SinglePartEntityModel<T> {
	public final ModelPart maimaiModel;
	public maimaiModel(ModelPart root) {
		this.maimaiModel = root.getChild("maimaiModel");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bb_main = modelPartData.addChild("maimaiModel", ModelPartBuilder.create().uv(18, 204).cuboid(-20.5F, -7.7826F, -8.334F, 18.0F, 4.76F, 3.75F, new Dilation(0.0F))
				.uv(98, 0).cuboid(-20.5F, -13.3696F, -9.865F, 18.0F, 5.95F, 5.0F, new Dilation(0.0F))
				.uv(108, 94).cuboid(-21.0F, -34.0F, 3.0F, 19.0F, 31.0F, 5.0F, new Dilation(0.0F))
				.uv(123, 45).cuboid(-21.0F, -27.61F, 2.0F, 19.0F, 27.61F, 6.0F, new Dilation(0.0F))
				.uv(54, 94).cuboid(-21.0F, -22.61F, 0.0F, 19.0F, 22.61F, 8.0F, new Dilation(0.0F))
				.uv(63, 67).cuboid(-21.0F, -15.61F, -3.0F, 19.0F, 15.61F, 11.0F, new Dilation(0.0F))
				.uv(0, 144).cuboid(-21.0F, -8.61F, -6.0F, 19.0F, 8.61F, 12.0F, new Dilation(0.0F))
				.uv(0, 51).cuboid(-21.0F, -4.76F, -10.0F, 19.0F, 4.76F, 18.0F, new Dilation(0.0F))
				.uv(202, 99).cuboid(2.5F, -7.7826F, -8.334F, 18.0F, 4.76F, 3.75F, new Dilation(0.0F))
				.uv(56, 28).cuboid(2.5F, -13.3696F, -9.865F, 18.0F, 5.95F, 5.0F, new Dilation(0.0F))
				.uv(0, 105).cuboid(2.0F, -34.0F, 3.0F, 19.0F, 31.0F, 5.0F, new Dilation(0.0F))
				.uv(112, 11).cuboid(2.0F, -27.61F, 2.0F, 19.0F, 27.61F, 6.0F, new Dilation(0.0F))
				.uv(0, 74).cuboid(2.0F, -22.61F, 0.0F, 19.0F, 22.61F, 8.0F, new Dilation(0.0F))
				.uv(63, 40).cuboid(2.0F, -15.61F, -3.0F, 19.0F, 15.61F, 11.0F, new Dilation(0.0F))
				.uv(106, 130).cuboid(2.0F, -8.61F, -6.0F, 19.0F, 8.61F, 12.0F, new Dilation(0.0F))
				.uv(0, 28).cuboid(2.0F, -4.76F, -10.0F, 19.0F, 4.76F, 18.0F, new Dilation(0.0F))
				.uv(0, 200).cuboid(-2.0F, -34.0F, 3.0F, 4.0F, 31.0F, 5.0F, new Dilation(0.0F))
				.uv(82, 193).cuboid(-2.0F, -15.61F, -3.0F, 4.0F, 15.61F, 11.0F, new Dilation(0.0F))
				.uv(202, 78).cuboid(-2.0F, -8.61F, -6.0F, 4.0F, 8.61F, 12.0F, new Dilation(0.0F))
				.uv(139, 187).cuboid(-2.0F, -4.76F, -10.0F, 4.0F, 4.76F, 18.0F, new Dilation(0.0F))
				.uv(218, 229).cuboid(-2.5F, -13.3696F, -8.865F, 5.0F, 5.95F, 5.0F, new Dilation(0.0F))
				.uv(156, 79).cuboid(-20.5F, -36.39F, 1.163F, 18.0F, 31.0F, 5.0F, new Dilation(0.0F))
				.uv(132, 151).cuboid(2.5F, -36.39F, 1.163F, 18.0F, 31.0F, 5.0F, new Dilation(0.0F))
				.uv(10, 0).cuboid(-0.5F, -30.5002F, -3.1289F, 1.0F, 0.95F, 2.08F, new Dilation(0.0F))
				.uv(173, 65).cuboid(2.75F, -33.0223F, -1.95F, 18.0F, 3.8323F, 8.8F, new Dilation(0.0F))
				.uv(37, 191).cuboid(-20.75F, -33.0223F, -1.95F, 18.0F, 3.8323F, 8.8F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData cube_r1 = bb_main.addChild("cube_r1", ModelPartBuilder.create().uv(92, 17).cuboid(-6.8177F, -2.8774F, -4.75F, 6.8916F, 5.4495F, 2.75F, new Dilation(0.0F))
				.uv(66, 74).cuboid(-6.8177F, -0.8774F, -6.75F, 0.8916F, 1.4495F, 2.75F, new Dilation(0.0F))
				.uv(120, 45).cuboid(-0.422F, -0.8774F, -6.75F, 0.8916F, 1.4495F, 2.75F, new Dilation(0.0F))
				.uv(209, 215).cuboid(-7.7287F, -1.0413F, -5.75F, 1.1145F, 1.8119F, 9.75F, new Dilation(0.0F))
				.uv(74, 220).cuboid(0.266F, -1.0413F, -5.75F, 1.1145F, 1.8119F, 9.75F, new Dilation(0.0F)), ModelTransform.of(16.375F, -30.8234F, 1.3453F, 1.5708F, 0.0F, -1.5708F));

		ModelPartData cube_r2 = bb_main.addChild("cube_r2", ModelPartBuilder.create().uv(165, 197).cuboid(-0.0739F, -2.8774F, -4.75F, 6.8916F, 5.4495F, 2.75F, new Dilation(0.0F))
				.uv(222, 69).cuboid(6.6141F, -1.0413F, -5.75F, 1.1145F, 1.8119F, 9.75F, new Dilation(0.0F))
				.uv(40, 225).cuboid(-1.3805F, -1.0413F, -5.75F, 1.1145F, 1.8119F, 9.75F, new Dilation(0.0F))
				.uv(10, 42).cuboid(5.9261F, -0.8774F, -6.75F, 0.8916F, 1.4495F, 2.75F, new Dilation(0.0F))
				.uv(123, 90).cuboid(-0.4696F, -0.8774F, -6.75F, 0.8916F, 1.4495F, 2.75F, new Dilation(0.0F)), ModelTransform.of(-16.375F, -30.8234F, 1.3453F, 1.5708F, 0.0F, 1.5708F));

		ModelPartData cube_r3 = bb_main.addChild("cube_r3", ModelPartBuilder.create().uv(8, 65).cuboid(-0.6528F, -1.7984F, -6.75F, 0.8916F, 1.4495F, 2.75F, new Dilation(0.0F))
				.uv(112, 67).cuboid(5.7429F, -1.7984F, -6.75F, 0.8916F, 1.4495F, 2.75F, new Dilation(0.0F))
				.uv(214, 119).cuboid(-1.5703F, -1.9956F, -5.75F, 1.1145F, 1.8119F, 9.75F, new Dilation(0.0F))
				.uv(225, 184).cuboid(6.4243F, -1.9956F, -5.75F, 1.1145F, 1.8119F, 9.75F, new Dilation(0.0F))
				.uv(22, 115).cuboid(-8.6528F, -2.7984F, -6.75F, 0.8916F, 3.4495F, 26.0F, new Dilation(0.0F))
				.uv(98, 11).cuboid(-8.6528F, -2.7984F, -6.75F, 8.8916F, 3.4495F, 1.0F, new Dilation(0.0F)), ModelTransform.of(16.375F, -30.8234F, 1.3453F, -1.5708F, 0.3927F, 1.5708F));

		ModelPartData cube_r4 = bb_main.addChild("cube_r4", ModelPartBuilder.create().uv(0, 22).cuboid(-1.2914F, -2.8613F, -6.75F, 0.8916F, 1.4495F, 2.75F, new Dilation(0.0F))
				.uv(112, 71).cuboid(5.1044F, -2.8613F, -6.75F, 0.8916F, 1.4495F, 2.75F, new Dilation(0.0F))
				.uv(214, 131).cuboid(-2.2145F, -3.0547F, -5.75F, 1.1145F, 1.8119F, 9.75F, new Dilation(0.0F))
				.uv(226, 121).cuboid(5.7801F, -3.0547F, -5.75F, 1.1145F, 1.8119F, 9.75F, new Dilation(0.0F)), ModelTransform.of(16.375F, -30.8234F, 1.3453F, -1.5708F, 0.7854F, 1.5708F));

		ModelPartData cube_r5 = bb_main.addChild("cube_r5", ModelPartBuilder.create().uv(50, 125).cuboid(-2.288F, -3.5988F, -6.75F, 0.8916F, 1.4495F, 2.75F, new Dilation(0.0F))
				.uv(0, 78).cuboid(4.1077F, -3.5988F, -6.75F, 0.8916F, 1.4495F, 2.75F, new Dilation(0.0F))
				.uv(162, 228).cuboid(-3.2149F, -3.7866F, -5.75F, 1.1145F, 1.8119F, 9.75F, new Dilation(0.0F))
				.uv(128, 210).cuboid(4.7797F, -3.7866F, -5.75F, 1.1145F, 1.8119F, 9.75F, new Dilation(0.0F)), ModelTransform.of(16.375F, -30.8234F, 1.3453F, -1.5708F, 1.1781F, 1.5708F));

		ModelPartData cube_r6 = bb_main.addChild("cube_r6", ModelPartBuilder.create().uv(66, 39).cuboid(-3.4911F, -3.8988F, -6.75F, 0.8916F, 1.4495F, 2.75F, new Dilation(0.0F))
				.uv(46, 78).cuboid(2.9046F, -3.8988F, -6.75F, 0.8916F, 1.4495F, 2.75F, new Dilation(0.0F))
				.uv(110, 157).cuboid(-4.4193F, -4.08F, -5.75F, 1.1145F, 1.8119F, 9.75F, new Dilation(0.0F))
				.uv(162, 216).cuboid(3.5754F, -4.08F, -5.75F, 1.1145F, 1.8119F, 9.75F, new Dilation(0.0F)), ModelTransform.of(16.375F, -30.8234F, 1.3453F, 0.0F, 1.5708F, 3.1416F));

		ModelPartData cube_r7 = bb_main.addChild("cube_r7", ModelPartBuilder.create().uv(0, 74).cuboid(-4.7173F, -3.7156F, -6.75F, 0.8916F, 1.4495F, 2.75F, new Dilation(0.0F))
				.uv(54, 78).cuboid(1.6784F, -3.7156F, -6.75F, 0.8916F, 1.4495F, 2.75F, new Dilation(0.0F))
				.uv(215, 33).cuboid(-5.6442F, -3.8902F, -5.75F, 1.1145F, 1.8119F, 9.75F, new Dilation(0.0F))
				.uv(174, 226).cuboid(2.3504F, -3.8902F, -5.75F, 1.1145F, 1.8119F, 9.75F, new Dilation(0.0F)), ModelTransform.of(16.375F, -30.8234F, 1.3453F, 1.5708F, 1.1781F, -1.5708F));

		ModelPartData cube_r8 = bb_main.addChild("cube_r8", ModelPartBuilder.create().uv(56, 64).cuboid(-5.7802F, -3.0771F, -6.75F, 0.8916F, 1.4495F, 2.75F, new Dilation(0.0F))
				.uv(54, 82).cuboid(0.6155F, -3.0771F, -6.75F, 0.8916F, 1.4495F, 2.75F, new Dilation(0.0F))
				.uv(110, 169).cuboid(-6.7033F, -3.2461F, -5.75F, 1.1145F, 1.8119F, 9.75F, new Dilation(0.0F))
				.uv(216, 172).cuboid(1.2913F, -3.2461F, -5.75F, 1.1145F, 1.8119F, 9.75F, new Dilation(0.0F)), ModelTransform.of(16.375F, -30.8234F, 1.3453F, 1.5708F, 0.7854F, -1.5708F));

		ModelPartData cube_r9 = bb_main.addChild("cube_r9", ModelPartBuilder.create().uv(10, 37).cuboid(-6.5177F, -2.0804F, -6.75F, 0.8916F, 1.4495F, 2.75F, new Dilation(0.0F))
				.uv(54, 86).cuboid(-0.122F, -2.0804F, -6.75F, 0.8916F, 1.4495F, 2.75F, new Dilation(0.0F))
				.uv(215, 45).cuboid(-7.4353F, -2.2456F, -5.75F, 1.1145F, 1.8119F, 9.75F, new Dilation(0.0F))
				.uv(220, 57).cuboid(0.5594F, -2.2456F, -5.75F, 1.1145F, 1.8119F, 9.75F, new Dilation(0.0F)), ModelTransform.of(16.375F, -30.8234F, 1.3453F, 1.5708F, 0.3927F, -1.5708F));

		ModelPartData cube_r10 = bb_main.addChild("cube_r10", ModelPartBuilder.create().uv(220, 143).cuboid(-1.6739F, -2.2456F, -5.75F, 1.1145F, 1.8119F, 9.75F, new Dilation(0.0F))
				.uv(86, 222).cuboid(6.3207F, -2.2456F, -5.75F, 1.1145F, 1.8119F, 9.75F, new Dilation(0.0F))
				.uv(54, 90).cuboid(-0.7696F, -2.0804F, -6.75F, 0.8916F, 1.4495F, 2.75F, new Dilation(0.0F))
				.uv(10, 51).cuboid(5.6261F, -2.0804F, -6.75F, 0.8916F, 1.4495F, 2.75F, new Dilation(0.0F)), ModelTransform.of(-16.375F, -30.8234F, 1.3453F, 1.5708F, -0.3927F, 1.5708F));

		ModelPartData cube_r11 = bb_main.addChild("cube_r11", ModelPartBuilder.create().uv(220, 155).cuboid(-2.4059F, -3.2461F, -5.75F, 1.1145F, 1.8119F, 9.75F, new Dilation(0.0F))
				.uv(18, 213).cuboid(5.5888F, -3.2461F, -5.75F, 1.1145F, 1.8119F, 9.75F, new Dilation(0.0F))
				.uv(54, 94).cuboid(-1.5072F, -3.0771F, -6.75F, 0.8916F, 1.4495F, 2.75F, new Dilation(0.0F))
				.uv(0, 65).cuboid(4.8885F, -3.0771F, -6.75F, 0.8916F, 1.4495F, 2.75F, new Dilation(0.0F)), ModelTransform.of(-16.375F, -30.8234F, 1.3453F, 1.5708F, -0.7854F, 1.5708F));

		ModelPartData cube_r12 = bb_main.addChild("cube_r12", ModelPartBuilder.create().uv(196, 226).cuboid(-3.4649F, -3.8902F, -5.75F, 1.1145F, 1.8119F, 9.75F, new Dilation(0.0F))
				.uv(128, 222).cuboid(4.5297F, -3.8902F, -5.75F, 1.1145F, 1.8119F, 9.75F, new Dilation(0.0F))
				.uv(54, 98).cuboid(-2.57F, -3.7156F, -6.75F, 0.8916F, 1.4495F, 2.75F, new Dilation(0.0F))
				.uv(102, 32).cuboid(3.8257F, -3.7156F, -6.75F, 0.8916F, 1.4495F, 2.75F, new Dilation(0.0F)), ModelTransform.of(-16.375F, -30.8234F, 1.3453F, 1.5708F, -1.1781F, 1.5708F));

		ModelPartData cube_r13 = bb_main.addChild("cube_r13", ModelPartBuilder.create().uv(221, 217).cuboid(-4.6899F, -4.08F, -5.75F, 1.1145F, 1.8119F, 9.75F, new Dilation(0.0F))
				.uv(40, 213).cuboid(3.3047F, -4.08F, -5.75F, 1.1145F, 1.8119F, 9.75F, new Dilation(0.0F))
				.uv(99, 36).cuboid(-3.7963F, -3.8988F, -6.75F, 0.8916F, 1.4495F, 2.75F, new Dilation(0.0F))
				.uv(43, 105).cuboid(2.5994F, -3.8988F, -6.75F, 0.8916F, 1.4495F, 2.75F, new Dilation(0.0F)), ModelTransform.of(-16.375F, -30.8234F, 1.3453F, 0.0F, -1.5708F, -3.1416F));

		ModelPartData cube_r14 = bb_main.addChild("cube_r14", ModelPartBuilder.create().uv(150, 210).cuboid(-5.8943F, -3.7866F, -5.75F, 1.1145F, 1.8119F, 9.75F, new Dilation(0.0F))
				.uv(228, 167).cuboid(2.1004F, -3.7866F, -5.75F, 1.1145F, 1.8119F, 9.75F, new Dilation(0.0F))
				.uv(100, 94).cuboid(-4.9993F, -3.5988F, -6.75F, 0.8916F, 1.4495F, 2.75F, new Dilation(0.0F))
				.uv(65, 125).cuboid(1.3964F, -3.5988F, -6.75F, 0.8916F, 1.4495F, 2.75F, new Dilation(0.0F)), ModelTransform.of(-16.375F, -30.8234F, 1.3453F, -1.5708F, -1.1781F, -1.5708F));

		ModelPartData cube_r15 = bb_main.addChild("cube_r15", ModelPartBuilder.create().uv(227, 35).cuboid(-6.8947F, -3.0547F, -5.75F, 1.1145F, 1.8119F, 9.75F, new Dilation(0.0F))
				.uv(150, 222).cuboid(1.1F, -3.0547F, -5.75F, 1.1145F, 1.8119F, 9.75F, new Dilation(0.0F))
				.uv(123, 79).cuboid(-5.996F, -2.8613F, -6.75F, 0.8916F, 1.4495F, 2.75F, new Dilation(0.0F))
				.uv(10, 58).cuboid(0.3997F, -2.8613F, -6.75F, 0.8916F, 1.4495F, 2.75F, new Dilation(0.0F)), ModelTransform.of(-16.375F, -30.8234F, 1.3453F, -1.5708F, -0.7854F, -1.5708F));

		ModelPartData cube_r16 = bb_main.addChild("cube_r16", ModelPartBuilder.create().uv(98, 227).cuboid(-7.5388F, -1.9956F, -5.75F, 1.1145F, 1.8119F, 9.75F, new Dilation(0.0F))
				.uv(18, 225).cuboid(0.4558F, -1.9956F, -5.75F, 1.1145F, 1.8119F, 9.75F, new Dilation(0.0F))
				.uv(123, 83).cuboid(-6.6345F, -1.7984F, -6.75F, 0.8916F, 1.4495F, 2.75F, new Dilation(0.0F))
				.uv(105, 95).cuboid(-0.2388F, -1.7984F, -6.75F, 0.8916F, 1.4495F, 2.75F, new Dilation(0.0F))
				.uv(46, 74).cuboid(-0.2388F, -2.7984F, -6.75F, 8.8916F, 3.4495F, 1.0F, new Dilation(0.0F))
				.uv(50, 125).cuboid(7.7612F, -2.7984F, -6.75F, 0.8916F, 3.4495F, 26.0F, new Dilation(0.0F)), ModelTransform.of(-16.375F, -30.8234F, 1.3453F, -1.5708F, -0.3927F, -1.5708F));

		ModelPartData cube_r17 = bb_main.addChild("cube_r17", ModelPartBuilder.create().uv(78, 128).cuboid(10.752F, -1.7248F, -0.375F, 0.8916F, 3.4495F, 26.0F, new Dilation(0.0F)), ModelTransform.of(-22.75F, -27.6493F, 1.1927F, -1.5708F, -0.3927F, -1.5708F));

		ModelPartData cube_r18 = bb_main.addChild("cube_r18", ModelPartBuilder.create().uv(0, 0).cuboid(-1.25F, -1.2207F, -0.994F, 2.5F, 2.5F, 4.0F, new Dilation(0.0F))
				.uv(216, 184).cuboid(-1.25F, -1.2207F, -0.494F, 2.5F, 2.5F, 3.0F, new Dilation(0.0F)), ModelTransform.of(13.4153F, -15.0828F, -9.2256F, -0.3655F, -0.147F, -0.3655F));

		ModelPartData cube_r19 = bb_main.addChild("cube_r19", ModelPartBuilder.create().uv(0, 141).cuboid(-3.5755F, 0.3038F, -1.5F, 2.5F, 2.5F, 3.0F, new Dilation(0.0F)), ModelTransform.of(9.1745F, -15.7544F, -7.8585F, -0.1572F, 0.3614F, 1.1493F));

		ModelPartData cube_r20 = bb_main.addChild("cube_r20", ModelPartBuilder.create().uv(144, 0).cuboid(-2.0666F, -0.3212F, -1.5F, 2.5F, 2.5F, 3.0F, new Dilation(0.0F)), ModelTransform.of(9.1745F, -15.7544F, -7.8585F, -0.2849F, 0.274F, 0.7459F));

		ModelPartData cube_r21 = bb_main.addChild("cube_r21", ModelPartBuilder.create().uv(98, 220).cuboid(-0.4334F, -0.3212F, -1.5F, 2.5F, 2.5F, 3.0F, new Dilation(0.0F)), ModelTransform.of(9.1745F, -15.7544F, -7.8585F, -0.3655F, 0.147F, 0.3655F));

		ModelPartData cube_r22 = bb_main.addChild("cube_r22", ModelPartBuilder.create().uv(50, 144).cuboid(-1.25F, -1.2207F, -0.494F, 2.5F, 2.5F, 3.0F, new Dilation(0.0F)), ModelTransform.of(6.4365F, -19.3548F, -7.4561F, 0.0F, -0.3927F, -1.5708F));

		ModelPartData cube_r23 = bb_main.addChild("cube_r23", ModelPartBuilder.create().uv(62, 144).cuboid(-1.25F, -1.2207F, -0.494F, 2.5F, 2.5F, 3.0F, new Dilation(0.0F)), ModelTransform.of(16.5049F, -19.3548F, -7.4561F, 0.0F, -0.3927F, -1.5708F));

		ModelPartData cube_r24 = bb_main.addChild("cube_r24", ModelPartBuilder.create().uv(144, 87).cuboid(-1.25F, -1.2793F, 0.006F, 2.5F, 2.5F, 3.0F, new Dilation(0.0F)), ModelTransform.of(6.8761F, -21.5362F, -7.6349F, -0.1572F, -0.3614F, -1.1493F));

		ModelPartData cube_r25 = bb_main.addChild("cube_r25", ModelPartBuilder.create().uv(0, 7).cuboid(-1.25F, -1.2793F, -0.994F, 2.5F, 2.5F, 4.0F, new Dilation(0.0F)), ModelTransform.of(9.5847F, -23.6559F, -5.6745F, -0.3655F, -0.147F, -0.3655F));

		ModelPartData cube_r26 = bb_main.addChild("cube_r26", ModelPartBuilder.create().uv(0, 37).cuboid(-1.25F, -1.2793F, -0.994F, 2.5F, 2.5F, 4.0F, new Dilation(0.0F)), ModelTransform.of(13.4153F, -23.6559F, -5.6745F, -0.3655F, 0.147F, 0.3655F));

		ModelPartData cube_r27 = bb_main.addChild("cube_r27", ModelPartBuilder.create().uv(0, 147).cuboid(-1.25F, -1.2793F, 0.006F, 2.5F, 2.5F, 3.0F, new Dilation(0.0F)), ModelTransform.of(16.1239F, -21.5362F, -7.6349F, -0.1572F, 0.3614F, 1.1493F));

		ModelPartData cube_r28 = bb_main.addChild("cube_r28", ModelPartBuilder.create().uv(156, 0).cuboid(-1.25F, -1.2207F, 0.006F, 2.5F, 2.5F, 3.0F, new Dilation(0.0F)), ModelTransform.of(6.8761F, -17.968F, -9.1129F, -0.1572F, 0.3614F, 1.1493F));

		ModelPartData cube_r29 = bb_main.addChild("cube_r29", ModelPartBuilder.create().uv(0, 51).cuboid(-1.25F, -1.2207F, -0.994F, 2.5F, 2.5F, 4.0F, new Dilation(0.0F)), ModelTransform.of(9.5847F, -15.0828F, -9.2256F, -0.3655F, 0.147F, 0.3655F));

		ModelPartData cube_r30 = bb_main.addChild("cube_r30", ModelPartBuilder.create().uv(156, 115).cuboid(-1.25F, -1.2207F, 0.006F, 2.5F, 2.5F, 3.0F, new Dilation(0.0F)), ModelTransform.of(16.1239F, -17.968F, -9.1129F, -0.1572F, -0.3614F, -1.1493F));

		ModelPartData cube_r31 = bb_main.addChild("cube_r31", ModelPartBuilder.create().uv(156, 121).cuboid(-1.25F, -1.2207F, -0.494F, 2.5F, 2.5F, 3.0F, new Dilation(0.0F)), ModelTransform.of(16.1239F, -17.5853F, -8.189F, -0.1572F, -0.3614F, -1.1493F));

		ModelPartData cube_r32 = bb_main.addChild("cube_r32", ModelPartBuilder.create().uv(106, 130).cuboid(-1.25F, -1.2793F, -0.494F, 2.5F, 2.5F, 3.0F, new Dilation(0.0F)), ModelTransform.of(15.039F, -22.6244F, -6.1018F, -0.2849F, 0.274F, 0.7459F));

		ModelPartData cube_r33 = bb_main.addChild("cube_r33", ModelPartBuilder.create().uv(156, 127).cuboid(-1.25F, -1.2793F, -0.494F, 2.5F, 2.5F, 3.0F, new Dilation(0.0F)), ModelTransform.of(16.1239F, -21.1243F, -6.7231F, -0.1572F, 0.3614F, 1.1493F));

		ModelPartData cube_r34 = bb_main.addChild("cube_r34", ModelPartBuilder.create().uv(222, 81).cuboid(-0.4334F, -2.1788F, -1.5F, 2.5F, 2.5F, 3.0F, new Dilation(0.0F)), ModelTransform.of(9.1745F, -22.1852F, -5.1948F, -0.3655F, -0.147F, -0.3655F));

		ModelPartData cube_r35 = bb_main.addChild("cube_r35", ModelPartBuilder.create().uv(156, 133).cuboid(-2.0666F, -2.1788F, -1.5F, 2.5F, 2.5F, 3.0F, new Dilation(0.0F)), ModelTransform.of(9.1745F, -22.1852F, -5.1948F, -0.2849F, -0.274F, -0.7459F));

		ModelPartData cube_r36 = bb_main.addChild("cube_r36", ModelPartBuilder.create().uv(104, 157).cuboid(-3.5755F, -2.8038F, -1.5F, 2.5F, 2.5F, 3.0F, new Dilation(0.0F)), ModelTransform.of(9.1745F, -22.1852F, -5.1948F, -0.1572F, -0.3614F, -1.1493F));

		ModelPartData cube_r37 = bb_main.addChild("cube_r37", ModelPartBuilder.create().uv(140, 222).cuboid(-1.25F, -1.2793F, -0.494F, 2.5F, 2.5F, 3.0F, new Dilation(0.0F)), ModelTransform.of(13.4153F, -23.6267F, -5.6866F, -0.3655F, 0.147F, 0.3655F));

		ModelPartData cube_r38 = bb_main.addChild("cube_r38", ModelPartBuilder.create().uv(30, 225).cuboid(-1.25F, -1.2793F, -0.494F, 2.5F, 2.5F, 3.0F, new Dilation(0.0F))
				.uv(186, 226).cuboid(-24.25F, -1.2793F, -0.494F, 2.5F, 2.5F, 3.0F, new Dilation(0.0F)), ModelTransform.of(11.5F, -23.9787F, -5.5408F, -0.3927F, 0.0F, 0.0F));

		ModelPartData cube_r39 = bb_main.addChild("cube_r39", ModelPartBuilder.create().uv(46, 165).cuboid(-1.25F, -1.2207F, -0.494F, 2.5F, 2.5F, 3.0F, new Dilation(0.0F)), ModelTransform.of(15.039F, -16.0852F, -8.8104F, -0.2849F, -0.274F, -0.7459F));

		ModelPartData cube_r40 = bb_main.addChild("cube_r40", ModelPartBuilder.create().uv(226, 133).cuboid(-1.25F, -1.2207F, -0.494F, 2.5F, 2.5F, 3.0F, new Dilation(0.0F))
				.uv(74, 232).cuboid(-24.25F, -1.2207F, -0.494F, 2.5F, 2.5F, 3.0F, new Dilation(0.0F)), ModelTransform.of(11.5F, -14.7309F, -9.3714F, -0.3927F, 0.0F, 0.0F));

		ModelPartData cube_r41 = bb_main.addChild("cube_r41", ModelPartBuilder.create().uv(104, 36).cuboid(-1.0F, -0.175F, -1.5F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.5F, -30.5252F, -2.5086F, 0.3927F, 0.0F, 0.0F));

		ModelPartData cube_r42 = bb_main.addChild("cube_r42", ModelPartBuilder.create().uv(46, 171).cuboid(-1.25F, -1.2793F, 0.006F, 2.5F, 2.5F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-16.1239F, -21.5362F, -7.6349F, -0.1572F, -0.3614F, -1.1493F));

		ModelPartData cube_r43 = bb_main.addChild("cube_r43", ModelPartBuilder.create().uv(56, 39).cuboid(-1.25F, -1.2793F, -0.994F, 2.5F, 2.5F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-13.4153F, -23.6559F, -5.6745F, -0.3655F, -0.147F, -0.3655F));

		ModelPartData cube_r44 = bb_main.addChild("cube_r44", ModelPartBuilder.create().uv(0, 58).cuboid(-1.25F, -1.2793F, -0.994F, 2.5F, 2.5F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-9.5847F, -23.6559F, -5.6745F, -0.3655F, 0.147F, 0.3655F));

		ModelPartData cube_r45 = bb_main.addChild("cube_r45", ModelPartBuilder.create().uv(46, 177).cuboid(-1.25F, -1.2793F, 0.006F, 2.5F, 2.5F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-6.8761F, -21.5362F, -7.6349F, -0.1572F, 0.3614F, 1.1493F));

		ModelPartData cube_r46 = bb_main.addChild("cube_r46", ModelPartBuilder.create().uv(98, 25).cuboid(-1.25F, -1.2207F, -0.994F, 2.5F, 2.5F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-9.5847F, -15.0828F, -9.2256F, -0.3655F, -0.147F, -0.3655F));

		ModelPartData cube_r47 = bb_main.addChild("cube_r47", ModelPartBuilder.create().uv(110, 181).cuboid(-1.25F, -1.2207F, 0.006F, 2.5F, 2.5F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-6.8761F, -17.968F, -9.1129F, -0.1572F, -0.3614F, -1.1493F));

		ModelPartData cube_r48 = bb_main.addChild("cube_r48", ModelPartBuilder.create().uv(138, 79).cuboid(-1.25F, -1.2207F, -0.994F, 2.5F, 2.5F, 4.0F, new Dilation(0.0F))
				.uv(232, 57).cuboid(-1.25F, -1.2207F, -0.494F, 2.5F, 2.5F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-13.4153F, -15.0828F, -9.2256F, -0.3655F, 0.147F, 0.3655F));

		ModelPartData cube_r49 = bb_main.addChild("cube_r49", ModelPartBuilder.create().uv(46, 183).cuboid(-1.25F, -1.2207F, 0.006F, 2.5F, 2.5F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-16.1239F, -17.968F, -9.1129F, -0.1572F, 0.3614F, 1.1493F));

		ModelPartData cube_r50 = bb_main.addChild("cube_r50", ModelPartBuilder.create().uv(197, 78).cuboid(-1.25F, -1.2207F, -0.494F, 2.5F, 2.5F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-6.4365F, -19.3548F, -7.4561F, 0.0F, 0.3927F, 1.5708F));

		ModelPartData cube_r51 = bb_main.addChild("cube_r51", ModelPartBuilder.create().uv(202, 84).cuboid(-1.25F, -1.2207F, -0.494F, 2.5F, 2.5F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-16.5049F, -19.3548F, -7.4561F, 0.0F, 0.3927F, 1.5708F));

		ModelPartData cube_r52 = bb_main.addChild("cube_r52", ModelPartBuilder.create().uv(227, 47).cuboid(-1.25F, -1.2793F, -0.494F, 2.5F, 2.5F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-13.4153F, -23.6267F, -5.6866F, -0.3655F, -0.147F, -0.3655F));

		ModelPartData cube_r53 = bb_main.addChild("cube_r53", ModelPartBuilder.create().uv(202, 108).cuboid(1.0755F, -2.8038F, -1.5F, 2.5F, 2.5F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-9.1745F, -22.1852F, -5.1948F, -0.1572F, 0.3614F, 1.1493F));

		ModelPartData cube_r54 = bb_main.addChild("cube_r54", ModelPartBuilder.create().uv(204, 0).cuboid(-0.4334F, -2.1788F, -1.5F, 2.5F, 2.5F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-9.1745F, -22.1852F, -5.1948F, -0.2849F, 0.274F, 0.7459F));

		ModelPartData cube_r55 = bb_main.addChild("cube_r55", ModelPartBuilder.create().uv(208, 227).cuboid(-2.0666F, -2.1788F, -1.5F, 2.5F, 2.5F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-9.1745F, -22.1852F, -5.1948F, -0.3655F, 0.147F, 0.3655F));

		ModelPartData cube_r56 = bb_main.addChild("cube_r56", ModelPartBuilder.create().uv(140, 210).cuboid(-1.25F, -1.2793F, -0.494F, 2.5F, 2.5F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-16.1239F, -21.1243F, -6.7231F, -0.1572F, -0.3614F, -1.1493F));

		ModelPartData cube_r57 = bb_main.addChild("cube_r57", ModelPartBuilder.create().uv(106, 136).cuboid(-1.25F, -1.2793F, -0.494F, 2.5F, 2.5F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-15.039F, -22.6244F, -6.1018F, -0.2849F, -0.274F, -0.7459F));

		ModelPartData cube_r58 = bb_main.addChild("cube_r58", ModelPartBuilder.create().uv(231, 84).cuboid(-2.0666F, -0.3212F, -1.5F, 2.5F, 2.5F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-9.1745F, -15.7544F, -7.8585F, -0.3655F, -0.147F, -0.3655F));

		ModelPartData cube_r59 = bb_main.addChild("cube_r59", ModelPartBuilder.create().uv(162, 210).cuboid(-0.4334F, -0.3212F, -1.5F, 2.5F, 2.5F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-9.1745F, -15.7544F, -7.8585F, -0.2849F, -0.274F, -0.7459F));

		ModelPartData cube_r60 = bb_main.addChild("cube_r60", ModelPartBuilder.create().uv(30, 213).cuboid(1.0755F, 0.3038F, -1.5F, 2.5F, 2.5F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-9.1745F, -15.7544F, -7.8585F, -0.1572F, -0.3614F, -1.1493F));

		ModelPartData cube_r61 = bb_main.addChild("cube_r61", ModelPartBuilder.create().uv(214, 143).cuboid(-1.25F, -1.2207F, -0.494F, 2.5F, 2.5F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-16.1239F, -17.5853F, -8.189F, -0.1572F, 0.3614F, 1.1493F));

		ModelPartData cube_r62 = bb_main.addChild("cube_r62", ModelPartBuilder.create().uv(215, 57).cuboid(-1.25F, -1.2207F, -0.494F, 2.5F, 2.5F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-15.039F, -16.0852F, -8.8104F, -0.2849F, 0.274F, 0.7459F));

		ModelPartData cube_r63 = bb_main.addChild("cube_r63", ModelPartBuilder.create().uv(0, 17).cuboid(-20.5F, -0.7055F, -8.0F, 41.0F, 1.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -33.7945F, 1.5017F, -0.2182F, 0.0F, 0.0F));

		ModelPartData cube_r64 = bb_main.addChild("cube_r64", ModelPartBuilder.create().uv(0, 0).cuboid(-38.0F, -26.8F, -21.511F, 41.0F, 1.42F, 16.0F, new Dilation(0.0F)), ModelTransform.of(17.5F, -4.52F, 1.0F, -0.3927F, 0.0F, 0.0F));

		ModelPartData cube_r65 = bb_main.addChild("cube_r65", ModelPartBuilder.create().uv(183, 197).cuboid(-3.0F, -20.8F, -11.511F, 5.0F, 21.42F, 8.0F, new Dilation(0.0F)), ModelTransform.of(0.5F, -9.52F, 2.0F, -0.3927F, 0.0F, 0.0F));

		ModelPartData cube_r66 = bb_main.addChild("cube_r66", ModelPartBuilder.create().uv(0, 28).cuboid(-3.0F, 8.54F, -6.64F, 5.0F, 4.73F, 3.5F, new Dilation(0.0F)), ModelTransform.of(0.5F, -17.85F, -6.0F, 0.3927F, 0.0F, 0.0F));

		ModelPartData cube_r67 = bb_main.addChild("cube_r67", ModelPartBuilder.create().uv(62, 204).cuboid(8.0F, -20.0277F, -6.075F, 3.0F, 28.56F, 3.0F, new Dilation(0.0F))
				.uv(173, 33).cuboid(12.0F, -20.0277F, -6.075F, 18.0F, 28.56F, 3.0F, new Dilation(0.0F))
				.uv(178, 150).cuboid(-11.0F, -20.0277F, -6.075F, 18.0F, 28.56F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-9.5F, -9.52F, 1.0F, -0.3927F, 0.0F, 0.0F));

		ModelPartData cube_r68 = bb_main.addChild("cube_r68", ModelPartBuilder.create().uv(112, 202).cuboid(8.5F, -19.0277F, -12.075F, 4.0F, 31.13F, 4.0F, new Dilation(0.0F))
				.uv(0, 165).cuboid(12.5F, -19.0277F, -12.075F, 19.0F, 31.13F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-10.5F, -9.52F, 7.0F, -0.3927F, 0.0F, 0.0F));

		ModelPartData cube_r69 = bb_main.addChild("cube_r69", ModelPartBuilder.create().uv(209, 197).cuboid(-3.0F, 8.54F, -6.64F, 18.0F, 4.73F, 3.5F, new Dilation(0.0F))
				.uv(209, 206).cuboid(-26.0F, 8.54F, -6.64F, 18.0F, 4.73F, 3.5F, new Dilation(0.0F)), ModelTransform.of(5.5F, -17.85F, -7.0F, 0.3927F, 0.0F, 0.0F));

		ModelPartData cube_r70 = bb_main.addChild("cube_r70", ModelPartBuilder.create().uv(62, 157).cuboid(-3.0F, -26.8F, -11.511F, 18.0F, 27.42F, 6.0F, new Dilation(0.0F))
				.uv(162, 0).cuboid(-26.0F, -26.8F, -11.511F, 18.0F, 27.42F, 6.0F, new Dilation(0.0F)), ModelTransform.of(5.5F, -9.5374F, 1.007F, -0.3927F, 0.0F, 0.0F));

		ModelPartData cube_r71 = bb_main.addChild("cube_r71", ModelPartBuilder.create().uv(123, 79).cuboid(2.9378F, -11.91F, -11.175F, 2.9F, 1.8323F, 8.8F, new Dilation(0.0F)), ModelTransform.of(20.5F, -13.09F, 2.0F, -0.3361F, -0.2071F, -0.532F));

		ModelPartData cube_r72 = bb_main.addChild("cube_r72", ModelPartBuilder.create().uv(210, 0).cuboid(-11.065F, -11.91F, -11.175F, 9.5F, 1.8323F, 8.8F, new Dilation(0.0F))
				.uv(210, 108).cuboid(-8.435F, -11.91F, -11.175F, 9.5F, 1.8323F, 8.8F, new Dilation(0.0F))
				.uv(169, 182).cuboid(-14.25F, -16.91F, -11.275F, 18.5F, 5.8323F, 8.8F, new Dilation(0.0F))
				.uv(210, 11).cuboid(-34.065F, -11.91F, -11.175F, 9.5F, 1.8323F, 8.8F, new Dilation(0.0F))
				.uv(210, 22).cuboid(-31.435F, -11.91F, -11.175F, 9.5F, 1.8323F, 8.8F, new Dilation(0.0F))
				.uv(101, 187).cuboid(-37.25F, -16.91F, -11.275F, 18.5F, 5.8323F, 8.8F, new Dilation(0.0F)), ModelTransform.of(16.5F, -13.09F, 2.0F, -0.3927F, 0.0F, 0.0F));

		ModelPartData cube_r73 = bb_main.addChild("cube_r73", ModelPartBuilder.create().uv(50, 125).cuboid(-5.8378F, -11.91F, -11.175F, 2.9F, 1.8323F, 8.8F, new Dilation(0.0F)), ModelTransform.of(2.5F, -13.09F, 2.0F, -0.3361F, 0.2071F, 0.532F));

		ModelPartData cube_r74 = bb_main.addChild("cube_r74", ModelPartBuilder.create().uv(112, 45).cuboid(-6.0F, 8.7298F, -7.5086F, 2.0F, 1.95F, 4.0F, new Dilation(0.0F)), ModelTransform.of(16.5F, -21.701F, -2.1862F, -0.1309F, 0.0F, 0.0F));

		ModelPartData cube_r75 = bb_main.addChild("cube_r75", ModelPartBuilder.create().uv(78, 125).cuboid(2.9378F, -11.91F, -11.175F, 2.9F, 1.8323F, 8.8F, new Dilation(0.0F)), ModelTransform.of(-2.5F, -13.09F, 2.0F, -0.3361F, -0.2071F, -0.532F));

		ModelPartData cube_r76 = bb_main.addChild("cube_r76", ModelPartBuilder.create().uv(78, 136).cuboid(-5.8378F, -11.91F, -11.175F, 2.9F, 1.8323F, 8.8F, new Dilation(0.0F)), ModelTransform.of(-20.5F, -13.09F, 2.0F, -0.3361F, 0.2071F, 0.532F));

		ModelPartData cube_r77 = bb_main.addChild("cube_r77", ModelPartBuilder.create().uv(168, 115).cuboid(-2.5F, -19.0277F, -12.075F, 19.0F, 31.13F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-18.5F, -9.5402F, 7.0F, -0.3927F, 0.0F, 0.0F));

		ModelPartData cube_r78 = bb_main.addChild("cube_r78", ModelPartBuilder.create().uv(0, 17).cuboid(-1.0F, -0.975F, -2.0F, 2.0F, 1.95F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-11.5F, -12.7982F, -8.9143F, -0.1309F, 0.0F, 0.0F));

		return TexturedModelData.of(modelData, 256, 256);

	}
	@Override
	public void setAngles(maimaiEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		maimaiModel.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return this.maimaiModel;
	}
}