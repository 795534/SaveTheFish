import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fish extends Actor
{
    /**
     * Act - do whatever the Fish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(2);
        if (Greenfoot.getRandomNumber(100) < 5)
        {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (getX() <= 5 || getX() >= 595)
        {
            turn(180);
        }
        if (getY() <= 150 || getY() >= 395)
        {
            turn(180);
        }
    }    
}
