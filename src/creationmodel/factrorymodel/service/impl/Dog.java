package creationmodel.factrorymodel.service.impl;

import creationmodel.factrorymodel.service.Animal;

/**
 * 实现类
 * @author czy
 * @date 2020-6-13
 */
public class Dog implements Animal {
    @Override
    public void bark() {
        System.out.println("小狗叫到：汪汪汪<<<<<>>><<<");
    }
}
