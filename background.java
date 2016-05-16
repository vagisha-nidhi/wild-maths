import greenfoot.*;
  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class background here.
 * The background firstly contains an instruction box. after removing the box, the player will get an equation on 
 * pressing enter key. Numbers are scattered on the screen. The player needs to get to the right answer without
 * being eaten by the snakes
 * 
 * @author (Vagisha Nidhi) 
 * @version (date of completion=13-12-2012)
 */
public class background extends World
{ public Actor fabequation; 

    /**
     * Constructor for objects of class background.
     * 
     */
    public background()
    {  
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 500, 1); 
        
       
        addObject(new one(),50,375);
        addObject(new two(),400,175);
        addObject(new five(),550,100);
        addObject(new three(),105,120);
        addObject(new four(),225,175);
        addObject(new six(),220,337);
        addObject(new seven(),350,400);
        addObject(new eight(),575,300);
         addObject(new ten(),250,50);
          addObject(new nine(),520,400);
          
       
        addObject(new youlose(),450,275);
        
          fabequation= new equation();
         
          addObject(fabequation,100,220);
          addObject(new enemy(),50,20);
          addObject(new enemy(),200,100);
          addObject(new enemy(),150,195);
          addObject(new enemy(),400,250);
          addObject(new enemy(),350,300);
          addObject(new enemy(),300,350);
          addObject(new enemy(),75,150);
          addObject(new you(),650,100);
           addObject(new youwin(),400,130);
             addObject(new instruction(),350,250);
         
          
         
    }
    public void act()
{
    
    {if(Greenfoot.mouseClicked(null))
         
        Greenfoot.setWorld(new level2world());
        }
    }
}