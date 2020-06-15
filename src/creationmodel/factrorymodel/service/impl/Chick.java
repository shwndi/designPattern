package creationmodel.factrorymodel.service.impl;

import creationmodel.factrorymodel.service.Animal;

/**
 * 实现类
 * @author czy
 * @date 2020-6-13
 */
public class Chick implements Animal {
    @Override
    public void bark() {
        System.out.println("小鸡叫到：咯咯哒！");
    }
}
