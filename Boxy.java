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
public class Boxy extends Canvas{
    /************************************************************************************
 **                  B O X Y  1 - make them manually                               **
 ***********************************************************************************/
	public void paint( Graphics window )
	{
		// this code draws a 100x100 box in blue at (200,300)
		window.setColor(Color.BLUE);
		window.fillRect(200,300,100,100);
		// this code "erases" the center of the box by painting over it in white
		window.setColor(Color.WHITE);
		window.fillRect(210,310,80,80);
		
		// draw three more boxes -- different colors, different places
                window.setColor(Color.red);
		window.fillRect(500,300,100,100);
                window.setColor(Color.WHITE);
		window.fillRect(510,310,80,80);
                
                window.setColor(Color.GREEN);
		window.fillRect(100,100,100,100);
                window.setColor(Color.WHITE);
		window.fillRect(110,110,80,80);
                
                window.setColor(Color.YELLOW);
		window.fillRect(400,400,100,100);
                window.setColor(Color.WHITE);
		window.fillRect(410,410,80,80);
	}

	public static void main( String[] args )
	{
		Boxy canvas = new Boxy();
		JFrame win = new JFrame("Boxy1 - make them manually");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		canvas.setBackground(Color.WHITE);
		win.add( canvas );
		win.setVisible(true);
	}
}
    

