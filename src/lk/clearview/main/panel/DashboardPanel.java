/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package lk.clearview.main.panel;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import lk.clearview.part.senesh.panel.*;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import lk.clearview.part.senesh.dialog.AddPrescription;
import lk.clearview.part.senesh.dialog.PatientPrescription;
import lk.clearview.part.senesh.dialog.UpdatePrescriptin;
import lk.clearview.main.Dashboard;
import lk.clearview.main.components.RoundPanelFix;
import lk.clearview.main.constance.Variable;
import raven.datetime.component.date.DatePicker;

/**
 *
 * @author USER
 */
public class DashboardPanel extends RoundPanelFix {
    
    /**
     * Creates new form ManagePatient
     */
    public DashboardPanel() {
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        roundPanelFix1 = new lk.clearview.main.components.RoundPanelFix();

        jLabel1.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 20)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/clearview/main/resources/icons8-dashboard-layout-22.png"))); // NOI18N
        jLabel1.setText("Welcome to Dashboard");

        javax.swing.GroupLayout roundPanelFix1Layout = new javax.swing.GroupLayout(roundPanelFix1);
        roundPanelFix1.setLayout(roundPanelFix1Layout);
        roundPanelFix1Layout.setHorizontalGroup(
            roundPanelFix1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 717, Short.MAX_VALUE)
        );
        roundPanelFix1Layout.setVerticalGroup(
            roundPanelFix1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(roundPanelFix1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1)
                .addGap(12, 12, 12))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private lk.clearview.main.components.RoundPanelFix roundPanelFix1;
    // End of variables declaration//GEN-END:variables
}
