package net.metrodot.cerberusmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.metrodot.cerberusmod.entity.animation.ModAnimationDefinitions;
import net.metrodot.cerberusmod.entity.custom.CerberusEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

public class CerberusModel<T extends Entity> extends HierarchicalModel<T> {
    private final ModelPart Cerberus;
    private final ModelPart Torso;
    private final ModelPart Front;
    private final ModelPart Back;
    private final ModelPart Tail;
    private final ModelPart Head;
    private final ModelPart FaceFront;
    private final ModelPart FaceRight;
    private final ModelPart FaceLeft;
    private final ModelPart Legs;
    private final ModelPart Legs2;
    private final ModelPart RBleg;
    private final ModelPart LFleg;
    private final ModelPart Legs1;
    private final ModelPart RFleg;
    private final ModelPart LBleg;

    public CerberusModel(ModelPart root) {
        this.Cerberus = root.getChild("Cerberus");
        this.Torso = Cerberus.getChild("Torso");
        this.Front = Cerberus.getChild("Torso").getChild("Front");
        this.Back = Cerberus.getChild("Torso").getChild("Back");
        this.Tail = Cerberus.getChild("Torso").getChild("Tail");
        this.Head = Cerberus.getChild("Torso").getChild("Head");
        this.FaceFront = Cerberus.getChild("Torso").getChild("Head").getChild("FaceFront");
        this.FaceRight = Cerberus.getChild("Torso").getChild("Head").getChild("FaceRight");
        this.FaceLeft = Cerberus.getChild("Torso").getChild("Head").getChild("FaceLeft");
        this.Legs = Cerberus.getChild("Legs");
        this.Legs2 = Cerberus.getChild("Legs").getChild("Legs2");
        this.RBleg = Cerberus.getChild("Legs").getChild("Legs2").getChild("RBleg");
        this.LFleg = Cerberus.getChild("Legs").getChild("Legs2").getChild("LFleg");
        this.Legs1 = Cerberus.getChild("Legs").getChild("Legs1");
        this.RFleg = Cerberus.getChild("Legs").getChild("Legs1").getChild("RFleg");
        this.LBleg = Cerberus.getChild("Legs").getChild("Legs1").getChild("LBleg");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Cerberus = partdefinition.addOrReplaceChild("Cerberus", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition Torso = Cerberus.addOrReplaceChild("Torso", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition Front = Torso.addOrReplaceChild("Front", CubeListBuilder.create(), PartPose.offset(0.0F, -7.5F, -6.0F));

        PartDefinition Front_r1 = Front.addOrReplaceChild("Front_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-7.5F, -6.5F, -3.0F, 15.0F, 8.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.0F));

        PartDefinition Back = Torso.addOrReplaceChild("Back", CubeListBuilder.create(), PartPose.offset(0.0F, -6.0F, 3.0F));

        PartDefinition Back_r1 = Back.addOrReplaceChild("Back_r1", CubeListBuilder.create().texOffs(0, 17).addBox(-4.5F, -4.5F, -3.0F, 9.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

        PartDefinition Tail = Torso.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(-0.75F, -6.9686F, 7.4316F));

        PartDefinition Tail_r1 = Tail.addOrReplaceChild("Tail_r1", CubeListBuilder.create().texOffs(27, 17).addBox(-2.0F, -5.0F, -1.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 3.8637F, 1.0353F, -0.1745F, 0.0F, 0.0F));

        PartDefinition Head = Torso.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition FaceFront = Head.addOrReplaceChild("FaceFront", CubeListBuilder.create().texOffs(18, 38).addBox(-3.0F, -5.0F, -0.75F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(43, 12).addBox(-1.5F, -2.0F, -4.5F, 3.0F, 3.0F, 5.0F, new CubeDeformation(-0.001F)), PartPose.offset(0.0F, -9.0F, -13.5F));

        PartDefinition FaceRight = Head.addOrReplaceChild("FaceRight", CubeListBuilder.create(), PartPose.offset(7.5F, -10.5F, -10.5F));

        PartDefinition NoseR_r1 = FaceRight.addOrReplaceChild("NoseR_r1", CubeListBuilder.create().texOffs(0, 32).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(42, 38).addBox(-1.5F, 0.0F, -6.75F, 3.0F, 3.0F, 5.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition FaceLeft = Head.addOrReplaceChild("FaceLeft", CubeListBuilder.create(), PartPose.offset(-7.5F, -10.5F, -10.5F));

        PartDefinition NoseL_r1 = FaceLeft.addOrReplaceChild("NoseL_r1", CubeListBuilder.create().texOffs(30, 26).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(39, 0).addBox(-1.5F, 0.0F, -6.75F, 3.0F, 3.0F, 5.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.5236F, 0.0F));

        PartDefinition Legs = Cerberus.addOrReplaceChild("Legs", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition Legs2 = Legs.addOrReplaceChild("Legs2", CubeListBuilder.create(), PartPose.offset(6.0F, 0.0F, -4.5F));

        PartDefinition RBleg = Legs2.addOrReplaceChild("RBleg", CubeListBuilder.create(), PartPose.offset(-9.0F, -6.0F, 10.5F));

        PartDefinition RBleg_r1 = RBleg.addOrReplaceChild("RBleg_r1", CubeListBuilder.create().texOffs(12, 50).addBox(-3.0005F, -5.905F, 1.5005F, 3.0F, 6.0F, 3.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.5F, 5.905F, -2.8708F, 0.0F, 0.0F, 0.0F));

        PartDefinition LFleg = Legs2.addOrReplaceChild("LFleg", CubeListBuilder.create(), PartPose.offset(-1.5F, -6.0F, -1.5F));

        PartDefinition LFleg_r1 = LFleg.addOrReplaceChild("LFleg_r1", CubeListBuilder.create().texOffs(0, 44).addBox(-3.0F, -8.0F, 1.5F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 6.0F, -3.0F, 0.0F, 0.0F, 0.0F));

        PartDefinition Legs1 = Legs.addOrReplaceChild("Legs1", CubeListBuilder.create(), PartPose.offset(4.5F, 0.0F, 3.0F));

        PartDefinition RFleg = Legs1.addOrReplaceChild("RFleg", CubeListBuilder.create(), PartPose.offset(-9.75F, -6.0F, -9.0F));

        PartDefinition RFleg_r1 = RFleg.addOrReplaceChild("RFleg_r1", CubeListBuilder.create().texOffs(42, 46).addBox(-2.25F, -2.0F, -3.0F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F));

        PartDefinition LBleg = Legs1.addOrReplaceChild("LBleg", CubeListBuilder.create(), PartPose.offset(-1.5F, -4.5F, 3.0F));

        PartDefinition LBleg_r1 = LBleg.addOrReplaceChild("LBleg_r1", CubeListBuilder.create().texOffs(48, 20).addBox(-3.0005F, -1.5005F, -2.9995F, 3.0F, 6.0F, 3.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(1.5F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);
        this.animateWalk(ModAnimationDefinitions.CERBERUS_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
        this.animate(((CerberusEntity) entity).idleAnimationState, ModAnimationDefinitions.CERBERUS_IDLE, ageInTicks, 1f);
        this.animate(((CerberusEntity) entity).attackAnimationState, ModAnimationDefinitions.CERBERUS_ATTACK, ageInTicks, 1f);
    }

    private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks)
    {
        pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
        pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

        this.FaceFront.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
        this.FaceFront.xRot = pHeadPitch * ((float)Math.PI / 180F);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        Cerberus.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    @Override
    public ModelPart root() {
        return Cerberus;
    }
}