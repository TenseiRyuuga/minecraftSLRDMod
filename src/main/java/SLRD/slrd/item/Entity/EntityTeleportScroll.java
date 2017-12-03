package SLRD.slrd.item.Entity;

import java.util.ArrayList;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.entity.monster.EntityEndermite;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityEndGateway;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityTeleportScroll extends EntityEnderPearl {

	  private EntityLivingBase thrower;

	    public EntityTeleportScroll(World worldIn)
	    {
	        super(worldIn);
	    }

	    public EntityTeleportScroll(World worldIn, EntityLivingBase throwerIn)
	    {
	        super(worldIn, throwerIn);
	        this.thrower = throwerIn;
	    }
	    
	    public EntityTeleportScroll(World worldIn, EntityLivingBase throwerIn, double x, double y, double z)
	    {
	        super(worldIn, throwerIn);
	        this.thrower = throwerIn;
	    }

	    @SideOnly(Side.CLIENT)
	    public EntityTeleportScroll(World worldIn, double x, double y, double z)
	    {
	        super(worldIn, x, y, z);
	    }
	    
//	    public ArrayList getLocation() {
//	    	ArrayList location = new ArrayList();
//	    	location.add(this.posX);
//	    	location.add(this.posY);
//	    	location.add(this.posZ);
//			return location;
//	    }
}