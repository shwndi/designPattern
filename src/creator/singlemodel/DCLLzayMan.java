package creator.singlemodel;

/**
 * 双重检测锁的懒汉模式
 * double check lock
 *
 *
 * @author czy
 * @date 2021/6/11
 */
public class DCLLzayMan {
    private DCLLzayMan(){
        System.out.println("双重检测锁的懒汉模式");
    }
    private  static DCLLzayMan dclLzayMan ;
    //这种方式太消耗资源。每次调用都要加锁
//    public static synchronized DCLLzayMan getInstance(){
//        if (dclLzayMan==null){
//                    dclLzayMan = new DCLLzayMan();
//        }
//        return dclLzayMan;
//    }
    //测试指令从排序
    public static DCLLzayMan getInstance(){
        if (dclLzayMan==null){
            synchronized (DCLLzayMan.class){
                if (dclLzayMan==null){
                    //不是原子性操作
                    dclLzayMan = new DCLLzayMan();
                }
            }
        }
        return dclLzayMan;
    }
}
