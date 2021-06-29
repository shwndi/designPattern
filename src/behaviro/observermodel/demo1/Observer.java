package behaviro.observermodel.demo1;

/**
 * 所有的观察者都必须
 * 实现update()方法，以
 * 实现观察者接口。在
 * 这里，我们按照Mary和
 * Sue的想法把观测值传
 * 入观察者中。
 * @author czy
 * @date 2021/6/28
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
