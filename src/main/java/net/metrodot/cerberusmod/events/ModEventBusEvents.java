package net.metrodot.cerberusmod.events;

import net.metrodot.cerberusmod.CerberusMod;
import net.metrodot.cerberusmod.entity.ModEntities;
import net.metrodot.cerberusmod.entity.custom.CerberusEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CerberusMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event){
        event.put(ModEntities.Cerberus.get(), CerberusEntity.createAttributes().build());
    }
}
