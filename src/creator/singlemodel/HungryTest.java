package creator.singlemodel;

/**
 * 饿汉模式测试
 * 结果：没有线程安全问题
 * 提前占用系统内存
 *
 * @author czy
 * @date 2021/6/11
 */
public class HungryTest {
    public static void main(String[] args) {

        //线程安全测试
        //和双亲委派模型也有关系
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                System.out.println(Hungry.getInstance().hashCode());
            }).start();
        }
    }
}
