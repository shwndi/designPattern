package creationmodel.factrorymodel.service.impl;

import creationmodel.factrorymodel.service.Animal;

/**
 * 实现类
 * @author czy
 * @date 2020-6-13
 */
public class Cat implements Animal {

    @Override
    public void bark() {
        System.out.println("小猫叫到:喵喵喵<<<>>>>><<");
    }
}