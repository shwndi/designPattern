package creationmodel.single;

/**
 * @author czy
 * @date 2021/5/19
 */
public class LazyMan {
    private LazyMan(){

    }
    private static LazyMan lazyMan;

     public static LazyMan getInstance(){
         if (lazyMan==null){
             lazyMan=new LazyMan();
         }
         return lazyMan;
     }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

        }
    }
}
