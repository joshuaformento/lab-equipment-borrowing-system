/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Joshua Formento
 */
public class Available extends javax.swing.JFrame {

    /**
     * Creates new form Record
     */
    public Available() {
        initComponents();
        setTitle("List of Equipment");
        setLocationRelativeTo(null);
        setVisible(true); 
        TableColumnModel columnModel = tableHistory.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(155);
        columnModel.getColumn(1).setPreferredWidth(70);
        columnModel.getColumn(2).setPreferredWidth(70);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }                                                                        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableHistory = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();
        showBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("BookmanOldStyleProCyrW04-Rg", 0, 32)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("BATANGAS STATE UNIVERSITY");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, 50));

        jLabel11.setFont(new java.awt.Font("BookmanOldStyleProCyrW04-Rg", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("The National Engineering University");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Couture", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("LIST OF EQUIPMENT");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, 38));

        jLabel2.setFont(new java.awt.Font("Couture", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Laboratory Equipment");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, 38));

        tableHistory.setFont(new java.awt.Font("Proxima Nova Rg", 0, 12)); // NOI18N
        tableHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EQUIPMENT", "STATUS", "IN USE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableHistory.setEnabled(false);
        tableHistory.getTableHeader().setReorderingAllowed(false);
        tableHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableHistoryMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableHistory);
        if (tableHistory.getColumnModel().getColumnCount() > 0) {
            tableHistory.getColumnModel().getColumn(0).setResizable(false);
            tableHistory.getColumnModel().getColumn(0).setPreferredWidth(155);
            tableHistory.getColumnModel().getColumn(1).setResizable(false);
            tableHistory.getColumnModel().getColumn(1).setPreferredWidth(70);
            tableHistory.getColumnModel().getColumn(2).setResizable(false);
            tableHistory.getColumnModel().getColumn(2).setPreferredWidth(70);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 620, 190));

        backBtn.setBackground(new java.awt.Color(255, 255, 255));
        backBtn.setFont(new java.awt.Font("Quarion", 1, 16)); // NOI18N
        backBtn.setForeground(new java.awt.Color(0, 0, 0));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        getContentPane().add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 380, -1, -1));

        showBtn.setBackground(new java.awt.Color(255, 255, 255));
        showBtn.setFont(new java.awt.Font("Quarion", 1, 16)); // NOI18N
        showBtn.setForeground(new java.awt.Color(0, 0, 0));
        showBtn.setText("Show");
        showBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBtnActionPerformed(evt);
            }
        });
        getContentPane().add(showBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/images/Artboard 1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableHistoryMouseClicked
     // TODO add your handling code here:
    }//GEN-LAST:event_tableHistoryMouseClicked

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        main.java.ReadQrcode student = new main.java.ReadQrcode("");
        student.setLayout(null);
        student.setBounds(200,200,740,455);
        student.setVisible(true);
        student.setLocationRelativeTo(null);
        student.setTitle("QR Code Scanner"); 
        this.setVisible(false);
    }//GEN-LAST:event_backBtnActionPerformed

    private void showBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBtnActionPerformed
            try{
                    Connection conn = Myconnection.getConnection();
                    Statement st = conn.createStatement();
                    String query = "SELECT * FROM equipmentinventory";
                    ResultSet rs = st.executeQuery(query);
                    ResultSetMetaData rsm = rs.getMetaData();
                    DefaultTableModel model = (DefaultTableModel) tableHistory.getModel();

                    int cols = 3;
                    for(int i = 0; i<cols; i++){

                        TableColumnModel columnModel = tableHistory.getColumnModel();
                        columnModel.getColumn(0).setPreferredWidth(155);
                        columnModel.getColumn(1).setPreferredWidth(70);
                        columnModel.getColumn(2).setPreferredWidth(70);
                        String EQUIPMENT, STATUS, INUSE;
                        while (rs.next()){
                            EQUIPMENT = rs.getString(2);
                            STATUS = rs.getString(4);
                            INUSE = rs.getString(5);
                            String[] row = {EQUIPMENT, STATUS, INUSE};
                            model.addRow(row);
                        }
                    }


                }catch (Exception ex){
                   ex.printStackTrace();
                }    
            // TODO add your handling code here:
    }//GEN-LAST:event_showBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Available.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Available.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Available.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Available.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Available().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton showBtn;
    private javax.swing.JTable tableHistory;
    // End of variables declaration//GEN-END:variables
}
