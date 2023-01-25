package chapter11.bystander;

public class DancingCrab extends Dancer {
    @Override
    public void learn(Dance dance) {
        setSteps(dance.getSteps(6));
    }
}