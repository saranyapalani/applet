package swww;
import java.awt.*;  
import java.applet.*;  
public class DisplayImage extends Applet {    
  Image picture;  
  
  public void init() {  
    picture = getImage(getDocumentBase(),"saranyapic.jpg");  
  }  
    
  public void paint(Graphics g) {  
    g.drawImage(picture, 30,30, this);  
  }  
      
  }  

