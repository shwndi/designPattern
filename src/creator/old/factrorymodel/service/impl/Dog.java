package creator.old.factrorymodel.service.impl;

import creator.old.factrorymodel.service.Bark;

/**
 * 实现类
 * @author czy
 * @date 2020-6-13
 */
public class Dog implements Bark {
    @Override
    public void bark() {
        System.out.println("小狗叫到：汪汪汪<<<<<>>><<<");
    }
}
