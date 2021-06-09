package creationmodel.factrorymodel.method;

/**
 * 方法工厂模式
 * 满足了开闭原则
 * 任意增加产品，但是会多出很多扩展类
 * 
 * @author czy
 * @date 2021/6/9
 */
public interface CarFactory {
    Car getCar();
}
