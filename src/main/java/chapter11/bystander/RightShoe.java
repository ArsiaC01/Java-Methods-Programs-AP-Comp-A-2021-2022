package chapter11.bystander;

public class RightShoe extends Dancer
{
  public void learn(Dance dance)
  {
    setSteps(dance.getSteps(2));
  }
}