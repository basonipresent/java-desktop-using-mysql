package form;

import javax.swing.JOptionPane;
import config.Constanta;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import model.Attendance;
import com.itextpdf.text.Font;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import model.Employee;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 *  
 */
public class EmployeePayslipList extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public EmployeePayslipList() {
        initComponents();
        formEmployeePayslipHeaderLabelId.setVisible(false);
        formEmployeePayslipHeaderLabelNik.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formEmployeePayslipPanelHeader = new javax.swing.JPanel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        formEmployeePayslipHeaderLable = new javax.swing.JLabel();
        formEmployeePayslipPanelFooter = new javax.swing.JPanel();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        formEmployeePayslipHeaderLabelId = new javax.swing.JLabel();
        formEmployeePayslipHeaderLabelNik = new javax.swing.JLabel();
        formEmployeePayslipPanelMain = new javax.swing.JPanel();
        formEmployeePayslipMainLabelFullName = new javax.swing.JLabel();
        formEmployeePayslipMainButtonLogout = new javax.swing.JButton();
        formEmployeePayslipMainButtonBack = new javax.swing.JButton();
        formEmployeePayslipMainPanelTable = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        formEmployeePayslipMainTable = new javax.swing.JTable();
        formEmployeePayslipMainPanelSearch = new javax.swing.JPanel();
        formEmployeePayslipMainLebelFullName = new javax.swing.JLabel();
        formEmployeePayslipMainTextFieldFullName = new javax.swing.JTextField();
        formEmployeePayslipMainButtonSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee Payslip List");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setName("frameEmployee"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        formEmployeePayslipPanelHeader.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        formEmployeePayslipPanelHeader.setPreferredSize(new java.awt.Dimension(1280, 100));

        kGradientPanel2.setkEndColor(new java.awt.Color(51, 153, 255));
        kGradientPanel2.setkGradientFocus(400);
        kGradientPanel2.setkStartColor(new java.awt.Color(0, 204, 204));
        kGradientPanel2.setPreferredSize(new java.awt.Dimension(1280, 100));

