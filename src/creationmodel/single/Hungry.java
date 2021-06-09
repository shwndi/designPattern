package creationmodel.single;

/**
 * 饿汉单例模式
 *
 * @author czy
 * @date 2021/5/19
 */
public class Hungry {
    //可能会浪费空间
    private byte[] date1 =new byte[1024];
    private byte[] date2 =new byte[1024];
    private byte[] date3 =new byte[1024];
    private byte[] date4 =new byte[1024];
    private Hungry(){

    }
    private final static Hungry HYUNGRY = new Hungry();
    public static Hungry getInstance(){
        return HYUNGRY;
    }
}
