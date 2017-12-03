package SLRD.slrd.block;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

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