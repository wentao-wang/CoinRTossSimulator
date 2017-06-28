

import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 * Bar class
 * A labeled bar that can serve as a single bar in a bar graph.
 * The text for the label is centered under the bar.
 * 
 * NOTE: we have provided the public interface for this class. Do not change
 * the public interface. You can add private instance variables, constants,
 * and private methods to the class. You will also be completing the
 * implementation of the methods given.
 * 
 */
public class Bar {
private int bot; //instance variable of bottom.
private int lef; //instance variable of left.
private int wid; //instance variable of width.
private int numU; //instance variable of numUnits.
private double unitsPer; //instance variable of unitsPerPixel.
private Color col; //instance variable of color.
private String lab; //instance variable of label.


   
   /**
      Creates a labeled bar.  You give the height of the bar in application
      units (e.g., population of a particular state), and then a scale for how
      tall to display it on the screen (parameter unitsPerPixel). 
  
      @param bottom  location of the bottom of the label
      @param left  location of the left side of the bar
      @param width  width of the bar
      @param numUnits  height of the bar in application units
      @param unitsPerPixel  how many application units per pixel for height
      @param color  the color of the bar
      @param label  the label at the bottom of the bar
   */
   public Bar(int bottom, int left, int width, int numUnits, 
              double unitsPerPixel, Color color, String label) {
	  bot=bottom;
	  lef=left;
	  wid=width;
	  numU=numUnits;
	  unitsPer=unitsPerPixel;
	  col=color;
	  lab=label;
   }
   

   /**
      Draw the labeled bar. 
      @param g2  the graphics context
   */
   public void draw(Graphics2D g2) {
     //draw the rectangle as a bar.
	   Rectangle body =new Rectangle(lef,bot,wid,(int)(numU*unitsPer)); //the coordinate and width and height of the bar.
     g2.setColor(col);
     g2.fill(body);
    
     //draw the string label.
     Font font = g2.getFont();
     g2.setColor(Color.BLACK);
     FontRenderContext context = g2.getFontRenderContext();
     Rectangle2D labelBounds = font.getStringBounds(lab, context);
     int widthOfLabel = (int) labelBounds.getWidth();
     int heightOfLabel = (int) labelBounds.getHeight();
     g2.drawString(lab, (int)(lef-0.25*widthOfLabel),bot+(int)(numU*unitsPer)+heightOfLabel); // the coordinate of the label.
     
   
   }
}

