package chapter11.bystander;

public class LeftSandal extends Dancer {
    @Override
    public void learn(Dance dance) {
        setSteps(dance.getSteps(3));
    }
}