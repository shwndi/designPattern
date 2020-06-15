package creationmodel.factrorymodel.factroy;

import creationmodel.factrorymodel.abstractbo.BaseAnimal;
import creationmodel.factrorymodel.bo.Lion;
import creationmodel.factrorymodel.bo.Monkey;
import creationmodel.factrorymodel.bo.Mouse;

/**
 * @author czy
 * @date 2020-6-13
 */
public class AnimalFactoryIsStatic  {

    public static BaseAnimal getBaseAnimal(String type, String colour, String high, String height) {
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


    public static BaseAnimal getBaseAnimal(String type) {
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

