package creationmodel.factrorymodel.abstractme;

/**
 * @author czy
 * @date 2021/6/9
 */
public class GLIphone implements IPhone {


    @Override
    public void start() {
        System.out.println("高粱开机");
    }

    @Override
    public void shutdown() {
        System.out.println("高粱关机");
    }

    @Override
    public void callUp() {
        System.out.println("高粱呼叫");
    }

    @Override
    public void sendSMS() {
        System.out.println("高粱发信息");
    }
}
