package chapter11.bystander;

public class LeftShoe extends Dancer {
    @Override
    public void learn(Dance dance) {
        setSteps(dance.getSteps(1));
    }
}
