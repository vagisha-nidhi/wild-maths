import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level2equation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level2equation extends mover
{private static int lev2i;
    private GreenfootImage lev2image1;
    private GreenfootImage lev2image2;
    private GreenfootImage lev2image3;
    private GreenfootImage lev2image4;
    private GreenfootImage lev2image5;
     private GreenfootImage lev2image;
        private GreenfootImage lev2image6;
  
    /**
     * Act - do whatever the level2equation wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
      public void movingEquation()
     { setLocation(getX()+1,getY()-1)
        ;}
     
     public static int lev2giveRandom()
     {return lev2i;  }
     
    public void act() 
    {
        lev2image= new GreenfootImage("backnew.png");
        
        setImage(lev2image);
        
        lev2image1= new GreenfootImage("backnew.png");
         lev2image2= new GreenfootImage("level2eq1.png");
        lev2image3= new GreenfootImage("level2eq2.png");
         lev2image4= new GreenfootImage("level2eq3.png");
          lev2image5= new GreenfootImage("level2eq4.png");
         lev2image6= new GreenfootImage("level2eq5.png");
        
        
        
        
        
         if(lev2random==12) 
        setImage(lev2image);
        
          
        
              if(Greenfoot.isKeyDown("enter"))
               lev2i=lev2starting();
                 
             
               
               
              
                else if(lev2i==1)
                setImage( lev2image2);
                else if(lev2i==2)
                setImage( lev2image3);
                  else if(lev2i==3)
                setImage( lev2image4);
                  else if(lev2i==4)
                setImage( lev2image5);
                  else if(lev2i==5)
                setImage( lev2image6);
           
                
                
                
                  
                if(lev2flag!=0)
             movingEquation();
                
             
             
                    if(atWorldEdge())
            {  World W = getWorld();  
W.removeObjects(W.getObjects(level2equation.class));    }
  // Add your action code here.
    }    
}
