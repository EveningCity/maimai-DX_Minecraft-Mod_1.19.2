package name.maimai_mod.entity.client;

import name.maimai_mod.Maimai_Mod;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {
    public static final EntityModelLayer maimai =
            new EntityModelLayer(new Identifier(Maimai_Mod.MOD_ID,"maimai"),"main");
}
