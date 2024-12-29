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
public class RoundDefaultPanel extends JPanel {
    
//    public static Color LIGHT_BACKGROUND_COLOR = new Color(240, 242, 255);
    
    public RoundDefaultPanel(){
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
            this.setBackground(Variable.DARK_DEFAULT_PANEL_BACKGROUND_COLOR);
        } else {
            this.setBackground(Variable.LIGHT_DEFAULT_PANEL_BACKGROUND_COLOR);
        }
    }
    
}
