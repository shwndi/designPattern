package creator.singlemodel;

/**
 * 懒汉单例模式
 *
 * @author czy
 * @date 2021/6/11
 */
public class LazyMan {
    private LazyMan(){
        System.out.println("懒汉单例模式");
    }
    private static LazyMan lazyMan;

    public static LazyMan getInstance(){
        if (lazyMan==null){
            lazyMan = new LazyMan();
        }
        return lazyMan;
    }
}
