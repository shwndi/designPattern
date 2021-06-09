package creationmodel.factrorymodel.abstractme;

/**
 * @author czy
 * @date 2021/6/9
 */
public class Leijun {
    public static void main(String[] args) {
        IPC ipc = new DMFactory().getIPC();
        ipc.chat();

        IPhone phone = new GLFactory().getPhone();
        phone.sendSMS();
    }
}
