package chapter11.bystander;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;

public class WaltzNumber extends DanceNumber {
    @Override
    public void setUpDancers(ActorWorld world) {
        super.setUpDancers(world);

        world.add(new Location(4, 5), new LeftShoe());
        world.add(new Location(4, 6), new RightShoe());
        Actor leftSandal = new LeftSandal();
        leftSandal.setDirection(180);
        world.add(new Location(2, 6), leftSandal);
        Actor rightSandal = new RightSandal();
        rightSandal.setDirection(180);
        world.add(new Location(2, 5), rightSandal);
        world.add(new Location(6, 3), new DancingBug());
        world.add(new Location(7, 4), new DancingCrab());
    }

    public static void main(String[] args) {
        DanceNumber number = new WaltzNumber();
        number.run(new ActorWorld(), new Waltz());
    }
}
