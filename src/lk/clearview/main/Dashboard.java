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
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.LookAndFeel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.UIManager;
import lk.clearview.main.components.LinkSlide;
import lk.clearview.main.constance.Variable;
import lk.clearview.main.panel.DashboardPanel;
import lk.clearview.main.panel.ThemePanel;

/**
 *
 * @author USER
 */
public class Dashboard extends javax.swing.JFrame {

    public static Dashboard DASHBOARD;

    protected LinkSlide slide1 = new LinkSlide(UIManager.getString("DASHBOARD"), Variable.SLIDE_ICON_SIZE, Variable.SLIDE_ICON_SIZE) {
        @Override
        public void setCommand() {
            changeClickPanel(getjPanel1());
            changeView(new DashboardPanel());
        }

        @Override
        public void initial() {
            setToolTipText("Dashboard");
        }
    };
//  Start Senesh Part
    protected LinkSlide slide2 = new LinkSlide(UIManager.getString("LIST"), Variable.SLIDE_ICON_SIZE, Variable.SLIDE_ICON_SIZE) {
        @Override
        public void setCommand() {
            changeClickPanel(getjPanel1());
            changeView(new lk.clearview.part.senesh.panel.ManagePatient());
        }

        @Override
        public void initial() {
            setToolTipText("Manage Patient");
        }
    };
    protected LinkSlide slide3 = new LinkSlide(UIManager.getString("EDIT"), Variable.SLIDE_ICON_SIZE, Variable.SLIDE_ICON_SIZE) {
        @Override
        public void setCommand() {
            changeClickPanel(getjPanel1());
            changeView(new lk.clearview.part.senesh.panel.ManagePrescription());
        }

        @Override
        public void initial() {
            setToolTipText("Manage Prescription");
        }
    };
    protected LinkSlide slide4 = new LinkSlide(UIManager.getString("CALANDER"), Variable.SLIDE_ICON_SIZE, Variable.SLIDE_ICON_SIZE) {
        @Override
        public void setCommand() {
            changeClickPanel(getjPanel1());
            changeView(new lk.clearview.part.senesh.panel.Schedule());
        }

        @Override
        public void initial() {
            setToolTipText("Schedule Appointment");
        }
    };
//  end of senesh part
//  start osini part
    protected LinkSlide slide5 = new LinkSlide("lk/clearview/main/resources/dashboard.svg", Variable.SLIDE_ICON_SIZE, Variable.SLIDE_ICON_SIZE) {
        @Override
        public void setCommand() {
            changeClickPanel(getjPanel1());
            changeView(new lk.clearview.part.osini.panel.ManageSupplier());
        }

        @Override
        public void initial() {
            setToolTipText("Manage Supplier");
        }
    };
    protected LinkSlide slide6 = new LinkSlide("lk/clearview/main/resources/dashboard.svg", Variable.SLIDE_ICON_SIZE, Variable.SLIDE_ICON_SIZE) {
        @Override
        public void setCommand() {
            changeClickPanel(getjPanel1());
            changeView(new lk.clearview.part.osini.panel.ManageStock());
        }

        @Override
        public void initial() {
            setToolTipText("Manage Stock");
        }
    };
    protected LinkSlide slide7 = new LinkSlide("lk/clearview/main/resources/dashboard.svg", Variable.SLIDE_ICON_SIZE, Variable.SLIDE_ICON_SIZE) {
        @Override
        public void setCommand() {
            changeClickPanel(getjPanel1());
            changeView(new lk.clearview.part.osini.panel.GrnAndItems());
        }

        @Override
        public void initial() {
            setToolTipText("Manage GRN and Items");
        }
    };
//  end of osini part
//  start isira part
    protected LinkSlide slide8 = new LinkSlide("lk/clearview/main/resources/dashboard.svg", Variable.SLIDE_ICON_SIZE, Variable.SLIDE_ICON_SIZE) {
        @Override
        public void setCommand() {
            changeClickPanel(getjPanel1());
            changeView(new lk.clearview.part.isira.panel.ManageActivities());
        }

        @Override
        public void initial() {
            setToolTipText("Manage Activities");
        }
    };
    protected LinkSlide slide9 = new LinkSlide("lk/clearview/main/resources/dashboard.svg", Variable.SLIDE_ICON_SIZE, Variable.SLIDE_ICON_SIZE) {
        @Override
        public void setCommand() {
            changeClickPanel(getjPanel1());
            changeView(new lk.clearview.part.isira.panel.ManageStaff());
        }

        @Override
        public void initial() {
            setToolTipText("Manage Staff");
        }
    };
//  end of isira part
//  start dhanushka part
    protected LinkSlide slide10 = new LinkSlide("lk/clearview/main/resources/dashboard.svg", Variable.SLIDE_ICON_SIZE, Variable.SLIDE_ICON_SIZE) {
        @Override
        public void setCommand() {
            changeClickPanel(getjPanel1());
            changeView(new lk.clearview.part.dhanushka.panel.ManagePatient());
        }

        @Override
        public void initial() {
            setToolTipText("Manage Patient");
        }
    };
    protected LinkSlide slide11 = new LinkSlide("lk/clearview/main/resources/dashboard.svg", Variable.SLIDE_ICON_SIZE, Variable.SLIDE_ICON_SIZE) {
        @Override
        public void setCommand() {
            changeClickPanel(getjPanel1());
            changeView(new lk.clearview.part.dhanushka.panel.ManageAppointments());
        }

        @Override
        public void initial() {
            setToolTipText("Manage Appointments");
        }
    };
//  end of dhanushka part
//  start of 
//    protected LinkSlide slide12 = new LinkSlide("lk/clearview/main/resources/dashboard.svg", Variable.SLIDE_ICON_SIZE, Variable.SLIDE_ICON_SIZE) {
//        @Override
//        public void setCommand() {
//            changeClickPanel(getjPanel1());
//            changeView();
//        }
//
//        @Override
//        public void initial() {
//            setToolTipText("Manage Appointments");
//        }
//    };
//    protected LinkSlide slide13 = new LinkSlide("lk/clearview/main/resources/dashboard.svg", Variable.SLIDE_ICON_SIZE, Variable.SLIDE_ICON_SIZE) {
//        @Override
//        public void setCommand() {
//            changeClickPanel(getjPanel1());
//            changeView();
//        }
//
//        @Override
//        public void initial() {
//            setToolTipText("Manage Appointments");
//        }
//    };
//    protected LinkSlide slide14 = new LinkSlide("lk/clearview/main/resources/dashboard.svg", Variable.SLIDE_ICON_SIZE, Variable.SLIDE_ICON_SIZE) {
//        @Override
//        public void setCommand() {
//            changeClickPanel(getjPanel1());
//            changeView();
//        }
//
//        @Override
//        public void initial() {
//            setToolTipText("Manage Appointments");
//        }
//    };

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        init();
        init2();
        DASHBOARD = this;
//        changeView(new DashboardPanel());
        changeClickPanel(slide1.getjPanel1());
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
        setSlide();
        setTheme2();
    }

    private void loadSide() {
        slider.setLayout(new BoxLayout(slider, BoxLayout.Y_AXIS));
        slider.add(slide1);
        slider.add(slide2);
        slider.add(slide3);
        slider.add(slide4);
        slider.add(slide5);
        slider.add(slide6);
        slider.add(slide7);
        slider.add(slide8);
        slider.add(slide9);
        slider.add(slide10);
        slider.add(slide11);
//        slider.add(slide12);
//        slider.add(slide13);
//        slider.add(slide14);

    }

    private void setSlide() {
        Variable.LINK_SLIDER_ARRAY[0] = slide1.getjPanel1();
        Variable.LINK_SLIDER_ARRAY[1] = slide2.getjPanel1();
        Variable.LINK_SLIDER_ARRAY[2] = slide3.getjPanel1();
        Variable.LINK_SLIDER_ARRAY[3] = slide4.getjPanel1();
        Variable.LINK_SLIDER_ARRAY[4] = setting_panel;
        Variable.LINK_SLIDER_ARRAY[5] = slide5.getjPanel1();
        Variable.LINK_SLIDER_ARRAY[6] = slide6.getjPanel1();
        Variable.LINK_SLIDER_ARRAY[7] = slide7.getjPanel1();
        Variable.LINK_SLIDER_ARRAY[8] = slide8.getjPanel1();
        Variable.LINK_SLIDER_ARRAY[9] = slide9.getjPanel1();
        Variable.LINK_SLIDER_ARRAY[10] = slide10.getjPanel1();
        Variable.LINK_SLIDER_ARRAY[11] = slide11.getjPanel1();

    }

    public void setPanelColor(JPanel... panels) {
        for (JPanel panel1 : panels) {
            panel1.setBackground(UIManager.getColor("CUSTOM_BACKGROUND"));
        }
    }

    //load colors panel at click
    public void changeClickPanel(JPanel panel1) {
        for (int i = 0; i < Variable.LINK_SLIDER_ARRAY.length; i++) {
            if (Variable.LINK_SLIDER_ARRAY[i] == panel1) {
                panel1.setBackground(UIManager.getColor("CLICK_COLOR"));
            } else {
                LookAndFeel theme = UIManager.getLookAndFeel();
                if (theme.getClass().getSimpleName().equals("FlatMacDarkLaf")) {
                    Variable.LINK_SLIDER_ARRAY[i].setBackground(Variable.DARK_BACKGROUND_COLOR);
                } else {
                    Variable.LINK_SLIDER_ARRAY[i].setBackground(Variable.LIGHT_BACKGROUND_COLOR);
                }
            }
        }
        if (panel1 == setting_panel) {
            setting_panel.setBackground(UIManager.getColor("CLICK_COLOR"));
        } else {
            setting_panel.setBackground(UIManager.getColor("CUSTOM_BACKGROUND"));
        }
    }

    public void initial() {
    }

    private void init2() {
        UIManager.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                setTheme2();
            }
        });
    }

    public void setTheme2() {
        LookAndFeel theme = UIManager.getLookAndFeel();
        if (theme.getClass().getSimpleName().equals("FlatMacDarkLaf")) {
            jPanel1.setBackground(Variable.BASE_DARK_BACKGROUND_COLOR);
        } else {
            jPanel1.setBackground(Variable.BASE_LIGHT_BACKGROUND_COLOR);
        }
    }

    private void click() {

    }

    private void setDashboard() {
//        JPanel panel = slide1.getjPanel1();
//        changeClickPanel(panel);
    }

    private void setTheme() {

        jPanel2.setBackground(UIManager.getColor("CUSTOM_BACKGROUND"));
        setting_panel.setBackground(UIManager.getColor("CUSTOM_BACKGROUND"));
        theme_panel.setBackground(UIManager.getColor("CUSTOM_BACKGROUND"));
        slider.setBackground(UIManager.getColor("CUSTOM_BACKGROUND"));

        theme.setIcon(new FlatSVGIcon(UIManager.getString("THEME"), 15, 15));
        logo.setIcon(new FlatSVGIcon(UIManager.getString("LOGO"), 42, 23));

        setDashboard();

    }

    public void changeView(JPanel viewPanel) {
        panelHolder.removeAll();
        panelHolder.add(viewPanel, BorderLayout.CENTER);
        SwingUtilities.updateComponentTreeUI(panelHolder);
        panelHolder.putClientProperty(FlatClientProperties.STYLE, "arc:15");
    }

    public void changeTheme() {
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
        changeView(new ThemePanel());
    }

    public void resetLayout() {
        repaint();
        revalidate();
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
        panelHolder = new javax.swing.JLayeredPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        roundPanel1 = new lk.clearview.main.components.RoundPanelFix();
        jScrollPane1 = new javax.swing.JScrollPane();
        slider = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        setting_panel = new javax.swing.JPanel();
        setting_label = new javax.swing.JLabel();
        setting = new javax.swing.JLabel();
        theme_panel = new javax.swing.JPanel();
        theme = new javax.swing.JLabel();
        theme_label = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel7 = new javax.swing.JPanel();
        theme_panel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clear View");
        setMinimumSize(new java.awt.Dimension(858, 612));

        panelHolder.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 387, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 132, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 133, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(127, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(185, 185, 185))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(141, 141, 141))))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        panelHolder.add(jPanel3, java.awt.BorderLayout.CENTER);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(59, 112));

        javax.swing.GroupLayout sliderLayout = new javax.swing.GroupLayout(slider);
        slider.setLayout(sliderLayout);
        sliderLayout.setHorizontalGroup(
            sliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 324, Short.MAX_VALUE)
        );
        sliderLayout.setVerticalGroup(
            sliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(slider);

        setting_panel.setToolTipText("Settings");
        setting_panel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setting_panel.setMaximumSize(new java.awt.Dimension(50, 50));
        setting_panel.setMinimumSize(new java.awt.Dimension(50, 50));
        setting_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setting_panelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                setting_panelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                setting_panelMouseExited(evt);
            }
        });

        setting_label.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 12)); // NOI18N
        setting_label.setText("Setting");

        setting.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout setting_panelLayout = new javax.swing.GroupLayout(setting_panel);
        setting_panel.setLayout(setting_panelLayout);
        setting_panelLayout.setHorizontalGroup(
            setting_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setting_panelLayout.createSequentialGroup()
                .addComponent(setting, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(setting_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        setting_panelLayout.setVerticalGroup(
            setting_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(setting, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, setting_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(setting_label, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        theme_panel.setToolTipText("Change Theme");
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

        theme_label.setFont(new java.awt.Font("Josefin Sans SemiBold", 0, 12)); // NOI18N
        theme_label.setText("Theme");

        javax.swing.GroupLayout theme_panelLayout = new javax.swing.GroupLayout(theme_panel);
        theme_panel.setLayout(theme_panelLayout);
        theme_panelLayout.setHorizontalGroup(
            theme_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(theme_panelLayout.createSequentialGroup()
                .addComponent(theme, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(theme_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        theme_panelLayout.setVerticalGroup(
            theme_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(theme, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, theme_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(theme_label, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(setting_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(theme_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(theme_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(setting_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        theme_panel1.setToolTipText("Change Theme");
        theme_panel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        theme_panel1.setMaximumSize(new java.awt.Dimension(50, 50));
        theme_panel1.setMinimumSize(new java.awt.Dimension(50, 50));
        theme_panel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                theme_panel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                theme_panel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                theme_panel1MouseExited(evt);
            }
        });
        theme_panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Josefin Sans", 0, 20)); // NOI18N
        jLabel1.setText("Clear");
        theme_panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 6, -1, -1));

        jLabel2.setFont(new java.awt.Font("Josefin Sans", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 113, 242));
        jLabel2.setText("View");
        theme_panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 6, -1, -1));

        jLabel3.setFont(new java.awt.Font("Josefin Sans", 0, 12)); // NOI18N
        jLabel3.setText("Senesh Pawan");
        theme_panel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 24, 110, 20));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoMouseClicked(evt);
            }
        });
        theme_panel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 0, 40, 40));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(theme_panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(theme_panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jSeparator4)
                        .addGap(8, 8, 8))
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(panelHolder)
                .addGap(12, 12, 12))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
                    .addComponent(panelHolder))
                .addGap(12, 12, 12))
        );

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setting_panelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setting_panelMouseEntered
        // Mouse Enter
        if (setting_panel.getBackground().equals(Variable.LIGHT_BACKGROUND_COLOR) || setting_panel.getBackground().equals(Variable.DARK_BACKGROUND_COLOR)) {
            setting_panel.setBackground(UIManager.getColor("MOUSE_ENTER_BACKGROUND_COLOR"));
        }
    }//GEN-LAST:event_setting_panelMouseEntered

    private void setting_panelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setting_panelMouseExited
        // Mouse Exist
        if (setting_panel.getBackground().equals(UIManager.getColor("MOUSE_ENTER_BACKGROUND_COLOR"))) {
            setting_panel.setBackground(UIManager.getColor("MOUSE_EXIT_BACKGROUND_COLOR"));
        }
    }//GEN-LAST:event_setting_panelMouseExited

    private void theme_panelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_theme_panelMouseEntered
        // Mouse Enter
        theme_panel.setBackground(UIManager.getColor("MOUSE_ENTER_BACKGROUND_COLOR"));
    }//GEN-LAST:event_theme_panelMouseEntered

    private void theme_panelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_theme_panelMouseExited
        // Mouse Exit
        theme_panel.setBackground(UIManager.getColor("MOUSE_EXIT_BACKGROUND_COLOR"));
    }//GEN-LAST:event_theme_panelMouseExited

    private void theme_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_theme_panelMouseClicked
        // ChanageTheme
        changeTheme();
    }//GEN-LAST:event_theme_panelMouseClicked

    private void setting_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setting_panelMouseClicked
        // TODO add your handling code here:
        changeClickPanel(setting_panel);
        changeView(new lk.clearview.main.panel.ProfileSettings());
    }//GEN-LAST:event_setting_panelMouseClicked

    private void logoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoMouseClicked
        // Logo Mouse Clicked
        if (roundPanel1.getWidth() < Variable.SLIDE_COLLAPS_WIDTH) {
            expan();
        } else {
            collaps();
        }
