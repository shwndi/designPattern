package creationmodel.abstractfactorymodel;

import creationmodel.abstractfactorymodel.abstractbo.BaseAnimal;
import creationmodel.abstractfactorymodel.service.BarkAnimal;


/**
 * 抽象工厂接口
 * @author czy
 * @date 2020-6-16
 */
public abstract class BaseFactory {

    public abstract BarkAnimal getBark(String name);

    public abstract BaseAnimal getBaseAnimal(String type);

    public abstract BaseAnimal getBaseAnimal(String type, String colour, String high, String height);
}