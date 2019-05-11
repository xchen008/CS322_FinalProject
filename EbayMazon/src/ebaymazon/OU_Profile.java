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

/**
 *
 * @author Janice
 */
public class OU_Profile extends javax.swing.JFrame {
    String str = new String("User");

    public OU_Profile(String string) {
        
        str = string;
        initComponents();
        try
        {
            Connection connect = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/jmaxdb?useLegacyDatetimeCode=false&serverTimezone=America/New_York","csc322","comp2020");
            PreparedStatement st = connect.prepareStatement("SELECT * FROM User WHERE username = ?");  
            st.setString(1,string);
            ResultSet rs = st.executeQuery();
            rs.next();
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

        jButton4.setText("jButton1");

        jLabel5.setText("jLabel5");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Profile");
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(600, 400));
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
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(Number))
                        .addGap(99, 99, 99)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phonenumber)
                            .addComponent(address)
                            .addComponent(creditcard)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(123, 123, 123))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(134, 134, 134))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(123, 123, 123))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(username)
                            .addComponent(Item2))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Item2))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(address))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(creditcard))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Number)
                    .addComponent(phonenumber))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        FriendList.setText("View Friends List");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(FriendList, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(215, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FriendList)
                    .addComponent(Close))
                .addGap(79, 79, 79))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 580, 380));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        setVisible(false);
    }//GEN-LAST:event_CloseActionPerformed

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
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
