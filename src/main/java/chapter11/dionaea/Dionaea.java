package chapter11.dionaea;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import java.awt.*;

public class Dionaea extends Flower
{
    //Constructors, makes uses of flower's constructors in the superclass:
    public Dionaea()
    {
        super(null);
    }
    public Dionaea(Color theColor)
    {
        super(theColor);
    }

    //Methods:
    //Checks if the chapter11.dionaea.Dionaea can eat, then if it can, it eats. Else it turns.
    public void act() {
        if (this.canEat())
        {
            this.eat();
        }
        else
        {
            this.turn();
        }
    }

    public void turn()
    {
        this.setDirection(this.getDirection() + 45);
    }

    public boolean canEat()
    {
        Location theLocation = this.getLocation();
        Location nextLocation = theLocation.getAdjacentLocation(this.getDirection());
        if(getGrid().isValid(nextLocation))
        {
            if(getGrid().get(nextLocation) != null)
            {
                if(getGrid().get(nextLocation) instanceof Bug)
                {
                    return true;
                }
            }
        }
        return false;
    }

    //Removes whatever is in front of the chapter11.dionaea.Dionaea
    public void eat()
    {
        getGrid().get(getLocation().getAdjacentLocation(getDirection())).removeSelfFromGrid();
    }
}
