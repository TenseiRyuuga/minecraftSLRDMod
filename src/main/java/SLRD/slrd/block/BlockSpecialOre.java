package SLRD.slrd.block;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockSpecialOre extends BlockOre {

	private Item drop;
	private int meta;
	private int least_quantity;
	private int most_quantity;

	public BlockSpecialOre(String name, Item drop, int meta, int least_quantity, int most_quantity) {
		super(Material.IRON, name);

		this.drop = drop;
		this.meta = meta;
		this.least_quantity = least_quantity;
		this.most_quantity = most_quantity;

		setHarvestLevel("pickaxe", 1);
		setHardness(10.0f);
		setResistance(20.0f);
	}

	@Override
	public BlockSpecialOre setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
	@Override
	public Item getItemDropped(IBlockState blockstate, Random random, int fortune) {
		return this.drop;
	}

	@Override
	public int damageDropped(IBlockState blockstate) {
		return this.meta;
	}

	@Override
	public int quantityDropped(IBlockState blockstate, int fortune, Random random) {
		if (this.least_quantity >= this.most_quantity)
			return this.least_quantity;
		return this.least_quantity + random.nextInt(this.most_quantity - this.least_quantity + fortune + 1);
	}
}