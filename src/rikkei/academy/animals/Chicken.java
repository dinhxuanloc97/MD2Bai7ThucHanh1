package rikkei.academy.animals;

import rikkei.academy.edible.IEdible;

public class Chicken extends  Animal implements IEdible {
    @Override
    public String makeSound() {
        return "chicken :cluck_cluck";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
