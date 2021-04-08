package form;

import config.Constanta;
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Users;

/**
 *
 * @author bason
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

        formLoginPanelHeader = new javax.swing.JPanel();
        formLoginLabelHeader = new javax.swing.JLabel();
        formLoginPanelFooter = new javax.swing.JPanel();
        formLoginLabelFooter = new javax.swing.JLabel();
        formLoginLabelFooter2 = new javax.swing.JLabel();
        formLoginPanelMain = new javax.swing.JPanel();
        formLoginMainLabelUsername = new javax.swing.JLabel();
        formLoginMainLabelPassword = new javax.swing.JLabel();
        formLoginMainTextFieldUsername = new javax.swing.JTextField();
        formLoginMainPasswordFieldPassword = new javax.swing.JPasswordField();
        formLoginMainPanelButton = new javax.swing.JPanel();
        formLoginMainButtonForgetPassword = new javax.swing.JButton();
        formLoginMainButtonCreateAccount = new javax.swing.JButton();
        formLoginMainButtonLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("frameLogin"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 768));

        formLoginPanelHeader.setPreferredSize(new java.awt.Dimension(1024, 100));

        formLoginLabelHeader.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        formLoginLabelHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        formLoginLabelHeader.setText("Login");

        javax.swing.GroupLayout formLoginPanelHeaderLayout = new javax.swing.GroupLayout(formLoginPanelHeader);
        formLoginPanelHeader.setLayout(formLoginPanelHeaderLayout);
        formLoginPanelHeaderLayout.setHorizontalGroup(
            formLoginPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLoginPanelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(formLoginLabelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        formLoginPanelHeaderLayout.setVerticalGroup(
            formLoginPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(formLoginLabelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        formLoginPanelFooter.setPreferredSize(new java.awt.Dimension(1024, 75));

        formLoginLabelFooter.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        formLoginLabelFooter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        formLoginLabelFooter.setText("Employee Content Management System");

        formLoginLabelFooter2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        formLoginLabelFooter2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        formLoginLabelFooter2.setText("CopyRight ©2021");

        javax.swing.GroupLayout formLoginPanelFooterLayout = new javax.swing.GroupLayout(formLoginPanelFooter);
        formLoginPanelFooter.setLayout(formLoginPanelFooterLayout);
        formLoginPanelFooterLayout.setHorizontalGroup(
            formLoginPanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLoginPanelFooterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formLoginPanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(formLoginLabelFooter2, javax.swing.GroupLayout.DEFAULT_SIZE, 1004, Short.MAX_VALUE)
                    .addComponent(formLoginLabelFooter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        formLoginPanelFooterLayout.setVerticalGroup(
            formLoginPanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formLoginPanelFooterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(formLoginLabelFooter)
                .addGap(7, 7, 7)
                .addComponent(formLoginLabelFooter2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        formLoginMainLabelUsername.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        formLoginMainLabelUsername.setText("Username");

        formLoginMainLabelPassword.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        formLoginMainLabelPassword.setText("Password");

        formLoginMainTextFieldUsername.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N

        formLoginMainPasswordFieldPassword.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N

        formLoginMainPanelButton.setPreferredSize(new java.awt.Dimension(479, 151));

        formLoginMainButtonForgetPassword.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        formLoginMainButtonForgetPassword.setText("Forget Password");

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

        javax.swing.GroupLayout formLoginMainPanelButtonLayout = new javax.swing.GroupLayout(formLoginMainPanelButton);
        formLoginMainPanelButton.setLayout(formLoginMainPanelButtonLayout);
        formLoginMainPanelButtonLayout.setHorizontalGroup(
            formLoginMainPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
            .addGroup(formLoginMainPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(formLoginMainPanelButtonLayout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addGroup(formLoginMainPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(formLoginMainButtonLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(formLoginMainButtonCreateAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(formLoginMainButtonForgetPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(15, Short.MAX_VALUE)))
        );
        formLoginMainPanelButtonLayout.setVerticalGroup(
            formLoginMainPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 151, Short.MAX_VALUE)
            .addGroup(formLoginMainPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(formLoginMainPanelButtonLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(formLoginMainButtonLogin)
                    .addGap(18, 18, 18)
                    .addComponent(formLoginMainButtonCreateAccount)
                    .addGap(18, 18, 18)
                    .addComponent(formLoginMainButtonForgetPassword)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout formLoginPanelMainLayout = new javax.swing.GroupLayout(formLoginPanelMain);
        formLoginPanelMain.setLayout(formLoginPanelMainLayout);
        formLoginPanelMainLayout.setHorizontalGroup(
            formLoginPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formLoginPanelMainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(formLoginPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formLoginPanelMainLayout.createSequentialGroup()
                        .addComponent(formLoginMainLabelUsername)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(formLoginMainTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formLoginPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(formLoginPanelMainLayout.createSequentialGroup()
                            .addComponent(formLoginMainLabelPassword)
                            .addGap(50, 50, 50)
                            .addComponent(formLoginMainPasswordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(formLoginMainPanelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(267, 267, 267))
        );
        formLoginPanelMainLayout.setVerticalGroup(
            formLoginPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formLoginPanelMainLayout.createSequentialGroup()
                .addContainerGap(179, Short.MAX_VALUE)
                .addGroup(formLoginPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formLoginMainTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(formLoginMainLabelUsername))
                .addGap(18, 18, 18)
                .addGroup(formLoginPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formLoginMainLabelPassword)
                    .addComponent(formLoginMainPasswordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(formLoginMainPanelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(formLoginPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(formLoginPanelFooter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(formLoginPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(formLoginPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formLoginPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formLoginPanelFooter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        formLoginPanelHeader.getAccessibleContext().setAccessibleName("");
        formLoginPanelHeader.getAccessibleContext().setAccessibleDescription("");

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
                Dashboard dashboard = new Dashboard();
                dashboard.show(true);
                dashboard.setLabelId(users.getId().toString());
                dashboard.setLabelNik(users.getUsername());
                dashboard.setFullName(users.getFirstName().trim() + " " + users.getLastName().trim());
                dashboard.setAccessMenu(users.getAccessMenu());
                dashboard.loadDataAttendance();
                dashboard.loadDataLeave();
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
                Dashboard dashboard = new Dashboard();
                dashboard.show(true);
                dashboard.setLabelId(users.getId().toString());
                dashboard.setLabelNik(users.getUsername());
                dashboard.setFullName(users.getFirstName().trim() + " " + users.getLastName().trim());
                dashboard.setAccessMenu(users.getAccessMenu());
                dashboard.loadDataAttendance();
                dashboard.loadDataLeave();
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
    private javax.swing.JButton formLoginMainButtonForgetPassword;
    private javax.swing.JButton formLoginMainButtonLogin;
    private javax.swing.JLabel formLoginMainLabelPassword;
    private javax.swing.JLabel formLoginMainLabelUsername;
    private javax.swing.JPanel formLoginMainPanelButton;
    private javax.swing.JPasswordField formLoginMainPasswordFieldPassword;
    private javax.swing.JTextField formLoginMainTextFieldUsername;
    private javax.swing.JPanel formLoginPanelFooter;
    private javax.swing.JPanel formLoginPanelHeader;
    private javax.swing.JPanel formLoginPanelMain;
    // End of variables declaration//GEN-END:variables
}
