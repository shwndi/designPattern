package creationmodel.factrorymodel.action;

import creationmodel.factrorymodel.factroy.AnimalBrakFactory;
import creationmodel.factrorymodel.service.Animal;

/**
 * 接口类工厂测试
 *
 * @author czy
 * @date 2020-6-13
 */
public class Barking {
    public static void main(String[] args) {
        Animal animal1 = AnimalBrakFactory.getAnimal("DOG");
        animal1.bark();
        Animal animal2 = AnimalBrakFactory.getAnimal("CAT");
        animal2.bark();
        Animal animal3 = AnimalBrakFactory.getAnimal("CHICK");
        animal3.bark();


    }
}
