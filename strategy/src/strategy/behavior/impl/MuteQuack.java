package strategy.behavior.impl;

import strategy.behavior.api.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I cannot quack");
    }
}
