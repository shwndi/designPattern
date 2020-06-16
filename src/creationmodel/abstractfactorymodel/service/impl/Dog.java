package creationmodel.abstractfactorymodel.service.impl;

import creationmodel.abstractfactorymodel.service.BarkAnimal;

/**
 * 实现类
 * @author czy
 * @date 2020-6-13
 */
public class Dog implements BarkAnimal {
    @Override
    public void bark() {
        System.out.println("小狗叫到：汪汪汪<<<<<>>><<<");
    }
}
