package chapter11.slowbug;

import info.gridworld.actor.*;

public class SlowBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        world.add(new SlowBug());
        world.show();
    }
}
