package creationmodel.factrorymodel.action;
import creationmodel.factrorymodel.abstractbo.BaseAnimal;
import creationmodel.factrorymodel.bo.Lion;
import creationmodel.factrorymodel.factroy.AnimalFactoryNotStatic;

/**
 * @author czy
 * @date 2020-6-13
 */
public class AnimalNotStatic {
    public static void main(String[] args) {
        AnimalFactoryNotStatic factory = new AnimalFactoryNotStatic();
        BaseAnimal lion1 =  factory.getBaseAnimal("LION", "金毛狮王", "有点高", "有点重");
        System.out.println(lion1);
        System.out.println( lion1.getClass().getName() + "@" + Integer.toHexString(lion1.hashCode()));
        BaseAnimal monkey1 = factory.getBaseAnimal("MONKEY", "金丝猴", "一米五", "30斤");
        System.out.println(monkey1);
        System.out.println( monkey1.getClass().getName() + "@" + Integer.toHexString(monkey1.hashCode()));
        BaseAnimal mouse1 = factory.getBaseAnimal("MOUSE", "米老鼠", "三层楼", "一吨");
        System.out.println(mouse1);
        System.out.println( mouse1.getClass().getName() + "@" + Integer.toHexString(mouse1.hashCode()));
        BaseAnimal lion2 = factory.getBaseAnimal("LION");
        System.out.println(lion2);
        System.out.println( lion2.getClass().getName() + "@" + Integer.toHexString(lion2.hashCode()));
        BaseAnimal monkey2 = factory.getBaseAnimal("MONKEY");
        System.out.println(monkey2);
        System.out.println( monkey2.getClass().getName() + "@" + Integer.toHexString(monkey2.hashCode()));
        BaseAnimal mouse2 = factory.getBaseAnimal("MOUSE");
        System.out.println(mouse2);
        System.out.println( mouse2.getClass().getName() + "@" + Integer.toHexString(mouse2.hashCode()));
    }
}
