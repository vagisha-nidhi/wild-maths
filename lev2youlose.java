import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lev2youlose here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lev2youlose extends level2numbers
{public int flag3;
private GreenfootImage imageyoulose;
private GreenfootImage imageback1;
    /**
     * Act - do whatever the lev2youlose wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         imageyoulose=new GreenfootImage("lev2youlose.png");
       imageback1= new GreenfootImage("backnew.png");
    
     
    flag3=mover.lev2countereat();
      
     if(flag3==1)
    { setImage(imageyoulose); 
setLocation(getX()-2,getY()-1);    }
       if(atWorldEdge())
            {  World W = getWorld();  
W.removeObjects(W.getObjects(lev2youlose.class));  
Greenfoot.stop();  }
        

     // Add your action code here.
    }    
}
