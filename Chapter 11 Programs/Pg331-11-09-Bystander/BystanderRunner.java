import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

public class BystanderRunner extends CongaNumber
{
    @Override
    public void setUpDancers(ActorWorld world)
    {
        super.setUpDancers(world);
        world.add(new Location(0, 9), new Bystander());
    }
    public static void main(String[] args)
    {
        DanceNumber number = new BystanderRunner();
        number.run(new ActorWorld(), new Conga());
    }
}
