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

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );

      head(window);
      upperBody(window);
      lowerBody(window);
      
     
   }

   public void head( Graphics window )
   {
      window.setColor(Color.RED);
      
      window.setColor(Color.YELLOW);
      window.fillOval( 320, 100, 100, 100 );
      
      window.setColor(Color.BLACK);
      window.fillOval(360, 130, 5, 8);
      window.fillOval(390, 130, 5, 8);
      
      window.drawArc(335, 135, 70, 50, 180, 180);
      
      window.fillOval(375, 155, 6, 6);
   }

   public void upperBody( Graphics window )
   {
       window.setColor(Color.GREEN);
       window.fillRect(327, 220, 90, 90);

       window.drawLine(327, 220, 240, 160);
       
       window.drawLine(417, 220, 504, 160);
       
   }

   public void lowerBody( Graphics window )
   {
       window.setColor(Color.RED);
       window.fillRect(327, 320, 90, 90);
       window.drawLine(417, 410, 504, 470);
       window.drawLine(327, 410, 240, 470);
   }
}