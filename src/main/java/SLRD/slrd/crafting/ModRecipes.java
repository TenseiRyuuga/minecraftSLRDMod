package SLRD.slrd.crafting;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import SLRD.slrd.block.ModBlocks;
import SLRD.slrd.item.ModItems;

public class ModRecipes {

    public static void addRecipes() {
        //shaped crafting recipes
        GameRegistry.addRecipe(new ItemStack(ModItems.tinyDeadifferium), "B#B", "###", "B#B", '#', ModItems.ingotDeadifferium, 'B', Items.BONE);
        GameRegistry.addRecipe(new ItemStack(ModItems.Jen), "###", "###", "###", '#', ModItems.tinyDeadifferium);
        GameRegistry.addRecipe(new ItemStack(ModItems.DJJen), "###", "#M#", "###", '#', ModItems.tinyDeadifferium, 'M', Items.RECORD_CAT);
        GameRegistry.addRecipe(new ItemStack(ModItems.RIPJen), "###", "#B#", "###", '#', ModItems.tinyDeadifferium, 'B', Items.BONE);
        GameRegistry.addRecipe(new ItemStack(ModItems.LOVEJen), "###", "#D#", "###", '#', ModItems.tinyDeadifferium, 'D', Blocks.RED_FLOWER);
        GameRegistry.addRecipe(new ItemStack(ModItems.DeadifferTeeHeePickaxe), "DDD", " S ", " S ", 'D', ModItems.ingotDeadifferium, 'S', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(ModItems.scrollTeleport), "III", "LER", "III", 'I', ModItems.ingotDeadifferium, 'L', ModItems.LOVEJen, 'E', Items.ENDER_EYE, 'R', ModItems.RIPJen);

        //Create coin bags
        GameRegistry.addRecipe(new ItemStack(ModItems.BagOfCopperChip), "###", "###", "###", '#', ModItems.CopperChip);
        GameRegistry.addRecipe(new ItemStack(ModItems.BagOfCopperCoinSmall), "###", "###", "###", '#', ModItems.CopperCoinSmall);
        GameRegistry.addRecipe(new ItemStack(ModItems.BagOfCopperCoinLarge), "###", "###", "###", '#', ModItems.CopperCoinLarge);
        GameRegistry.addRecipe(new ItemStack(ModItems.BagOfSilverCoin), "###", "###", "###", '#', ModItems.SilverCoin);
        GameRegistry.addRecipe(new ItemStack(ModItems.BagOfGoldCoin), "###", "###", "###", '#', ModItems.GoldCoin);
        GameRegistry.addRecipe(new ItemStack(ModItems.BagOfOldCoin), "###", "###", "###", '#', ModItems.OldCoin);
        GameRegistry.addRecipe(new ItemStack(ModItems.BagOfCrystalCoin), "###", "###", "###", '#', ModItems.CrystalCoin);
        
        //Create bigger coins
        GameRegistry.addRecipe(new ItemStack(ModItems.CopperCoinSmall, 1), "###", "## ", "   ", '#', new ItemStack(ModItems.CopperChip));
        GameRegistry.addRecipe(new ItemStack(ModItems.CopperCoinLarge, 1), "###", "## ", "   ", '#', new ItemStack(ModItems.CopperCoinSmall));
        GameRegistry.addRecipe(new ItemStack(ModItems.SilverCoin, 1), "## ", "## ", "   ", '#', new ItemStack(ModItems.CopperCoinLarge));
        GameRegistry.addRecipe(new ItemStack(ModItems.GoldCoin, 1), "###", "## ", "   ", '#', new ItemStack(ModItems.SilverCoin));
        GameRegistry.addRecipe(new ItemStack(ModItems.OldCoin, 1), "###", "## ", "   ", '#', new ItemStack(ModItems.GoldCoin));
        GameRegistry.addRecipe(new ItemStack(ModItems.CrystalCoin, 1), "## ", "## ", "   ", '#', new ItemStack(ModItems.OldCoin));
        
        //shapeless crafting recipes
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.tinyDeadifferium, 9), new ItemStack(ModItems.Jen));
        
        // Create samller coins
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.GoldCoin), new ItemStack(Items.DIAMOND));
        
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.CopperChip, 5), new ItemStack(ModItems.CopperCoinSmall));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.CopperCoinSmall, 5), new ItemStack(ModItems.CopperCoinLarge));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.CopperCoinLarge, 4), new ItemStack(ModItems.SilverCoin));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.SilverCoin, 5), new ItemStack(ModItems.GoldCoin));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.GoldCoin, 5), new ItemStack(ModItems.OldCoin));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.OldCoin, 4), new ItemStack(ModItems.CrystalCoin));
        
      
        
        //Get coins from bag
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.CopperChip, 9), new ItemStack(ModItems.BagOfCopperChip));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.CopperCoinSmall, 9), new ItemStack(ModItems.BagOfCopperCoinSmall));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.CopperCoinLarge, 9), new ItemStack(ModItems.BagOfCopperCoinLarge));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.SilverCoin, 9), new ItemStack(ModItems.BagOfSilverCoin));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.GoldCoin, 9), new ItemStack(ModItems.BagOfGoldCoin));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.OldCoin, 9), new ItemStack(ModItems.BagOfOldCoin));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.CrystalCoin, 9), new ItemStack(ModItems.BagOfCrystalCoin));
     
        //smelting recipes
        GameRegistry.addSmelting(ModBlocks.oreDeadifferium, new ItemStack(ModItems.ingotDeadifferium), 1.0f);
        GameRegistry.addSmelting(new ItemStack(ModItems.tinyDeadifferium, 5), new ItemStack(ModItems.Jen), 1.0f);
        GameRegistry.addSmelting(new ItemStack(ModItems.TeeHeeDiamond), new ItemStack(ModItems.tinyDeadifferium), 10.0f);

    }
}
