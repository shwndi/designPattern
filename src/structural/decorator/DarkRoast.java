package structural.decorator;

/**
 * 深培咖啡
 *
 * @author czy
 * @date 2021/7/4
 */
public class DarkRoast extends Beverage{
    public DarkRoast(){
        description = "Dark Roast";
    }
    @Override
    public double cost() {
        return 0.99;
    }
}
