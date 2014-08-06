/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testpaintcomponent;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author SeAN
 */
public class TestPaintComponent extends JFrame {
    private double scale = 1;
    private int x, y;
    
    
    
    public TestPaintComponent(){
        this.setLayout(new BorderLayout());
        //this.add(new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 1000), BorderLayout.NORTH); 
        
        this.add(new Panel1(), BorderLayout.NORTH);
        this.setTitle(String.format("TestPaintComponent %2.2f ",scale));
        this.setSize((int)(1000*scale), (int)(1000*scale));
        add(new MapPanel(), BorderLayout.CENTER);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TestPaintComponent frame = new TestPaintComponent();
        
        
        
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    class Panel1 extends JPanel{
        Panel1(){
            this.setLayout(new GridLayout(1,2));
            
            //this.add(new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 1000), BorderLayout.NORTH);
            this.setBorder(new LineBorder(Color.BLACK));
            
            this.add(new JButton("ZOOM IN"));
            this.add(new JButton("ZOOM OUT"));
        }
    }
    
    class MapPanel extends JPanel {
        // Sets up arraylist to store POI objects
        private java.util.ArrayList<POI> pts;
        
        private void LoadPOIArray(){
            BufferedReader br;
            String line;
            pts = new java.util.ArrayList<>();
            try{
                // creates a BufferedRaeder to access File with Object data as supplied by ITC313
                br = new BufferedReader(new FileReader("Ass1_Task1_POIs.txt"));

                // loop through the file reading each line
                while ((line = br.readLine()) != null){

                    // breaks the line into parts
                    String[] t1 = line.split("\t");

                    // tests the string to make sure line conforms to data format
                    if (t1.length != 2 ) break;

                    String[] t2 = t1[1].split(",");

                    // tests the string to make sure line conforms to data format
                    if (t2.length != 2) break;

                    pts.add(new POI(Integer.parseInt(t1[0]),Double.parseDouble(t2[0]),Double.parseDouble(t2[1])));
                }

                Iterator it = pts.iterator();

                while (it.hasNext()){
                    System.out.println(it.next());
                }
            }
            catch (IOException e){
                System.err.println( "Error - cant create the file." );
                return;
            }
        }
        
        public MapPanel(){
            LoadPOIArray();
        }
        
        @Override
        protected void paintComponent(Graphics g){
            Font f = new Font("Serif", Font.BOLD, ((int)(12 * scale))) ;
            g.setFont(f);
            super.paintComponent(g);
            Iterator it = pts.iterator();
            while(it.hasNext()){
                POI temp = (POI) it.next();
                int x = (int) (scale * temp.getX());
                int y = (int) (scale * temp.getY());
                
                g.drawString("X", x, y);
            }
        }
    }

}
