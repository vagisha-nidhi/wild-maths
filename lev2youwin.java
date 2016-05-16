import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lev2youwin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lev2youwin extends level2numbers
{static int youwincounter;
private GreenfootImage imageyouwin;
private GreenfootImage imageback;
    /**
     * Act - do whatever the lev2youwin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
    imageback= new GreenfootImage("backnew.png");
      imageyouwin= new GreenfootImage("lev2uwin.png");
    
    setImage(imageback);
    youwincounter=lev2counter();
      
     if(youwincounter==1)
     { setImage(imageyouwin);
         
    
 }  // Add your action code here.
       
}}
