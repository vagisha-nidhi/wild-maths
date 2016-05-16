import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class you here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class you extends Actor
{ static int a,b;
    /**
     * Act - do whatever the you wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       checkkeys();
       
        
    }
   public void checkkeys()
   { if(Greenfoot.isKeyDown("up"))
   setLocation(getX(),getY()-2);
   if(Greenfoot.isKeyDown("down"))
   setLocation(getX(),getY()+2);
       if(Greenfoot.isKeyDown("left"))
        setLocation(getX()-2,getY());
       if(Greenfoot.isKeyDown("right"))
        setLocation(getX()+2,getY());
       
       a=getX();
       b=getY();
    }
   
}
