package chapter11.bystander;

public class Maracas extends Dancer {
    private EasySound[] beatSound;
    private int[] beat;
    private int stepsCount;

    public Maracas() {
        beatSound = new EasySound[3];
        beatSound[1] = new EasySound("beat1.wav");
        beatSound[2] = new EasySound("beat2.wav");
    }

    @Override
    public void learn(Dance dance) {
        beat = dance.getBeat();
        stepsCount = 0;
        setSteps("21 57 ");
    }

    @Override
    public void act() {
        if (beat != null) {
            int i = beat[stepsCount];
            if (i > 0) {
                beatSound[i].play();
            }
            stepsCount++;
            if (stepsCount >= beat.length) {
                stepsCount = 0;
            }
        }
        super.act();
    }
}