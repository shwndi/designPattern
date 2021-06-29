package behaviro.observermodel.demo1;

/**
 * 1、此布告板实现了Observer接口，所以
 * 可以从WeatherData对象中获得改变。
 * 2、它也实现了DisplayElement接口，
 * 因为我们的API规定所有的布告
 * 板都必须实现此接口。
 *
 * @author czy
 * @date 2021/6/28
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    /**
     * 当update()被调用时，我们
     * 把温度和湿度保存起来，
     * 然后调用display()。
     * @param temperature
     * @param humidity
     * @param pressure
     */
    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    /**
     *display()方法就只是
     * 把最近的温度和湿
     * 度显示出来。
     */
    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
