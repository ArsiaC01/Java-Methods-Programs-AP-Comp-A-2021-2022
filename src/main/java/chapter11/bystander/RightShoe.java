package chapter11.bystander;

public class RightShoe extends Dancer {
    @Override
    public void learn(Dance dance) {
        setSteps(dance.getSteps(2));
    }
}