import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Seahorse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Seahorse extends Actor
{
    /**
     * Act - do whatever the Seahorse wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(1);
        
        if (getX() <= 5 || getX() >= 595)
        {
            turn(Greenfoot.getRandomNumber(45));
        }
        if (getY() <= 350 || getY() >= 395)
        {
            turn(Greenfoot.getRandomNumber(45));
        }
    }    
}
