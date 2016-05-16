import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class numbers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class numbers extends mover
{static int flag1=0;
    /**
     * Act - do whatever the numbers wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
        public boolean numbersee(Class clss) 
    { Actor actor = getOneObjectAtOffset(0, 0,you.class);
    
        return actor != null; 
 
   }
   
public int counter()
{
return flag1;
}
   
  public boolean atWorldEdge()
    {
        if(getX() < 20 || getX() > getWorld().getWidth() - 20)
            return true;
        if(getY() < 20 || getY() > getWorld().getHeight() - 20)
            return true;
        else
            return false;
    }
    public void act() 
    {
        turn(1);
    }
}
     

