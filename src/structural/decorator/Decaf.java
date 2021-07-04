package structural.decorator;

/**
 * 低咖啡因
 *
 * @author czy
 * @date 2021/7/4
 */
public class Decaf extends Beverage{
    public Decaf(){
        description = "Decaf";
    }
    @Override
    public double cost() {
        return 1.05;
    }
}
