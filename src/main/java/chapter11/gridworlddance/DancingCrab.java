package chapter11.gridworlddance;

public class DancingCrab extends Dancer
{
  public void learn(Dance dance)
  {
    setSteps(dance.getSteps(6));
  }
}