package name.maimai_mod;

import name.maimai_mod.entity.ModEntities;
import name.maimai_mod.entity.client.ModModelLayers;
import name.maimai_mod.entity.client.maimaiModel;
import name.maimai_mod.entity.client.maimaiRender;
import name.maimai_mod.entity.client.maimaiModel;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;


public class Maimai_ModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.maimai, maimaiModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.maimai, maimaiRender::new);

    }

}
