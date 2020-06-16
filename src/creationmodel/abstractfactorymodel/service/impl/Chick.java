package creationmodel.abstractfactorymodel.service.impl;

import creationmodel.abstractfactorymodel.service.BarkAnimal;

/**
 * 实现类
 * @author czy
 * @date 2020-6-13
 */
public class Chick implements BarkAnimal {
    @Override
    public void bark() {
        System.out.println("小鸡叫到：咯咯哒！");
    }
}
