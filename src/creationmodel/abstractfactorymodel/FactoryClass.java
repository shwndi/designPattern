package creationmodel.abstractfactorymodel;

import creationmodel.abstractfactorymodel.factroy.AnimalBrakFactory;
import creationmodel.abstractfactorymodel.factroy.AnimalFactory;

/**
 * 具体工厂创建
 *
 * @author czy
 * @date 2020-6-16
 */
public class FactoryClass {
    public static BaseFactory getFactory(String Type){
        if(Type.equalsIgnoreCase("BARK")){
            return new AnimalBrakFactory();
        } else if(Type.equalsIgnoreCase("ANIMAL")){
            return new AnimalFactory();
        }
        return null;
    }
}
