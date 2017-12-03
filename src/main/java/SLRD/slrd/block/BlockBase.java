package SLRD.slrd.block;

import java.util.Random;

import SLRD.slrd.SLRDMod;
import SLRD.slrd.item.ItemModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStone;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockBase extends Block implements ItemModelProvider {

	protected String name;
	protected MapColor MapColor;
	protected BlockStateContainer State;

	public static final PropertyEnum<BlockStone.EnumType> VARIANT = PropertyEnum.<BlockStone.EnumType> create("variant",
			BlockStone.EnumType.class);

	public BlockBase(final Material materialIn, final String name) {
		super(materialIn);
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(SLRDMod.creativeTab);
	}

	@Override
	public void registerItemModel(final Item itemBlock) {
		SLRDMod.proxy.registerItemRenderer(itemBlock, 0, name);

	}

	@Override
	public BlockBase setCreativeTab(final CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

	public Item getItemDropped(final int meta, final Random random, final int fortune) {
		// TODO Auto-generated method stub
		return null;
	}

	public int damageDropped(final int metadata) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int quantityDropped(final int meta, final int fortune, final Random random) {
		// TODO Auto-generated method stub
		return 0;
	}

	public BlockBase(final Material materialIn, final MapColor MapColorIn, final String name) {
		this(materialIn, name);
		this.enableStats = true;
		this.blockSoundType = SoundType.STONE;
		this.blockParticleGravity = 1.0F;
		this.slipperiness = 0.6F;
		this.MapColor = MapColorIn;
		this.State = this.createBlockState();
		this.setDefaultState(this.blockState.getBaseState());
		this.fullBlock = this.getDefaultState().isOpaqueCube();
		this.lightOpacity = this.fullBlock ? 255 : 0;
		this.translucent = !materialIn.blocksLight();
	}

}