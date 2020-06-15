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
        AnimalBrakFactory animal = new AnimalBrakFactory();
        Animal animal1 = animal.getAnimal("DOG");
        animal1.bark();
        Animal animal2 = animal.getAnimal("CAT");
        animal2.bark();
        Animal animal3 = animal.getAnimal("CHICK");
        animal3.bark();


    }
}
