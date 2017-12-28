package SLRD.slrd.block;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockOre extends BlockBase {

	public BlockOre(String name) {
		this(Material.ROCK, name);
	}

	public BlockOre(Material material, String name) {
		super( material, name);

		setHardness(10.0f);
		setResistance(20.0f);
	}

	@Override
	public BlockOre setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}