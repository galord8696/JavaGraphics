package GraphicsUnit2;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color; 
import java.awt.Graphics;

public class Shape
{
   //instance variables
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;
	private int xSpeed;
	private int ySpeed;

   /*
    *The constructor is used to initialize all instance variables.
    *The constructor makes the object.
    */
   public Shape(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {
	xPos = x;
	yPos = y;
	width = wid;
	height = ht;
	color = col;
	xSpeed = xSpd;
	ySpeed = ySpd;
		//finish this constructor
   }

      /*
    *The draw method draws the shape on the screen.
    */
   public void draw(Graphics window)
   {
      //window.setColor(getColor());
      //window.fillRect(getxPos(), getyPos(), getWidth(), getHeight());
      
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

   }

   public void draw(Graphics window, Color col)
   {
      window.setColor(col);
      window.fillRect(getxPos(), getyPos(), getWidth(), getHeight());
   }

   public void moveAndDraw(Graphics window)
   {
       setxPos(getxPos()+getxSpeed());
       setyPos(getyPos()+getySpeed());
       draw(window);
   }

   //add in set and get methods for xPos, yPos, xSpeed, and ySpeed

    /**
     * @return the xPos
     */
    public int getxPos() {
        return xPos;
    }

    /**
     * @param xPos the xPos to set
     */
    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    /**
     * @return the yPos
     */
    public int getyPos() {
        return yPos;
    }

    /**
     * @param yPos the yPos to set
     */
    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * @return the xSpeed
     */
    public int getxSpeed() {
        return xSpeed;
    }

    /**
     * @param xSpeed the xSpeed to set
     */
    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    /**
     * @return the ySpeed
     */
    public int getySpeed() {
        return ySpeed;
    }

    /**
     * @param ySpeed the ySpeed to set
     */
    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }
    
        @Override
    public String toString()
    {
         return getxPos()+" "+getyPos()+" "+getWidth()+" "+getHeight()+" "+getColor()+" "+getxSpeed()+" "+getySpeed();
    }
}