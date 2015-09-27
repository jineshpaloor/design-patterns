package StrategyPattern;

/**
 * Created by jineshn on 20/09/15.
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
