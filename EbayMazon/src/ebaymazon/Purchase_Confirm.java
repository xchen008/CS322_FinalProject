/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebaymazon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Janice
 */
public class Purchase_Confirm extends javax.swing.JFrame {

    /**
     * Creates new form Purchase_Confirm
     * 
     */
    
    String str = "Title";
    String User = "User";
    Statement st = null;
    PreparedStatement stmt = null;
    PreparedStatement stmt3 = null;
    ResultSet rs = null;
    
    public Purchase_Confirm(String string,String string2) {
        
        initComponents();
        
        str = string;
        User = string2;
        Item.setText(str);
        this.setLocationRelativeTo(null);

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Purchase = new javax.swing.JButton();
        Close = new javax.swing.JButton();
        Item = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Do you want to buy this product?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 14, 308, 78));

        Purchase.setText("YES :)");
        Purchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PurchaseActionPerformed(evt);
            }
        });
        getContentPane().add(Purchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 170, -1, -1));

        Close.setText("NO :(");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
        getContentPane().add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 170, -1, -1));

        Item.setText("Product_Name");
        getContentPane().add(Item, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 110, 135, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_CloseActionPerformed

    private void PurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PurchaseActionPerformed
        // TODO add your handling code here:

        
	Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        try
        {   
            //String sel = "SELECT 'Title', 'Price', 'Seller' FROM Products WHERE Title = ?";
            Connection connect = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/jmaxdb?useLegacyDatetimeCode=false&serverTimezone=America/New_York","csc322","comp2020");
            st = (Statement) connect.createStatement();
            rs = st.executeQuery("SELECT * FROM Products");
            
            stmt= connect.prepareStatement("INSERT INTO PastProducts values (?,?,?,?,?)");
            stmt3 = connect.prepareStatement("DELETE FROM Products WHERE Title = ?");
            stmt3.setString(1, str);
            
            while(rs.next())
            {
            
            String s1 = rs.getString("Title");
            
            if(s1.equals(str))
            {
                Float s2 = rs.getFloat("Price");
                String s4 = rs.getString("Seller");
                String s5 = sdf.format(date);


    //            System.out.print(s5);
    //            st.executeUpdate();
                stmt.setString(1, s1);
                stmt.setFloat(2, s2);
                stmt.setString(3, User);
                stmt.setString(4, s4);
                stmt.setString(5, s5);
            }
            }
            
            stmt.executeUpdate();
            stmt3.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully Purchase!");
            this.setVisible(false);
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_PurchaseActionPerformed

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
            java.util.logging.Logger.getLogger(Purchase_Confirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Purchase_Confirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Purchase_Confirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Purchase_Confirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Purchase_Confirm("Title","User").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Close;
    private javax.swing.JLabel Item;
    private javax.swing.JButton Purchase;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}