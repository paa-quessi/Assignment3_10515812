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
 * @author ORIGINAL */
public class GraphicsDemo1 extends Canvas {
    /*
        1)the window is 800 pixels wide and 600 pixels tall
        2)the first value represents position of the rectangle in the x-axis
          the second value represents position of the rectangle in the y-axis
          the third value represents the width of the rectangle
          the fourth value represents the length of the rectangle
        3)the first value represents position of the oval in the x-axis
          the second value represents position of the oval in the y-axis
          the third value represents the width of the oval
          the fourth value represents the length of the oval
        4)The values represent the position of the string in terms of x and y 
          axis
        5)The component that is called last is the one that is drawn on top of 
          the other
    */
    public void paint( Graphics g )
    {
        g.setColor(Color.green);
        g.drawRect(50,20,100,200);  // draw a rectangle
        g.fillOval(160,20,100,200); // draw a filled-in oval
        g.setColor(Color.blue);
        g.fillRect(200,400,200,20); // a filled-in rectangle
        g.drawOval(200,430,200,100);
        
        //Question 6 -> drawing a red square at the lower right part of the window
        g.setColor(Color.red);
        g.fillRect(600, 400, 150, 150);
        
        g.setColor(Color.black);
        g.drawString("Graphics are pretty neat.", 500, 100);
        int x = getWidth() / 2;
        int y = getHeight() / 2;
        g.drawString("The first letter of this string is at (" + x + "," + y + ")", x, y);
    }

    public static void main( String[] args )
    {
        // You can change the title or size here if you want.
        JFrame win = new JFrame("GraphicsDemo1");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GraphicsDemo1 canvas = new GraphicsDemo1();
        win.add( canvas );
        win.setVisible(true);
    }
    
}
