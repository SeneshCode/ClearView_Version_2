/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lk.clearview.main;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.LookAndFeel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import lk.clearview.main.components.LinkSlide;
import lk.clearview.main.constance.Variable;

/**
 *
 * @author USER
 */
public class Dashboard extends javax.swing.JFrame {

    protected LinkSlide slide1 = new LinkSlide(UIManager.getString("DASHBOARD"), Variable.SLIDE_ICON_SIZE, Variable.SLIDE_ICON_SIZE) {
        @Override
        public void setCommand() {

        }
        @Override
        public void initial() {
            setToolTipText("");
        }
    };
    protected LinkSlide slide2 = new LinkSlide(UIManager.getString("LIST"), Variable.SLIDE_ICON_SIZE, Variable.SLIDE_ICON_SIZE) {
        @Override
        public void setCommand() {

        }
        @Override
        public void initial() {
            setToolTipText("");
        }
    };
    protected LinkSlide slide3 = new LinkSlide(UIManager.getString("EDIT"), Variable.SLIDE_ICON_SIZE, Variable.SLIDE_ICON_SIZE) {
        @Override
        public void setCommand() {

        }
    };
    protected LinkSlide slide4 = new LinkSlide(UIManager.getString("CALANDER"), Variable.SLIDE_ICON_SIZE, Variable.SLIDE_ICON_SIZE) {
        @Override
        public void setCommand() {

        }
        @Override
        public void initial() {
            setToolTipText("");
        }
    };
    protected LinkSlide slide5 = new LinkSlide("lk/clearview/main/resources/dashboard.svg", Variable.SLIDE_ICON_SIZE, Variable.SLIDE_ICON_SIZE) {
        @Override
        public void setCommand() {

        }
        @Override
        public void initial() {
            setToolTipText("");
        }
    };
    protected LinkSlide slide6 = new LinkSlide("lk/clearview/main/resources/dashboard.svg", Variable.SLIDE_ICON_SIZE, Variable.SLIDE_ICON_SIZE) {
        @Override
        public void setCommand() {

        }
        @Override
        public void initial() {
            setToolTipText("");
        }
    };

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        init();
    }

    public void init() {
        this.setIconImage(new ImageIcon(getClass().getResource("./resources/lightlogo.png")).getImage());
        logo.setIcon(new FlatSVGIcon(UIManager.getString("LOGO"), 42, 23));
        scrollPaneOptimize(jScrollPane1);
        theme.setIcon(new FlatSVGIcon(UIManager.getString("THEME"), Variable.SLIDE_ICON_SIZE, Variable.SLIDE_ICON_SIZE));
        theme_panel.putClientProperty(FlatClientProperties.STYLE, "arc:15");
        setting.setIcon(new FlatSVGIcon(UIManager.getString("SETTINGS"), Variable.SLIDE_ICON_SIZE, Variable.SLIDE_ICON_SIZE));
        setting_panel.putClientProperty(FlatClientProperties.STYLE, "arc:15");
        loadSide();
        setTheme();
    }

    private void loadSide() {
        slider.setLayout(new BoxLayout(slider, BoxLayout.Y_AXIS));
        slider.add(slide1);
        slider.add(slide2);
        slider.add(slide3);
        slider.add(slide4);
        slider.add(slide5);
        slider.add(slide6);
        slider.add(new LinkSlide("lk/clearview/main/resources/dashboard.svg", 15, 15));
        slider.add(new LinkSlide("lk/clearview/main/resources/dashboard.svg", 15, 15));
        slider.add(new LinkSlide("lk/clearview/main/resources/dashboard.svg", 15, 15));
        slider.add(new LinkSlide("lk/clearview/main/resources/dashboard.svg", 15, 15));
        slider.add(new LinkSlide("lk/clearview/main/resources/dashboard.svg", 15, 15));
        slider.add(new LinkSlide("lk/clearview/main/resources/dashboard.svg", 15, 15));
        slider.add(new LinkSlide("lk/clearview/main/resources/dashboard.svg", 15, 15));
    }

    private void click() {

    }

    private void setTheme() {

        jPanel2.setBackground(UIManager.getColor("CUSTOM_BACKGROUND"));
        setting_panel.setBackground(UIManager.getColor("CUSTOM_BACKGROUND"));
        theme_panel.setBackground(UIManager.getColor("CUSTOM_BACKGROUND"));
        slider.setBackground(UIManager.getColor("CUSTOM_BACKGROUND"));

        theme.setIcon(new FlatSVGIcon(UIManager.getString("THEME"), 15, 15));
        logo.setIcon(new FlatSVGIcon(UIManager.getString("LOGO"), 42, 23));

    }

    private void chanageTheme() {
        LookAndFeel getTheme = UIManager.getLookAndFeel();
        if (getTheme.getClass().getSimpleName().equals("FlatMacDarkLaf")) {
            FlatLafRegisterCustomDefaultsSource();
            FlatMacLightLaf.setup();
        } else {
            FlatLafRegisterCustomDefaultsSource();
            FlatMacDarkLaf.setup();
        }
        SwingUtilities.updateComponentTreeUI(this);
        setTheme();
    }

    public void resetLayout() {
//        repaint();
//        revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new lk.clearview.main.components.RoundPanelFix();
        jScrollPane1 = new javax.swing.JScrollPane();
        slider = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        setting_panel = new javax.swing.JPanel();
        setting = new javax.swing.JLabel();
        theme_panel = new javax.swing.JPanel();
        theme = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clear View");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(59, 112));

        javax.swing.GroupLayout sliderLayout = new javax.swing.GroupLayout(slider);
        slider.setLayout(sliderLayout);
        sliderLayout.setHorizontalGroup(
            sliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        sliderLayout.setVerticalGroup(
            sliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(slider);

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        setting_panel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setting_panel.setMaximumSize(new java.awt.Dimension(50, 50));
        setting_panel.setMinimumSize(new java.awt.Dimension(50, 50));
        setting_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                setting_panelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                setting_panelMouseExited(evt);
            }
        });

        setting.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout setting_panelLayout = new javax.swing.GroupLayout(setting_panel);
        setting_panel.setLayout(setting_panelLayout);
        setting_panelLayout.setHorizontalGroup(
            setting_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setting_panelLayout.createSequentialGroup()
                .addComponent(setting, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        setting_panelLayout.setVerticalGroup(
            setting_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(setting, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        theme_panel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        theme_panel.setMaximumSize(new java.awt.Dimension(50, 50));
        theme_panel.setMinimumSize(new java.awt.Dimension(50, 50));
        theme_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                theme_panelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                theme_panelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                theme_panelMouseExited(evt);
            }
        });

        theme.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout theme_panelLayout = new javax.swing.GroupLayout(theme_panel);
        theme_panel.setLayout(theme_panelLayout);
        theme_panelLayout.setHorizontalGroup(
            theme_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(theme_panelLayout.createSequentialGroup()
                .addComponent(theme, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        theme_panelLayout.setVerticalGroup(
            theme_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(theme, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(theme_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setting_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(theme_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(setting_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, roundPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(785, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setting_panelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setting_panelMouseEntered
        // Mouse Enter
        setting_panel.setBackground(UIManager.getColor("MOUSE_ENTER_BACKGROUND_COLOR"));
        resetLayout();
    }//GEN-LAST:event_setting_panelMouseEntered

    private void setting_panelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setting_panelMouseExited
        // Mouse Exist
        setting_panel.setBackground(UIManager.getColor("MOUSE_EXIT_BACKGROUND_COLOR"));
        resetLayout();
    }//GEN-LAST:event_setting_panelMouseExited

    private void theme_panelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_theme_panelMouseEntered
        // Mouse Enter
        theme_panel.setBackground(UIManager.getColor("MOUSE_ENTER_BACKGROUND_COLOR"));
        resetLayout();
    }//GEN-LAST:event_theme_panelMouseEntered

    private void theme_panelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_theme_panelMouseExited
        // Mouse Exit
        theme_panel.setBackground(UIManager.getColor("MOUSE_EXIT_BACKGROUND_COLOR"));
        resetLayout();
    }//GEN-LAST:event_theme_panelMouseExited

    private void theme_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_theme_panelMouseClicked
        // ChanageTheme
        chanageTheme();
    }//GEN-LAST:event_theme_panelMouseClicked

    public void scrollPaneOptimize(JScrollPane ScrollPane) {
        ScrollPane.setBorder(BorderFactory.createEmptyBorder());
        ScrollPane.setViewportBorder(BorderFactory.createEmptyBorder());
        ScrollPane.getVerticalScrollBar().setUnitIncrement(16);
        ScrollPane.getHorizontalScrollBar().setUnitIncrement(16);
    }

    public static void FlatLafRegisterCustomDefaultsSource() {
        FlatLaf.registerCustomDefaultsSource("lk/clearview/style");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatLafRegisterCustomDefaultsSource();
        FlatMacLightLaf.setup();
//        FlatMacDarkLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel logo;
    private lk.clearview.main.components.RoundPanelFix roundPanel1;
    private javax.swing.JLabel setting;
    private javax.swing.JPanel setting_panel;
    private javax.swing.JPanel slider;
    private javax.swing.JLabel theme;
    private javax.swing.JPanel theme_panel;
    // End of variables declaration//GEN-END:variables
}
