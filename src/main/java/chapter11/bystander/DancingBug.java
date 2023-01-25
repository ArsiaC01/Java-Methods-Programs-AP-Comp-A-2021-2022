package chapter11.bystander;

import java.awt.Color;

public class DancingBug extends Dancer {
    public DancingBug() {}

    public DancingBug(Color color) {
        super(color);
    }

    @Override
    public void learn(Dance dance) {
        setSteps(dance.getSteps(5));
    }
}