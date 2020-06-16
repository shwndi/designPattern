package creationmodel.abstractfactorymodel.factroy;

import creationmodel.abstractfactorymodel.BaseFactory;
import creationmodel.abstractfactorymodel.abstractbo.BaseAnimal;
import creationmodel.abstractfactorymodel.service.Animal;
import creationmodel.abstractfactorymodel.service.impl.Cat;
import creationmodel.abstractfactorymodel.service.impl.Chick;
import creationmodel.abstractfactorymodel.service.impl.Dog;


/**
 * 叫声接口类工厂
 *
 * @author czy
 * @date 2020-6-13
 */
public class AnimalBrakFactory extends BaseFactory {

    @Override
    public Animal getAnimal(String name) {
        switch (name) {
            case "DOG":
                return  new Dog();
            case "CAT":
                return  new Cat();
            case "CHICK":
                return new Chick();
            default:
                return null;
        }
    }

    @Override
    public BaseAnimal getBaseAnimal(String type) {
        return null;
    }

    @Override
    public BaseAnimal getBaseAnimal(String type, String colour, String high, String height) {
        return null;
    }

}
