
/**
 * Write a description of class LineBug here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.actor.*;

import java.awt.Color;

public class LineBug extends Bug
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class LineBug
     */
    public LineBug()
    {
        // initialise instance variables
        setColor(new Color (135, 206, 235));
    }


    public void act()
    {
        if (canMove()){
            move();
        }else{
            //setDirection(getDirection()); //+ Location.HALF_RIGHT);
            turn();
            turn();
            turn();
            turn();
            //turn();
        }
    }
    /*public void move()
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
    }
    */
}
