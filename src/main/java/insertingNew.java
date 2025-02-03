package main.java;

import javax.swing.*;
import java.sql.*;
import java.util.Scanner;
import java.util.UUID;

public class insertingNew {
    public void UIDgen() {
        UUID uniqueKey = UUID.randomUUID();
        System.out.println (uniqueKey);
    }
public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Enter Equipment name:");
    String equipmentname = input.nextLine();
    System.out.println("Enter borrower name:");
    String bor = input.nextLine();
    System.out.println("Enter equipment status");
    String stat = input.nextLine();
    System.out.println("Enter whether the equipment is in use:");
    String inuse = input.nextLine();
    UUID uniqueKey = UUID.randomUUID();

    PreparedStatement ps;


    String sql = "INSERT INTO equipmentinventory (ID, EQUIPMENTNAME, BORROWER, STATUS, INUSE) VALUES (?, ? , ?, ?, ?)";

    try {
        ps = Myconnection.getConnection().prepareStatement(sql);
        ps.setString(1, String.valueOf(uniqueKey));
        ps.setString(2, equipmentname);
        ps.setString(3, bor);
        ps.setString(4, stat);
        ps.setString(5, inuse);

        if (ps.executeUpdate() != 0){
            System.out.println("Equipment has been recorded");
        }

    } catch (SQLException ex) {
        throw new RuntimeException(ex);
    }


    }
}
