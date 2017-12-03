package SLRD.slrd.drops;

import java.util.Random;

import SLRD.slrd.item.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class DropHandler {

	public static Random random;
	public static int dropped;

	@SubscribeEvent
	public void onEntityDrop(LivingDropsEvent event) {
		random = new Random();
		dropped = random.nextInt(5) + 1; //DO NOT CHANGE THIS? (+1 means at least 1 item drops..)

		//cow, extends EntityAnimal. you could use EntityTameable and so on..
		if(event.getEntityLiving() instanceof EntityCow) {
			event.getEntityLiving().entityDropItem(new ItemStack(ModItems.RIPJen), dropped);
		}

		// all hostile mobs
		/*
 if(event.getEntityLiving() instanceof EntityMob) {

 }
		 */
	}

	@SubscribeEvent
	public void onLivingDeathEvent(LivingDeathEvent event) {
		random = new Random();
		dropped = random.nextInt(5) + 1; //DO NOT CHANGE THIS? (+1 means at least 1 item drops..)

		//player has private entity
		if(event.getEntityLiving() instanceof EntityPlayer) {
			event.getEntityLiving().entityDropItem(new ItemStack(ModItems.RIPJen), dropped);
		}
	}
}
