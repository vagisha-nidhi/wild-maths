import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class youlose here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class youlose extends mover
{public int flag3;
private GreenfootImage imageyoulose;
private GreenfootImage imageback1;
    /**
     * Act - do whatever the youlose wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      
        imageyoulose=new GreenfootImage("youlose.PNG");
       imageback1= new GreenfootImage("smallbackground.png");
    
     
    flag3=mover.countereat();
      
     if(flag3==1)
    { setImage(imageyoulose); simple1=1;moving=0;
     setLocation(getX()-2,getY()-1);    } 
       if(atWorldEdge())
            {  World W = getWorld();  
W.removeObjects(W.getObjects(youlose.class));  
Greenfoot.stop();  }
     
    
    
       // Add your action code here.
    }    
}
