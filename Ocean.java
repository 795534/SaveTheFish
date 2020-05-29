import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Ocean World
 * 
 * @author Christina Young, Jessica Yu, Annika Lin
 * @version May 2020
 */
public class Ocean extends World
{
    private GreenfootSound ocean = new GreenfootSound("OceanSounds.mp3");  
    private GreenfootSound music = new GreenfootSound("OceanMusic.mp3");
    private int timer = 0;
    static ArrayList<Trash> trashItems = new ArrayList<Trash>();
    static int numAlive;
    static int numTrash;
    /**
     * Constructor for objects of class Ocean.
     * 
     */
    public Ocean()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);   
        populate();
        ocean.playLoop();
        music.playLoop();
    }
    /**
     * Populate the world with a fixed scenario of sea creatures.
     */    
    public void populate()
    {       
        Dolphin d1 = new Dolphin();
        addObject(d1, 300, 100);
        numAlive++;
        
        Dolphin d2 = new Dolphin();
        addObject(d2, 100, 100);
        numAlive++;
        
        Dolphin d3 = new Dolphin();
        addObject(d3, 200, 100);
        numAlive++;
        
        Fish f1 = new Fish();
        addObject(f1, 200, 300);
        numAlive++;
        
        Fish f2 = new Fish();
        addObject(f2, 400, 300);
        numAlive++;
        
        Fish f3 = new Fish();
        addObject(f3, 500, 300);
        numAlive++;
        
        Seahorse s1 = new Seahorse();
        addObject(s1, 350, 360);
        numAlive++;
        
        Human scuba = new Human(); 
        addObject(scuba, 300, 200);
        
        for (int i=0; i < 5; i++)
        {
            pollute();
        }  
    }
    
    public void act()
    {
        timer++;
        if(timer % 200 == 0)
        {
            pollute();
        }
        //stops the game if all animals die
        if(numAlive == 0)
        {
            Fail fail = new Fail();
            addObject(fail, 300, 200);
            
            Greenfoot.stop();
        }
        if(numTrash == 0)
        {
            Pass pass= new Pass();
            addObject(pass, 300, 200);
            
            Greenfoot.stop();
        }
    }
    
    /**
     * Add more trash 
     */
    public void pollute()
    {
        int randomX = Greenfoot.getRandomNumber(566) + 34;
        int randomY = Greenfoot.getRandomNumber(80);
        Trash newTrash = new Trash(randomX, randomY);
        addObject(newTrash, randomX, randomY);
        numTrash++;
        trashItems.add(newTrash);
        Greenfoot.playSound("BubblesShort.mp3");
    }
    public int trash()
    {
        return numTrash;
    }    
}
