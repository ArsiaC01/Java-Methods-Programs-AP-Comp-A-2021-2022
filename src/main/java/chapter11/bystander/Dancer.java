package chapter11.bystander;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import java.awt.Color;

public abstract class Dancer extends Actor
{
  private String steps;
  private int stepsCount;

  public Dancer()
  {
    setColor(null);
  }

  public Dancer(Color color)
  {
    setColor(color);
  }

  public void setSteps(String steps)
  {
    this.steps = steps;
    stepsCount = 0;
  }

  public void act()
  {
    if (getGrid() != null && steps != null)
    {
      takeStep(steps.substring(stepsCount, stepsCount + 3));
      stepsCount += 3;
      if (stepsCount >= steps.length() - 2)
        stepsCount = 0;
    }
  }

  private void takeStep(String step)
  {
    char d = step.charAt(0);
    if (Character.isDigit(d))
    {
      int dir = Character.digit(d, 10) * 45;
      Location loc = getLocation();
      Location next = loc.getAdjacentLocation(getDirection() + dir);
      if (getGrid().isValid(next))
        moveTo(next);
      else
        removeSelfFromGrid();
    }

    d = step.charAt(1);
    if (Character.isDigit(d))
    {
      int dir = Character.digit(d, 10) * 45;
      setDirection(getDirection() + dir);
    }
  }

  public abstract void learn(Dance dance);
}
