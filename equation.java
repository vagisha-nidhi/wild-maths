import greenfoot.*;
import java.util.*;// (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class equation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class equation extends mover
{

private static int i;
    private GreenfootImage image1;
    private GreenfootImage image2;
    private GreenfootImage image3;
    private GreenfootImage image4;
    private GreenfootImage image5;
    private GreenfootImage image6;
     private GreenfootImage image;
      private GreenfootImage image7;
      private GreenfootImage image8;
       private GreenfootImage image9;
       private GreenfootImage image10;
   
  
    /**
     * Act - do whatever the equation wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   public void movingEquation()
     { setLocation(getX()+1,getY()-1)
        ;}
     
     public static int giveRandom()
     {return i;  }
     
    
     public void act() 
     {
       
       // Add your action code here.
        image= new GreenfootImage("smallbackground.png");
        
        setImage(image);
        
         if(random==10) 
        setImage(image);
        
        image1= new GreenfootImage("smallbackground.png");
        image2= new GreenfootImage("equation2.JPG");
        image3= new GreenfootImage("equation3.png");
        image4= new GreenfootImage("equation4.png");
        image5= new GreenfootImage("equation5.png");
        image6= new GreenfootImage("equation6.png");
         image7= new GreenfootImage("equation7.png");
         image8= new GreenfootImage("equation8.png");
          image9= new GreenfootImage("equation9.png");
       image10= new GreenfootImage("equation10.png");
   
        if(random==10) 
        setImage(image);
        
          
        
              if(Greenfoot.isKeyDown("enter"))
               i=starting();
           
                
                if(i==0)
                setImage(image1);
                else if(i==1)
                setImage(image2);
                else if(i==2)
                setImage(image3);
                else if(i==3)
                setImage(image4);
                else if(i==4)
                setImage(image5);
               else if(i==5)
                setImage(image6);
                 else if(i==6)
                setImage(image7);
                 else if(i==7)
                setImage(image8);
                 else if(i==8)
                setImage(image9);
                 else if(i==9)
                setImage(image10);
                
                
                
                if(flag!=0)
             movingEquation();
                
             
            
                
                    if(atWorldEdge())
            {  World W = getWorld();  
W.removeObjects(W.getObjects(equation.class));    }
  
    
}
}
