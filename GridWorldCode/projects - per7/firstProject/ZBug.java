
/**
 * Write a description of class ZBug here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.actor.*;

import java.awt.Color;

public class ZBug extends Bug
{
    // instance variables - replace the example below with your own
    private int length;
    private Location location;
    private int eastCount = 0;
    private int stepCount = 0;
    /**
     * Constructor for objects of class ZBug
     */
    public ZBug(int length)
    {
        // initialise instance variables
        this.length = length;
        setDirection(Location.EAST);
        setColor(Color.BLACK);
        //moveTo(new Location(20, 20));
    }

    
    public void move(){
        
        if (canMove() && stepCount < length/3){
            move();
            stepCount ++;
        }else{
            if (getDirection() == Location.EAST){
                setDirection(Location.SOUTHWEST);
                eastCount ++;
            }else if (getDirection() == Location.SOUTHWEST){
                setDirection(Location.EAST);
            }
            stepCount = 0;
            
        }
    
    
    }
}
