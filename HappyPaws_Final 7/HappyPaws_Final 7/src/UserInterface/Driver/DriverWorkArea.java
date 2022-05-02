/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Driver;

import HappyPawSystem.Driver.Driver;
import HappyPawSystem.Ecosystem;
import HappyPawSystem.UserAccount.UserAccount;
import java.util.Properties;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
//import javax.mail;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author rashmisingh
 */
public class DriverWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form DriverWorkArea
     */
    JPanel userProcessContainer;
    Ecosystem system;
    private UserAccount account;

    public DriverWorkArea(JPanel userProcessContainer, UserAccount account, Ecosystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.account = account;
        populateTable();
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
        tblDriver = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        btnChangeStatus = new javax.swing.JButton();
        bntSendWindow = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblManageInfo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(214, 209, 222));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDriver.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Pet Owner", "Pet Type", "Health Camp", "Hospital Name", "Status"
            }
        ));
        jScrollPane1.setViewportView(tblDriver);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 660, 137));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(63, 40, 101));
        jLabel1.setText("Status");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 54, -1));

        txtStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStatusActionPerformed(evt);
            }
        });
        add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 138, -1));

        btnChangeStatus.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnChangeStatus.setForeground(new java.awt.Color(63, 40, 101));
        btnChangeStatus.setText("Change Status");
        btnChangeStatus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnChangeStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeStatusActionPerformed(evt);
            }
        });
        add(btnChangeStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 132, 41));

        bntSendWindow.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        bntSendWindow.setForeground(new java.awt.Color(63, 40, 101));
        bntSendWindow.setText("Send Email");
        bntSendWindow.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bntSendWindow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSendWindowActionPerformed(evt);
            }
        });
        add(bntSendWindow, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, 126, 41));

        jPanel1.setBackground(new java.awt.Color(63, 40, 101));

        lblManageInfo.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lblManageInfo.setForeground(new java.awt.Color(255, 255, 255));
        lblManageInfo.setText("DRIVER WORK AREA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(482, Short.MAX_VALUE)
                .addComponent(lblManageInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(402, 402, 402))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(lblManageInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(63, 40, 101));
        jLabel2.setText("You are logged in as a driver...");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 280, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStatusActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtStatusActionPerformed

    private void btnChangeStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeStatusActionPerformed
        // TODO add your handling code here:
        for(Driver driver: system.getDriverDirectory().getDriverDirectory()) {
            if(account.getUsername().equals(driver.getUsername())) {
                system.getDriverDirectory().updateDropOffStatus(driver,txtStatus.getText());
            }
        }
        populateTable();
        
    }                                               

    public void populateTable() {
        DefaultTableModel tablemodel = (DefaultTableModel) tblDriver.getModel();
        tablemodel.setRowCount(0);
        for(Driver driver: system.getDriverDirectory().getDriverDirectory()) {
            if(account.getUsername().equals(driver.getUsername())) {
                Object[] row = new Object[5];
                row[0] = driver.getPetOwner();
                row[1] = driver.getPetType();
                row[2] = driver.getHealthCamp();
                row[3] = driver.getHospitalName();
                row[4] = driver.getDropOffStatus() == null ? "N/A" : driver.getDropOffStatus();
                tablemodel.addRow(row);
            }
        }
    
    }//GEN-LAST:event_btnChangeStatusActionPerformed

    private void bntSendWindowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSendWindowActionPerformed
        // TODO add your handling code here:
        sendMailToPetOwner("rashmisingh337@gmail.com","","");
    }//GEN-LAST:event_bntSendWindowActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntSendWindow;
    private javax.swing.JButton btnChangeStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManageInfo;
    private javax.swing.JTable tblDriver;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables

    public void sendMailToPetOwner(String toMail, String msg, String username){
        System.out.println("Now start sending Email!");
        final String usname = "nronson93@gmail.com";
        final String passwrd = "Scam2022@";
        
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        //props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth","true");
        props.put("mail.smtp.starttls.enable", "true");
        //props.put("mail.smtp.port","465");
        
        Session session=Session.getDefaultInstance(props,
             new javax.mail.Authenticator() {
             protected PasswordAuthentication getPasswordAuthentication(){
                 return new PasswordAuthentication(usname,passwrd);
                }
             });
        
        try{
         Message message=new MimeMessage(session);
         message.setFrom(new InternetAddress("rashmisingh@gmail.com"));
         message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toMail));
         message.setSubject("Status Update ");
         message.setContent("<font color=black> Pet has been dropped to the destination ! <b>" +
                 "<font color=black> It's been a real pleasure serving you ! <b>","text/html");

         Transport.send(message);
         JOptionPane.showMessageDialog(null, "Pet has been dropped to the destination!");
     }
        catch(MessagingException e){
        e.printStackTrace();

        }
    }
}

