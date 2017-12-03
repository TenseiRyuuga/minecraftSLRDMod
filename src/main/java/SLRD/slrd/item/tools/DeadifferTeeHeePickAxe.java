package SLRD.slrd.item.tools;

import SLRD.slrd.SLRDMod;
import SLRD.slrd.client.SLRDTab;
import SLRD.slrd.item.ItemModelProvider;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.creativetab.CreativeTabs;

public class DeadifferTeeHeePickAxe extends ItemPickaxe implements ItemModelProvider {

		protected String name;
		
		public DeadifferTeeHeePickAxe(ToolMaterial material, String name) {
			super(material);
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
		public DeadifferTeeHeePickAxe setCreativeTab(CreativeTabs tab) {
			super.setCreativeTab(tab);
			return this;
		}
	}
