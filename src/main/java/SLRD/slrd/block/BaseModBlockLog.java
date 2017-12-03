package SLRD.slrd.block;

import java.util.List;

import net.minecraft.block.BlockLog;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BaseModBlockLog extends BlockLog {
	public static String[] logs = new String[] {"maple", "popular"};
	
//	public BaseBlockLog(String[] logs) {
//		super();
//		this.logs = logs;
//	}
	
	@SideOnly(Side.CLIENT)
	public void getSubBlocks (Item item, CreativeTabs tabs, List list) {
		for (int i = 0; i < logs.length; i++) {
			list.add(new ItemStack(item, 1, i));
		}
	}
}
