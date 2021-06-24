package creator.factrorymodel.simple;

/**
 * 简单工厂模式
 *
 * @author czy
 * @date 2021/6/9
 */
public class Consumer {
    public static void main(String[] args) {

        TSL tsl = new TSL();
        WL wl = new WL();
        tsl.name();
        wl.name();
        Car tsl1 = CarFactory.getCar("tsl");
        tsl1.name();
        Car wlhg = CarFactory.getCar("wlhg");
        wlhg.name();
    }
}
