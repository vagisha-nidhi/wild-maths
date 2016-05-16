import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Class.*;
/**
 * Write a description of class youwin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class youwin extends numbers
{static int youwincounter;
private GreenfootImage imageyouwin;
private GreenfootImage imageback;
    /**
     * Act - do whatever the youwin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
     {
    imageback= new GreenfootImage("smallbackground.png");
      imageyouwin= new GreenfootImage("uwin.PNG");
    
    setImage(imageback);
    youwincounter=counter();
      
     if(youwincounter==1)
     { setImage(imageyouwin);
         
         simple=0;    Greenfoot.delay(100);
 } 
       
     
     // Add your action code here.
    }    
}
