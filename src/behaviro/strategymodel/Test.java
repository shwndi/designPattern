package behaviro.strategymodel;

/**
 * @author czy
 * @date 2021/6/24
 */
public class Test {
    public static void main(String[] args) {
        GreenHeadDuck duck = new GreenHeadDuck();
        duck.fly();
        duck.call();
        duck.display();
        duck.swim();
        System.out.println("++++++++++++++++++++++++");
        Model model = new Model();
        model.setCall(new Squeak());
        model.setFly(new FlyNoWay());
        model.call();
        model.fly();
        model.display();
        model.setFly(new FlyRocketPower());
        model.fly();
    }
}
