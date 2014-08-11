/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testpaintcomponent.view;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author SeAN
 */
class Panel3 extends JPanel{
        Panel3(double scale, int dimension){
            this.setLayout(new BorderLayout(5,5));
            this.add(new Panel1(), BorderLayout.NORTH);
            this.add(new MapPanel(scale, dimension), BorderLayout.CENTER);
        }
    }