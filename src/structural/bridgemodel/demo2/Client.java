package structural.bridgemodel.demo2;

/**
 * 顾客测试
 *
 * @author czy
 * @date 2021/6/22
 */
public class Client {
    public static void main(String[] args) {
        //我需要丹药
        Elixir elixir = new Elixir();
        //听说青云门的好
        QYM qym = new QYM();
        qym.setGoods(elixir);
        System.out.print("我要买");
        qym.brand();
    }
}
