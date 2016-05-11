import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.util.Scanner;


public class Player extends Applet implements KeyListener{

	Game g = new Game();
	public Player(){
		
	}
	
	Image p0;
 	Image p1;
	Image p2; 
	Image p3;
	Image p4;
	Image p5;
	Image p6;
	Image p7;
	Scanner kb;
	String rst;
	
	//Image[] p = new Image[8];
	public Player(Game g){	
	 
	p0 = g.getImage(g.getDocumentBase(),"download0.jpg");
	p1 = g.getImage(g.getDocumentBase(),"download1.jpg");
	p2 = g.getImage(g.getDocumentBase(),"download2.jpg");
	p3 = g.getImage(g.getDocumentBase(),"download3.jpg");
	p4 = g.getImage(g.getDocumentBase(),"download4.jpg");
	p5 = g.getImage(g.getDocumentBase(),"download5.jpg");
	p6 = g.getImage(g.getDocumentBase(),"download6.jpg");
	p7 = g.getImage(g.getDocumentBase(),"download7.jpg");

	
	getpImg();
	
	}
	public void update(Game g){
		
		addKeyListener(this);
		x += Xvec;
		y += Yvec;
		collide(g);
		if(getpImg() == null){
			System.out.println("null");
		}
		
	}

	private int Xvec = 0;
	private int Yvec = 0;
	private int space = 0;
	private int x = g.getWidth()/2;
	private int y = g.getHeight()/2;
	private int size = 70;
	
	public boolean shank(NPC npc){
		return false;
	}
	public void collide(Game g){
		if(x<g.getWidth()-g.getWidth())
			x=0;
		if(x>=g.getWidth()-size)
			x=g.getWidth()-size;
		if(y<g.getHeight()-g.getHeight())
			y=0;
		if(y>=g.getHeight()-size)
			y=g.getHeight()-size;			
	}
	public int gtSize(){
		return size;
	}
	public int getX(){
		return  x;
	}
	public int getY(){
		return y;
	}
	public void setX(int pX){
		x = pX;
	}
	public void setY(int pY){
		y = pY;
	}
	public void setXvec(int pX){
		Xvec = Yvec*-pX;
	}
	public void setYvec(int pY){
		Yvec = Yvec*-pY;
	}
	public void res(){
		
	   x=g.getWidth()/2;
	   y=g.getHeight()/2;
	}	
	public Image getpImg(){
		
		if(Xvec<0 && Yvec>0)
			return p4;
		if(Xvec>0 && Yvec>0)
			return p5;
		if(Yvec<0 && Xvec>0)
			return p6;
		if(Yvec<0 && Xvec<0)
			return p7;			
		if(Xvec>0)
			return p1;
	    if (Xvec<0)
			return p3;
		if (Yvec>0)
			return p2;
		if (Yvec<0)
			return p0;		
		else 
			return p2;		
	}
	public void keyTyped(KeyEvent e){
		
	}
	
	public void keyPressed(KeyEvent e){
		
		switch(e.getKeyCode()){
			case KeyEvent.VK_LEFT:{
				System.out.println("Left is pressed.");
				Xvec = -5;
				
				break;	
			}
			case KeyEvent.VK_RIGHT:{
				System.out.println("Right is pressed.");
				Xvec = 5;
				
				break;
			}
			case KeyEvent.VK_UP:{
				System.out.println("Up is pressed.");
				Yvec = -5;
				
				break;	
			}
			case KeyEvent.VK_DOWN:{
				System.out.println("Down is pressed.");
				Yvec = 5;
				
				break;
			}
			case KeyEvent.VK_SPACE:{
				System.out.println("Spaced is pressed.");
				space = 1;
				break;
			}
			
		}
		
	}
	
	
	public void keyReleased(KeyEvent e){
		switch(e.getKeyCode()){
		case KeyEvent.VK_LEFT:{
			Xvec = 0;
			break;	
		}
		case KeyEvent.VK_RIGHT:{
			Xvec = 0;
			break;
		}
		case KeyEvent.VK_UP:{
			Yvec = 0;
			break;	
		}
		case KeyEvent.VK_DOWN:{
			Yvec = 0;
			break;
		}
		case KeyEvent.VK_SPACE:{
			space = 0;
			break;
		}
	}

	}

	public void paint(Graphics g,Game e){
		g.drawImage(getpImg(),x,y,size,size,e);

	}
	
}
	

