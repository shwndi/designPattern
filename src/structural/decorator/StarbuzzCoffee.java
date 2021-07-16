package structural.decorator;

/**
 *
 * @author czy
 * @date 2021/7/5
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Espresso espresso = new Espresso();
        System.out.println(espresso.getDescription()+espresso.cost());

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        System.out.println(darkRoast.getDescription()+" $" +darkRoast.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription()
                + " $" + beverage3.cost());
    }

}
