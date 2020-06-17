package creationmodel.factrorymodel.factroy;

import creationmodel.factrorymodel.service.Bark;
import creationmodel.factrorymodel.service.impl.Cat;
import creationmodel.factrorymodel.service.impl.Chick;
import creationmodel.factrorymodel.service.impl.Dog;

/**
 * 接口类工厂
 *
 * @author czy
 * @date 2020-6-13
 */
public class AnimalBrakFactory {
    public static Bark getAnimal(String name) {
        switch (name) {
            case "DOG":
                return new Dog();
            case "CAT":
                return new Cat();
            case "CHICK":
                return new Chick();
            default:
                return null;
        }
    }
}
