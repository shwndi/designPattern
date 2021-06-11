package creator.old.abstractfactorymodel.service.impl;

import creator.old.abstractfactorymodel.service.Bark;

/**
 * 实现类
 * @author czy
 * @date 2020-6-13
 */
public class Cat implements Bark {

    @Override
    public void bark() {
        System.out.println("小猫叫到:喵喵喵<<<>>>>><<");
    }
}
