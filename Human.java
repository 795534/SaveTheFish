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
    private int trashPicked;
    private GreenfootImage rightScuba;
    private GreenfootImage leftScuba;
    
    public Human()
    {
        rightScuba = new GreenfootImage("rightScuba.png");
        leftScuba = new GreenfootImage("leftScuba.png");
        setImage(rightScuba);
        trashPicked = 0;
    }
    
    public void act() 
    {
        checkKeys();
        lookForTrash();
        checkEdge();
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

    public void lookForTrash()
    {
        for (int i=0; i < Ocean.trashItems.size(); i++)
        {
            int trashXCoor = Trash.getXCoor(Ocean.trashItems.get(i));
            int trashYCoor = Trash.getYCoor(Ocean.trashItems.get(i));
            int xDistance = trashXCoor - this.getX();
            int yDistance = Math.abs(trashYCoor - this.getY());
            if (yDistance < 15)
            {
                if (getImage().equals(leftScuba) && (xDistance <= - 30 && xDistance >= -100))
                {
                   World ocean = getWorld();
                   ocean.removeObject(Ocean.trashItems.get(i));
                   Ocean.trashItems.remove(i);
                   i--;
                   trashPicked++;
                }
                if (getImage().equals(rightScuba) && (xDistance >= 30 && xDistance <= 100))
                {
                   World ocean = getWorld();
                   ocean.removeObject(Ocean.trashItems.get(i));
                   Ocean.trashItems.remove(i);
                   i--;
                   trashPicked++;
                }
            }
        }
    }
    
    public void checkEdge()
    {
        if (getX() == getWorld().getWidth()-1)
        {
            setImage(leftScuba);
        }
        if (getX()==0)
        {
            setImage(rightScuba);
        }
    }

}

