import java.applet.*;
import java.awt.*;


//The following code is written to run the applet window in 500 height and 500 width

/*   <applet code="RotateCircle.java" height=500 width=500>
</applet>   */

public class OvalsDrawing extends Applet 
{

 public void paint(Graphics g)
 {
          // It draws a square with black color 


                   g.setColor(Color.black);
           g.fillRect(15,15,100,100); 
        
         // This loop is running for drawing and rotating the semicircles

        for(int ifor=0;ifor<360;ifor+=25)
       { 
        //It draws gray color arc on the applet
          g.setColor(Color.gray); 
                 g.fillArc(200,25,100,100,ifor,360);

        //I have drawn white arc to give a feel that arc (semi circle) is rotating  
        g.setColor(Color.white);
        g.fillArc(200,25,100,100,ifor,180); 
       }
       }
}
