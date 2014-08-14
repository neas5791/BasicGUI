/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testpaintcomponent.view;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Seaboard
 */
public class TaskTwoView extends JFrame{
    public TaskTwoView(double scale, int size){
        
        //this.setLayout(new FlowLayout());
        //TaskTwo two = new TaskTwo(scale, size);
        this.add(new TaskTwo(scale, size));
        /*
        this.setLayout(new BorderLayout());
        //this.add(new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 1000), BorderLayout.NORTH); 
        this.add(new Panel2(),BorderLayout.WEST);
        this.add(new Panel2(),BorderLayout.EAST);
        this.add(new Panel2(),BorderLayout.SOUTH);
        this.add(new Panel2(), BorderLayout.NORTH);
        this.add(new Panel3(), BorderLayout.CENTER);
        //this.add(new Panel1(), BorderLayout.NORTH);
        this.setTitle(String.format("TestPaintComponent %2.2f ",scale));
        this.setSize((int)(scale * size), (int)(scale * size));
        //add(new MapPanel(), BorderLayout.CENTER);
        */
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
