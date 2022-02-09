import info.gridworld.actor.Bug;
import java.awt.Color;

public class SlowBug extends Bug
{
    private int turn = 0;
    public SlowBug()
    {
        super();
    }
    public SlowBug(Color color)
    {
        super(color);
    }
    public void act()
    {
        if (turn == 2)
        {
            super.act();
            turn = 0;
        }
        else
            turn++;
    }
}