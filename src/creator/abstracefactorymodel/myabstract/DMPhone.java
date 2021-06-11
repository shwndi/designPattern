package creator.abstracefactorymodel.myabstract;

/**
 * @author czy
 * @date 2021/6/9
 */
public class DMPhone implements IPhone{
    @Override
    public void start() {
        System.out.println("大米开机");
    }

    @Override
    public void shutdown() {
        System.out.println("大米关机");
    }

    @Override
    public void callUp() {
        System.out.println("大米呼叫");
    }

    @Override
    public void sendSMS() {
        System.out.println("大米发短信");
    }
}
