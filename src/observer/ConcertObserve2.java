package observer;

import observer.partent.Observe;

public class ConcertObserve2 implements Observe{
    @Override
    public void response() {
        System.out.println("观察者2作出反应");
    }
}
