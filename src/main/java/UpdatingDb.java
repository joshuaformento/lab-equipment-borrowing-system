package main.java;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdatingDb {

    public static void main(String[] args) throws SQLException {
        Scanner scan = new Scanner(System.in);
        PreparedStatement ps;

        System.out.println("Enter UID");
        String Identity = scan.nextLine();
        System.out.println("Enter Borrower name:");
        String bor = scan.nextLine();
        System.out.println("Enter Equipment Status:");
        String stat = scan.nextLine();
        System.out.println("Update equipment status:(In use or not)");
        String inuse= scan.nextLine();


        String sql = "UPDATE `equipmentinventory` SET `BORROWER` = '"+ bor + "', `STATUS` = '"+ stat +"', `INUSE` = '"+ inuse +"' " +
                "WHERE `equipmentinventory`.`ID` = '"+ Identity +"'";
        try {
            ps = Myconnection.getConnection().prepareStatement(sql);
            int rowupdate = ps.executeUpdate(sql);
            System.out.println("Rows updated" + rowupdate);
            System.out.println("Updated!");
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
