import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level2world here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level2world extends World
{

    /**
     * Constructor for objects of class level2world.
     * 
     */
    public level2world()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 500, 1); 
        addObject(new lev2zero(),100,60);
        addObject(new lev2four(),550,250);
        addObject(new lev2one(),550,100);
        addObject(new lev2three(),350,80);
        addObject(new lev2eight(),320,377);
         addObject(new lev2five(),150,450);
          addObject(new lev2six(),100,211);
           addObject(new lev2two(),300,211);
             addObject(new lev2nine(),600,420);
      
         
     
           
       
           
        addObject(new you(),445,100);
         addObject(new level2equation(),100,350);
         
         
            addObject(new enemy(),50,20);
          addObject(new enemy(),200,100);
          addObject(new enemy(),150,195);
          addObject(new enemy(),400,250);
          addObject(new enemy(),350,300);
          addObject(new enemy(),300,350);
          addObject(new enemy(),75,150);
             addObject(new lev2youlose(),600,470); 
             addObject(new lev2youwin(),400,200); 
            addObject(new lev2ins(),350,250); 
        }
}
