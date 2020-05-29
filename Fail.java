import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fail here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fail extends Actor
{
    /**
     * Act - do whatever the Fail wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        GreenfootImage img = new GreenfootImage(200, 200);
        img.drawString("Too Much Pollution. Game Over.", 10, 60);
        Greenfoot.playSound("loseSound.mp3");
        img.scale(500,500);
        setImage(img);
    }    
}
