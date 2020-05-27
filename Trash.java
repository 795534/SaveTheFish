import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
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
    private GreenfootImage bottle;
    private GreenfootImage straw;
    private GreenfootImage bag;
    private GreenfootImage rings;
    private ArrayList<GreenfootImage> differentTrash;
    public Trash(int xCoor, int yCoor)
    {
        this.xCoor = xCoor;
        this.yCoor = yCoor;
        bottle = new GreenfootImage("bottle.png");
        straw = new GreenfootImage("straw.png");
        bag = new GreenfootImage("bag.png");
        rings = new GreenfootImage("rings.png");
        differentTrash = new ArrayList<GreenfootImage>();
        differentTrash.add(bottle);
        differentTrash.add(straw);
        differentTrash.add(bag);
        differentTrash.add(rings);
        setImage(differentTrash.get(Greenfoot.getRandomNumber(4)));
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
