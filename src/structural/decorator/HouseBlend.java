package structural.decorator;

/**
 * 综合咖啡
 * @author czy
 * @date 2021/7/4
 */
public class HouseBlend extends Beverage{
    public HouseBlend(){
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
