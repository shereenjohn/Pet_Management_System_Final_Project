/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HospitalAdmin;

import ReliefSystem.Ecosystem;
import ReliefSystem.UserAccount.UserAccount;
import UserInterface.SystemAdminWorkArea.ManagePetVolunteer;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author rashmisingh 
 */
public class HospitalAdminWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form HospitalAdminWorkArea
     */
    JPanel userProcessContainer;
    Ecosystem system;
    private UserAccount account;
    public HospitalAdminWorkArea(JPanel userProcessContainer,UserAccount account, Ecosystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.account = account;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        sidepane = new javax.swing.JPanel();
        ManageLabAssitant = new javax.swing.JPanel();
        lblManageLabAssistant = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ManageDriver = new javax.swing.JPanel();
        lblManageDriver = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ManageHospitalInfo = new javax.swing.JPanel();
        lblmanagehospitalinfo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ManagePet = new javax.swing.JPanel();
        lblmanagepet = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ManageVet = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblManageVet = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblAddSponsor = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        backgroundPanel.setBackground(new java.awt.Color(255, 255, 255));

        sidepane.setBackground(new java.awt.Color(153, 0, 0));
        sidepane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ManageLabAssitant.setBackground(new java.awt.Color(204, 204, 255));

        lblManageLabAssistant.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblManageLabAssistant.setText("Manage LabAssistant");
        lblManageLabAssistant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblManageLabAssistantMousePressed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lab_assistant.png"))); // NOI18N

        javax.swing.GroupLayout ManageLabAssitantLayout = new javax.swing.GroupLayout(ManageLabAssitant);
        ManageLabAssitant.setLayout(ManageLabAssitantLayout);
        ManageLabAssitantLayout.setHorizontalGroup(
            ManageLabAssitantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageLabAssitantLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(46, 46, 46)
                .addComponent(lblManageLabAssistant, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        ManageLabAssitantLayout.setVerticalGroup(
            ManageLabAssitantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageLabAssitantLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ManageLabAssitantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblManageLabAssistant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        sidepane.add(ManageLabAssitant, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 290, 40));

        ManageDriver.setBackground(new java.awt.Color(204, 204, 255));

        lblManageDriver.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblManageDriver.setText("Manage Pet Info");
        lblManageDriver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblManageDriverMousePressed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pet_owner.png"))); // NOI18N

        javax.swing.GroupLayout ManageDriverLayout = new javax.swing.GroupLayout(ManageDriver);
        ManageDriver.setLayout(ManageDriverLayout);
        ManageDriverLayout.setHorizontalGroup(
            ManageDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageDriverLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel4)
                .addGap(55, 55, 55)
                .addComponent(lblManageDriver, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        ManageDriverLayout.setVerticalGroup(
            ManageDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageDriverLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ManageDriverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblManageDriver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        sidepane.add(ManageDriver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 260, 50));

        ManageHospitalInfo.setBackground(new java.awt.Color(204, 204, 255));

        lblmanagehospitalinfo.setBackground(new java.awt.Color(0, 255, 255));
        lblmanagehospitalinfo.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblmanagehospitalinfo.setText("Manage Hospital Info");
        lblmanagehospitalinfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblmanagehospitalinfoMousePressed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hosptial-logo.jpg"))); // NOI18N

        javax.swing.GroupLayout ManageHospitalInfoLayout = new javax.swing.GroupLayout(ManageHospitalInfo);
        ManageHospitalInfo.setLayout(ManageHospitalInfoLayout);
        ManageHospitalInfoLayout.setHorizontalGroup(
            ManageHospitalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageHospitalInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblmanagehospitalinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        ManageHospitalInfoLayout.setVerticalGroup(
            ManageHospitalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageHospitalInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ManageHospitalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ManageHospitalInfoLayout.createSequentialGroup()
                        .addComponent(lblmanagehospitalinfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        sidepane.add(ManageHospitalInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 260, 40));

        ManagePet.setBackground(new java.awt.Color(0, 204, 204));

        lblmanagepet.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblmanagepet.setText("Manage Pet Info");
        lblmanagepet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblmanagepetMousePressed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manage_pet_info.jpg"))); // NOI18N

        javax.swing.GroupLayout ManagePetLayout = new javax.swing.GroupLayout(ManagePet);
        ManagePet.setLayout(ManagePetLayout);
        ManagePetLayout.setHorizontalGroup(
            ManagePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ManagePetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblmanagepet, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        ManagePetLayout.setVerticalGroup(
            ManagePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManagePetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblmanagepet, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addGap(0, 0, 0))
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sidepane.add(ManagePet, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 290, 50));

        ManageVet.setBackground(new java.awt.Color(204, 204, 255));
        ManageVet.setForeground(new java.awt.Color(0, 153, 153));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vet.png"))); // NOI18N

        lblManageVet.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblManageVet.setText("Manage Vet");
        lblManageVet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblManageVetMousePressed(evt);
            }
        });

        javax.swing.GroupLayout ManageVetLayout = new javax.swing.GroupLayout(ManageVet);
        ManageVet.setLayout(ManageVetLayout);
        ManageVetLayout.setHorizontalGroup(
            ManageVetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageVetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(lblManageVet, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        ManageVetLayout.setVerticalGroup(
            ManageVetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ManageVetLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblManageVet, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        sidepane.add(ManageVet, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 260, 40));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        lblAddSponsor.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblAddSponsor.setText("Manage Sponsor");
        lblAddSponsor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblAddSponsorMousePressed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sponsor.PNG"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel8)
                .addGap(50, 50, 50)
                .addComponent(lblAddSponsor, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblAddSponsor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        sidepane.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 260, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Hospital-Administration-Courses.jpeg"))); // NOI18N
        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addComponent(sidepane, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidepane, javax.swing.GroupLayout.DEFAULT_SIZE, 1707, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblManageVetMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManageVetMousePressed
        // TODO add your handling code here:
        ManageVet manageVetJPanel = new ManageVet(userProcessContainer, account, system);
        userProcessContainer.add("ManageVet", manageVetJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_lblManageVetMousePressed

    private void lblManageLabAssistantMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManageLabAssistantMousePressed
        // TODO add your handling code here:
        ManageLabAssistant manageLabAssistantJPanel = new ManageLabAssistant(userProcessContainer,account, system);
        userProcessContainer.add("ManageLabAssistant", manageLabAssistantJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_lblManageLabAssistantMousePressed

    private void lblmanagehospitalinfoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblmanagehospitalinfoMousePressed
        // TODO add your handling code here:
        ManageHospitalInfo manageHospitalInfoJPanel = new ManageHospitalInfo(userProcessContainer,account, system);
        userProcessContainer.add("ManageHospitalInfo", manageHospitalInfoJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_lblmanagehospitalinfoMousePressed

    private void lblmanagepetMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblmanagepetMousePressed
        // TODO add your handling code here:
        
        ManagePetInfo managePetInfoJPanel = new ManagePetInfo(userProcessContainer,account, system);
        userProcessContainer.add("ManagePetInfo", managePetInfoJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_lblmanagepetMousePressed

    private void lblAddSponsorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddSponsorMousePressed
        // TODO add your handling code here:
        ManageSponsor manageSponsorJPanel = new ManageSponsor(userProcessContainer,account, system);
        userProcessContainer.add("ManageSponsorInfo", manageSponsorJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_lblAddSponsorMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ManageDriver;
    private javax.swing.JPanel ManageHospitalInfo;
    private javax.swing.JPanel ManageLabAssitant;
    private javax.swing.JPanel ManagePet;
    private javax.swing.JPanel ManageVet;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAddSponsor;
    private javax.swing.JLabel lblManageDriver;
    private javax.swing.JLabel lblManageLabAssistant;
    private javax.swing.JLabel lblManageVet;
    private javax.swing.JLabel lblmanagehospitalinfo;
    private javax.swing.JLabel lblmanagepet;
    private javax.swing.JPanel sidepane;
    // End of variables declaration//GEN-END:variables
}
