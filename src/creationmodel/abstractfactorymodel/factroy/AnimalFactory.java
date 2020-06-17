package creationmodel.abstractfactorymodel.factroy;

import creationmodel.abstractfactorymodel.BaseFactory;
import creationmodel.abstractfactorymodel.abstractbo.BaseAnimal;
import creationmodel.abstractfactorymodel.bo.Lion;
import creationmodel.abstractfactorymodel.bo.Monkey;
import creationmodel.abstractfactorymodel.bo.Mouse;
import creationmodel.abstractfactorymodel.service.Bark;


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
