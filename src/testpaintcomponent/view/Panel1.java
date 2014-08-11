/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testpaintcomponent.view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author SeAN
 */
class Panel1 extends JPanel{
        private JButton in;
        private JButton out;
        //(1) Petrol station, (2) Taxi Stand, (3) ATM, (4) Hospital and (5) Shopping centre
        private JCheckBox Petrol, Taxi, ATM, Hospital, Shopping;
        
        Panel1(){
            in = new JButton("ZOOM IN");
            in.setActionCommand("IN");
            out = new JButton("ZOOM OUT");
            out.setActionCommand("OUT");
            Petrol = new JCheckBox("Petrol");
            Taxi = new JCheckBox("Taxi Rank");
            ATM = new JCheckBox("ATM");
            Hospital = new JCheckBox("Hospital");
            Shopping = new JCheckBox("Shopping Centre");
            
            this.setLayout(new GridLayout(2,6));
            
            //this.add(new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 1000), BorderLayout.NORTH);
            this.setBorder(new LineBorder(Color.GREEN));
            this.add(Petrol);
            this.add(Taxi);
            this.add(ATM);
            this.add(Hospital);
            this.add(Shopping);
            
            this.add(in);
            this.add(new JPanel());
            this.add(new JPanel());
            this.add(new JPanel());
            this.add(out);
            
            /* moove these to controller class*/
            /*this.addZoomListener(new TestPaintComponent.ZoomClick());*/
        }
        public void addZoomListener (ActionListener listenForZoom){
            in.addActionListener(listenForZoom);
            out.addActionListener(listenForZoom);
        }
    }