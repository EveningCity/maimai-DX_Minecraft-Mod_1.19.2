package name.maimai_mod.entity;

import name.maimai_mod.Maimai_Mod;
import name.maimai_mod.entity.custom.maimaiEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {
    public static final EntityType<maimaiEntity> maimai = Registry.register(Registry.ENTITY_TYPE,
            new Identifier(Maimai_Mod.MOD_ID,"maimai"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE,maimaiEntity::new).
            dimensions(EntityDimensions.fixed(2f,3f)).build());
}
