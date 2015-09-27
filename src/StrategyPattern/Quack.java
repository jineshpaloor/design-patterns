package StrategyPattern;

/**
 * Created by jineshn on 20/09/15.
 */
public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("StrategyPattern.Quack..");
    }
}
