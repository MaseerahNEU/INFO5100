/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.table.DefaultTableModel;
import model.CreateEmployee;
import model.EmployeeList;

/**
 *
 * @author masee
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    
    EmployeeList emp;
    public ViewJPanel(EmployeeList emp) {
        initComponents();
        this.emp = emp;
        fillTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        lblPhoneNum1 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtLevel = new javax.swing.JTextArea();
        lblEName = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAge = new javax.swing.JTextArea();
        lblEmpID = new javax.swing.JLabel();
        btnPhoto = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtTitle = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtTeamInfo = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtPhoneNum = new javax.swing.JTextArea();
        lblAge = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtEName = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtEmail = new javax.swing.JTextArea();
        lblGender = new javax.swing.JLabel();
        lblStartDate = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtEmpID = new javax.swing.JTextArea();
        lblLevel = new javax.swing.JLabel();
        lblTeamInfo = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtGender = new javax.swing.JTextArea();
        lblTitle = new javax.swing.JLabel();
        lblPhoneNum = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        txtStartDate = new javax.swing.JTextArea();
        lblEmail = new javax.swing.JLabel();
        btnView1 = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "EName", "Emp ID", "Start Date", "Title"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        lblPhoneNum1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblPhoneNum1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPhoneNum1.setText("Photo:");

        txtLevel.setColumns(20);
        txtLevel.setRows(5);
        jScrollPane6.setViewportView(txtLevel);

        lblEName.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblEName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEName.setText("Employee Name:");

        txtAge.setColumns(20);
        txtAge.setRows(5);
        jScrollPane2.setViewportView(txtAge);

        lblEmpID.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblEmpID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmpID.setText("Employee ID:");

        btnPhoto.setText("Upload Photo");
        btnPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhotoActionPerformed(evt);
            }
        });

        txtTitle.setColumns(20);
        txtTitle.setRows(5);
        jScrollPane7.setViewportView(txtTitle);

        txtTeamInfo.setColumns(20);
        txtTeamInfo.setRows(5);
        jScrollPane8.setViewportView(txtTeamInfo);

        txtPhoneNum.setColumns(20);
        txtPhoneNum.setRows(5);
        jScrollPane9.setViewportView(txtPhoneNum);

        lblAge.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblAge.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAge.setText("Age:");

        txtEName.setColumns(20);
        txtEName.setRows(5);
        jScrollPane3.setViewportView(txtEName);

        txtEmail.setColumns(20);
        txtEmail.setRows(5);
        jScrollPane10.setViewportView(txtEmail);

        lblGender.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblGender.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblGender.setText("Gender:");

        lblStartDate.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblStartDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStartDate.setText("Start Date:");

        txtEmpID.setColumns(20);
        txtEmpID.setRows(5);
        jScrollPane4.setViewportView(txtEmpID);

        lblLevel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblLevel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLevel.setText("Level:");

        lblTeamInfo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblTeamInfo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTeamInfo.setText("Team Info:");

        txtGender.setColumns(20);
        txtGender.setRows(5);
        jScrollPane5.setViewportView(txtGender);

        lblTitle.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTitle.setText("Title:");

        lblPhoneNum.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblPhoneNum.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPhoneNum.setText("Phone Number:");

        txtStartDate.setColumns(20);
        txtStartDate.setRows(5);
        jScrollPane11.setViewportView(txtStartDate);

        lblEmail.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmail.setText("Email address:");

        btnView1.setText("View");
        btnView1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnView1ActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPhoneNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(btnView1)
                        .addGap(149, 149, 149)
                        .addComponent(btnDelete)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView1)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAge))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGender, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblStartDate, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTeamInfo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTitle))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPhoneNum))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPhoneNum1)
                                    .addComponent(btnPhoto)))
                            .addComponent(lblLevel)))
                    .addComponent(lblEmpID))
                .addGap(51, 51, 51))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhotoActionPerformed
        // TODO add your handling code here:
        /*JFileChooser file = new JFileChooser();
        Image img = ImageIO.read();
        if (img != null) {
            lblPhoto.setText(file.getSelectedFile().getAbsolutePath());
            this.emp.setphoto(new ImageIcon(img));
        }*/
    }//GEN-LAST:event_btnPhotoActionPerformed

    private void btnView1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnView1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnView1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnPhoto;
    private javax.swing.JButton btnView1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblEName;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmpID;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblPhoneNum;
    private javax.swing.JLabel lblPhoneNum1;
    private javax.swing.JLabel lblStartDate;
    private javax.swing.JLabel lblTeamInfo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextArea txtAge;
    private javax.swing.JTextArea txtEName;
    private javax.swing.JTextArea txtEmail;
    private javax.swing.JTextArea txtEmpID;
    private javax.swing.JTextArea txtGender;
    private javax.swing.JTextArea txtLevel;
    private javax.swing.JTextArea txtPhoneNum;
    private javax.swing.JTextArea txtStartDate;
    private javax.swing.JTextArea txtTeamInfo;
    private javax.swing.JTextArea txtTitle;
    // End of variables declaration//GEN-END:variables

    private void fillTable() {
        
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.setRowCount(0);
        for(CreateEmployee nEmp:emp.getDirectory()){
         
            Object[] row = new Object[4];
            row[0] = nEmp.geteName();
            row[1] = nEmp.getEmpID();
            row[2] = nEmp.getStartDate();
            row[3] = nEmp.getTitle();
            model.addRow(row);
        }
    }
}