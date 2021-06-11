package creator.factrorymodel.method;

/**
 * @author czy
 * @date 2021/6/9
 */
public class TSLFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new TSL();
    }
}
