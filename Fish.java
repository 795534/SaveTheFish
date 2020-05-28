import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fish extends Actor
{
    private boolean isAlive = true;

    /**
     * Act - do whatever the Fish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(isAlive)
        {
            move(2);
            if(isAtEdge())
            {
                turnTowards(300, 300);
                GreenfootImage img = getImage();
                img.mirrorVertically();
                setImage(img);
            }
            if (getY() <= 150 || getY() >= 395)
            {
                turn(50);
            }
            if(isTouching(Trash.class))
            {
                turnTowards(getX(), 390);
                move(1);
                setLocation(getX(), 390);
                die();
            }
        }
    }    

    public void die()
    {
        isAlive = false;
        setImage("deadfish.png");
        Ocean.numAlive--;
    }
}
