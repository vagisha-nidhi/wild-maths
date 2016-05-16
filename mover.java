import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class mover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mover extends Actor
{ public int random=12,flag=0,lev2random=12,lev2flag=0,moving=0,simple=0,simple1=0,simple2=0,stop,movingnew=0;
static int losecounter,lev2losecounter;

    /**
     * Act - do whatever the mover wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
  
  public boolean atWorldEdge()
    {
        if(getX() < 20 || getX() > getWorld().getWidth() - 20)
            return true;
        if(getY() < 20 || getY() > getWorld().getHeight() - 20)
            return true;
        else
            return false;
    }
     public boolean canSee(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        return actor != null;        
    }
    
    public void eat(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        if(actor != null)
        {
            losecounter=losecounter+1;
            getWorld().removeObject(actor);
            lev2losecounter=lev2losecounter+1;
        }
    }
    
    public int starting()
    {
        random=Greenfoot.getRandomNumber(10);
              flag=flag+1; 
              return random;
            }
            public int lev2starting()
    {
        lev2random=Greenfoot.getRandomNumber(6);
              lev2flag=lev2flag+1; 
              return lev2random;
            }
            
            static int countereat()
            { return losecounter;
            }
              
            static int lev2countereat()
            { return lev2losecounter;
            }
            
          
            
            
             public int stop()
             { return movingnew; }
            
            
}