//        System.out.println(roundPanel1.getWidth());
    }//GEN-LAST:event_logoMouseClicked

    private void theme_panel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_theme_panel1MouseClicked
        // Logo Panel
        if (roundPanel1.getWidth() < Variable.SLIDE_COLLAPS_WIDTH) {
            expan();
        } else {
            collaps();
        }
//        System.out.println(roundPanel1.getWidth());
    }//GEN-LAST:event_theme_panel1MouseClicked

    private void theme_panel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_theme_panel1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_theme_panel1MouseEntered

    private void theme_panel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_theme_panel1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_theme_panel1MouseExited

    public void clickColorAccurate() {
        for (javax.swing.JPanel panel1 : Variable.LINK_SLIDER_ARRAY) {
            if (panel1.getBackground().equals(UIManager.getColor("CLICK_COLOR"))) {
                for (int i = 0; i < Variable.LINK_SLIDER_ARRAY.length; i++) {
                    if (Variable.LINK_SLIDER_ARRAY[i] == panel1) {
                        panel1.setBackground(UIManager.getColor("CLICK_COLOR"));
                    } else {
                        LookAndFeel theme = UIManager.getLookAndFeel();
                        if (theme.getClass().getSimpleName().equals("FlatMacDarkLaf")) {
                            Variable.LINK_SLIDER_ARRAY[i].setBackground(Variable.DARK_BACKGROUND_COLOR);
                        } else {
                            Variable.LINK_SLIDER_ARRAY[i].setBackground(Variable.LIGHT_BACKGROUND_COLOR);
                        }
                    }
                }
            }
        }
    }

    public void expan() {
//        [74, 582]
        // Timer with 1 ms delay
        Timer timer = new Timer(1, e -> {
            // The target width you want to animate to
            int targetWidth = Variable.SLIDE_COLLAPS_WIDTH;

            // Get the current width of the panel
            int currentWidth = roundPanel1.getPreferredSize().width;

            // Animate by incrementing the width
            if (currentWidth < targetWidth) {
                currentWidth += 5;  // Increase width by 2 pixels
                roundPanel1.setPreferredSize(new Dimension(currentWidth, roundPanel1.getHeight()));
//                clickColorAccurate();
                SwingUtilities.updateComponentTreeUI(roundPanel1);  // Update the panel size
            } else {
                ((Timer) e.getSource()).stop();  // Stop the timer once the target width is reached
            }
        });

        // Start the timer
        timer.start();

    }

    public void collaps() {
        // Timer with 1 ms delay
        Timer timer = new Timer(1, e -> {
            // The target width you want to animate to
            int targetWidth = Variable.SLIDE_WIDTH;

            // Get the current width of the panel
            int currentWidth = roundPanel1.getPreferredSize().width;

            // Animate by decrementing the width
            if (currentWidth > targetWidth) {
                currentWidth -= 5;  // Decrease width by 2 pixels
                roundPanel1.setPreferredSize(new Dimension(currentWidth, roundPanel1.getHeight()));
                SwingUtilities.updateComponentTreeUI(roundPanel1);  // Update the panel size
//                clickColorAccurate();
            } else {
                ((Timer) e.getSource()).stop();  // Stop the timer once the target width is reached
            }
        });

        // Start the timer
        timer.start();
    }

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

        UIManager.put("defaultFont", Variable.DEFAULT_FONT);

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel logo;
    private javax.swing.JLayeredPane panelHolder;
    private lk.clearview.main.components.RoundPanelFix roundPanel1;
    private javax.swing.JLabel setting;
    private javax.swing.JLabel setting_label;
    private javax.swing.JPanel setting_panel;
    private javax.swing.JPanel slider;
    private javax.swing.JLabel theme;
    private javax.swing.JLabel theme_label;
    private javax.swing.JPanel theme_panel;
    private javax.swing.JPanel theme_panel1;
    // End of variables declaration//GEN-END:variables
}
