/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testpaintcomponent.view;

import javax.swing.JFrame;

/**
 *
 * @author Seaboard
 */
public class TaskTwoView extends JFrame{
    public TaskTwoView(double scale, int size){
        this.add(new TaskTwo(scale, size));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double scale = 1.0;
        int size = 900;
        //testpaintcomponent.view.TaskTwo frame = new testpaintcomponent.view.TaskTwo(scale, size);
        //JFrame f = new JFrame();
        TaskTwoView frame = new TaskTwoView(scale,size);
        
        frame.setSize(size+50, size+100);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}
