package creator.singlemodel;

/**
 * @author czy
 * @date 2021/6/11
 */
public class DCLTest {
    public static void main(String[] args) {
        for (long i = 0; i < 10L; i++) {
            new Thread(()->{
                    DCLLzayMan.getInstance();
            }).start();
        }
    }
}
