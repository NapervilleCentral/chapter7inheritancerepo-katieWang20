
/**
 * Write a description of class SpiralBug here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.actor.*;

import java.awt.Color;

public class SpiralBug extends Bug
{
    private int length = 0;
    private int a = 0;
    // instance variables - replace the example below with your own
     public SpiralBug()
    {
        // initialise instance variables
        setColor(new Color (135, 206, 235));
    }


    public void act()
    {
        
        if (canMove() && a < length){
            
            move();
            a++;
        }else{
            
            turn();
            turn();
          
            
            a = 0;
            length++;
           
            
        }
    }
    
    /*
    public void move()
    {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        if (gr.isValid(next))
            moveTo(next);
        else
            removeSelfFromGrid();
        Flower flower = new Flower(getColor());
        flower.putSelfInGrid(gr, loc);
    }*/
}
