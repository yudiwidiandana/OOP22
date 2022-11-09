import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Captain captain = new Captain();
        addObject(captain,54,182);
        Enemy enemy = new Enemy();
        addObject(enemy,735,201);
        enemy.setLocation(737,215);
        captain.setLocation(78,255);
        enemy.setLocation(746,250);
        Laser laser = new Laser();
        addObject(laser,137,258);
        Enemy enemy2 = new Enemy();
        addObject(enemy2,599,146);
        Enemy enemy3 = new Enemy();
        addObject(enemy3,658,360);
        Enemy enemy4 = new Enemy();
        addObject(enemy4,699,76);
        Enemy enemy5 = new Enemy();
        addObject(enemy5,604,311);
        Enemy enemy6 = new Enemy();
        addObject(enemy6,579,418);
        removeObject(laser);
    }

    public void act(){
        spawnEnemy();
    }
    public int timerEnemy = 0;
    public void spawnEnemy(){
        if(timerEnemy==180){
            addObject(new Enemy(Greenfoot.getRandomNumber(4) + 1), 599, Greenfoot.getRandomNumber(400));
            timerEnemy = 0;
        } else{
            timerEnemy++;
        }
    }
}
