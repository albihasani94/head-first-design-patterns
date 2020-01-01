package strategy.behavior.impl;

import strategy.behavior.api.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack! Quack!");
    }
}
