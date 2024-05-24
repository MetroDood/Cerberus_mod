package net.metrodot.cerberusmod.entity;

import net.metrodot.cerberusmod.CerberusMod;
import net.metrodot.cerberusmod.entity.custom.CerberusEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, CerberusMod.MOD_ID);

    public static final RegistryObject<EntityType<CerberusEntity>> Cerberus =
            ENTITY_TYPES.register("cerberus", () -> EntityType.Builder.of(CerberusEntity::new, MobCategory.CREATURE)
                    .sized(1f, 1f).build("cerberus"));

    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }

}
