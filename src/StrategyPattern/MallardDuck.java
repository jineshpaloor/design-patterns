package StrategyPattern;

/**
 * Created by jineshn on 20/09/15.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackbehavior = new MuteQuack();
    }

    public void display(){
        System.out.println("I am a real Mallard StrategyPattern.Duck!");
    }
}
