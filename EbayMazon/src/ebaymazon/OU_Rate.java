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
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Formatter;

/**
 *
 * @author XueruChen
 */
public class OU_Rate extends javax.swing.JFrame {

    /**
     * Creates new form OU_Rate
     */
    
    String seller = null;
    String title = null;
    
    public OU_Rate(String str, String str2) {
        initComponents();
        this.setLocationRelativeTo(null);
        seller = str;
        title = str2;
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
        Rating = new javax.swing.JTextField();
        Done = new javax.swing.JButton();
        Close = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Rate this product out of 5");

        Rating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RatingActionPerformed(evt);
            }
        });

        Done.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Done.setText("Submit");
        Done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoneActionPerformed(evt);
            }
        });

        Close.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Close.setText("Close");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(Done)
                        .addGap(70, 70, 70)
                        .addComponent(Close))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(Rating, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Rating, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Done)
                    .addComponent(Close))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RatingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RatingActionPerformed
        // TODO add your handling code here:
        
        try
        {   
            //String sel = "SELECT 'Title', 'Price', 'Seller' FROM Products WHERE Title = ?";
            Connection connect = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/jmaxdb?useLegacyDatetimeCode=false&serverTimezone=America/New_York","csc322","comp2020");
            Statement st = (Statement) connect.createStatement();
            ResultSet rs = null;
           
            rs = st.executeQuery("SELECT * FROM User");
            
            int numrate = 0;
            double rating = 0.0;
            
            while(rs.next())
            {
                if(rs.getString("username").equals(seller))
                {
                    numrate = rs.getInt("num_rating");
                    rating = rs.getDouble("rating");
                }    
            }
            
            int newrate = Integer.parseInt(Rating.getText());

      
            rating = rating * (numrate++) + newrate;
            rating = rating/numrate;

            
            PreparedStatement stmt = connect.prepareStatement("UPDATE User SET rating = ?, num_rating = ? WHERE username = ?");
            stmt.setDouble(1, rating);
            stmt.setInt(2, numrate);
            stmt.setString(3, seller);

            PreparedStatement stmt2 = connect.prepareStatement("UPDATE PastProducts SET rated= ? WHERE Seller = ? AND Title = ?");
            stmt2.setInt(1,newrate);
            stmt2.setString(2,seller);
            stmt2.setString(3,title);
            stmt2.executeUpdate();
            stmt.executeUpdate();
            
            
            
            JOptionPane.showMessageDialog(null, "Successfully rated!");
            this.setVisible(false);
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
    }//GEN-LAST:event_RatingActionPerformed

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_CloseActionPerformed

    private void DoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneActionPerformed
        // TODO add your handling code here:
        RatingActionPerformed(evt);
    }//GEN-LAST:event_DoneActionPerformed

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
            java.util.logging.Logger.getLogger(OU_Rate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OU_Rate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OU_Rate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OU_Rate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OU_Rate(" "," ").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Close;
    private javax.swing.JButton Done;
    private javax.swing.JTextField Rating;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
