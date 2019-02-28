package GraphicsUnit1;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.util.*;

public class Shape
{
   //instance variables
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;

   public Shape(int x, int y, int wid, int ht, Color col)
   {
		xPos = x;
                yPos = y;
                width = wid;
                height = ht;
                color = col;
		//finish this constructor
   }


   public void draw(Graphics window)
   {
      window.setColor(color);
      int x[]={xPos, xPos+(int)width/2, xPos+width};
      int y[]={yPos, yPos-height, yPos};
      window.drawPolygon(x, y, 3);
      
      int cx = xPos + (int)width/3;
      int cy = yPos - (int)height/4 * 3;
      int cw = (int)height/4 * 3;
              
      window.drawOval(cx, cy, cw, cw);
      
      int tx = xPos+(int)width/2;
      int ty = yPos-height;
      
      int by = yPos;
      int bx = xPos+(int)width/2;
      
      window.drawLine(tx, ty, bx, by);
      //draw whatever you want
      //    ^
      //  [ :: ]
      //    ()

   }

   //BONUS
   //add in set and get methods for all instance variables

   public String toString()
   {
   	return xPos+" "+yPos+" "+width+" "+height+" "+color;
   }
}