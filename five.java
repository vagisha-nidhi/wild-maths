import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class five here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class five extends numbers
{ public int ran;
    /**
     * Act - do whatever the five wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
     ran=equation.giveRandom();
        if(ran==8)
      { if(numbersee(you.class))
      { turn(-2);
        Greenfoot.playSound("fanfare.wav");
         flag1=1  ;   
          moving=0;
           simple=0;
              simple1=1;
}
    } 
}// Add your action code here.
        
}
