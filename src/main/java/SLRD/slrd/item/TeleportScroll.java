package SLRD.slrd.item;

import SLRD.slrd.item.Entity.EntityTeleportScroll;
import SLRD.slrd.item.tools.ItemTeleport;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.EnderTeleportEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class TeleportScroll extends ItemTeleport {

	private double posX;
	private double posY = 10;
	private double posZ;



	public TeleportScroll(String name)
	{
		super(name);
		this.maxStackSize = 16;
	}

//	public ActionResult<ItemStack> onItemLeftClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
//		posX = playerIn.posX;
//		posY = playerIn.posY;
//		posZ = playerIn.posZ;
//		ItemStack itemstack = playerIn.getHeldItem(handIn);
//
//		playerIn.sendMessage(new TextComponentString("Teleport location set to X:" + posX + " Y:" + posY + " Z:" + posZ));
//		return new ActionResult(EnumActionResult.SUCCESS, itemstack);
//	}
	
	 public static void registerFixesTeleportScroll(DataFixer fixer)
	    {
	        EntityThrowable.registerFixesThrowable(fixer, "TeleportScroll");
	    }
	
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
    {
        ItemStack itemstack = playerIn.getHeldItem(handIn);

        if (!playerIn.capabilities.isCreativeMode)
        {
            itemstack.shrink(1);
        }

        worldIn.playSound((EntityPlayer)null, playerIn.posX, playerIn.posY, playerIn.posZ, SoundEvents.ENTITY_ENDERPEARL_THROW, SoundCategory.NEUTRAL, 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
        playerIn.getCooldownTracker().setCooldown(this, 20);

        if (!worldIn.isRemote)
        {
            EntityTeleportScroll entityteleportscrolll = new EntityTeleportScroll(worldIn, playerIn);
            entityteleportscrolll.setHeadingFromThrower(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 1.5F, 1.0F);
            worldIn.spawnEntity(entityteleportscrolll);
        }

        playerIn.addStat(StatList.getObjectUseStats(this));
        return new ActionResult(EnumActionResult.SUCCESS, itemstack);
    }
}
