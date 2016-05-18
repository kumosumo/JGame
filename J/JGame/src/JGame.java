/**
 * @(#)JGame.java
 *
 * JGame Applet application
 *
 * @author 
 * @version 1.00 2016/5/11
 */
 
import java.awt.*;
import java.applet.*;

public class JGame extends Applet implements Runnable{
	
	Thread thread = new Thread(this);
	boolean running = true;
	public void init() {
	}
	public void start(){thread.start()
	}
	public void destroy(){}
	public void stop(){}
	public void run(){
		while(running)
		{
			
			try
			{
				thread.sleep(20)
			}
			catch(InterruptedException e)
			{
				System.out.println("Error has Occured");
			}
		}
		}

	public void paint(Graphics g) {
		
		g.drawString("Welcome to Java!!", 50, 60 );
		
	}
}