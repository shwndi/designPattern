package behaviro.observermodel.demo2;

import behaviro.observermodel.demo1.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * @author czy
 * @date 2021/6/29
 */
public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f ;
    private float lastPressure;
    public ForecastDisplay(Observable observable) {
        observable.addObserver ( this );
    }
    @Override
    public void update(Observable observable, Object arg ) {
        lastPressure = currentPressure;
        if (observable instanceof WeatherData) {
            WeatherData weatherData =
                    (WeatherData )observable;
            currentPressure = weatherData.getPressure() ;
        }
        display();
    }

    @Override
    public void display(){
        System.out.println("Last conditions: " + lastPressure
                + "CurrentPressure  conditions " + currentPressure + "% humidity");    }
}
