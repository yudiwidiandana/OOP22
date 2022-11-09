import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Captain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Captain extends Actor
{
    /**
     * Act - do whatever the Captain wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveCaptain();
        shootLaser();
        captainCollision();
    }
    public void moveCaptain()
    {
        if(Greenfoot.isKeyDown("W")){
            setLocation(getX(), getY() -4);
        }
        if(Greenfoot.isKeyDown("S")){
            setLocation(getX(), getY() +4);
        }
        if(Greenfoot.isKeyDown("D")){
            setLocation(getX() +4, getY());
        }
        if(Greenfoot.isKeyDown("A")){
            setLocation(getX() -4, getY());
        }
            
    }
    
    int laserTimer = 0;
    public void shootLaser(){
        if (Greenfoot.mouseClicked(null)){
            getWorld().addObject(new Laser(), getX() +5,getY());
            laserTimer = 0;
        }else{
            laserTimer++;
        }
    }
    public void captainCollision(){
        if (isTouching(Enemy.class)){
            
            getWorld().addObject(new Boom(), getX(), getY());
            
            removeTouching(Enemy.class);
            setLocation(54,192);
        }//else if (isAtEdge())
         // getWorld().removeObject(this);
    }
}
