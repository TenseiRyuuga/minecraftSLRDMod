package SLRD.slrd;

import SLRD.slrd.block.ModBlocks;
import SLRD.slrd.client.SLRDTab;
import SLRD.slrd.command.TeleportHandler;
import SLRD.slrd.crafting.ModRecipes;
import SLRD.slrd.drops.DropHandler;
import SLRD.slrd.item.ModItems;
import SLRD.slrd.proxy.CommonProxy;
import SLRD.slrd.world.ModWorldGen;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = SLRDMod.modId, name = SLRDMod.name, version = SLRDMod.version, acceptedMinecraftVersions = "[1.11.2]")
public class SLRDMod {

	@SidedProxy(serverSide = "SLRD.slrd.proxy.CommonProxy", clientSide = "SLRD.slrd.proxy.ClientProxy")
	public static CommonProxy proxy;

	public static final String modId = "slrd";
	public static final String name = "Tutorial Mod";
	public static final String version = "0.5.7";

	public static final SLRDTab creativeTab = new SLRDTab();

	@Mod.Instance(modId)
	public static SLRDMod instance;

	@Mod.EventHandler
	public void preInit(final FMLPreInitializationEvent event) {
		System.out.println(name + " is loading!");
		
		ModItems.init();
		ModBlocks.init();
		ModRecipes.addRecipes();
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 0);
	}

	@Mod.EventHandler
	public void init(final FMLInitializationEvent event) {
		// other stuff
		MinecraftForge.EVENT_BUS.register(new DropHandler());
		MinecraftForge.EVENT_BUS.register(new TeleportHandler());

	}

	@Mod.EventHandler
	public void postInit(final FMLPostInitializationEvent event) {

	}
}