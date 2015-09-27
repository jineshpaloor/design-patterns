import ObserverPattern.CurrentConditionsDisplay;
import ObserverPattern.WeatherData;
import StrategyPattern.Duck;
import StrategyPattern.MallardDuck;

/**
 * Created by jineshn on 20/09/15.
 */
public class DesignPatterns {
    public static void main(String[] args) {

        /* Stratey Pattern Example */
//        Duck mallard = new MallardDuck();
//        mallard.performQuack();
//        mallard.display();

        /* Observer Pattern */
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(50, 60, 70);
    }
}
