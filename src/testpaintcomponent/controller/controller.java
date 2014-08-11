/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testpaintcomponent.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author SeAN
 */
public class controller {
    private double scale = 1.00;
    private int x, y;
    static private int size = 900;

    class ZoomClick implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getActionCommand() == "IN")
                // *setScale(getScale()+0.1);
                System.out.println("You pressed zoom in");
            else if (e.getActionCommand() == "OUT")
                // *setScale(getScale()-0.1);
                System.out.println("You pressed zoom out");
        /*                
            if ( ((JButton) (e.getSource())).getText() == "ZOOM IN"){
                setScale(getScale()-0.1);
            }
            else if ( ((JButton) (e.getSource())).getText() == "ZOOM OUT"){
                setScale(getScale()+0.1);
            }
        */
            // *repaint();
        }
    }
}
