package structural.decorator;

/**
 * 浓咖啡
 *
 * @author czy
 * @date 2021/7/4
 */
public class Espresso extends Beverage{
    public Espresso(){
        description = "Espresso";
    }
    @Override
    public double cost() {
        return 1.99;
    }
}
