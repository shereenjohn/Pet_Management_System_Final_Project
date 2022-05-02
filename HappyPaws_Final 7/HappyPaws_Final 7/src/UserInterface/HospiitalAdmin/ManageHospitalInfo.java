/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HospiitalAdmin;

import HappyPawSystem.Ecosystem;
import HappyPawSystem.Hospital.Hospital;
import HappyPawSystem.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author rashmisingh
 */
public class ManageHospitalInfo extends javax.swing.JPanel {

    /**
     * Creates new form ManageHospitalInfo
     */
    JPanel userProcessContainer;
    Ecosystem system;
    private UserAccount account;

    public ManageHospitalInfo(JPanel userProcessContainer, UserAccount account, Ecosystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.account = account;
        populateTextFields();
    }

    private void populateTextFields() {
        for (Hospital hospital : system.getHospitalDirectory().getHospitalDirectory()) {
            System.out.println("account username :" + account.getUsername());
            if (hospital.getUsername().equals(account.getUsername())) {
                txthospitaladmin.setText(hospital.getUsername());
                System.out.println("Hospital name : " + hospital.getName());
                txthospitalname.setText(hospital.getName());
                txthospitaladdress.setText(hospital.getAddress());
                txthospitalphone.setText(hospital.getNumber());
                txtHospitalDriver.setText(hospital.getDriverName());
                break;
            }
        }
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
        lblhospitaladmin = new javax.swing.JLabel();
        txthospitaladmin = new javax.swing.JTextField();
        lblhospitalname = new javax.swing.JLabel();
        txthospitalname = new javax.swing.JTextField();
        lblhospitaladdress = new javax.swing.JLabel();
        txthospitaladdress = new javax.swing.JTextField();
        lblhospitalphone = new javax.swing.JLabel();
        txthospitalphone = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtHospitalDriver = new javax.swing.JTextField();
        lblManageInfo = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblManageInfo1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(214, 209, 222));
        jPanel1.setPreferredSize(new java.awt.Dimension(770, 772));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblhospitaladmin.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lblhospitaladmin.setForeground(new java.awt.Color(63, 40, 101));
        lblhospitaladmin.setText("HOSPITAL ADMIN");
        jPanel1.add(lblhospitaladmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 140, 30));

        txthospitaladmin.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        txthospitaladmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthospitaladminActionPerformed(evt);
            }
        });
        jPanel1.add(txthospitaladmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 200, 30));

        lblhospitalname.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lblhospitalname.setForeground(new java.awt.Color(63, 40, 101));
        lblhospitalname.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblhospitalname.setText("HOSPITAL NAME");
        jPanel1.add(lblhospitalname, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 130, 30));

        txthospitalname.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        jPanel1.add(txthospitalname, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 200, 30));

        lblhospitaladdress.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lblhospitaladdress.setForeground(new java.awt.Color(63, 40, 101));
        lblhospitaladdress.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblhospitaladdress.setText("HOSPITAL ADDRESS");
        jPanel1.add(lblhospitaladdress, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 150, 30));

        txthospitaladdress.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        txthospitaladdress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthospitaladdressActionPerformed(evt);
            }
        });
        jPanel1.add(txthospitaladdress, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 200, 30));

        lblhospitalphone.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lblhospitalphone.setForeground(new java.awt.Color(63, 40, 101));
        lblhospitalphone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblhospitalphone.setText("HOSPITAL PHONE");
        jPanel1.add(lblhospitalphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 130, 30));

        txthospitalphone.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        txthospitalphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthospitalphoneActionPerformed(evt);
            }
        });
        jPanel1.add(txthospitalphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 200, 30));

        btnsave.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnsave.setForeground(new java.awt.Color(63, 40, 101));
        btnsave.setText("SAVE");
        btnsave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 490, 80, 30));

        btnupdate.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(63, 40, 101));
        btnupdate.setText("UPDATE");
        btnupdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 490, 90, 30));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(63, 40, 101));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("HOSPITAL DRIVER");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 150, 30));

        txtHospitalDriver.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        jPanel1.add(txtHospitalDriver, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, 200, 30));

        lblManageInfo.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lblManageInfo.setForeground(new java.awt.Color(63, 40, 101));
        lblManageInfo.setText("MANAGE HOSPITAL INFORMATION");
        jPanel1.add(lblManageInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 466, 72));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-back-arrow-64 (2) (1).png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 40, 40));

        jPanel2.setBackground(new java.awt.Color(63, 40, 101));

        lblManageInfo1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lblManageInfo1.setForeground(new java.awt.Color(255, 255, 255));
        lblManageInfo1.setText("HOSPITAL ADMIN WORK AREA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(410, Short.MAX_VALUE)
                .addComponent(lblManageInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(194, 194, 194))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(lblManageInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 551, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txthospitaladminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthospitaladminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthospitaladminActionPerformed

    private void txthospitaladdressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthospitaladdressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthospitaladdressActionPerformed

    private void txthospitalphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthospitalphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthospitalphoneActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        if(validateInputFields()){
            for (Hospital hospital : system.getHospitalDirectory().getHospitalDirectory()) {
                if (hospital.getUsername().equals(account.getUsername())) {
                    system.getHospitalDirectory().updateHospitalInfo(hospital, txthospitalname.getText(), txthospitalphone.getText(), txthospitaladdress.getText(), txtHospitalDriver.getText());
                }
            }
            btnupdate.setEnabled(true);
            txthospitaladdress.setEnabled(false);
            txthospitaladmin.setEnabled(false);
            txthospitalname.setEnabled(false);
            txthospitalphone.setEnabled(false);
            txtHospitalDriver.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Hospital information has been saved sucessfully");
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        txthospitaladdress.setEnabled(true);
        txthospitaladmin.setEnabled(true);
        txthospitalname.setEnabled(true);
        txthospitalphone.setEnabled(true);
        txtHospitalDriver.setEnabled(true);
        btnupdate.setEnabled(false);
        JOptionPane.showMessageDialog(this, "Hospital information has been updated sucessfully");
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblManageInfo;
    private javax.swing.JLabel lblManageInfo1;
    private javax.swing.JLabel lblhospitaladdress;
    private javax.swing.JLabel lblhospitaladmin;
    private javax.swing.JLabel lblhospitalname;
    private javax.swing.JLabel lblhospitalphone;
    private javax.swing.JTextField txtHospitalDriver;
    private javax.swing.JTextField txthospitaladdress;
    private javax.swing.JTextField txthospitaladmin;
    private javax.swing.JTextField txthospitalname;
    private javax.swing.JTextField txthospitalphone;
    // End of variables declaration//GEN-END:variables

private boolean validateInputFields() {

        Pattern p = Pattern.compile("^[A-Za-z0-9 ]+$");
        Matcher m = p.matcher(txthospitaladmin.getText());
        Pattern p7 = Pattern.compile("^[A-Za-z0-9]+$");
        Matcher m7 = p7.matcher(txthospitalname.getText());
        Pattern p1 = Pattern.compile("^[A-Za-z0-9]+$");
        Matcher m1 = p1.matcher(txthospitaladdress.getText());
        Pattern p2 = Pattern.compile("^[0-9]{10,10}+$");
        Matcher m2 = p2.matcher(txthospitalphone.getText());

        if (!m.matches()) {

            JOptionPane.showMessageDialog(this, "Please enter correct input format for owner");
            return false;
        } else if (!m7.matches()) {

            JOptionPane.showMessageDialog(this, "Please enter correct input format for hospitalname ");
            return false;
        }
        else if (!m1.matches()) {

            JOptionPane.showMessageDialog(this, "Please enter correct input format for address ");
            return false;
        }
         else if (!m2.matches()) {

        JOptionPane.showMessageDialog(this, "Please enter correct input format for phonenumber");
            return false; 
         }
        else {
            return true;
        }
    }
}

