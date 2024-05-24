package net.metrodot.cerberusmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.metrodot.cerberusmod.CerberusMod;
import net.metrodot.cerberusmod.entity.custom.CerberusEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class CerberusRenderer extends MobRenderer<CerberusEntity, CerberusModel<CerberusEntity>> {

    public CerberusRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new CerberusModel<>(pContext.bakeLayer(ModModelLayers.CERBERUS_LAYER)),0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(CerberusEntity pEntity) {
        return new ResourceLocation(CerberusMod.MOD_ID, "textures/entity/cerberus.png");
    }

    @Override
    public void render(CerberusEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()){
            pMatrixStack.scale(0.7f, 0.7f, 0.7f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
