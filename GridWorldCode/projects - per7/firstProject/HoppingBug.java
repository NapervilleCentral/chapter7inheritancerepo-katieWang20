
/**
 * Write a description of class HoppingBug here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.actor.*;

import java.awt.Color;

public class HoppingBug extends Bug
{
    // instance variables - replace the example below with your own
    // if can move, then hop (move 3)
    // if cant, then turns
    
    private int hopLen;

    /**
     * Constructor for objects of class HoppingBug
     */
    
    
    public HoppingBug()
    {
        // initialise instance variables
        //Location loc = new Location();
        
        
        hopLen = 3;
    }
    //dont let the bug noclip out of the walls
    public void act(){
        if (canMove()){
            for (int i = 1; i <= hopLen; i ++){
                move();
            }
        }else{
            turn();
            for (int i = 1; i <= hopLen; i ++){
                move();
            }
        }
    
    
    }
}
