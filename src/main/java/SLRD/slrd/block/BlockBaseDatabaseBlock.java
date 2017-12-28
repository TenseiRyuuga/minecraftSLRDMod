package SLRD.slrd.block;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import net.minecraft.block.material.Material;

public class BlockBaseDatabaseBlock extends BlockBase{

    Connection conn = null;
    Statement stmt;
    ResultSet rs;
    String query;

    public BlockBaseDatabaseBlock(Material materialIn, String name) {
        super(materialIn, name);
        System.out.println("Steady DB?");
        try {
            conn
                    = DriverManager.getConnection("jdbc:mysql://localhost/slrd?"
                            + "user=SLRD&password=DeadifferTeeHee");
            System.out.println("Go DB!" + conn);

            //add playername to db
            String input = "ryuuga";
//            EntityPlayerSP input = Minecraft.getMinecraft().player;
//            stmt = conn.createStatement();
//            query = "INSERT INTO `test`(`PlayerID`) VALUES ('" + Player + "')";

            //Create a database
            stmt = conn.createStatement();
            query = "SELECT * FROM `test`";
            rs = stmt.executeQuery(query);
            System.out.println("Database rs:" + rs);

            while (rs.next()) {
                System.out.println("Resultset rs:" + rs.getString("PlayerID"));
            }

            // Do something with the Connection
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
}
