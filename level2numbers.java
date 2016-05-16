import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level2numbers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level2numbers extends mover
{static int lev2flag1=0;
    /**
     * Act - do whatever the level2numbers wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    public boolean lev2numbersee(Class clss) 
    { Actor lev2actor = getOneObjectAtOffset(0, 0,you.class);
    
        return lev2actor != null; 
 
   }
   
public int lev2counter()
{
return lev2flag1;
}
    public void act() 
    {
        // Add your action code here.
    }    
}
