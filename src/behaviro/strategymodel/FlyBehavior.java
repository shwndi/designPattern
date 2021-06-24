package behaviro.strategymodel;

/**
 * 飞行行为
 * @author czy
 * @date 2021/6/24
 */
public interface FlyBehavior {
    void fly();
}
class Fly implements  FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I can fly !");
    }
}
class FlyNoWay implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I can`t fly !");
    }
}
class FlyRocketPower implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I`m fly by Rocket!");
    }
}