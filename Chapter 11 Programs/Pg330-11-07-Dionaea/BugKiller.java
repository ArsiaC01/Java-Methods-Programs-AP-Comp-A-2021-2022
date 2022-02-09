import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;

public class BugKiller
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        world.add(new Dionaea());
        world.add(new Dionaea());
        world.add(new Dionaea());
        world.add(new Bug());
        world.add(new Bug());
        world.add(new Bug());
        world.show();
    }
}
