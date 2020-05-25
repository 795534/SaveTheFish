import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dolphin here.
 * 
 * @Annika (your name) 
 * @1 (a version number or a date)
 */
public class Dolphin extends Actor
{
    /**
     * Act - do whatever the Dolphin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        for (int i =0; i<90; i+=10)
        {
            move(1);
            turn(i);
            if (i==89)
            {
                i=0;
            }   
        }    
        
    }    
}
