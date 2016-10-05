/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guitest;
 import javax.swing.JButton;
import javax.swing.JPanel;
/**
 *
 * @author Adlan Ramly
 */
public class MainPanel extends JPanel{
    MainPanel() {
    JButton blueButton = new JButton("Blue");
    add(blueButton);
    
    JButton redButton = new JButton("Red");
    add(redButton);
    
    JButton robertButton = new JButton("Robert");
    add(robertButton);
    
    JButton philButton = new JButton("Philip");
    add(philButton);
    
    JButton shawnButton = new JButton("Shawn");
    add(shawnButton);
    
    JButton adlanButton = new JButton("Adlan");
    add(adlanButton);
    }
    
}
