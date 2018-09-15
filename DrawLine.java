package applet;

	import java.applet.Applet;
	import java.awt.Color;
	import java.awt.Graphics;
	 
	 
	public class DrawLine extends Applet{
		public void paint(Graphics g){

			g.drawLine(10,10,50,50);
			
			//draw vertical line
			g.drawLine(10,50,10,100);
			
			//draw horizontal line
			g.drawLine(10,10,50,10);
			setcolor(Color.red);
		}
	
	}

