/* 
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Cay Horstmann
 */
// 

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;

/**
 * This class runs a world that contains a bug and a rock, added at random
 * locations. Click on empty locations to add additional actors. Click on
 * populated locations to invoke methods on their occupants. <br />
 * To build your own worlds, define your own actors and a runner class. See the
 * BoxBugRunner (in the boxBug folder) for an example. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class BugRunner

{
    public static void main(String[] args)
    {
        int[] array = {2, 9, 6, 1, 10, 13, 19, 6, 48, 10, 7, 34, 78, 7, 14, 20, 1, 24, 10, 12, 6, 29, 4, 56};
        
        ActorWorld world = new ActorWorld();
        //world.add(new ChildBug());
        
        
        //world.add(new SpiralBug());
        //world.add(new Bug());
        //world.add(new Rock());
        
        //world.add(new ZBug(5));
        
        //world.add(new WBug());
        //world.add(new DancingBug(array));
        world.add(new HoppingBug());   
        world.show();
        
        
    }
}
