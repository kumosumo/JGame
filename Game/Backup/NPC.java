import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.util.Scanner;

public class NPC extends Applet {
    
    Image npc;
    Player p;
    private int size;
    private int y=250;
    private int x=250;
    
    public NPC(Game g){
    	p = new Player();
    	npc = g.getImage(g.getDocumentBase(),"NPC.png");
    }   
    
 	public void update(Game g){
 		collide(g);
 		move();
 		size = p.gtSize();
 		if(npc == null){
 			System.out.println("NPC pic is null");
 		}
 		
 
 	}
 	public void move(){
 		x-=1;
 		y=(x-10)^2;
 		
 	}
	public void collide(Game g){
		if(x<g.getWidth()-g.getWidth())
			x=0;
		if(x>g.getWidth())
			x=g.getWidth();
		if(y<g.getHeight()-g.getHeight())
			y=0;
		if(y>g.getHeight())
			y=g.getHeight();			
	}
    public void paint(Graphics gra,Game g) {
        gra.drawImage(npc,x,y,size,size,g);
        
    }
}