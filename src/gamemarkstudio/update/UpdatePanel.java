/*
 * %W% %E% Hamza Yasin
 *
 * Copyright (c) 2017-2018 Miranz Technology. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Miranz
 * technology. You shall not disclose such Confidential Information and 
 * shall use it only in accordance with the terms of the license agreement 
 * you entered into with Miranz.
 *
 */
package gamemarkstudio.update;

import hrmanagement.update.updateemployeepanel.UpdateEmployee;
import hrmanagement.update.updatepassword.ChangePassword;
import hrmanagement.updatesalaryslips.UpdateSalarySlips;
/*
 * @version 1.10 25 Aug 2017
 * @author Hamza Yasin
 */
public class UpdatePanel extends javax.swing.JPanel {

    TitlePane titlePane = null;
    UpdateEmployee updateEmployee = null;
    UpdateSalarySlips updateSalarySlip = null;
    ChangePassword changePassword = null;
    
    public UpdatePanel() {
        initComponents();
        
        loadPanels();
        titlePane.setVisible(true);
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
        updateEmployeeButton = new javax.swing.JButton();
        changePasswordButton = new javax.swing.JButton();
        backbonePanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("Update");
        jLabel1.setToolTipText("");

        updateEmployeeButton.setBackground(new java.awt.Color(255, 255, 255));
        updateEmployeeButton.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        updateEmployeeButton.setText("Update Employee");
        updateEmployeeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateEmployeeButtonActionPerformed(evt);
            }
        });

        changePasswordButton.setBackground(new java.awt.Color(255, 255, 255));
        changePasswordButton.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        changePasswordButton.setForeground(new java.awt.Color(0, 102, 51));
        changePasswordButton.setText("Change Password");
        changePasswordButton.setToolTipText("");
        changePasswordButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        changePasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordButtonActionPerformed(evt);
            }
        });

        backbonePanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout backbonePanelLayout = new javax.swing.GroupLayout(backbonePanel);
        backbonePanel.setLayout(backbonePanelLayout);
        backbonePanelLayout.setHorizontalGroup(
            backbonePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        backbonePanelLayout.setVerticalGroup(
            backbonePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backbonePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(updateEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
                        .addComponent(changePasswordButton)
                        .addGap(445, 445, 445))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changePasswordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(backbonePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateEmployeeButtonActionPerformed
        hidePanels();
        updateEmployee.setVisible(true);
    }//GEN-LAST:event_updateEmployeeButtonActionPerformed

    private void changePasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordButtonActionPerformed
        hidePanels();
        changePassword.setVisible(true);
    }//GEN-LAST:event_changePasswordButtonActionPerformed

    private void loadPanels()
    {
        //title_pane
        titlePane = new TitlePane();
        backbonePanel.add(titlePane);
        titlePane.setSize(1330, 482);
        
        //update_employee
        updateEmployee = new UpdateEmployee();
        backbonePanel.add(updateEmployee);
        updateEmployee.setSize(1330, 520);
        
        //update_Salaryslips
        updateSalarySlip = new UpdateSalarySlips();
        backbonePanel.add(updateSalarySlip);
        updateSalarySlip.setSize(1330, 520);
        
        //change_password_panel
        changePassword = new ChangePassword();
        backbonePanel.add(changePassword);
        changePassword.setSize(1330, 520);
        
        hidePanels();
    }
    
    private void hidePanels()
    {
        titlePane.setVisible(false);
        updateEmployee.setVisible(false);
        updateSalarySlip.setVisible(false);
        changePassword.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backbonePanel;
    private javax.swing.JButton changePasswordButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton updateEmployeeButton;
    // End of variables declaration//GEN-END:variables
}
