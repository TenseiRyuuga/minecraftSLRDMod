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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BlockBaseDatabaseBlock extends BlockBase {

    Connection conn = null;

    public BlockBaseDatabaseBlock(Material materialIn, String name) {
        super(materialIn, name);
        System.out.println("Steady DB?");
        try {
            conn
                    = DriverManager.getConnection("jdbc:mysql://localhost/test?"
                            + "user=SLRD&password=DeadifferTeeHee");
            System.out.println("Go DB!" + conn);

    // Do something with the Connection
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
}
