package chapter11.bystander;

public class RightSandal extends Dancer {
    @Override
    public void learn(Dance dance) {
        setSteps(dance.getSteps(4));
    }
}