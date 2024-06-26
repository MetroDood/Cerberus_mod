package net.metrodot.cerberusmod.events;

import net.metrodot.cerberusmod.CerberusMod;
import net.metrodot.cerberusmod.entity.client.CerberusModel;
import net.metrodot.cerberusmod.entity.client.ModModelLayers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CerberusMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.CERBERUS_LAYER, CerberusModel::createBodyLayer);
    }
}