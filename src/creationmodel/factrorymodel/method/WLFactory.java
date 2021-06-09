package creationmodel.factrorymodel.method;

/**
 * @author czy
 * @date 2021/6/9
 */
public class WLFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new WL();
    }
}
