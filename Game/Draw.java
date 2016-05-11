/**
 * @(#)Draw.java
 *
 *
 * @author 
 * @version 1.00 2015/5/8
 */
import java.util.Scanner;
import java.awt.*;


public class Draw extends java.applet.Applet implements Runnable {
    
    /** Initialization method that will be called after the applet is loaded
     *  into the browser.
     */
     
     private int width = 500;
     private int height = 500;	 
     
   	private int x = width/2;
   	private int y = height/2;
    	
    public void init() {
    
    	
    	System.out.println("Opened");
       setSize(width,height);
       while(true){
       		System.out.println(x);
       }
       
 
    }
    public void start(){
    	
    	System.out.println("Loading...");
    	Thread thread = new Thread(this);
    	thread.start();
    }
    public void stop(){
    	System.out.println("Exiting..." + "\nExited...");
    }

    public void paint(Graphics g) {
    	setBackground(Color.green);
        g.drawString("Hello",(width+1)/2,(height+1)/2);
        g.drawRect(x,y,20,20);
       
       
    }
    public void run(){
    	while(true){
    		if(x<0){
    			x+=1;
    		}
    		repaint();
    		try{
    			Thread.sleep(17);
    			
    		}
    		catch(InterruptedException e){
    			e.printStackTrace();
    		}
    	}
    }
    
    
   
}