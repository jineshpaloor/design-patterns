package StrategyPattern;

/**
 * Created by jineshn on 20/09/15.
 */
public abstract class Duck {
    QuackBehavior quackbehavior;
    public Duck() {
    }

    public abstract void display();

    public void performQuack() {
        quackbehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoy!");
    }
}
