package chapter11.bystander;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;

import java.awt.Color;

public class YMCANumber extends DanceNumber {
    @Override
    public void setUpDancers(ActorWorld world) {
        super.setUpDancers(world);

        Actor leftSandal = new LeftSandal();
        leftSandal.setDirection(180);
        world.add(new Location(1, 5), leftSandal);
        Actor rightSandal = new RightSandal();
        rightSandal.setDirection(180);
        world.add(new Location(1, 4), rightSandal);
        world.add(new Location(5, 2), new LeftShoe());
        world.add(new Location(5, 3), new RightShoe());
        world.add(new Location(5, 7), new DancingBug());
        world.add(new Location(7, 2), new DancingBug(Color.YELLOW));
        world.add(new Location(7, 4), new DancingBug(Color.GREEN));
        world.add(new Location(8, 6), new DancingCrab());
    }

    public static void main(String[] args) {
        DanceNumber number = new YMCANumber();
        number.run(new ActorWorld(), new YMCA());
    }
}

public @interface