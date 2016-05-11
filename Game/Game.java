import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.imageio.ImageIO;
import java.awt.Graphics2D;
import java.awt.Image;


public class Game extends Applet implements Runnable{
	Thread thread = new Thread(this);
	boolean run = true;
	
	Image dbimg;
	Graphics dbg;
	
	private int width = 500,height = 500;
	Player p;
	NPC npc;
	NPC npc2;
	public int getWidth(){
		return width;
	}
	public int getHeight(){
		return height;
	}
	public void init(){
		setSize(width,height);
	 p = new Player(this);
	 npc = new NPC(this);
	 npc2 = new NPC(this,50,50);
	 addKeyListener(p);
	 
	}
	public void update(Graphics g){
		dbimg = createImage(getWidth(),getHeight());
		dbg =dbimg.getGraphics();
		paint(dbg);
		g.drawImage(dbimg,0,0,this);
		
	}
	public void start(){thread.start();
	System.out.println("Opened.");

	}
	public void destry(){run = false;}
	public void stop(){run = false;}
	
	public void run(){
		while(run){
			p.update(this);
			npc.update(this,p);
			npc2.update(this,p);
			repaint();
			try{
				thread.sleep(15);
			}
			catch(InterruptedException e){
				System.out.println("Error");
			}
		}
	}
	
	public void paint(Graphics g){
		p.paint(g,this);
		npc.paint(g,this);
		npc2.paint(g,this);
		
		
	}
}
