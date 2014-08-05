/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basicgui;

import java.awt.GridLayout;
import javax.swing.JFrame;

/**
 *
 * @author SeAN
 */
public class MyFrame  extends JFrame {
    public MyFrame(){
        this.setLayout(new GridLayout(1,2));
        this.setTitle("The Microwave");
        this.setSize(600,300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
