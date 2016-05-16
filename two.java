import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class two here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class two extends numbers
{  public int ran;
    /**
     * Act - do whatever the two wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        ran=equation.giveRandom();
        if(ran==7)
      { if(numbersee(you.class))
      { turn(-2);
        Greenfoot.playSound("fanfare.wav");
              flag1=1; 
             moving=0;
           simple=0;
           simple1=1;}
    } 
   
  
}
}
