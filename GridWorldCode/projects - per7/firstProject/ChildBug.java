
/**
 * Write a description of class ChildBug here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.actor.*;

import java.awt.Color;

public class ChildBug extends Bug
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class ChildBug
     */
    public ChildBug()
    {
        setColor(Color.BLUE);
    }
    public void act()
    {
        if (canMove()){
            move();
        }else{
            turn();
            turn();}
    }
    

}
