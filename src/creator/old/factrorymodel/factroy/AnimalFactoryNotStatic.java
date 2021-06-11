package creator.old.factrorymodel.factroy;

import creator.old.factrorymodel.abstractbo.BaseAnimal;
import creator.old.factrorymodel.bo.Lion;
import creator.old.factrorymodel.bo.Monkey;
import creator.old.factrorymodel.bo.Mouse;

/**
 * @author czy
 * @date 2020-6-13
 */
public class AnimalFactoryNotStatic {

    public  BaseAnimal getBaseAnimal(String type, String colour, String high, String height) {
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

    public  BaseAnimal getBaseAnimal(String type) {
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
