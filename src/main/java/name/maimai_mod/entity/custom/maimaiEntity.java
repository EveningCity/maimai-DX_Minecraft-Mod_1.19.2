package name.maimai_mod.entity.custom;

import name.maimai_mod.entity.ModEntities;
import name.maimai_mod.sounds.ModSounds;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.control.MoveControl;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import static net.minecraft.util.ActionResult.SUCCESS;

public class maimaiEntity extends AnimalEntity {
    public maimaiEntity(EntityType<? extends AnimalEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public void tick() {
        super.tick();
    }
    public static DefaultAttributeContainer.Builder createmaimaiAttributes(){
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH,1)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED,0F)
                .add(EntityAttributes.GENERIC_ATTACK_KNOCKBACK,0F)
                .add(EntityAttributes.GENERIC_ARMOR,0F);
    }

    @Override
    public ActionResult interactMob(PlayerEntity player, Hand hand) {
        ItemStack itemStack = player.getStackInHand(hand);
        if(!this.world.isClient && itemStack.isOf(Items.EMERALD)) {
            this.eat(player, hand, itemStack);
            this.playSound(ModSounds.maimai_start,1.5f,1f);
            this.playSound(ModSounds.maimaiSound,0.5f,1f);
            return SUCCESS;

        }
        if (this.world.isClient) {
            return ActionResult.CONSUME;
        }
        return super.interactMob(player, hand);
    }


    @Override
    public int getXpToDrop() {
        return 0 ;
    }


    @Override
    public @Nullable PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
        return ModEntities.maimai.create(world);
    }
}
