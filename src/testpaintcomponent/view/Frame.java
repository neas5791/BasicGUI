/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testpaintcomponent.view;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author SeAN
 */
public class Frame extends JFrame{
    
    public Frame(double scale, int dimension){
        
        this.setLayout(new BorderLayout());
        
        this.add(new Panel2(),BorderLayout.WEST);
        this.add(new Panel2(),BorderLayout.EAST);
        this.add(new Panel2(),BorderLayout.SOUTH);
        this.add(new Panel2(), BorderLayout.NORTH);
        this.add(new Panel3(scale, dimension), BorderLayout.CENTER);
        
        this.setTitle(String.format("TestPaintComponent %2.2f ",scale));
        this.setSize((int)(scale * dimension), (int)(scale * dimension));
    }
}
