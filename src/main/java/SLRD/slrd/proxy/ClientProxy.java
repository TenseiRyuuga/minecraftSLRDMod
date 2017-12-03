package SLRD.slrd.proxy;

import SLRD.slrd.SLRDMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerItemRenderer(final Item item, final int meta, final String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta,
				new ModelResourceLocation(SLRDMod.modId + ":" + id, "inventory"));
	}
}