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
public class GraphicsDemo3 extends Canvas {
/*
    2)the first value represents the x coordinate of the first point
          the second value represents y coordinate of the first point
      the first value represents the x coordinate of the second point
          the second value represents y coordinate of the second point
    
    4) Upper left corner
    5) the beginning of the string corresponds to the position provided
    6) it throws an error
    7) it throws an error
*/
   public void paint( Graphics g )
    {
        // lines
        g.setColor(Color.green);
        g.drawLine(10,100,400,100);
        
        //question 2
        g.setColor(Color.red);
        g.drawLine(185,75, 300, 120);
        
        g.setColor(Color.blue);
        g.drawLine(50,150,100,180);
        g.setColor(Color.magenta);
        g.drawLine(100,350,300,230);
        
        //question 3
        g.setColor(Color.red);
        g.drawLine(200, 310, 180, 250);

        g.setColor(Color.black);

        // fonts
        g.drawString("Graphics are pretty neat.", 400, 100);
        g.setFont(new Font("Consolas", Font.BOLD, 36)); // 36-pt plain
        g.drawString("Yes, they are.", 400, 200);

        g.setColor(Color.white);
        g.setFont(new Font("Calibri", Font.PLAIN+Font.BOLD, 60)); // 60-pt italic bold
        g.drawString("Leander Lions", 300, 350);

        g.setColor(Color.blue);
        g.setFont(Font.decode("Calibri-PLAINBOLD-60")); // a different way to specify the same font
        g.drawString("Leander Lions", 290, 360);
        
        g.setColor(Color.black);
        g.setFont(new Font(null)); // restore default font

        int x=400, y=490;
        g.drawRect(x,y,150,20);
        g.drawString("Where is the starting point?", x,y);
        g.setColor(Color.red);
        g.drawLine(x,y,x,y);	// drawing a line from a point to itself makes a 1px-by-1px dot

    }

    public static void main( String[] args )
    {
        JFrame win = new JFrame("GraphicsDemo3: Fonts and Lines");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GraphicsDemo3 canvas = new GraphicsDemo3();
        win.add( canvas );
        win.setVisible(true);
    }
    
}
