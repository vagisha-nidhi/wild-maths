import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class backinstruction here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class backinstruction extends World
{

    /**
     * Constructor for objects of class backinstruction.
     * 
     */
    public backinstruction()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(529, 558, 1); 
    }
    public void act()
     {if(Greenfoot.mouseClicked(null))
         
        Greenfoot.setWorld(new background());
        }
}
