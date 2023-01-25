package chapter11.bystander;

public class Waltz implements Dance {
    private static String[] steps =
            {
                    "00 -- 20 -- 50 -- ",
                    "-- 10 -- 40 -- 60 ",
                    "-- 50 -- 00 -- 20 ",
                    "40 -- 60 -- 10 -- ",
                    "-7 -1 -1 ",
                    "60 60 -2 ",
            };

    private static int[] beat = {1, 2, 2};

    @Override
    public String getName() {
        return "chapter11.bystander.Waltz";
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
