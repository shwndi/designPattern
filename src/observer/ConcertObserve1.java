package observer;

import observer.partent.Observe;

public class ConcertObserve1 implements Observe{
    @Override
    public void response() {
        System.out.println("观察者1作出反应");
    }
}
