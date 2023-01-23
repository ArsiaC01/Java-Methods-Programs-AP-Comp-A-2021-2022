package chapter11.bystander;

public class MusicOnly implements Dance
{
  private static String[] steps = {"-- "};
  private static int[] beat = {2};

  public String getName() { return "Music Only"; }
  public String getSteps(int m) { return steps[m-1]; }
  public int[] getBeat() { return beat; }
}
