import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemy extends mover
{public static int i,p,thing=0;
    /**
     * Act - do whatever the enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
  
    public void act() 
    {   thing=stop();
          
          if(Greenfoot.isKeyDown("A"))
          moving=1;
          if(moving==1)
         { if(Greenfoot.isKeyDown("enter"))
           simple=1;}
         
           if(simple==1)
           move(1); 
      
       if (Greenfoot.getRandomNumber(100) > 90) {
            turn(Greenfoot.getRandomNumber(90)-45);
        }
        if ( canSee(you.class) ) 
        {
            eat(you.class);
               Greenfoot.playSound("au.wav");
               moving=0;
               simple=0;
       
        }
        
        if(atWorldEdge())
        turn(17);// Add your action code here.
    }    
}
