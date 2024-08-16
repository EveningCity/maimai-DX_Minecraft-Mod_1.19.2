package name.maimai_mod.entity.client;

import name.maimai_mod.Maimai_Mod;
import name.maimai_mod.entity.custom.maimaiEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.util.Identifier;

public class maimaiRender extends MobEntityRenderer<maimaiEntity,maimaiModel<maimaiEntity>>{

    private static final Identifier TEXTURE = new Identifier(Maimai_Mod.MOD_ID,"texture/entity/maimai.png");
    public maimaiRender(EntityRendererFactory.Context context) {
        super(context, new maimaiModel<>(context.getPart(ModModelLayers.maimai)),0f);
    }

    @Override
    public Identifier getTexture(maimaiEntity entity) {
        return TEXTURE;
    }
}
