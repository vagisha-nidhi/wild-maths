import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lev2ins here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lev2ins extends level2numbers
{
    /**
     * Act - do whatever the lev2ins wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if(Greenfoot.isKeyDown("A"))
        {
            getWorld().removeObject(this);
        }// Add your action code here. // Add your action code here.
    }    
}
