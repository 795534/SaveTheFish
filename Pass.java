import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pass extends Actor
{
    /**
     * Act - do whatever the Pass wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        GreenfootImage img = new GreenfootImage(200, 200);
        Greenfoot.playSound("winSound.wav");
        img.drawString("You Saved the Oean!", 50, 60);
        img.scale(500,500);
        setImage(img);
    }    
}
