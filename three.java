import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class three here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class three extends numbers
{ public int ran;
    /**
     * Act - do whatever the three wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
     ran=equation.giveRandom();
         if(ran==5)
      { if(numbersee(you.class))
      { turn(-2);
        Greenfoot.playSound("fanfare.wav");
               flag1=1;
             moving=0;
           simple=0;
           simple1=1;}
    }// Add your action code here.
    }    
}
