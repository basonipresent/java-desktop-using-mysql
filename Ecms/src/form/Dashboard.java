package form;

import javax.swing.JOptionPane;
import config.Constanta;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import model.Employee;
import model.Nationality;
import model.Position;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bason
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Dashboard() {
        initComponents();
        formDashboardHeaderLabelId.setVisible(false);
        formEmployeeHeaderLabelNik.setVisible(false);
        formEmployeeMainButtonDelete.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formDashboardPanelHeader = new javax.swing.JPanel();
        formDashboardHeaderLable = new javax.swing.JLabel();
        formDashboardHeaderLabelId = new javax.swing.JLabel();
        formEmployeeHeaderLabelNik = new javax.swing.JLabel();
        formDashboardPanelFooter = new javax.swing.JPanel();
        formDashboardLabelFooter2 = new javax.swing.JLabel();
        formDashboardPanelMain = new javax.swing.JPanel();
        formDashboardMainLabelFullName = new javax.swing.JLabel();
        formDashboardMainButtonLogout = new javax.swing.JButton();
        formDashboardMainButtonBack = new javax.swing.JButton();
        formDashboardMainButtonEmployee = new javax.swing.JButton();
        formDashboardMainButtonReport = new javax.swing.JButton();
        formDashboardMainButtonApproval = new javax.swing.JButton();
        formEmployeeMainPanelButton = new javax.swing.JPanel();
        formEmployeeMainButtonSave = new javax.swing.JButton();
        formEmployeeMainButtonClear = new javax.swing.JButton();
        formEmployeeMainPanelTable = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        formEmployeeMainTable = new javax.swing.JTable();
        formEmployeeMainButtonDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("frameEmployee"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 768));

        formDashboardPanelHeader.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        formDashboardPanelHeader.setPreferredSize(new java.awt.Dimension(1024, 100));

        formDashboardHeaderLable.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        formDashboardHeaderLable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        formDashboardHeaderLable.setText("Dashboard");

        formDashboardHeaderLabelId.setFont(new java.awt.Font("Roboto Light", 0, 8)); // NOI18N
        formDashboardHeaderLabelId.setText("Id");
        formDashboardHeaderLabelId.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        formEmployeeHeaderLabelNik.setFont(new java.awt.Font("Roboto Light", 0, 8)); // NOI18N
        formEmployeeHeaderLabelNik.setText("Nik");
        formEmployeeHeaderLabelNik.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout formDashboardPanelHeaderLayout = new javax.swing.GroupLayout(formDashboardPanelHeader);
        formDashboardPanelHeader.setLayout(formDashboardPanelHeaderLayout);
        formDashboardPanelHeaderLayout.setHorizontalGroup(
            formDashboardPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formDashboardPanelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formDashboardPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(formDashboardHeaderLable, javax.swing.GroupLayout.DEFAULT_SIZE, 1004, Short.MAX_VALUE)
                    .addGroup(formDashboardPanelHeaderLayout.createSequentialGroup()
                        .addComponent(formDashboardHeaderLabelId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(formEmployeeHeaderLabelNik)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        formDashboardPanelHeaderLayout.setVerticalGroup(
            formDashboardPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formDashboardPanelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(formDashboardHeaderLable, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formDashboardPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formDashboardHeaderLabelId)
                    .addComponent(formEmployeeHeaderLabelNik)))
        );

        formDashboardHeaderLable.getAccessibleContext().setAccessibleDescription("");

        formDashboardPanelFooter.setPreferredSize(new java.awt.Dimension(1024, 75));

        formDashboardLabelFooter2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        formDashboardLabelFooter2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        formDashboardLabelFooter2.setText("Employee Content Management System CopyRight ©2021");

        javax.swing.GroupLayout formDashboardPanelFooterLayout = new javax.swing.GroupLayout(formDashboardPanelFooter);
        formDashboardPanelFooter.setLayout(formDashboardPanelFooterLayout);
        formDashboardPanelFooterLayout.setHorizontalGroup(
            formDashboardPanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formDashboardPanelFooterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(formDashboardLabelFooter2, javax.swing.GroupLayout.DEFAULT_SIZE, 1004, Short.MAX_VALUE)
                .addContainerGap())
        );
        formDashboardPanelFooterLayout.setVerticalGroup(
            formDashboardPanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formDashboardPanelFooterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(formDashboardLabelFooter2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        formDashboardMainLabelFullName.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        formDashboardMainLabelFullName.setText("FullName");

        formDashboardMainButtonLogout.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        formDashboardMainButtonLogout.setText("Logout");
        formDashboardMainButtonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formDashboardMainButtonLogoutActionPerformed(evt);
            }
        });
        formDashboardMainButtonLogout.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formDashboardMainButtonLogoutKeyPressed(evt);
            }
        });

        formDashboardMainButtonBack.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        formDashboardMainButtonBack.setText("Back");
        formDashboardMainButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formDashboardMainButtonBackActionPerformed(evt);
            }
        });
        formDashboardMainButtonBack.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formDashboardMainButtonBackKeyPressed(evt);
            }
        });

        formDashboardMainButtonEmployee.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        formDashboardMainButtonEmployee.setText("Employee");
        formDashboardMainButtonEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formDashboardMainButtonEmployeeActionPerformed(evt);
            }
        });
        formDashboardMainButtonEmployee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formDashboardMainButtonEmployeeKeyPressed(evt);
            }
        });

        formDashboardMainButtonReport.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        formDashboardMainButtonReport.setText("Report");
        formDashboardMainButtonReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formDashboardMainButtonReportActionPerformed(evt);
            }
        });
        formDashboardMainButtonReport.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formDashboardMainButtonReportKeyPressed(evt);
            }
        });

        formDashboardMainButtonApproval.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        formDashboardMainButtonApproval.setText("Approval");
        formDashboardMainButtonApproval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formDashboardMainButtonApprovalActionPerformed(evt);
            }
        });
        formDashboardMainButtonApproval.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formDashboardMainButtonApprovalKeyPressed(evt);
            }
        });

        formEmployeeMainButtonSave.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        formEmployeeMainButtonSave.setText("Save");

        formEmployeeMainButtonClear.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        formEmployeeMainButtonClear.setText("Clear");

        javax.swing.GroupLayout formEmployeeMainPanelButtonLayout = new javax.swing.GroupLayout(formEmployeeMainPanelButton);
        formEmployeeMainPanelButton.setLayout(formEmployeeMainPanelButtonLayout);
        formEmployeeMainPanelButtonLayout.setHorizontalGroup(
            formEmployeeMainPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formEmployeeMainPanelButtonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(formEmployeeMainButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(formEmployeeMainButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(221, 221, 221))
        );
        formEmployeeMainPanelButtonLayout.setVerticalGroup(
            formEmployeeMainPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formEmployeeMainPanelButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formEmployeeMainPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formEmployeeMainButtonClear)
                    .addComponent(formEmployeeMainButtonSave))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        formEmployeeMainTable.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        formEmployeeMainTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nik", "First Name", "Last Name", "Position", "Address", "Salary", "Days Off", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        formEmployeeMainTable.setColumnSelectionAllowed(true);
        formEmployeeMainTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formEmployeeMainTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(formEmployeeMainTable);
        formEmployeeMainTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        formEmployeeMainButtonDelete.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        formEmployeeMainButtonDelete.setText("Delete");

        javax.swing.GroupLayout formEmployeeMainPanelTableLayout = new javax.swing.GroupLayout(formEmployeeMainPanelTable);
        formEmployeeMainPanelTable.setLayout(formEmployeeMainPanelTableLayout);
        formEmployeeMainPanelTableLayout.setHorizontalGroup(
            formEmployeeMainPanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formEmployeeMainPanelTableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formEmployeeMainPanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 984, Short.MAX_VALUE)
                    .addComponent(formEmployeeMainButtonDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        formEmployeeMainPanelTableLayout.setVerticalGroup(
            formEmployeeMainPanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formEmployeeMainPanelTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(formEmployeeMainButtonDelete)
                .addContainerGap())
        );

        javax.swing.GroupLayout formDashboardPanelMainLayout = new javax.swing.GroupLayout(formDashboardPanelMain);
        formDashboardPanelMain.setLayout(formDashboardPanelMainLayout);
        formDashboardPanelMainLayout.setHorizontalGroup(
            formDashboardPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formDashboardPanelMainLayout.createSequentialGroup()
                .addGroup(formDashboardPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formDashboardPanelMainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(formEmployeeMainPanelTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(formDashboardPanelMainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(formEmployeeMainPanelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(formDashboardPanelMainLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(formDashboardMainLabelFullName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(formDashboardMainButtonApproval, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(formDashboardMainButtonReport, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(formDashboardMainButtonEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(formDashboardMainButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(formDashboardMainButtonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        formDashboardPanelMainLayout.setVerticalGroup(
            formDashboardPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formDashboardPanelMainLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(formDashboardPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formDashboardMainButtonLogout)
                    .addComponent(formDashboardMainButtonBack)
                    .addComponent(formDashboardMainLabelFullName)
                    .addComponent(formDashboardMainButtonEmployee)
                    .addComponent(formDashboardMainButtonReport)
                    .addComponent(formDashboardMainButtonApproval))
                .addGap(275, 275, 275)
                .addComponent(formEmployeeMainPanelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formEmployeeMainPanelTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(formDashboardPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(formDashboardPanelFooter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(formDashboardPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(formDashboardPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formDashboardPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(formDashboardPanelFooter, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        formDashboardPanelHeader.getAccessibleContext().setAccessibleName("");
        formDashboardPanelHeader.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    LocalDateTime localDateTimeNow = LocalDateTime.now();
    DateTimeFormatter DATETIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public void setLabelId(String text) {
        formDashboardHeaderLabelId.setText(text);
    }

    public void setLabelNik(String text) {
        formEmployeeHeaderLabelNik.setText(text);
    }
    
    public void setLabelFullName(String text) {
        formDashboardMainLabelFullName.setText("Welcome " + text + ",");
    }

    private void formEmployeeMainTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formEmployeeMainTableMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formEmployeeMainTableMouseClicked

    private void formDashboardMainButtonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formDashboardMainButtonLogoutActionPerformed
        // TODO add your handling code here:
        try {
            int action = JOptionPane.showConfirmDialog(null,
                    Constanta.Messages.MESSAGE_CONFIRM_LOGOUT,
                    Constanta.Messages.BANNER_CONFIRM,
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);

            if (action == JOptionPane.YES_OPTION) {
                Login login = new Login();
                login.show();
                this.dispose();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, Constanta.Messages.MESSAGE_ERROR + e.getMessage());
        }
    }//GEN-LAST:event_formDashboardMainButtonLogoutActionPerformed

    private void formDashboardMainButtonLogoutKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formDashboardMainButtonLogoutKeyPressed
        // TODO add your handling code here:
        try {
            int action = JOptionPane.showConfirmDialog(null,
                    Constanta.Messages.MESSAGE_CONFIRM_LOGOUT,
                    Constanta.Messages.BANNER_CONFIRM,
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);

            if (action == JOptionPane.YES_OPTION) {
                Login login = new Login();
                login.show();
                this.dispose();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, Constanta.Messages.MESSAGE_ERROR + e.getMessage());
        }
    }//GEN-LAST:event_formDashboardMainButtonLogoutKeyPressed

    private void formDashboardMainButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formDashboardMainButtonBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formDashboardMainButtonBackActionPerformed

    private void formDashboardMainButtonBackKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formDashboardMainButtonBackKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formDashboardMainButtonBackKeyPressed

    private void formDashboardMainButtonEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formDashboardMainButtonEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formDashboardMainButtonEmployeeActionPerformed

    private void formDashboardMainButtonEmployeeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formDashboardMainButtonEmployeeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formDashboardMainButtonEmployeeKeyPressed

    private void formDashboardMainButtonReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formDashboardMainButtonReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formDashboardMainButtonReportActionPerformed

    private void formDashboardMainButtonReportKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formDashboardMainButtonReportKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formDashboardMainButtonReportKeyPressed

    private void formDashboardMainButtonApprovalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formDashboardMainButtonApprovalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formDashboardMainButtonApprovalActionPerformed

    private void formDashboardMainButtonApprovalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formDashboardMainButtonApprovalKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formDashboardMainButtonApprovalKeyPressed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel formDashboardHeaderLabelId;
    private javax.swing.JLabel formDashboardHeaderLable;
    private javax.swing.JLabel formDashboardLabelFooter2;
    private javax.swing.JButton formDashboardMainButtonApproval;
    private javax.swing.JButton formDashboardMainButtonBack;
    private javax.swing.JButton formDashboardMainButtonEmployee;
    private javax.swing.JButton formDashboardMainButtonLogout;
    private javax.swing.JButton formDashboardMainButtonReport;
    private javax.swing.JLabel formDashboardMainLabelFullName;
    private javax.swing.JPanel formDashboardPanelFooter;
    private javax.swing.JPanel formDashboardPanelHeader;
    private javax.swing.JPanel formDashboardPanelMain;
    public javax.swing.JLabel formEmployeeHeaderLabelNik;
    private javax.swing.JButton formEmployeeMainButtonClear;
    private javax.swing.JButton formEmployeeMainButtonDelete;
    private javax.swing.JButton formEmployeeMainButtonSave;
    private javax.swing.JPanel formEmployeeMainPanelButton;
    private javax.swing.JPanel formEmployeeMainPanelTable;
    private javax.swing.JTable formEmployeeMainTable;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
