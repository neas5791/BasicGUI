/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basicgui;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;

/**
 *
 * @author SeAN
 */
public class MyFrame  extends JFrame {
    public MyFrame(){
        this.setLayout(new GridLayout(2,1));
        setTitle("Frame with components");
        setSize(400,300);
        setLocationRelativeTo(null);
    }
}
