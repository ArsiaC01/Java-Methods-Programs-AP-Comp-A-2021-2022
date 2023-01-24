package chapter11.gridworlddance;

public class RightShoe extends Dancer
{
  public void learn(Dance dance)
  {
    setSteps(dance.getSteps(2));
  }
}