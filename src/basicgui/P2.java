/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basicgui;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author SeAN
 */
public class P2 extends JPanel {
    public P2(){
        //this.setLayout((new FlowLayout()));
        this.setLayout(new BorderLayout());
        this.add(new JTextField(),BorderLayout.NORTH );
        this.add(new Buttons(), BorderLayout.CENTER);
        
        }
}
