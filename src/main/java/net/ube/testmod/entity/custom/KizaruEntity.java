package net.ube.testmod.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;
import net.ube.testmod.entity.ModEntities;
import org.jetbrains.annotations.Nullable;

public class KizaruEntity extends AnimalEntity {


    public KizaruEntity(EntityType<? extends AnimalEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(0,new SwimGoal(this));
//        this.goalSelector.add(1, new EscapeDangerGoal(this, 2.0));
        this.goalSelector.add(1,new AnimalMateGoal(this,1.150));
        this.goalSelector.add(2,new TemptGoal(this,2, Ingredient.ofItems(Items.BEETROOT),false));
        this.goalSelector.add(5, new WanderAroundFarGoal(this, 1.0));
        this.goalSelector.add(6, new LookAtEntityGoal(this, PlayerEntity.class, 6.0F));
        this.goalSelector.add(7, new LookAroundGoal(this));




//        this.goalSelector.add()
    }


    public static DefaultAttributeContainer.Builder createPorcupineAttributes(){

        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH,1500)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED,0.2f)
                .add(EntityAttributes.GENERIC_ARMOR,6.5f)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE,10);

    }

    @Override
    public boolean isBreedingItem(ItemStack stack) {
        return stack.isOf(Items.DIAMOND);
    }

    @Nullable
    @Override
    public PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {

        return ModEntities.KIZARU.create(world);
    }
}
