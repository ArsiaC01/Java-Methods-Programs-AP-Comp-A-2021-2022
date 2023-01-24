package chapter11.gridworlddance;

public class LeftShoe extends Dancer
{
  public void learn(Dance dance)
  {
    setSteps(dance.getSteps(1));
  }
}
