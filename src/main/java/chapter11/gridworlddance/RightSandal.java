package chapter11.gridworlddance;

public class RightSandal extends Dancer
{
  public void learn(Dance dance)
  {
    setSteps(dance.getSteps(4));
  }
}