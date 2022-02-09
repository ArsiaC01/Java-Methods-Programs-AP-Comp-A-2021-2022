import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import java.awt.Color;

public class CongaNumber extends DanceNumber
{
  public void setUpDancers(ActorWorld world)
  {
    super.setUpDancers(world);

    world.add(new Location(5, 3), new LeftSandal());
    world.add(new Location(5, 4), new RightSandal());
    world.add(new Location(5, 6), new LeftShoe());
    world.add(new Location(5, 7), new RightShoe());
    world.add(new Location(7, 2), new DancingBug(Color.YELLOW));
    world.add(new Location(7, 4), new DancingBug(Color.GREEN));
    world.add(new Location(7, 6), new DancingBug(Color.YELLOW));
    world.add(new Location(7, 8), new DancingBug());
    world.add(new Location(8, 6), new DancingCrab());
  }

  public static void main(String[] args)
  {
    DanceNumber number = new CongaNumber();
    number.run(new ActorWorld(), new Conga());
  }
}
