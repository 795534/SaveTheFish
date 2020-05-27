import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dolphin here.
 * 
 * @Annika (your name) 
 * @1 (a version number or a date)
 */
public class Dolphin extends Actor
{
    private boolean isAlive = true;

    /**
     * Act - do whatever the Dolphin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(isAlive)
        {
            move(2);
            turn(1);
            if(getX() >= 550){
                setLocation(10, getY());
            }    

            if (getY() <= 20)
            {
                turn(30);
            }   
            if (getY() >= 150)
            {
                turn(-30);
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
        setImage("deaddolphin.png");
        Ocean.numAlive--;
    }
}
