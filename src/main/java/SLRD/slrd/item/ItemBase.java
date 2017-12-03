package SLRD.slrd.item;

import SLRD.slrd.SLRDMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemBase extends Item implements ItemModelProvider{
 
 protected String name;
 
 public ItemBase(String name) {
 this.name = name;
 setUnlocalizedName(name);
 setRegistryName(name);
 setCreativeTab(SLRDMod.creativeTab);
 }
 
 @Override
 public void registerItemModel(Item item) {
 SLRDMod.proxy.registerItemRenderer(this, 0, name);
 }
 
 @Override
 public ItemBase setCreativeTab(CreativeTabs tab) {
 super.setCreativeTab(tab);
 return this;
 }
}