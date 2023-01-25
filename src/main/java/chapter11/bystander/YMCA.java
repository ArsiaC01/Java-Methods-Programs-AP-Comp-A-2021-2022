package chapter11.bystander;

public class YMCA implements Dance {
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

    @Override
    public String getName() {
        return "chapter11.bystander.YMCA";
    }

    @Override
    public String getSteps(int m) {
        return steps[m - 1];
    }

    @Override
    public int[] getBeat() {
        return beat;
    }
}
