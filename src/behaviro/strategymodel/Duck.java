package behaviro.strategymodel;

/**
 * @author czy
 * @date 2021/6/24
 */
public abstract class Duck {
    public CallBehavior call;
    public FlyBehavior fly;
    public void fly(){
        fly.fly();
    }
    public void call(){
        call.call();
    }
    public abstract void display() ;

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public void setCall(CallBehavior call) {
        this.call = call;
    }

    public void setFly(FlyBehavior fly) {
        this.fly = fly;
    }
}
class GreenHeadDuck extends Duck{
    public GreenHeadDuck() {
         this.call = new Quack();
         this.fly = new Fly();
    }

    @Override
    public void display() {
        System.out.println("this is a GreenHeadDuck !");
    }
}

class Model extends Duck{

    @Override
    public void display() {
        System.out.println("this is a model!");
    }
}