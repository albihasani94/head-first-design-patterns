package strategy.behavior.impl;

import strategy.behavior.api.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak! Squeak!");
    }
}
