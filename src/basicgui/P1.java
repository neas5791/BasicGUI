/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basicgui;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author SeAN
 */
public class P1 extends JPanel{
    public P1(){
        this.setLayout(new BorderLayout());
        this.add(new JLabel(new ImageIcon("pizza.jpg")));
        this.setBorder(new LineBorder(Color.BLACK,10,true));
    }
}
