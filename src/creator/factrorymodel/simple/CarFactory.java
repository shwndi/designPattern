package creator.factrorymodel.simple;

/**
 * 简单工厂模式（静态工厂模式）
 * 新增产品的时候，必须修改代码
 * 不足之处，添加新类型要修改工厂
 * 不符合开闭原则
 * 但是大多数情况下还是用简单工厂模式，消耗更少的资源
 *
 * @author czy
 * @date 2021/6/9
 */
public class CarFactory {

    /**
     * 方法1
     * @param name
     * @return
     */
    public static Car getCar(String name){
        if(name.equals("wlhg")){
            return new WL();
        }else if(name.equals("tsl")){
            return new TSL();
        }else {
            return null;
        }
    }

    /**
     * 方法2
     * @return
     */
    public static Car getTsl(){
        return new TSL();
    }

    public static Car getWlhg(){
        return new WL();
    }
}
