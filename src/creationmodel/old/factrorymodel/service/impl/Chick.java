package creationmodel.old.factrorymodel.service.impl;

import creationmodel.old.factrorymodel.service.Bark;

/**
 * 实现类
 * @author czy
 * @date 2020-6-13
 */
public class Chick implements Bark {
    @Override
    public void bark() {
        System.out.println("小鸡叫到：咯咯哒！");
    }
}
