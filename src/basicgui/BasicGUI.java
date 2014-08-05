/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basicgui;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author SeAN
 */
public class BasicGUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyFrame myframe = new MyFrame();
        P1 p1 = new P1();
        P2 p2 = new P2();
        
        
        
        
        
        JButton firstBtn = new JButton("First Button");
        JButton secondBtn = new JButton("Second Button");
        JButton thirdBtn = new JButton("Third Button");
        JButton fourthBtn = new JButton("Fourth Button");
        
        
        p1.add(firstBtn);
        p1.add(secondBtn);
        
        p2.add(thirdBtn);
        p2.add(fourthBtn);
        
        myframe.add(p1);
        myframe.add(p2);
        
        //myframe.add(firstBtn);
        //myframe.add(secondBtn);
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe.setVisible(true);
    }
    
}
