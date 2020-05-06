package animal;

import Edible.Edible;

public class Chicken extends Animal implements Edible {

    public Chicken() {
    }

    @Override
    public String makeSound() {
        return "O` o o";
    }

    @Override
    public String howToEat() {
        return "cook";
    }
}
