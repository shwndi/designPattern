package structural.adaptermodel.classAdapter;

/**
 * https://github.com/shwndi/designPattern.git建造者模式,你学废了吗?
 * 大古
 * 大古想要变身迪迦，需要一个变身器
 *
 * @author czy
 * @date 2021/6/18
 */
public class BigGu extends UltramanTiga implements ShapeShifter{

    @Override
    public void becomeBigPerson() {
        this.action();
    }
}
