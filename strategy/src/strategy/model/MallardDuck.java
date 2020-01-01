package strategy.model;

import strategy.behavior.impl.FlyWithWings;
import strategy.behavior.impl.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am a Mallard duck");
    }
}
