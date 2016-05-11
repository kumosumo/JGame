
import java.awt.*;
import java.applet.Applet;

public class get extends java.applet.Applet {
    
    Image plyr;
   
    public void init() {
       plyr = getImage(getDocumentBase(),"download0.jpg");
       if(plyr == null){
       	System.out.println("Plyr is Null");
       }
    }

    public void paint(Graphics g) {
        g.drawImage(plyr,200,200,this);
    }
}