package name.maimai_mod.item;

import name.maimai_mod.Maimai_Mod;
import name.maimai_mod.entity.ModEntities;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

public class ModItems {

    public static void registerModItems() {
    }

    public class maimai_mod implements ModInitializer {

        public static final Item MAIMAI_DX = new SpawnEggItem(ModEntities.maimai, 0xc4c4c4, 0xadadad, new FabricItemSettings().group(ItemGroup.MISC));

        @Override
        public void onInitialize() {
            Registry.register(Registry.ITEM, new Identifier("maimai_mod", "maimai_dx"), MAIMAI_DX);
        }
    }
}
