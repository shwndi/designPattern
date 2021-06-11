package creator.singlemodel;

/**
 * 无法被反射修改，因此是安全的
 *
 * @author czy
 * @date 2021/6/11
 */
public enum EnumSingle {
    SINGLE;

    public static EnumSingle getInstance(){
        return SINGLE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(EnumSingle.getInstance().hashCode());
            }).start();
        }
    }
}
