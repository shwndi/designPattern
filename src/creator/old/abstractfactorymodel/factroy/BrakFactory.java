package creator.old.abstractfactorymodel.factroy;

import creator.old.abstractfactorymodel.BaseFactory;
import creator.old.abstractfactorymodel.abstractbo.BaseAnimal;
import creator.old.abstractfactorymodel.service.Bark;
import creator.old.abstractfactorymodel.service.impl.Cat;
import creator.old.abstractfactorymodel.service.impl.Chick;
import creator.old.abstractfactorymodel.service.impl.Dog;


/**
 * 叫声接口类工厂
 *
 * @author czy
 * @date 2020-6-13
 */
public class BrakFactory extends BaseFactory {

    @Override
    public Bark getBark(String name) {
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
