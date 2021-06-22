package structural.bridgemodel.demo2;

/**
 * 商品
 *
 * @author czy
 * @date 2021/6/22
 */
public interface Goods {
    void buy();
}

/**
 * 丹药
 */
class Elixir implements Goods{

    @Override
    public void buy() {
        System.out.print("丹药");
    }
}

/**
 * 阵法
 */
class ZhenFa implements Goods{

    @Override
    public void buy() {
        System.out.print("炼药");
    }
}

/**
 * 练器
 */
class LianQi implements Goods{

    @Override
    public void buy() {
        System.out.print("练器");
    }
}