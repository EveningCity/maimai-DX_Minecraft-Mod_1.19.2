package name.maimai_mod;

import name.maimai_mod.entity.ModEntities;
import name.maimai_mod.entity.custom.maimaiEntity;
import name.maimai_mod.item.ModItems;
import name.maimai_mod.sounds.ModSounds;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static name.maimai_mod.item.ModItems.maimai_mod.MAIMAI_DX;

public class Maimai_Mod implements ModInitializer {

	public static final String MOD_ID = "maimai_mod";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		FabricDefaultAttributeRegistry.register(ModEntities.maimai, maimaiEntity.createmaimaiAttributes());
		ModSounds.registerSounds();
		ModItems.registerModItems();
		Registry.register(Registry.ITEM, new Identifier("maimai_mod", "maimai_dx"), MAIMAI_DX);
	}
}