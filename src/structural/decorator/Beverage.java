package structural.decorator;

/**
 * 饮料
 *
 * @author czy
 * @date 2021/7/4
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }
    public  abstract double cost();
}
