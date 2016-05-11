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
    private int size;
    private int y=300;
    private int x=100;
    private int health = 1000;
    public int getX(){
    	return x;
    }
    public int getY(){
    	return y;
    }
    public NPC(Game g){
   
    	npc = g.getImage(g.getDocumentBase(),"NPC.png");
    }
    public NPC(Game g,int x1,int y1){
    	x = x1;
    	y = y1;
    	npc = g.getImage(g.getDocumentBase(),"NPC.png");
    }   
    
 	public void update(Game g,Player p){ 
 		collide(g);
 		move(p);
 		if(collision(p)){
 			p.setXvec(0);
 			p.setYvec(0);
 		}
 		size = p.gtSize();
 		if(npc == null){
 			System.out.println("NPC pic is null");
 		}
 		
 	}
 	
 	public boolean collision(Player p){
 			
 		int pX = p.getX();
 		int pY = p.getY();
 		if(pX + size > x && pX < x + size && health >0){
 			if(pY + size > y && pY < y + size){
 				System.out.println("collision");
 				return true;
 			}
 		}
 		return false;
 	}
 	public void move(Player p){
 		double VX = 0;
 		double VY = 0;
 		if(y > p.getY() && collision(p)!=true)
 			VY = -1;
 		if(y < p.getY()&& collision(p)!=true)
 			VY = 1;
 		if(x > p.getX()&& collision(p)!=true)
 			VX = -1;
 		if(x < p.getX()&& collision(p)!=true)
 			VX =1;	
 		x += VX;
 		y += VY;
 		
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
        if(health>0)
        	gra.drawImage(npc,x,y,size,size,g);
        
    }
}