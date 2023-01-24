package chapter11.gridworlddance;

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
    return "chapter11.bystander.chapter11.gridworlddance.YMCA";
  }

  public String getSteps(int m) { return steps[m-1]; }
  public int[] getBeat() { return beat; }
}
