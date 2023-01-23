package chapter11.bystander;

public class YMCA implements Dance
{
  private static String[] steps =
    {
      "67 31 ",
      "21 57 ",
      "67 31 ",
      "21 57 ",
      "67 31 21 57 ",
      "60 60 20 20 20 20 60 60 ",
    };

  private static int[] beat = {1, 1, 1, 1, 2, 2, 2, 2};

  public String getName()
  {
    return "chapter11.bystander.YMCA";
  }

  public String getSteps(int m) { return steps[m-1]; }
  public int[] getBeat() { return beat; }
}
