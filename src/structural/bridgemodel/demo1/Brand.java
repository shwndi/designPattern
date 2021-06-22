package structural.bridgemodel.demo1;

/**
 * 品牌
 *
 * @author czy
 * @date 2021/6/21
 */
public interface Brand {
    void info();
}
//三种品牌实现
/**
 * 东北大鹌鹑品牌
 *
 */
class LXQDY implements Brand {
    @Override
    public void info() {
        System.out.print("东北大鹌鹑");
    }
}
/**
 * 红心砖头品牌
 *
 */
class HZT implements Brand {
    @Override
    public void info() {
        System.out.print("红心砖头");
    }
}
/**
 * 黑心大米品牌
 *
 */
class HXDM implements Brand {
    @Override
    public void info() {
        System.out.print("黑心大米");
    }
}