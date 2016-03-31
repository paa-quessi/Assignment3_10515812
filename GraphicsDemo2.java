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
public class GraphicsDemo2 extends Canvas {
  public void paint( Graphics g )
    {
        g.setColor(Color.black);

        g.drawRect(50,20,100,200);  // draw a rectangle
        g.drawOval(160,20,100,200); // draw a filled-in oval

        //arcs
        g.drawArc(270,20,100,200,0,270); // draw an arc that starts at 0 degrees
                                         //   and has an arclength of 270 degrees
        g.drawArc(50,250,150,150,90,180);
        g.drawArc(210,250,150,150,45,90);
        g.fillArc(210,280,150,150,45,90);

        g.setColor(Color.yellow);
        g.fillArc(150,400,150,150,45,270); // chomp
        
        //question 3: drawing the second packman
        g.setColor(Color.pink);
        g.fillArc(300, 450, 75, 75, 225, 270);
        
        
        // custom colors
        Color myOrange = new Color(230,92,0); // amount of red, green, blue in the color
                                              // Each component has a value from 0-255
        g.setColor(myOrange);
        g.fillOval(500,50,150,150);

        Color myGrey = new Color(238,238,238);
        g.setColor(myGrey);
        g.fillOval(550,100,50,50);

        Color myColor=new Color(250,200,150); 
        g.setColor(myColor);
        g.fillOval(500,210,150,150);

        g.setColor(Color.green);
        g.fillOval(500,370,150,150);
        
              g.setColor(Color.black);
        g.setFont(new Font(null));
        for ( int X=0; X<800; X += 50 )
        g.drawString( String.valueOf(X), X, 50 );
        for ( int Y=100; Y<600; Y += 50 )
        g.drawString( String.valueOf(Y), 28, Y );  
    }

    public static void main( String[] args )
    {
        JFrame win = new JFrame("GraphicsDemo2: Arcs and Colors");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GraphicsDemo2 canvas = new GraphicsDemo2();
        win.add( canvas );
        win.setVisible(true);
    }
    
}
