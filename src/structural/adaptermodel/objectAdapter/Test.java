package structural.adaptermodel.objectAdapter;

/**
 * 每个人都是迪迦
 *
 * @author czy
 * @date 2021/6/21
 */
public class Test {
    public static void main(String[] args) {
        EveryBody body = new EveryBody(new UltramanTiga());
        body.becomeBigPerson();
    }
}
