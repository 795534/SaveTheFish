import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Seahorse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Seahorse extends Actor
{
    private boolean isAlive = true;
    /**
     * Act - do whatever the Seahorse wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(isAlive)
        {
            move(1);       
            if (isAtEdge())
            {
                turnTowards(300, 300);
                getImage().mirrorVertically();
            }
            if(isTouching(Trash.class))
            {
                die();
            }
        }
    }    

    public void die()
    {
        isAlive = false;
        setImage("deadseahorse.png");
        Ocean.numAlive--;
        int xint = getX();
        int yint = getY();  
    }  
}
