package applet;
	 import java.awt.*;
	 import java.applet.*;

	 public class centerCircle extends Applet
	 {
	      public void paint(Graphics g){
	           Dimension d = getSize();
	           int x = d.width/2;
	           int y = d.height/2;
	           int radius = (int) ((d.width < d.height) ? 0.4 * d.width : 0.4 * d.height);
	           g.setColor(Color.red);
	           g.fillOval(x-radius, y-radius, 2*radius, 2*radius);
	           g.setColor(Color.red);
	           g.drawString("Width   = "+d.width,10,10);
	           g.drawString("Height = "+d.height,10,20);
	        }
	 }



