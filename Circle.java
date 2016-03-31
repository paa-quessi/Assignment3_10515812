/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3_10515812;

import java.awt.*;
import javax.swing.JFrame;

/**
 *
 * @author ORIGINAL
 */
public class Circle extends Canvas {
     public void paint( Graphics g )
    {
        g.setColor(Color.GREEN);
        g.fillOval(150, 150, 400, 400);
    }
    
    public static void main( String[] args )
    {
        JFrame win = new JFrame("Cirlce");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Circle canvas = new Circle();
        win.add( canvas );
        win.setVisible(true);
    } 
    
    
}
