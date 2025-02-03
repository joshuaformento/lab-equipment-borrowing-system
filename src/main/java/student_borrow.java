package main.java;


import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Joshua Formento
 */
public class student_borrow extends javax.swing.JFrame {

    /**
     * Creates new form student_borrow
     */
    public student_borrow() {
        initComponents();
        setTitle("Laboratory Equipment Borrowing System: Borrow");
        setLocationRelativeTo(null);
        setVisible(true);
    }

    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        qrcode = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        equipTF = new javax.swing.JTextField();
        statusTF = new javax.swing.JTextField();
        nameTF = new javax.swing.JTextField();
        useTF = new javax.swing.JTextField();
        borrowBtn = new javax.swing.JButton();
        scanBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Couture", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Laboratory Equipment Inventory ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, 38));

        backBtn.setBackground(new java.awt.Color(255, 255, 255));
        backBtn.setFont(new java.awt.Font("Quarion", 1, 14)); // NOI18N
        backBtn.setForeground(new java.awt.Color(0, 0, 0));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        getContentPane().add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, -1, -1));

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));
        exitBtn.setFont(new java.awt.Font("Quarion", 1, 14)); // NOI18N
        exitBtn.setForeground(new java.awt.Color(0, 0, 0));
        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 380, -1, -1));

        qrcode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        qrcode.setPreferredSize(new java.awt.Dimension(180, 180));

        javax.swing.GroupLayout qrcodeLayout = new javax.swing.GroupLayout(qrcode);
        qrcode.setLayout(qrcodeLayout);
        qrcodeLayout.setHorizontalGroup(
            qrcodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 176, Short.MAX_VALUE)
        );
        qrcodeLayout.setVerticalGroup(
            qrcodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 176, Short.MAX_VALUE)
        );

        getContentPane().add(qrcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jLabel2.setFont(new java.awt.Font("Bebas Neue", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("equipment name:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, 30));

        jLabel3.setFont(new java.awt.Font("Bebas Neue", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("in use/not:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, -1, 30));

        jLabel4.setFont(new java.awt.Font("Bebas Neue", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("borrower name:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, -1, 30));

        jLabel5.setFont(new java.awt.Font("Bebas Neue", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("status:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, 30));

        equipTF.setEditable(false);
        equipTF.setFont(new java.awt.Font("Proxima Nova Alt Lt", 0, 14)); // NOI18N
        equipTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equipTFActionPerformed(evt);
            }
        });
        getContentPane().add(equipTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 250, -1));

        statusTF.setEditable(false);
        statusTF.setFont(new java.awt.Font("Proxima Nova Alt Lt", 0, 14)); // NOI18N
        getContentPane().add(statusTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 250, -1));

        nameTF.setFont(new java.awt.Font("Proxima Nova Alt Lt", 0, 14)); // NOI18N
        getContentPane().add(nameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 250, -1));

        useTF.setFont(new java.awt.Font("Proxima Nova Alt Lt", 0, 14)); // NOI18N
        getContentPane().add(useTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 250, -1));

        borrowBtn.setBackground(new java.awt.Color(255, 255, 255));
        borrowBtn.setFont(new java.awt.Font("Quarion", 1, 14)); // NOI18N
        borrowBtn.setForeground(new java.awt.Color(0, 0, 0));
        borrowBtn.setText("Borrow");
        borrowBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrowBtnActionPerformed(evt);
            }
        });
        getContentPane().add(borrowBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, -1, -1));

        scanBtn.setBackground(new java.awt.Color(255, 255, 255));
        scanBtn.setFont(new java.awt.Font("Quarion", 1, 14)); // NOI18N
        scanBtn.setForeground(new java.awt.Color(0, 0, 0));
        scanBtn.setText("Scan");
        scanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scanBtnActionPerformed(evt);
            }
        });
        getContentPane().add(scanBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/images/Artboard 1.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void equipTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equipTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_equipTFActionPerformed

    private void borrowBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrowBtnActionPerformed
    try {
            String newName = nameTF.getText();
            String use = useTF.getText();

            
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(student_borrow.class.getName()).log(Level.SEVERE, null, ex);
            }
            con = DriverManager.getConnection("jdbc:mysql://localhost/finalprojectdb","root","");
            java.sql.Statement stm = con.createStatement();
            String sql = "INSERT INTO equipmentinventory (BORROWER, INUSE) VALUES ('"+newName+"','"+use+"')";
            stm.executeUpdate(sql);
            JOptionPane.showMessageDialog(this, "You can now borrow.");
            new student_borrow().setVisible(true);
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(student_borrow.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{
            String borrower = nameTF.getText();
            String equipment = equipTF.getText();
            String add = "INSERT  borrowhistory SET Borrowername = " + borrower + ", Equipmentname = "+ equipment +"";
            PreparedStatement ps = Myconnection.getConnection().prepareStatement(add); 
                    
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }


//        try {
//        String borrower = nameTF.getText();
//        String equipment = equipTF.getText();
//
//            
//            try {
//                Class.forName("com.mysql.cj.jdbc.Driver");
//            } catch (ClassNotFoundException ex) {
//                Logger.getLogger(student_borrow.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            con = DriverManager.getConnection("jdbc:mysql://localhost/finalprojectdb","root","");
//            java.sql.Statement stm = con.createStatement();
//            String add = "INSERT INTO borrowhistory (Borrowername, Equipmentname) VALUES ('"+borrower+"','"+equipment+"')";
//            stm.executeUpdate(add);
//        } catch (SQLException ex) {
//            Logger.getLogger(student_borrow.class.getName()).log(Level.SEVERE, null, ex);
//        }

//        try{
//            String update = "INSERT INTO borrowhistory (Borrowername, Equipmentname) VALUES (?, ?)";
//                    try {
//                        ps = Myconnection.getConnection().prepareStatement(update);
//                        ps.setString(2, equipment);
//                        ps.setString(1, borrower);
//
//                        if (ps.executeUpdate() != 0){
//                            JOptionPane.showMessageDialog(null,"Equipment has been recorded");
//                        }
//            String borrower = nameTF.getText();
//            String equipment = equipTF.getText();
//            PreparedStatement ps;
//                
//                String update = "INSERT INTO borrowhistory (Borrowername, Equipmentname) VALUES (?, ?)";
//                    try {
//                        ps = Myconnection.getConnection().prepareStatement(update);
//                        ps.setString(2, borrower);
//                        ps.setString(3, equipment);
//                        if (ps.executeUpdate() != 0){
//                            JOptionPane.showMessageDialog(null,"Equipment has been recorded");
//                        }
//                        
//                    } catch (SQLException ex) {
//                        throw new RuntimeException(ex);
//                    }
//            String borrower = nameTF.getText();
//            String equipment = equipTF.getText();
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            con = DriverManager.getConnection("jdbc:mysql://localhost/finalprojectdb","root","");
//            java.sql.Statement stm = con.createStatement();
//            //String add = "INSERT INTO borrowhistory SET Borrowername = " + borrower + ", Equipmentname = "+ equipment +"";
//            String add = "INSERT INTO borrowhistory (Borrowername, Equipmentname) VALUES ('"+borrower+"','"+equipment+"')";
//            //PreparedStatement ps = Myconnection.getConnection().prepareStatement(add); 
//            stm.executeUpdate(add);
                    
//        }catch(Exception ex){
//            JOptionPane.showMessageDialog(null, ex);
//        } // TODO add your handling code here:
    }//GEN-LAST:event_borrowBtnActionPerformed

    private void scanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scanBtnActionPerformed
        ReadQrcode scan = new ReadQrcode("");
        scan.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_scanBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        StudentLogin login = new StudentLogin();
        login.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(student_borrow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(student_borrow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(student_borrow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(student_borrow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new student_borrow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton borrowBtn;
    private javax.swing.JTextField equipTF;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nameTF;
    private javax.swing.JPanel qrcode;
    private javax.swing.JButton scanBtn;
    private javax.swing.JTextField statusTF;
    private javax.swing.JTextField useTF;
    // End of variables declaration//GEN-END:variables
}
