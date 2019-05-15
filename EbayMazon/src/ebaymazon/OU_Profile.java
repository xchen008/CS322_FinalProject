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
import java.util.logging.Level;
import java.util.logging.Logger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Formatter;

/**
 *
 * @author Janice
 */
public class OU_Profile extends javax.swing.JFrame {
    
    
    String str = new String("User");

    public OU_Profile(String string) {
        
        str = string;
        initComponents();
        this.setLocationRelativeTo(null);
        try
        {
            Connection connect = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/jmaxdb?useLegacyDatetimeCode=false&serverTimezone=America/New_York","csc322","comp2020");
            PreparedStatement st = connect.prepareStatement("SELECT * FROM User WHERE username = ?");  
            st.setString(1,string);
            ResultSet rs = st.executeQuery();
            rs.next();
            
            DecimalFormat df = new DecimalFormat("#.##");
            rate.setText(String.format("Your rating is: " + df.format(rs.getDouble("rating"))));
            username.setText(rs.getString("username"));
            address.setText(rs.getString("Address"));
            phonenumber.setText(rs.getString("PhoneNumber"));
            creditcard.setText(rs.getString("CreditCard"));
            
            
        } catch (SQLException ex) {
            Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Close = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Number = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        Item2 = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        creditcard = new javax.swing.JLabel();
        phonenumber = new javax.swing.JLabel();
        FriendList = new javax.swing.JButton();
        EditPassword = new javax.swing.JButton();
        EditAddress = new javax.swing.JButton();
        EditCreditCard = new javax.swing.JButton();
        EditPhoneNumber = new javax.swing.JButton();
        rate = new javax.swing.JLabel();

        jButton4.setText("jButton1");

        jLabel5.setText("jLabel5");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Profile");
        setMinimumSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "My Profile", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 36))); // NOI18N

        Close.setText("Close");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel2.setText("Password:");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel1.setText("Username:");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel3.setText("Credit Card:");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel4.setText("Address:");

        Number.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        Number.setText("Phone Number:");

        username.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        username.setText("jLabel1");

        Item2.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        Item2.setText("*********");

        address.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        address.setText("jLabel3");

        creditcard.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        creditcard.setText("jLabel4");

        phonenumber.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        phonenumber.setText("jLabel5");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123)
                        .addComponent(username))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(Number)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(99, 99, 99)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Item2)
                            .addComponent(creditcard)
                            .addComponent(phonenumber)
                            .addComponent(address))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username))
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Item2)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(address))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(creditcard))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Number)
                    .addComponent(phonenumber))
                .addGap(21, 21, 21))
        );

        FriendList.setText("View Friends List");

        EditPassword.setText("Edit");
        EditPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditPasswordActionPerformed(evt);
            }
        });

        EditAddress.setText("Edit");
        EditAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditAddressActionPerformed(evt);
            }
        });

        EditCreditCard.setText("Edit");
        EditCreditCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditCreditCardActionPerformed(evt);
            }
        });

        EditPhoneNumber.setText("Edit");
        EditPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditPhoneNumberActionPerformed(evt);
            }
        });

        rate.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        rate.setText("Your rating is:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(FriendList, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 252, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EditPassword)
                    .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditAddress)
                    .addComponent(EditCreditCard)
                    .addComponent(EditPhoneNumber))
                .addGap(31, 31, 31))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rate)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rate)
                        .addGap(47, 47, 47)
                        .addComponent(EditPassword)
                        .addGap(26, 26, 26)
                        .addComponent(EditAddress)
                        .addGap(27, 27, 27)
                        .addComponent(EditCreditCard)
                        .addGap(18, 18, 18)
                        .addComponent(EditPhoneNumber))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FriendList)
                    .addComponent(Close))
                .addGap(79, 79, 79))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 580, 390));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        setVisible(false);
    }//GEN-LAST:event_CloseActionPerformed

    private void EditPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditPasswordActionPerformed
        EditProfile editpass = new EditProfile(str,1);
        editpass.setVisible(true);
    }//GEN-LAST:event_EditPasswordActionPerformed

    private void EditAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditAddressActionPerformed
        EditProfile editaddr = new EditProfile(str,2);
        editaddr.setVisible(true);
    }//GEN-LAST:event_EditAddressActionPerformed

    private void EditCreditCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditCreditCardActionPerformed
        EditProfile editcc = new EditProfile(str,3);
        editcc.setVisible(true);
    }//GEN-LAST:event_EditCreditCardActionPerformed

    private void EditPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditPhoneNumberActionPerformed
        EditProfile editnum = new EditProfile(str,4);
        editnum.setVisible(true);
    }//GEN-LAST:event_EditPhoneNumberActionPerformed

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
            java.util.logging.Logger.getLogger(OU_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OU_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OU_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OU_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OU_Profile("User").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Close;
    private javax.swing.JButton EditAddress;
    private javax.swing.JButton EditCreditCard;
    private javax.swing.JButton EditPassword;
    private javax.swing.JButton EditPhoneNumber;
    private javax.swing.JButton FriendList;
    private javax.swing.JLabel Item2;
    private javax.swing.JLabel Number;
    private javax.swing.JLabel address;
    private javax.swing.JLabel creditcard;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel phonenumber;
    private javax.swing.JLabel rate;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
