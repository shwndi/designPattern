package structural.decorator;

/**
 * 豆浆
 *
 * @author czy
 * @date 2021/7/5
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " .Soy";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
