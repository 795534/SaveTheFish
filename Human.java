import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Human here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Human extends Actor
{
    /**
     * Act - do whatever the Human wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed = 5;
    private GreenfootImage rightScuba = new GreenfootImage("rightScuba.png");
    private GreenfootImage leftScuba = new GreenfootImage("leftScuba.png");

    public void act() 
    {
        checkKeys();
    }    
    
    private void checkKeys()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            setImage(rightScuba);
            move(2);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setImage(leftScuba);
            move(-2);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY()+2);
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY()-2);
        }
    }

    
}

