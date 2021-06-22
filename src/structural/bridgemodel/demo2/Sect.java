package structural.bridgemodel.demo2;

/**
 * 宗门
 *
 * @author czy
 * @date 2021/6/22
 */
public abstract class Sect {
    protected Goods goods;

    public Sect() {
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    /**
     * 获取宗门信息
     */
    abstract void brand();
}

/**
 * 青云门
 */
class QYM extends Sect{

    public QYM() {
    }

    @Override
    void brand() {
        System.out.print("青云门的");
        super.goods.buy();
    }
}

/**
 * 天音寺
 */
class  TYS extends Sect{
    public TYS(){}


    @Override
    void brand() {
        System.out.print("天音寺的");
        super.goods.buy();
    }
}

/**
 * 焚香谷
 */
class FXG extends Sect{
    public FXG() {
    }

    @Override
    void brand() {
        System.out.print("焚香谷的");
        super.goods.buy();
    }
}