        formEmployeePayslipHeaderLable.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        formEmployeePayslipHeaderLable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        formEmployeePayslipHeaderLable.setIcon(new javax.swing.ImageIcon("D:\\dev\\.project\\ecms\\lib\\logo.png")); // NOI18N

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(formEmployeePayslipHeaderLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addComponent(formEmployeePayslipHeaderLable)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        formEmployeePayslipHeaderLable.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout formEmployeePayslipPanelHeaderLayout = new javax.swing.GroupLayout(formEmployeePayslipPanelHeader);
        formEmployeePayslipPanelHeader.setLayout(formEmployeePayslipPanelHeaderLayout);
        formEmployeePayslipPanelHeaderLayout.setHorizontalGroup(
            formEmployeePayslipPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        formEmployeePayslipPanelHeaderLayout.setVerticalGroup(
            formEmployeePayslipPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formEmployeePayslipPanelHeaderLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(formEmployeePayslipPanelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        formEmployeePayslipPanelHeader.getAccessibleContext().setAccessibleName("");
        formEmployeePayslipPanelHeader.getAccessibleContext().setAccessibleDescription("");

        formEmployeePayslipPanelFooter.setPreferredSize(new java.awt.Dimension(1280, 50));

        kGradientPanel3.setkEndColor(new java.awt.Color(51, 153, 255));
        kGradientPanel3.setkGradientFocus(400);
        kGradientPanel3.setkStartColor(new java.awt.Color(0, 204, 204));

        formEmployeePayslipHeaderLabelId.setFont(new java.awt.Font("Roboto Light", 0, 8)); // NOI18N
        formEmployeePayslipHeaderLabelId.setText("Id");
        formEmployeePayslipHeaderLabelId.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        formEmployeePayslipHeaderLabelNik.setFont(new java.awt.Font("Roboto Light", 0, 8)); // NOI18N
        formEmployeePayslipHeaderLabelNik.setText("Nik");
        formEmployeePayslipHeaderLabelNik.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kGradientPanel3Layout.createSequentialGroup()
                    .addGap(628, 628, 628)
                    .addComponent(formEmployeePayslipHeaderLabelId)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(formEmployeePayslipHeaderLabelNik)
                    .addContainerGap(648, Short.MAX_VALUE)))
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kGradientPanel3Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(formEmployeePayslipHeaderLabelId)
                        .addComponent(formEmployeePayslipHeaderLabelNik))
                    .addContainerGap(42, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout formEmployeePayslipPanelFooterLayout = new javax.swing.GroupLayout(formEmployeePayslipPanelFooter);
        formEmployeePayslipPanelFooter.setLayout(formEmployeePayslipPanelFooterLayout);
        formEmployeePayslipPanelFooterLayout.setHorizontalGroup(
            formEmployeePayslipPanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        formEmployeePayslipPanelFooterLayout.setVerticalGroup(
            formEmployeePayslipPanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(formEmployeePayslipPanelFooter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, -1, -1));

        formEmployeePayslipPanelMain.setBackground(new java.awt.Color(255, 255, 255));
        formEmployeePayslipPanelMain.setPreferredSize(new java.awt.Dimension(1280, 570));

        formEmployeePayslipMainLabelFullName.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        formEmployeePayslipMainLabelFullName.setText("FullName");

        formEmployeePayslipMainButtonLogout.setBackground(new java.awt.Color(255, 255, 255));
        formEmployeePayslipMainButtonLogout.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        formEmployeePayslipMainButtonLogout.setText("Logout");
        formEmployeePayslipMainButtonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formEmployeePayslipMainButtonLogoutActionPerformed(evt);
            }
        });
        formEmployeePayslipMainButtonLogout.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formEmployeePayslipMainButtonLogoutKeyPressed(evt);
            }
        });

        formEmployeePayslipMainButtonBack.setBackground(new java.awt.Color(255, 255, 255));
        formEmployeePayslipMainButtonBack.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        formEmployeePayslipMainButtonBack.setText("Back");
        formEmployeePayslipMainButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formEmployeePayslipMainButtonBackActionPerformed(evt);
            }
        });
        formEmployeePayslipMainButtonBack.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formEmployeePayslipMainButtonBackKeyPressed(evt);
            }
        });

        formEmployeePayslipMainPanelTable.setBackground(new java.awt.Color(255, 255, 255));
        formEmployeePayslipMainPanelTable.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employee List", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 11))); // NOI18N

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        formEmployeePayslipMainTable.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        formEmployeePayslipMainTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nik", "First Name", "Last Name", "Position", "Address", "Salary", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        formEmployeePayslipMainTable.setColumnSelectionAllowed(true);
        formEmployeePayslipMainTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        formEmployeePayslipMainTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formEmployeePayslipMainTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(formEmployeePayslipMainTable);
        formEmployeePayslipMainTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        formEmployeePayslipMainPanelSearch.setBackground(new java.awt.Color(255, 255, 255));

        formEmployeePayslipMainLebelFullName.setBackground(new java.awt.Color(255, 255, 255));
        formEmployeePayslipMainLebelFullName.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        formEmployeePayslipMainLebelFullName.setText("Full Name");

        formEmployeePayslipMainTextFieldFullName.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N

        formEmployeePayslipMainButtonSearch.setBackground(new java.awt.Color(51, 153, 255));
        formEmployeePayslipMainButtonSearch.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        formEmployeePayslipMainButtonSearch.setText("Search");
        formEmployeePayslipMainButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formEmployeePayslipMainButtonSearchActionPerformed(evt);
            }
        });
        formEmployeePayslipMainButtonSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formEmployeePayslipMainButtonSearchKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout formEmployeePayslipMainPanelSearchLayout = new javax.swing.GroupLayout(formEmployeePayslipMainPanelSearch);
        formEmployeePayslipMainPanelSearch.setLayout(formEmployeePayslipMainPanelSearchLayout);
        formEmployeePayslipMainPanelSearchLayout.setHorizontalGroup(
            formEmployeePayslipMainPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formEmployeePayslipMainPanelSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(formEmployeePayslipMainLebelFullName)
                .addGap(18, 18, 18)
                .addComponent(formEmployeePayslipMainTextFieldFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(formEmployeePayslipMainButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        formEmployeePayslipMainPanelSearchLayout.setVerticalGroup(
            formEmployeePayslipMainPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formEmployeePayslipMainPanelSearchLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(formEmployeePayslipMainPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formEmployeePayslipMainPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(formEmployeePayslipMainTextFieldFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(formEmployeePayslipMainLebelFullName))
                    .addComponent(formEmployeePayslipMainButtonSearch, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        javax.swing.GroupLayout formEmployeePayslipMainPanelTableLayout = new javax.swing.GroupLayout(formEmployeePayslipMainPanelTable);
        formEmployeePayslipMainPanelTable.setLayout(formEmployeePayslipMainPanelTableLayout);
        formEmployeePayslipMainPanelTableLayout.setHorizontalGroup(
            formEmployeePayslipMainPanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formEmployeePayslipMainPanelTableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formEmployeePayslipMainPanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(formEmployeePayslipMainPanelSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(formEmployeePayslipMainPanelTableLayout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())))
        );
        formEmployeePayslipMainPanelTableLayout.setVerticalGroup(
            formEmployeePayslipMainPanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formEmployeePayslipMainPanelTableLayout.createSequentialGroup()
                .addComponent(formEmployeePayslipMainPanelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout formEmployeePayslipPanelMainLayout = new javax.swing.GroupLayout(formEmployeePayslipPanelMain);
        formEmployeePayslipPanelMain.setLayout(formEmployeePayslipPanelMainLayout);
        formEmployeePayslipPanelMainLayout.setHorizontalGroup(
            formEmployeePayslipPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formEmployeePayslipPanelMainLayout.createSequentialGroup()
                .addGroup(formEmployeePayslipPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formEmployeePayslipPanelMainLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(formEmployeePayslipMainLabelFullName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(formEmployeePayslipMainButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(formEmployeePayslipMainButtonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formEmployeePayslipPanelMainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(formEmployeePayslipMainPanelTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        formEmployeePayslipPanelMainLayout.setVerticalGroup(
            formEmployeePayslipPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formEmployeePayslipPanelMainLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(formEmployeePayslipPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formEmployeePayslipMainButtonLogout)
                    .addComponent(formEmployeePayslipMainLabelFullName)
                    .addComponent(formEmployeePayslipMainButtonBack))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formEmployeePayslipMainPanelTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(formEmployeePayslipPanelMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    LocalDateTime localDateTimeNow = LocalDateTime.now();
    DateTimeFormatter DATETIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    DateTimeFormatter DATETIME_PDF_FORMATTER = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
    private List<String> access_menu = new ArrayList<>();
    private String full_name;

    public void setLabelId(String text) {
        formEmployeePayslipHeaderLabelId.setText(text);
    }

    public void setLabelNik(String text) {
        formEmployeePayslipHeaderLabelNik.setText(text);
    }

    public String getFullName() {
        return full_name;
    }

    public void setFullName(String text) {
        this.full_name = text;
        formEmployeePayslipMainLabelFullName.setText("Welcome " + text + ",");
    }

    public List<String> getAccessMenu() {
        return access_menu;
    }

    public void setAccessMenu(List<String> value) {
        this.access_menu = value;
    }

    private List<Attendance> list_attendance;

    private void setListAttendance(List<Attendance> value) {
        this.list_attendance = value;
    }

    private List<Attendance> getListAttendance() {
        return list_attendance;
    }

    public void loadData() {
        try {
            Employee employee = new Employee();
            List<Employee> listEmployee = employee.list();
            DefaultTableModel defaultTableModel = (DefaultTableModel) formEmployeePayslipMainTable.getModel();
            defaultTableModel.setRowCount(0);
            Object[] rows = new Object[8];
            for (int i = 0; i < listEmployee.size(); i++) {
                TableColumnModel tableColumnModel = formEmployeePayslipMainTable.getColumnModel();
                tableColumnModel.getColumn(0).setMaxWidth(0);
                tableColumnModel.getColumn(0).setMinWidth(0);

                rows[0] = listEmployee.get(i).getId();
                rows[1] = listEmployee.get(i).getNik();
                rows[2] = listEmployee.get(i).getFirstName();
                rows[3] = listEmployee.get(i).getLastName();
                rows[4] = listEmployee.get(i).getPositionName().trim();
                rows[5] = listEmployee.get(i).getAddress();
                rows[6] = String.format("%.0f", listEmployee.get(i).getBasicSalary());
                rows[7] = listEmployee.get(i).getStatus();

                defaultTableModel.addRow(rows);
            }
            formEmployeePayslipMainTable.setAutoCreateRowSorter(true);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, Constanta.Messages.MESSAGE_ERROR + e.getMessage());
        }
    }
    
    private void searchData() {
        try {
            Employee employee = new Employee();
            String keyword = formEmployeePayslipMainTextFieldFullName.getText();
            List<Employee> listEmployee = employee.search(keyword);
            DefaultTableModel defaultTableModel = (DefaultTableModel) formEmployeePayslipMainTable.getModel();
            defaultTableModel.setRowCount(0);
            Object[] rows = new Object[8];
            for (int i = 0; i < listEmployee.size(); i++) {
                TableColumnModel tableColumnModel = formEmployeePayslipMainTable.getColumnModel();
                tableColumnModel.getColumn(0).setMaxWidth(0);
                tableColumnModel.getColumn(0).setMinWidth(0);

                rows[0] = listEmployee.get(i).getId();
                rows[1] = listEmployee.get(i).getNik();
                rows[2] = listEmployee.get(i).getFirstName();
                rows[3] = listEmployee.get(i).getLastName();
                rows[4] = listEmployee.get(i).getPositionName().trim();
                rows[5] = listEmployee.get(i).getAddress();
                rows[6] = String.format("%.0f", listEmployee.get(i).getBasicSalary());
                rows[7] = listEmployee.get(i).getStatus();

                defaultTableModel.addRow(rows);
            }
            formEmployeePayslipMainTable.setAutoCreateRowSorter(true);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, Constanta.Messages.MESSAGE_ERROR + e.getMessage());
        }
    }

    private void insertCell(PdfPTable table, String text, int align, int colspan, Font font) {
        PdfPCell cell;
        text = text == null ? "" : text.trim();
        cell = new PdfPCell(new Phrase(text, font));
        cell.setHorizontalAlignment(align);
        cell.setColspan(colspan);

        if (text.trim().equalsIgnoreCase("")) {
            cell.setMinimumHeight(10f);
        }
        table.addCell(cell);
    }

    private void formEmployeePayslipMainTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formEmployeePayslipMainTableMouseClicked
        // TODO add your handling code here:
        try {
            Employee employee = new Employee();
            GeneratePayslip generatePayslip = new GeneratePayslip();
            int rowSelected = formEmployeePayslipMainTable.getSelectedRow();
            int selectedId = Integer.parseInt(formEmployeePayslipMainTable.getValueAt(rowSelected, 0).toString());

            employee = employee.get(selectedId);
            generatePayslip.show(true);
            generatePayslip.assignValue(employee);
            generatePayslip.setLabelId(formEmployeePayslipHeaderLabelId.getText());
            generatePayslip.setLabelNik(formEmployeePayslipHeaderLabelNik.getText());
            generatePayslip.setFullName(getFullName());
            generatePayslip.setAccessMenu(getAccessMenu());
            generatePayslip.loadDataPayslip(employee.getNik());
            this.dispose();
        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, Constanta.Messages.MESSAGE_ERROR + e.getMessage());
        }
    }//GEN-LAST:event_formEmployeePayslipMainTableMouseClicked

    private void formEmployeePayslipMainButtonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formEmployeePayslipMainButtonLogoutActionPerformed
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
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, Constanta.Messages.MESSAGE_ERROR + e.getMessage());
        }
    }//GEN-LAST:event_formEmployeePayslipMainButtonLogoutActionPerformed

    private void formEmployeePayslipMainButtonLogoutKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formEmployeePayslipMainButtonLogoutKeyPressed
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
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, Constanta.Messages.MESSAGE_ERROR + e.getMessage());
        }
    }//GEN-LAST:event_formEmployeePayslipMainButtonLogoutKeyPressed

    private void formEmployeePayslipMainButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formEmployeePayslipMainButtonSearchActionPerformed
        // TODO add your handling code here:
        try {
            searchData();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, Constanta.Messages.MESSAGE_ERROR + e.getMessage());
        }
    }//GEN-LAST:event_formEmployeePayslipMainButtonSearchActionPerformed

    private void formEmployeePayslipMainButtonSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formEmployeePayslipMainButtonSearchKeyPressed
        // TODO add your handling code here:
        try {
            searchData();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, Constanta.Messages.MESSAGE_ERROR + e.getMessage());
        }
    }//GEN-LAST:event_formEmployeePayslipMainButtonSearchKeyPressed

    private void formEmployeePayslipMainButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formEmployeePayslipMainButtonBackActionPerformed
        // TODO add your handling code here:
        try {
            Dashboard dashboard = new Dashboard();
            dashboard.show();
            dashboard.setLabelId(formEmployeePayslipHeaderLabelId.getText());
            dashboard.setLabelNik(formEmployeePayslipHeaderLabelNik.getText());
            dashboard.setFullName(getFullName());
            dashboard.setAccessMenu(getAccessMenu());
            dashboard.loadDataAttendance();
            dashboard.loadDataLeave();
            dashboard.loadDataPayslip();
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, Constanta.Messages.MESSAGE_ERROR + e.getMessage());
        }
    }//GEN-LAST:event_formEmployeePayslipMainButtonBackActionPerformed

    private void formEmployeePayslipMainButtonBackKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formEmployeePayslipMainButtonBackKeyPressed
        // TODO add your handling code here:
        try {
            Dashboard dashboard = new Dashboard();
            dashboard.show();
            dashboard.setLabelId(formEmployeePayslipHeaderLabelId.getText());
            dashboard.setLabelNik(formEmployeePayslipHeaderLabelNik.getText());
            dashboard.setFullName(getFullName());
            dashboard.setAccessMenu(getAccessMenu());
            dashboard.loadDataAttendance();
            dashboard.loadDataLeave();
            dashboard.loadDataPayslip();
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, Constanta.Messages.MESSAGE_ERROR + e.getMessage());
        }
    }//GEN-LAST:event_formEmployeePayslipMainButtonBackKeyPressed

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
            java.util.logging.Logger.getLogger(EmployeePayslipList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeePayslipList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeePayslipList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeePayslipList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new EmployeePayslipList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel formEmployeePayslipHeaderLabelId;
    public javax.swing.JLabel formEmployeePayslipHeaderLabelNik;
    private javax.swing.JLabel formEmployeePayslipHeaderLable;
    private javax.swing.JButton formEmployeePayslipMainButtonBack;
    private javax.swing.JButton formEmployeePayslipMainButtonLogout;
    private javax.swing.JButton formEmployeePayslipMainButtonSearch;
    private javax.swing.JLabel formEmployeePayslipMainLabelFullName;
    private javax.swing.JLabel formEmployeePayslipMainLebelFullName;
    private javax.swing.JPanel formEmployeePayslipMainPanelSearch;
    private javax.swing.JPanel formEmployeePayslipMainPanelTable;
    private javax.swing.JTable formEmployeePayslipMainTable;
    private javax.swing.JTextField formEmployeePayslipMainTextFieldFullName;
    private javax.swing.JPanel formEmployeePayslipPanelFooter;
    private javax.swing.JPanel formEmployeePayslipPanelHeader;
    private javax.swing.JPanel formEmployeePayslipPanelMain;
    private javax.swing.JScrollPane jScrollPane2;
    private keeptoo.KGradientPanel kGradientPanel2;
    private keeptoo.KGradientPanel kGradientPanel3;
    // End of variables declaration//GEN-END:variables
}
