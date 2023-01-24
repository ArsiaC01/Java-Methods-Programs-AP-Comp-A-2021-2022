package chapter11.gridworlddance;

public class DanceRunner
{
  public static void main(String[] args)
  {
    int k = (int)(3 * Math.random());
    switch (k)
    {
      case 0:
        WaltzNumber.main(args); break;
      case 1:
        YMCANumber.main(args); break;
      case 2:
        CongaNumber.main(args); break;
    }
  }
}