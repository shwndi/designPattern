package creator.old.abstractfactorymodel;

import creator.old.abstractfactorymodel.abstractbo.BaseAnimal;
import creator.old.abstractfactorymodel.service.Bark;


/**
 * 抽象工厂接口
 * @author czy
 * @date 2020-6-16
 */
public abstract class BaseFactory {

    public abstract Bark getBark(String name);

    public abstract BaseAnimal getBaseAnimal(String type);

    public abstract BaseAnimal getBaseAnimal(String type, String colour, String high, String height);
}