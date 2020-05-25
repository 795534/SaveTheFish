import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Ocean World
 * 
 * @author Christina Young, Jessica Yu, Annika Lin
 * @version May 2020
 */
public class Ocean extends World
{

    /**
     * Constructor for objects of class Ocean.
     * 
     */
    public Ocean()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
    }
    /**
     * Populate the world with a fixed scenario of sea creatures.
     */    
    public void populate()
    {
        Dolphin d1 = new Dolphin();
        addObject(d1, 300, 100);
        
        Dolphin d2 = new Dolphin();
        addObject(d2, 100, 100);
        
        Fish f1 = new Fish();
        addObject(f1, 200, 300);
        
        Fish f2 = new Fish();
        addObject(f2, 400, 300);
        
        Fish f3 = new Fish();
        addObject(f3, 500, 300);
        
        Seahorse s1 = new Seahorse();
        addObject(s1, 350, 200);
        
    }   
}
