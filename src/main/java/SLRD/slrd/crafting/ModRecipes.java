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
        GameRegistry.addRecipe(new ItemStack(ModItems.DeadifferTeeHeePickaxe), " S ", " S ", "DDD", 'D', ModItems.ingotDeadifferium, 'S', Items.STICK);

        //shapeless crafting recipes
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.tinyDeadifferium, 9), new ItemStack(ModItems.Jen));
     
        //smelting recipes
        GameRegistry.addSmelting(ModBlocks.oreDeadifferium, new ItemStack(ModItems.ingotDeadifferium), 1.0f);
        GameRegistry.addSmelting(new ItemStack(ModItems.tinyDeadifferium, 8), new ItemStack(ModItems.Jen), 1.0f);

    }
}
