package form;

import config.Constanta;
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Users;

/**
 *
 *  
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    Users users = new Users();

    public Login() {
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

        formLoginPanelHeader = new keeptoo.KGradientPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        formLoginLabelHeader = new javax.swing.JLabel();
        formLoginPanelFooter = new javax.swing.JPanel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        formLoginLabelFooter = new javax.swing.JLabel();
        formLoginLabelFooter2 = new javax.swing.JLabel();
        formLoginPanelMain = new javax.swing.JPanel();
        formLoginMainPanelButton = new javax.swing.JPanel();
        formLoginMainButtonCreateAccount = new javax.swing.JButton();
        formLoginMainButtonLogin = new javax.swing.JButton();
        formLoginMainPasswordFieldPassword = new javax.swing.JPasswordField();
        formLoginMainLabelPassword = new javax.swing.JLabel();
        formLoginMainTextFieldUsername = new javax.swing.JTextField();
        formLoginMainLabelUsername = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setName("frameLogin"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        formLoginPanelHeader.setBackground(new java.awt.Color(51, 153, 255));
        formLoginPanelHeader.setPreferredSize(new java.awt.Dimension(1024, 100));

        kGradientPanel1.setkEndColor(new java.awt.Color(51, 153, 255));
        kGradientPanel1.setkGradientFocus(400);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 204, 204));

        formLoginLabelHeader.setBackground(new java.awt.Color(102, 153, 255));
        formLoginLabelHeader.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        formLoginLabelHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        formLoginLabelHeader.setIcon(new javax.swing.ImageIcon("D:\\dev\\.project\\ecms\\lib\\logo.png")); // NOI18N

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(formLoginLabelHeader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(formLoginLabelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout formLoginPanelHeaderLayout = new javax.swing.GroupLayout(formLoginPanelHeader);
        formLoginPanelHeader.setLayout(formLoginPanelHeaderLayout);
        formLoginPanelHeaderLayout.setHorizontalGroup(
            formLoginPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        formLoginPanelHeaderLayout.setVerticalGroup(
            formLoginPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formLoginPanelHeaderLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(formLoginPanelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));
        formLoginPanelHeader.getAccessibleContext().setAccessibleName("");
        formLoginPanelHeader.getAccessibleContext().setAccessibleDescription("");

        formLoginPanelFooter.setBackground(new java.awt.Color(51, 153, 255));
        formLoginPanelFooter.setForeground(new java.awt.Color(0, 204, 255));
        formLoginPanelFooter.setPreferredSize(new java.awt.Dimension(1024, 75));

        kGradientPanel2.setkEndColor(new java.awt.Color(51, 153, 255));
        kGradientPanel2.setkGradientFocus(400);
        kGradientPanel2.setkStartColor(new java.awt.Color(0, 204, 204));

        formLoginLabelFooter.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        formLoginLabelFooter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        formLoginLabelFooter.setText("Employee Content Management System");

        formLoginLabelFooter2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        formLoginLabelFooter2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        formLoginLabelFooter2.setText("CopyRight ??2021");

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(formLoginLabelFooter, javax.swing.GroupLayout.DEFAULT_SIZE, 1249, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kGradientPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(formLoginLabelFooter2, javax.swing.GroupLayout.DEFAULT_SIZE, 1260, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(formLoginLabelFooter)
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kGradientPanel2Layout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(formLoginLabelFooter2)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout formLoginPanelFooterLayout = new javax.swing.GroupLayout(formLoginPanelFooter);
        formLoginPanelFooter.setLayout(formLoginPanelFooterLayout);
        formLoginPanelFooterLayout.setHorizontalGroup(
            formLoginPanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        formLoginPanelFooterLayout.setVerticalGroup(
            formLoginPanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(formLoginPanelFooter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 645, 1280, -1));

        formLoginPanelMain.setBackground(new java.awt.Color(255, 255, 255));

        formLoginMainPanelButton.setBackground(new java.awt.Color(255, 255, 255));
        formLoginMainPanelButton.setPreferredSize(new java.awt.Dimension(479, 151));

        formLoginMainButtonCreateAccount.setBackground(new java.awt.Color(51, 153, 255));
        formLoginMainButtonCreateAccount.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        formLoginMainButtonCreateAccount.setText("Create Account");
        formLoginMainButtonCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formLoginMainButtonCreateAccountActionPerformed(evt);
            }
        });
        formLoginMainButtonCreateAccount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formLoginMainButtonCreateAccountKeyPressed(evt);
            }
        });

        formLoginMainButtonLogin.setBackground(new java.awt.Color(51, 153, 255));
        formLoginMainButtonLogin.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        formLoginMainButtonLogin.setText("Login");
        formLoginMainButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formLoginMainButtonLoginActionPerformed(evt);
            }
        });
        formLoginMainButtonLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formLoginMainButtonLoginKeyPressed(evt);
            }
        });

        formLoginMainPasswordFieldPassword.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N

        formLoginMainLabelPassword.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        formLoginMainLabelPassword.setText("Password");

        formLoginMainTextFieldUsername.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N

        formLoginMainLabelUsername.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        formLoginMainLabelUsername.setText("Username");

        javax.swing.GroupLayout formLoginMainPanelButtonLayout = new javax.swing.GroupLayout(formLoginMainPanelButton);
        formLoginMainPanelButton.setLayout(formLoginMainPanelButtonLayout);
        formLoginMainPanelButtonLayout.setHorizontalGroup(
            formLoginMainPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLoginMainPanelButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formLoginMainPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(formLoginMainButtonLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(formLoginMainButtonCreateAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(formLoginMainPanelButtonLayout.createSequentialGroup()
                        .addGroup(formLoginMainPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(formLoginMainLabelUsername)
                            .addGroup(formLoginMainPanelButtonLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(formLoginMainLabelPassword)))
                        .addGap(18, 18, 18)
                        .addGroup(formLoginMainPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(formLoginMainPasswordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(formLoginMainTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        formLoginMainPanelButtonLayout.setVerticalGroup(
            formLoginMainPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formLoginMainPanelButtonLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(formLoginMainPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formLoginMainTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(formLoginMainLabelUsername))
                .addGap(18, 18, 18)
                .addGroup(formLoginMainPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formLoginMainPasswordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(formLoginMainLabelPassword))
                .addGap(18, 18, 18)
                .addComponent(formLoginMainButtonLogin)
                .addGap(18, 18, 18)
                .addComponent(formLoginMainButtonCreateAccount)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout formLoginPanelMainLayout = new javax.swing.GroupLayout(formLoginPanelMain);
        formLoginPanelMain.setLayout(formLoginPanelMainLayout);
        formLoginPanelMainLayout.setHorizontalGroup(
            formLoginPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLoginPanelMainLayout.createSequentialGroup()
                .addGap(401, 401, 401)
                .addComponent(formLoginMainPanelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(410, Short.MAX_VALUE))
        );
        formLoginPanelMainLayout.setVerticalGroup(
            formLoginPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formLoginPanelMainLayout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addComponent(formLoginMainPanelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163))
        );

        getContentPane().add(formLoginPanelMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 99, -1, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clearForm() {
        formLoginMainTextFieldUsername.setText("");
        formLoginMainPasswordFieldPassword.setText("");
    }

    private void formLoginMainButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formLoginMainButtonLoginActionPerformed
        // TODO add your handling code here:
        try {
            boolean is_success = users.login(formLoginMainTextFieldUsername.getText(), formLoginMainPasswordFieldPassword.getText());

            if (is_success) {
                MainMenu mainMenu = new MainMenu();
                mainMenu.show(true);
                mainMenu.setLabelId(users.getId().toString());
                mainMenu.setLabelNik(users.getUsername());
                mainMenu.setFullName(users.getFirstName().trim() + " " + users.getLastName().trim());
                mainMenu.setAccessMenu(users.getAccessMenu());
                mainMenu.setUsers(users);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, Constanta.Messages.MESSAGE_FAILED_LOGIN);
                clearForm();
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_formLoginMainButtonLoginActionPerformed

    private void formLoginMainButtonLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formLoginMainButtonLoginKeyPressed
        // TODO add your handling code here:
        try {
            boolean is_success = users.login(formLoginMainTextFieldUsername.getText(), formLoginMainPasswordFieldPassword.getText());

            if (is_success) {
                MainMenu mainMenu = new MainMenu();
                mainMenu.show(true);
                mainMenu.setLabelId(users.getId().toString());
                mainMenu.setLabelNik(users.getUsername());
                mainMenu.setFullName(users.getFirstName().trim() + " " + users.getLastName().trim());
                mainMenu.setAccessMenu(users.getAccessMenu());
                mainMenu.setUsers(users);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, Constanta.Messages.MESSAGE_FAILED_LOGIN);
                clearForm();
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_formLoginMainButtonLoginKeyPressed

    private void formLoginMainButtonCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formLoginMainButtonCreateAccountActionPerformed
        // TODO add your handling code here:
        try {
            Register register = new Register();
            register.show(true);
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_formLoginMainButtonCreateAccountActionPerformed

    private void formLoginMainButtonCreateAccountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formLoginMainButtonCreateAccountKeyPressed
        // TODO add your handling code here:
        try {
            Register register = new Register();
            register.show(true);
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_formLoginMainButtonCreateAccountKeyPressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel formLoginLabelFooter;
    private javax.swing.JLabel formLoginLabelFooter2;
    private javax.swing.JLabel formLoginLabelHeader;
    private javax.swing.JButton formLoginMainButtonCreateAccount;
    private javax.swing.JButton formLoginMainButtonLogin;
    private javax.swing.JLabel formLoginMainLabelPassword;
    private javax.swing.JLabel formLoginMainLabelUsername;
    private javax.swing.JPanel formLoginMainPanelButton;
    private javax.swing.JPasswordField formLoginMainPasswordFieldPassword;
    private javax.swing.JTextField formLoginMainTextFieldUsername;
    private javax.swing.JPanel formLoginPanelFooter;
    private javax.swing.JPanel formLoginPanelHeader;
    private javax.swing.JPanel formLoginPanelMain;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    // End of variables declaration//GEN-END:variables
}
