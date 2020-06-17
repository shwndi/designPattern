package creationmodel.factrorymodel.action;

import creationmodel.factrorymodel.factroy.AnimalBrakFactory;
import creationmodel.factrorymodel.service.Bark;

/**
 * 接口类工厂测试
 *
 * @author czy
 * @date 2020-6-13
 */
public class Barking {
    public static void main(String[] args) {
        Bark bark1 = AnimalBrakFactory.getAnimal("DOG");
        bark1.bark();
        Bark bark2 = AnimalBrakFactory.getAnimal("CAT");
        bark2.bark();
        Bark bark3 = AnimalBrakFactory.getAnimal("CHICK");
        bark3.bark();


    }
}
