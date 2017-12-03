package SLRD.slrd.block;

import SLRD.slrd.item.ItemModelProvider;
import SLRD.slrd.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

	public static BlockBase DFurnace;
	public static BlockBase StandardTestBlock;

	public static BlockOre oreDeadifferium;
	public static BlockOre oreTeeHeeDiamond;

	public static void init() {
		oreDeadifferium = register(new BlockOre("oreDeadifferium"));
		oreTeeHeeDiamond = register(new BlockSpecialOre("oreTeeHeeDiamond", ModItems.TeeHeeDiamond, 0, 1, 6));
		DFurnace = register(new BlockShaped(Material.ROCK, "DFurnace"));
		StandardTestBlock = register(new BlockBase(Material.ROCK, "StandardTestBlock"));
	}

	private static <T extends Block> T register(final T block, final ItemBlock itemBlock) {

		GameRegistry.register(block);
		if (itemBlock != null) {
			GameRegistry.register(itemBlock);
		}

		if (block instanceof ItemModelProvider) {
			((ItemModelProvider) block).registerItemModel(itemBlock);
		}

		return block;
	}

	private static <T extends Block> T register(final T block) {
		final ItemBlock itemBlock = new ItemBlock(block);
		itemBlock.setRegistryName(block.getRegistryName());
		return register(block, itemBlock);
	}
}