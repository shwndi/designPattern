package structural.decorator;

/**
 * 奶泡
 *
 * @author czy
 * @date 2021/7/5
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " .Whip";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
