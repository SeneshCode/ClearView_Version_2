/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lk.clearview.main.components;

import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Color;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JPanel;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import lk.clearview.main.constance.Variable;

/**
 *
 * @author USER
 */
public class RoundPanelFix extends JPanel {
    
//    public static Color LIGHT_BACKGROUND_COLOR = new Color(240, 242, 255);
    
    public RoundPanelFix(){
        init();
        this.putClientProperty(FlatClientProperties.STYLE, "arc:15");
    }
//        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

    private void init(){
        setTheme();
        UIManager.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                setTheme();
            }
        });
    }
    public void setTheme() {
        LookAndFeel theme = UIManager.getLookAndFeel();
        if (theme.getClass().getSimpleName().equals("FlatMacDarkLaf")) {
            this.setBackground(Variable.DARK_BACKGROUND_COLOR);
        } else {
            this.setBackground(Variable.LIGHT_BACKGROUND_COLOR);
        }
    }
    
}
