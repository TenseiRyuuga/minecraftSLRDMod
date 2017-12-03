package SLRD.slrd.client;

import SLRD.slrd.SLRDMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import SLRD.slrd.item.ModItems;

public class SLRDTab extends CreativeTabs{

	public SLRDTab() {
		super(SLRDMod.modId);
		//setBackgroundImageName("tutorialmod.png");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.Jen); //shown icon on creative tab
	}
	
	 @Override
	 public boolean hasSearchBar() {
		 return true; // return false if you don't want search bar
	 }

}