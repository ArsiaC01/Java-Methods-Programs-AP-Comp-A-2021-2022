package chapter11.bystander;

public class LeftSandal extends Dancer
{
  public void learn(Dance dance)
  {
    setSteps(dance.getSteps(3));
  }
}