package Fruits;

import Edible.Edible;

public abstract class Fruits implements Edible {
    @Override
    public String howToEat() {
        return "bite";
    }
}
