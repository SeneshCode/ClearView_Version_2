/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lk.clearview.main;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.Color;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.sql.ResultSet;
import java.util.logging.Level;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.LookAndFeel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import static lk.clearview.main.Dashboard.FlatLafRegisterCustomDefaultsSource;
import lk.clearview.main.constance.Variable;
import lk.clearview.main.model.MYSQL;
import lk.clearview.main.panel.ThemePanel;

/**
 *
 * @author EnovateX Team
 */
public class ClearViewLogin extends javax.swing.JFrame {

    /**
     * Creates new form DoctorLogin
     */
    public ClearViewLogin() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("./resources/lightlogo.png")).getImage());
//        this.setIconImage(new ImageIcon(getClass().getResource("../resources/eye-35.png")).getImage());
        init2();
        setThemeOfLogin();
        loadingProgressBar.setVisible(false);
    }

//    private void setSvg(){
//        String path = getClass().getResource("../resources/login.svg").toString();
//        jLabel1.setIcon(new FlatSVGIcon("../resources/login.svg",352,438));
//    }
    private void setThemeOfLogin() {
        LookAndFeel getTheme = UIManager.getLookAndFeel();
        if (getTheme.getClass().getSimpleName().equals(Variable.LIGHT_THEME_STRING)) {
            jLabel1.setIcon(new FlatSVGIcon("lk/clearview/main/resources/optical2.svg", 580, 400));
            jPanel1.setBackground(new Color(255, 255, 255));
            jPanel2.setBackground(new Color(255, 255, 255));
            jButton2.setText("Chanage Theme to Dark");
            jButton2.setBackground(new Color(255, 255, 255));
        } else {
            jLabel1.setIcon(new FlatSVGIcon("lk/clearview/main/resources/optical.svg", 580, 400));
            jPanel1.setBackground(new Color(22, 22, 24));
            jPanel2.setBackground(new Color(22, 22, 24));
            jButton2.setText("Chanage Theme to Light");
            jButton2.setBackground(new Color(30, 30, 30));
        }
    }

    private void init2() {
        UIManager.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                setThemeOfLogin();
            }
        });
    }

    public void changeTheme() {
        LookAndFeel getTheme = UIManager.getLookAndFeel();
        if (getTheme.getClass().getSimpleName().equals(Variable.LIGHT_THEME_STRING)) {
            FlatLafRegisterCustomDefaultsSource();
            FlatMacDarkLaf.setup();
        } else {
            FlatLafRegisterCustomDefaultsSource();
            FlatMacLightLaf.setup();
        }
        SwingUtilities.updateComponentTreeUI(this);
        setThemeOfLogin();
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        loadingProgressBar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clear View Login");
        setBackground(new java.awt.Color(22, 22, 24));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(22, 22, 24));
        jPanel1.setMaximumSize(new java.awt.Dimension(829, 499));
        jPanel1.setMinimumSize(new java.awt.Dimension(829, 499));

        jLabel7.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 36)); // NOI18N
        jLabel7.setText("View");

        jLabel8.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(3, 96, 255));
        jLabel8.setText("Clear");

        jLabel6.setFont(new java.awt.Font("Josefin Sans", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Log in Clear View Staff Dashboard");

        jLabel4.setFont(new java.awt.Font("Josefin Sans", 0, 12)); // NOI18N
        jLabel4.setText("Password");

        jLabel5.setFont(new java.awt.Font("Josefin Sans", 0, 12)); // NOI18N
        jLabel5.setText("User Name");

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(3, 96, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Log In");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setMaximumSize(new java.awt.Dimension(80, 27));
        jButton1.setMinimumSize(new java.awt.Dimension(80, 27));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(22, 22, 24));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 390, 380));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Powered by EnovateX software solution");

        jButton2.setText("Chanage Theme to Light");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(202, 202, 202))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(210, 210, 210))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(username, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(password, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(10, 10, 10))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE))
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(loadingProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel5)
                        .addGap(4, 4, 4)
                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4)
                        .addGap(4, 4, 4)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loadingProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        changeTheme();
    }//GEN-LAST:event_jButton2ActionPerformed

    public void removeProgress() {
        loadingProgressBar.setVisible(false);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Log In Here
        String username = this.username.getText();
        String password = String.valueOf(this.password.getPassword());
        Thread tread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    if (username.isBlank()) {
                        removeProgress();
                        JOptionPane.showMessageDialog(ClearViewLogin.this, "Please Enter Your username!", "Warning", JOptionPane.WARNING_MESSAGE);
                        ClearViewLogin.this.username.grabFocus();
                    } else if (!username.matches("^([0-9]{9}[x|X|v|V]|[0-9]{12})$")) {
                        for (int i = 2; i < 11; i++) {
                            Thread.sleep(3);
                            loadingProgressBar.setValue(i);
                        }
                        removeProgress();
                        JOptionPane.showMessageDialog(ClearViewLogin.this, "Invalid Username!", "Warning", JOptionPane.WARNING_MESSAGE);
                        ClearViewLogin.this.username.grabFocus();
                    } else if (password.isEmpty()) {
                        removeProgress();
                        JOptionPane.showMessageDialog(ClearViewLogin.this, "Please Enter Your Password!", "Warning", JOptionPane.WARNING_MESSAGE);
                        ClearViewLogin.this.password.grabFocus();
                    } else {
                        for (int i = 10; i < 36; i++) {
                            Thread.sleep(4);
                            loadingProgressBar.setValue(i);
                        }
                        try {
                            for (int i = 35; i < 59; i++) {
                                Thread.sleep(5);
                                loadingProgressBar.setValue(i);
                            }
                            ResultSet resultSet = MYSQL.search("SELECT * FROM `staff` INNER JOIN `user_role` ON `staff`.`user_role_id`=`user_role`.`id` INNER JOIN `user_status` ON `staff`.`user_status_id`=`user_status`.`id` WHERE `staff`.`nic`='" + username + "' AND `staff`.`password`='" + password + "'");
                            for (int i = 59; i < 71; i++) {
                                Thread.sleep(2);
                                loadingProgressBar.setValue(i);
                            }
                            if (resultSet.next()) {
                                for (int i = 71; i < 100; i++) {
                                    Thread.sleep(4);
                                    loadingProgressBar.setValue(i);
                                }
//                                      JOptionPane.showMessageDialog(MyShopSignIn.this, "Successfully Login!", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
                                String user_type = resultSet.getString("user_role.role");
                                String isBlock = resultSet.getString("user_status.status");
                                loadingProgressBar.setValue(100);
                                Thread.sleep(220);
                                if (isBlock.equals("active") || isBlock.equals("inactive")) {
                                    removeProgress();
                                    Dashboard Dashboard = new Dashboard(username, user_type, resultSet.getString("first_name"), resultSet.getString("last_name"));
                                    Dashboard.setVisible(true);
                                    ClearViewLogin.this.dispose();
                                } else if (isBlock.equals("block")) {
                                    removeProgress();
                                    JOptionPane.showMessageDialog(ClearViewLogin.this, "Block User!", "Warning", JOptionPane.ERROR_MESSAGE);
                                }else {
                                    removeProgress();
                                    JOptionPane.showMessageDialog(ClearViewLogin.this, "Invalid User!", "Warning", JOptionPane.ERROR_MESSAGE);
                                }
                            } else {
                                removeProgress();
                                ClearViewLogin.this.username.setText("");
                                ClearViewLogin.this.password.setText("");
                                ClearViewLogin.this.username.grabFocus();
                                JOptionPane.showMessageDialog(ClearViewLogin.this, "Invalid Username or Password!", "Warning", JOptionPane.ERROR_MESSAGE);
                            }
                        } catch (Exception e) {
//                            logger.log(Level.SEVERE, "(this error coming at logging section in database with connect to find user) Error is " + e);
                        }
                    }
                } catch (Exception e) {
//                    logger.log(Level.SEVERE, "(this error coming at Thread section in Login.java) Error is " + e);
                }
            }
        });
        tread.start();

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatLafRegisterCustomDefaultsSource();
//        FlatMacLightLaf.setup();
        FlatMacDarkLaf.setup();

        UIManager.put("defaultFont", Variable.DEFAULT_FONT);

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClearViewLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar loadingProgressBar;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
