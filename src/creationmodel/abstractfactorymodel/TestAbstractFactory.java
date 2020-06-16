package creationmodel.abstractfactorymodel;
import creationmodel.abstractfactorymodel.abstractbo.BaseAnimal;

/**
 * @author czy
 * @date 2020-6-16
 */
public class TestAbstractFactory {
    public static void main(String[] args) {
        BaseFactory animalFactory = FactoryClass.getFactory("ANIMAL");

        BaseAnimal lion1 = animalFactory.getBaseAnimal("LION", "1", "2", "3");
        System.out.println(lion1.toString());

    }
}
