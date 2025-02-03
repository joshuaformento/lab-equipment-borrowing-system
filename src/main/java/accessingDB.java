import javax.swing.*;
import java.sql.*;
import java.util.Scanner;

public class accessingDB {

    public static class Function{
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        final String DB_URL = "jdbc:mysql://localhost/finalprojectdb?serverTimezone=UTC";
        final String USERNAME = "root";
        final String PASSWORD = "";

        public ResultSet find(String s) throws SQLException {
            try {
                conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
                ps = conn.prepareStatement("select * from equipmentinventory where id = ?");
                ps.setString(1,s);
                rs = ps.executeQuery();
            } catch (Exception e){
                e.printStackTrace();
            }
            return rs;
        }

        public static void main(String[] args) throws SQLException {
            Scanner input = new Scanner(System.in);

            Function f = new Function();
            ResultSet rs = null;
            String en = "EQUIPMENTNAME";
            String br = "BORROWER";
            String stat = "STATUS";
            String iu = "INUSE";

            System.out.println("Enter equipment ID");
            int userinp = input.nextInt();

            rs = f.find(String.valueOf(userinp));
            try{

            if (rs.next()){
                System.out.println(rs.getString(en));
                System.out.println(rs.getString(br));
                System.out.println(rs.getString(stat));
                System.out.println(rs.getString(iu));
            } else {
                JOptionPane.showMessageDialog(null, "no data");
            }
        } catch (Exception ex){
    JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        }

    }
}
