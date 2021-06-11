package creator.singlemodel;

/**
 * 饿汉模式
 *
 * @author czy
 * @date 2021/6/11
 */
public class Hungry {
   private Hungry(){
       System.out.println("饿汉模式");
   }
   private static Hungry HUNGRY = new Hungry();

   public static Hungry getInstance(){
       return HUNGRY;
   }
}
