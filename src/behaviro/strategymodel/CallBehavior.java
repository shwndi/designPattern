package behaviro.strategymodel;

/**
 * 叫喊
 * @author czy
 * @date 2021/6/24
 */
public interface CallBehavior{
    void call();
}

/**
 * 嘎嘎
 */
class Quack implements CallBehavior{
    @Override
    public void call() {
        System.out.println("嘎嘎");
    }
}
class Squeak implements CallBehavior{
    @Override
    public void call() {
        System.out.println("吱吱");
    }
}
class Mute implements CallBehavior{
    @Override
    public void call() {
        System.out.println("<<Silence>>");
    }
}