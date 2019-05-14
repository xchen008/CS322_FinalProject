
package ebaymazon;

public class SU_MainPage extends javax.swing.JFrame {

    /**
     * Creates new form SU_MainPage
     */
    public SU_MainPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AvaliableItems = new javax.swing.JToggleButton();
        NewUsersApp = new javax.swing.JToggleButton();
        WarningList = new javax.swing.JToggleButton();
        NewItem = new javax.swing.JToggleButton();
        ListOfUsers = new javax.swing.JToggleButton();
        Transaction = new javax.swing.JToggleButton();
        Complains = new javax.swing.JToggleButton();
        BlockList = new javax.swing.JToggleButton();
        Taboo = new javax.swing.JToggleButton();
        Cancel = new javax.swing.JToggleButton();
        Logout = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SU_MainPage");
        setMinimumSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SU Main Page", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 36))); // NOI18N

        AvaliableItems.setText("Avaliable Items");
        AvaliableItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvaliableItemsActionPerformed(evt);
            }
        });

        NewUsersApp.setText("New Users Applications");
        NewUsersApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewUsersAppActionPerformed(evt);
            }
        });

        WarningList.setText("Warning List");
        WarningList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WarningListActionPerformed(evt);
            }
        });

        NewItem.setText("New Item Info");
        NewItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewItemActionPerformed(evt);
            }
        });

        ListOfUsers.setText("List of Users");
        ListOfUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListOfUsersActionPerformed(evt);
            }
        });

        Transaction.setText("Transactions");
        Transaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransactionActionPerformed(evt);
            }
        });

        Complains.setText("Complaints");
        Complains.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComplainsActionPerformed(evt);
            }
        });

        BlockList.setText("Block List");
        BlockList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlockListActionPerformed(evt);
            }
        });

        Taboo.setText("Taboo List");
        Taboo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TabooActionPerformed(evt);
            }
        });

        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        Logout.setText("Logout");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NewUsersApp, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AvaliableItems, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WarningList, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(NewItem, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(Complains, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ListOfUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Transaction, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Taboo, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(BlockList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(Cancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Logout)
                .addGap(109, 109, 109))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewItem)
                    .addComponent(AvaliableItems)
                    .addComponent(Complains))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewUsersApp)
                    .addComponent(ListOfUsers)
                    .addComponent(BlockList))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(WarningList, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Transaction)
                        .addComponent(Taboo)))
                .addGap(18, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancel)
                    .addComponent(Logout))
                .addGap(24, 24, 24))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 580, 380));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NewUsersAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewUsersAppActionPerformed
        setVisible(false);
        SU_GUApplications newapp = new SU_GUApplications();
        newapp.setVisible(true);
    }//GEN-LAST:event_NewUsersAppActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_CancelActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        setVisible(false);
        LoginPage logout = new LoginPage();
        logout.setVisible(true);
    }//GEN-LAST:event_LogoutActionPerformed

    private void TabooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TabooActionPerformed
        SU_TabooList fr = new SU_TabooList();
        fr.setVisible(true);
    }//GEN-LAST:event_TabooActionPerformed

    private void BlockListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlockListActionPerformed
        SU_BlockList fr = new SU_BlockList();
        fr.setVisible(true);
    }//GEN-LAST:event_BlockListActionPerformed

    private void WarningListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WarningListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WarningListActionPerformed

    private void AvaliableItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvaliableItemsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AvaliableItemsActionPerformed

    private void NewItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewItemActionPerformed

    private void ComplainsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComplainsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComplainsActionPerformed

    private void TransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransactionActionPerformed
        SU_SellingTransactions transaction = new SU_SellingTransactions();
        transaction.setVisible(true);
    }//GEN-LAST:event_TransactionActionPerformed

    private void ListOfUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListOfUsersActionPerformed
        SU_OUList users = new SU_OUList();
        users.setVisible(true);
    }//GEN-LAST:event_ListOfUsersActionPerformed

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
            java.util.logging.Logger.getLogger(SU_MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SU_MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SU_MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SU_MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SU_MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton AvaliableItems;
    private javax.swing.JToggleButton BlockList;
    private javax.swing.JToggleButton Cancel;
    private javax.swing.JToggleButton Complains;
    private javax.swing.JToggleButton ListOfUsers;
    private javax.swing.JToggleButton Logout;
    private javax.swing.JToggleButton NewItem;
    private javax.swing.JToggleButton NewUsersApp;
    private javax.swing.JToggleButton Taboo;
    private javax.swing.JToggleButton Transaction;
    private javax.swing.JToggleButton WarningList;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
