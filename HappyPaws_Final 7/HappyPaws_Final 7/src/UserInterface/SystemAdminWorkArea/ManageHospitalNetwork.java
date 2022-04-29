/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.SystemAdminWorkArea;

import HappyPawSystem.Ecosystem;
import HappyPawSystem.Hospital.Hospital;
import HappyPawSystem.Role.HospitalAdminRole;
import HappyPawSystem.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author haarikakatlaparthi
 */
public class ManageHospitalNetwork extends javax.swing.JPanel {

    /**
     * Creates new form ManageHospitalNetwork
     */
    
    JPanel userProcessContainer;
    Ecosystem system;
    private UserAccount user;
    
    public ManageHospitalNetwork(JPanel userProcessContainer, Ecosystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateHospitalTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        lblManageHospNetwork = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHospital = new javax.swing.JTable();
        btnViewHospital = new javax.swing.JButton();
        btnDeleteHospital = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        lblUserName1 = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnAddHospital = new javax.swing.JButton();
        btnUpdateHospital1 = new javax.swing.JButton();
        lblUserName2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(214, 209, 222));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-back-arrow-64 (2) (1).png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 40, 40));

        lblManageHospNetwork.setBackground(new java.awt.Color(0, 153, 153));
        lblManageHospNetwork.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lblManageHospNetwork.setForeground(new java.awt.Color(63, 40, 101));
        lblManageHospNetwork.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageHospNetwork.setText("MANAGE HOSPITAL NETWORK");
        add(lblManageHospNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 370, 87));

        tblHospital.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        tblHospital.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "UserName", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblHospital);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, 91));

        btnViewHospital.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnViewHospital.setForeground(new java.awt.Color(63, 40, 101));
        btnViewHospital.setText("VIEW");
        btnViewHospital.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnViewHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewHospitalActionPerformed(evt);
            }
        });
        add(btnViewHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 100, 30));

        btnDeleteHospital.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnDeleteHospital.setForeground(new java.awt.Color(63, 40, 101));
        btnDeleteHospital.setText("DELETE");
        btnDeleteHospital.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDeleteHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteHospitalActionPerformed(evt);
            }
        });
        add(btnDeleteHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 90, 30));

        txtName.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(0, 153, 153));
        txtName.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 180, 30));

        txtUsername.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 180, 30));

        lblUserName1.setBackground(new java.awt.Color(0, 153, 153));
        lblUserName1.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lblUserName1.setForeground(new java.awt.Color(63, 40, 101));
        lblUserName1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUserName1.setText("NAME");
        add(lblUserName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 210, 30));

        lblPassword.setBackground(new java.awt.Color(0, 153, 153));
        lblPassword.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(63, 40, 101));
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPassword.setText("PASSWORD");
        add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 210, 30));

        txtPassword.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(0, 153, 153));
        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 180, 30));

        btnAddHospital.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnAddHospital.setForeground(new java.awt.Color(63, 40, 101));
        btnAddHospital.setText("ADD HOSPITAL NETWORK");
        btnAddHospital.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddHospitalActionPerformed(evt);
            }
        });
        add(btnAddHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 230, 40));

        btnUpdateHospital1.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnUpdateHospital1.setForeground(new java.awt.Color(63, 40, 101));
        btnUpdateHospital1.setText("UPDATE");
        btnUpdateHospital1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdateHospital1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateHospital1ActionPerformed(evt);
            }
        });
        add(btnUpdateHospital1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 100, 30));

        lblUserName2.setBackground(new java.awt.Color(0, 153, 153));
        lblUserName2.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lblUserName2.setForeground(new java.awt.Color(63, 40, 101));
        lblUserName2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUserName2.setText("USERNAME");
        add(lblUserName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 210, 24));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewHospitalActionPerformed
        // TODO add your handling code here:
        int selectRow = tblHospital.getSelectedRow();

        if (selectRow >= 0) {
            String name = (String) tblHospital.getValueAt(selectRow, 0);
            String username = (String) tblHospital.getValueAt(selectRow, 1);
            String password = (String) tblHospital.getValueAt(selectRow, 2);

            txtName.setText(name + "");
            txtUsername.setText(username + "");
            txtPassword.setText(password + "");
        }
        else  
        {
            JOptionPane.showMessageDialog(null, "Please select a row to view the Hospital network details");
        }         
             
    }//GEN-LAST:event_btnViewHospitalActionPerformed

    private void btnDeleteHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteHospitalActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblHospital.getSelectedRow();
        if (selectedRow >= 0) {
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Confirm delete?", "Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION) {
                String username = (String) tblHospital.getValueAt(selectedRow, 1);
                String pwd = (String) tblHospital.getValueAt(selectedRow, 2);
                UserAccount user = system.getUserAccountDirectory().authenticateUser(username, pwd);

                system.getUserAccountDirectory().deleteUserAccount(user);
                system.getHospitalDirectory().deleteHospital(user.getUsername());
                populateHospitalTable();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row to delete the Hospital network details");
        }
    }//GEN-LAST:event_btnDeleteHospitalActionPerformed

    private void btnAddHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddHospitalActionPerformed
        // TODO add your handling code here:
        if (system.getUserAccountDirectory().checkIfUsernameIsUnique(txtUsername.getText())) {
            UserAccount userAccount = system.getUserAccountDirectory().createUserAccount(txtName.getText(), txtUsername.getText(), txtPassword.getText(), null, new HospitalAdminRole());
            Hospital hospital = system.getHospitalDirectory().createUserAccount(txtUsername.getText(), txtName.getText());
            populateHospitalTable();
            txtName.setText("");
            txtUsername.setText("");
            txtPassword.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Username is not unique");
        }
    }//GEN-LAST:event_btnAddHospitalActionPerformed

    private void btnUpdateHospital1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateHospital1ActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tblHospital.getSelectedRow();
        if (selectedRow >= 0) {
        String name = (String) tblHospital.getValueAt(selectedRow, 0);
        String username = (String) tblHospital.getValueAt(selectedRow, 1);
        String password = (String) tblHospital.getValueAt(selectedRow, 2);
        user = system.getUserAccountDirectory().authenticateUser(username, password);
        system.getUserAccountDirectory().updateUserAccount(user, txtName.getText(), txtUsername.getText(), txtPassword.getText());
        populateHospitalTable();;

        txtName.setText("");
        txtUsername.setText("");
        txtPassword.setText("");
        
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row to update the Hospital network details");
        }
    }//GEN-LAST:event_btnUpdateHospital1ActionPerformed

    private void populateHospitalTable() {
        DefaultTableModel tablemodel = (DefaultTableModel) tblHospital.getModel();

        tablemodel.setRowCount(0);
        for (UserAccount user : system.getUserAccountDirectory().getUserAccountList()) {

            if (user.getRole().getClass().getName().equals("HappyPawSystem.Role.HospitalAdminRole")) {
                Object[] row = new Object[3];
                row[0] = user.getName();
                row[1] = user.getUsername();
                row[2] = user.getPassword();
                tablemodel.addRow(row);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddHospital;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteHospital;
    private javax.swing.JButton btnUpdateHospital1;
    private javax.swing.JButton btnViewHospital;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManageHospNetwork;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUserName1;
    private javax.swing.JLabel lblUserName2;
    private javax.swing.JTable tblHospital;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

private boolean validateInputFields() {

        Pattern p = Pattern.compile("^[A-Za-z0-9 ]+$");
        Matcher m = p.matcher(txtName.getText());
        
        Pattern p7 = Pattern.compile("^[A-Za-z0-9]+$");
        Matcher m7 = p7.matcher(txtUsername.getText());
        
        Pattern p1 = Pattern.compile("^[A-Za-z0-9]+$");
        Matcher m1 = p1.matcher(txtPassword.getText());
        
        
        if (!m.matches()) {

            JOptionPane.showMessageDialog(this, "Error in provided name,Please Try agian!");
            return false;
        } else if (!m7.matches()) {

            JOptionPane.showMessageDialog(this, "Error in provided username ,Please Try agian!");
            return false;
        }
        else if (!m1.matches()) {

            JOptionPane.showMessageDialog(this, "Error in provided password ,Please Try agian!");
            return false;
        }
        else {
            return true;
        }
    }
}