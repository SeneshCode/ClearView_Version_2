/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lk.clearview.main.constance;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author USER
 */
public interface Variable {
//  Hard Code Colors
    Color LIGHT_BACKGROUND_COLOR = new Color(255, 255, 255);
    Color DARK_BACKGROUND_COLOR = new Color(38,38,41);
//    Color DARK_BACKGROUND_COLOR = new Color(38,38,41);
    
//    Default Color of default custom panel
    Color LIGHT_DEFAULT_PANEL_BACKGROUND_COLOR = new Color(235,236,236);
    Color DARK_DEFAULT_PANEL_BACKGROUND_COLOR = new Color(42,42,48);
    
    Color BASE_LIGHT_BACKGROUND_COLOR = new Color(234, 236, 251);
    Color BASE_DARK_BACKGROUND_COLOR = new Color(21,21,22);
    
//  Public Variable
    int SLIDE_ICON_SIZE = 15;
//  Slide Panel Array
    JPanel[] LINK_SLIDER_ARRAY = new JPanel[12];
    
}
