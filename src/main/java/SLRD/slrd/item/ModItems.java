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

    //coins
    public static ItemBase CopperChip;
    public static ItemBase CopperCoinSmall;
    public static ItemBase CopperCoinLarge;
    public static ItemBase SilverCoin;
    public static ItemBase GoldCoin;
    public static ItemBase OldCoin;
    public static ItemBase CrystalCoin;

    //bags of coins
    public static ItemBase BagOfCopperChip;
    public static ItemBase BagOfCopperCoinSmall;
    public static ItemBase BagOfCopperCoinLarge;
    public static ItemBase BagOfSilverCoin;
    public static ItemBase BagOfGoldCoin;
    public static ItemBase BagOfOldCoin;
    public static ItemBase BagOfCrystalCoin;

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

        CopperChip = register(new ItemBase("copper_chip"));;
        CopperCoinSmall = register(new ItemBase("copper_coin_small"));;
        CopperCoinLarge = register(new ItemBase("copper_coin_large"));;
        SilverCoin = register(new ItemBase("silver_coin"));;
        GoldCoin = register(new ItemBase("gold_coin"));;
        OldCoin = register(new ItemBase("old_coin"));;
        CrystalCoin = register(new ItemBase("crystal_coin"));;

        //bags of coins
        BagOfCopperChip = register(new ItemBase("bag_of_copper_chips"));;
        BagOfCopperCoinSmall = register(new ItemBase("bag_of_copper_coins_small"));;
        BagOfCopperCoinLarge = register(new ItemBase("bag_of_copper_coins_large"));;
        BagOfSilverCoin = register(new ItemBase("bag_of_silver_coins"));;
        BagOfGoldCoin = register(new ItemBase("bag_of_gold_coins"));;
        BagOfOldCoin = register(new ItemBase("bag_of_old_coins"));;
        BagOfCrystalCoin = register(new ItemBase("bag_of_crystal_coins"));;

        DeadifferTeeHeePickaxe = register(new DeadifferTeeHeePickAxe(ToolMaterial.DIAMOND, "deadifferteeheepickaxe"));

        scrollTeleport = register(new ItemTeleport("scrollteleport"));
        scrollTeleportSpecified = register(new TeleportScroll("scrollteleportspecified"));
    }

    private static <T extends Item> T register(T item) {
        GameRegistry.register(item);

        if (item instanceof ItemModelProvider) {
            ((ItemModelProvider) item).registerItemModel(item);
        }

        return item;
    }
}
