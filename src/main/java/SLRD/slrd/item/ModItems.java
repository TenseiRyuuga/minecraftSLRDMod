package SLRD.slrd.item;

import SLRD.slrd.item.tools.DeadifferTeeHeePickAxe;
import SLRD.slrd.item.tools.ItemTeleport;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

	public static ItemBase ingotDeadifferium;
	public static ItemBase tinyDeadifferium;
	public static ItemBase RIPJen;
	public static ItemBase LOVEJen;
	public static ItemBase DJJen;
	public static ItemBase Jen;
	public static ItemBase TeeHeeDiamond;
	
	public static DeadifferTeeHeePickAxe DeadifferTeeHeePickaxe;
	
	public static ItemTeleport scrollTeleport;
	public static ItemTeleport scrollTeleportSpecified;
	
	public static void init() {
		ingotDeadifferium = register(new ItemBase("ingotDeadifferium"));
		tinyDeadifferium = register(new ItemBase("tinyDeadifferium"));
		RIPJen = register(new ItemBase("RIPJen"));
		LOVEJen = register(new ItemBase("LOVEJen"));
		DJJen = register(new ItemBase("DJJen"));
		Jen = register(new ItemBase("Jen"));
		TeeHeeDiamond = register(new ItemBase("TeeHeeDiamond"));
		
		DeadifferTeeHeePickaxe = register(new DeadifferTeeHeePickAxe(ToolMaterial.DIAMOND, "deadifferteeheepickaxe"));
		
		scrollTeleport = register(new ItemTeleport("scrollteleport"));
		scrollTeleportSpecified = register(new TeleportScroll("scrollteleportspecified"));
	}

	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);

		if(item instanceof ItemModelProvider) {
			((ItemModelProvider)item).registerItemModel(item);
		}

	
		return item;
	}
}