package GraphicsUnit1;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;
import java.awt.Font;

public class SmileyFace extends Canvas
{
   public SmileyFace()    //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.CYAN);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      smileyFace(window);
   }

   public void smileyFace( Graphics window )
   {
      window.setColor(Color.RED);
      
      window.drawString("SMILEY FACE LAB ", 35, 35);
      
      window.setColor(Color.YELLOW);
      window.fillOval( 210, 100, 400, 400 );
      
      window.setColor(Color.BLACK);
      window.fillOval(300, 200, 50, 80);
      window.fillOval(400, 200, 50, 80);
      
      window.drawArc(280, 350, 150, 50, 180, 180);

		//add more code here


   }
}