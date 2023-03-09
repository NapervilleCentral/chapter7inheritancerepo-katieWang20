
/**
 * Katie Wang
 * 3/8/2022
 * 
 */

import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.actor.*;

import java.awt.Color;


public class DancingBug extends Bug
{
    // instance variables - replace the example below with your own
    private int length = 5;
    private int[] array;
    private int index= 0;
    private int steps = 0;
    int numOfTurns = 0;
    
    /**
     * Constructor for objects of class DancingBug
     */
    public DancingBug(int[] array)
    {
        // initialise instance variables
        this.array = array;
    }

    public void act(){
        
        if (canMove() && steps < 5 && index < array.length) {
            move();
            
            numOfTurns = 0;
            
            steps++;
        }else if (index < array.length && numOfTurns < array[index]){
            turn();
            numOfTurns++;
            
            //steps = 0;
        }else{
            index++;    
            steps = 0;
            //numOfTurns = 0;
            //steps = 0;
        }
        
        
        
        
    }
    
}
