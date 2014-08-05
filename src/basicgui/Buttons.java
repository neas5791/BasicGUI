/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basicgui;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Seaboard
 */
public class Buttons extends JPanel {
    
    public Buttons(){
        
        this.setLayout(new GridLayout(4,3));
        
        for (int i = 1; i < 10; i++){
            this.add(new JButton(String.format("%s",i)));
        }
        
        this.add(new JButton(String.format("%s","START")));
        this.add(new JButton(String.format("%s",0)));
        this.add(new JButton(String.format("%s","STOP")));
    }
}
