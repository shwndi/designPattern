package observer.test;

public class Observer1 implements Observer{

    @Override
    public void response() {
        System.out.println("观察者1报道");
    }
}
