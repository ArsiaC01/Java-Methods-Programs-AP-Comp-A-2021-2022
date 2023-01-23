package chapter11.bystander;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class DanceNumber
{
  public void setUpDancers(ActorWorld world)
  {
    world.add(new Location(0, 0), new Maracas());
  }

  public void teach(ActorWorld world, Dance dance)
  {
    world.setMessage(dance.getName());

    Grid<Actor> gr = world.getGrid();
    for (Location loc : gr.getOccupiedLocations())
    {
      Actor a = gr.get(loc);
      if (a instanceof Dancer)
        ((Dancer)a).learn(dance);
    }
  }

  public void run(ActorWorld world, Dance dance)
  {
    setUpDancers(world);
    teach(world, dance);
    world.show();
  }

  public static void main(String[] args)
  {
    DanceNumber number = new DanceNumber();
    number.run(new ActorWorld(), new MusicOnly());
  }
}
