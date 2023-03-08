
/**
 * Write a description of class NBug here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.actor.*;

import java.awt.Color;

public class WBug extends Bug
{
    // instance variables - replace the example below with your own
    private int stepCount = 0;
    private int changeCount = 0;
    int length = 5;
    /**
     * Constructor for objects of class NBug
     */
    public WBug()
    {
        setDirection(Location.SOUTHEAST);
    }

    public void act(){
    
        if (canMove() && stepCount < length && changeCount < 4) {
            move();
            stepCount ++;
        }else{
            
            if (getDirection() == Location.SOUTHEAST && changeCount < 4){
                setDirection(Location.NORTHEAST);
                changeCount ++;
            }else if (getDirection() == Location.NORTHEAST && changeCount < 4){
                setDirection(Location.SOUTHEAST);
                changeCount ++;
                
                
            }
            
            stepCount = 0;
        }
    
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
   
}
