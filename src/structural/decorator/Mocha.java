package structural.decorator;

/**
 * 摩卡
 *
 * @author czy
 * @date 2021/7/5
 */
public class Mocha extends CondimentDecorator{
    Beverage beverage;
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
