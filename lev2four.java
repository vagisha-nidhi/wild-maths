import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lev2four here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lev2four extends level2numbers
{public int ran;
    /**
     * Act - do whatever the lev2four wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        ran=level2equation.lev2giveRandom();
        if(ran==2)
      { if(lev2numbersee(you.class))
      { turn(-2);
        Greenfoot.playSound("fanfare.wav");
           lev2flag1=1;  
         Greenfoot.stop();}
    }// Add your action code here.
    }    
}
