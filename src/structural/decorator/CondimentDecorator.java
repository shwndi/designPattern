package structural.decorator;

/**
 * 调味品装饰器
 *
 * @author czy
 * @date 2021/7/4
 */
public abstract class CondimentDecorator extends Beverage {
    /**
     * 描述
     * @return
     */
    @Override
    public abstract String getDescription();
}
