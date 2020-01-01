package strategy.behavior.impl;

import strategy.behavior.api.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I cannot fly");
    }
}
