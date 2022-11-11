import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RobotWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RobotWorld extends World
{

    /**
     * Constructor for objects of class RobotWorld.
     * 
     */
    public RobotWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Robot robot = new Robot();
        addObject(robot,94,180);
        Wall wall = new Wall();
        addObject(wall,224,183);
        Block block = new Block();
        addObject(block,425,187);
        Scorepanel scorepanel = new Scorepanel();
        addObject(scorepanel,415,277);
        block.setLocation(428,99);
        scorepanel.setLocation(416,215);
        Pizza pizza = new Pizza();
        addObject(pizza,100,276);
        Home home = new Home();
        addObject(home,290,311);
        wall.setLocation(232,126);
        home.setLocation(236,220);
        home.setLocation(234,278);
        removeObject(home);
        removeObject(pizza);
        removeObject(wall);
        removeObject(scorepanel);
        removeObject(block);
        robot.setLocation(167,179);
    }
}
