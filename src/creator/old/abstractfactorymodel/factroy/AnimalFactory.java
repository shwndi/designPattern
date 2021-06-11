package creator.old.abstractfactorymodel.factroy;

import creator.old.abstractfactorymodel.BaseFactory;
import creator.old.abstractfactorymodel.abstractbo.BaseAnimal;
import creator.old.abstractfactorymodel.bo.Lion;
import creator.old.abstractfactorymodel.bo.Monkey;
import creator.old.abstractfactorymodel.bo.Mouse;
import creator.old.abstractfactorymodel.service.Bark;


/**、
 * 动物工厂
 * @author czy
 * @date 2020-6-13
 */
public class AnimalFactory extends BaseFactory {
    @Override
    public BaseAnimal getBaseAnimal(String type, String colour, String high, String height) {
        switch (type) {
            case "LION":
                return new Lion(colour, high, height);
            case "MONKEY":
                return new Monkey(colour, high, height);
            case "MOUSE":
                return new Mouse(colour, high, height);
            default:
                return null;
        }
    }

    @Override
    public Bark getBark(String name) {
        return null;
    }

    @Override
    public BaseAnimal getBaseAnimal(String type) {
        switch (type) {
            case "LION":
                return new Lion();
            case "MONKEY":
                return new Monkey();
            case "MOUSE":
                return new Mouse();
            default:
                return null;
        }
    }
}
