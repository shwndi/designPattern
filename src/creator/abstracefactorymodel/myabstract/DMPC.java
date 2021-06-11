package creator.abstracefactorymodel.myabstract;

/**
 * @author czy
 * @date 2021/6/9
 */
public class DMPC implements IPC{
    @Override
    public void start() {
        System.out.println("大米电脑开机");
    }

    @Override
    public void shutDown() {
        System.out.println("大米电脑关机");
    }

    @Override
    public void watchTV() {
        System.out.println("大米电脑看电视");
    }

    @Override
    public void chat() {
        System.out.println("大米电脑聊天");
    }
}
