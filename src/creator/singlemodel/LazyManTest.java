package creator.singlemodel;

/**
 * 懒汉模式测试
 * 测试结果：多次调用了构造方法
 * 线程不安全，不是同一个对象
 *
 * @author czy
 * @date 2021/6/11
 */
public class LazyManTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                System.out.println(LazyMan.getInstance().hashCode());
            }).start();
        }
    }
}
