package SLRD.slrd.world;

import java.util.Random;

import SLRD.slrd.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DimensionType;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModWorldGen implements IWorldGenerator {

	private WorldGenerator gen_Deadifferium_ore; //Generates Deadifferium Ore (used in Overworld)
	private WorldGenerator gen_TeeHeeDiamond_ore; //Generates Deadifferium Ore (used in Overworld)

	public ModWorldGen() {
	    this.gen_Deadifferium_ore = new WorldGenMinable(ModBlocks.oreDeadifferium.getDefaultState(), 8);
	    this.gen_TeeHeeDiamond_ore = new WorldGenMinable(ModBlocks.oreTeeHeeDiamond.getDefaultState(), 6);
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
	    switch (world.provider.getDimensionType()) {
	    case OVERWORLD: //Overworld
	    	  this.runGenerator(this.gen_Deadifferium_ore, world, random, chunkX, chunkZ, 20, 30, 64);
	    	  this.runGenerator(this.gen_TeeHeeDiamond_ore, world, random, chunkX, chunkZ, 20, 0, 40);
	        break;
	    case NETHER: //Nether

	        break;
	    case THE_END: //End

	        break;
	    }
	}
	
	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
	    if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
	        throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

	    int heightDiff = maxHeight - minHeight + 1;
	    for (int i = 0; i < chancesToSpawn; i ++) {
	        int x = chunk_X * 16 + rand.nextInt(16);
	        int y = minHeight + rand.nextInt(heightDiff);
	        int z = chunk_Z * 16 + rand.nextInt(16);
	        generator.generate(world, rand, new BlockPos(x, y, z));
	    }
	}
}
