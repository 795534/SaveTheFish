import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Trash here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Trash extends Actor
{
    /**
     * Act - do whatever the Trash wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int xCoor;
    private int yCoor;
    public Trash(int xCoor, int yCoor)
    {
        this.xCoor = xCoor;
        this.yCoor = yCoor;
    }
    public void act() 
    {
        moveAround();
    }    
    
    public void moveAround()
    {
        move(2);
        if (Greenfoot.getRandomNumber(100) < 10)
        {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (getX() <= 5 || getX() >= 595)
        {
            turn(180);
        }
        if (getY() <= 5 || getY() >= 395)
        {
            turn(180);
        }
        
    }
    
    public static int getXCoor(Trash trash)
    {
        return trash.getX();
    }
    
    public static int getYCoor(Trash trash)
    {
        return trash.getY();
    }
}
