package chapter11.bystander;

public class Conga implements Dance {
    private static String[] steps =
            {
                    "00 -- 00 -- -- 77 -- 02 37 -- 40 -- -- 37 -- 41 ",
                    "-- 00 -- 07 00 -- 01 -- -- 40 -- 47 40 -- 41 -- ",
                    "00 -- 00 -- -- 77 -- 02 37 -- 40 -- -- 37 -- 41 ",
                    "-- 00 -- 07 00 -- 01 -- -- 40 -- 47 40 -- 41 -- ",
                    "00 -- 01 -- -- 37 -- 40 00 -- 07 -- -- 51 -- 40 ",
                    "60 -- 60 -- -- 60 -- 64 60 -- 60 -- -- 60 -- 64 ",
            };

    private static int[] beat = {2, 2, 1, 1};

    @Override
    public String getName() {
        return "Conga";
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