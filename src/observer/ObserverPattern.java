package observer;

public class ObserverPattern {
    public static void main(String[] args) {
        ConcerteSubject subject = new ConcerteSubject();
        ConcertObserve1 observe1 = new ConcertObserve1();
        ConcertObserve2 observe2 = new ConcertObserve2();
        subject.addObserver(observe1);
        subject.addObserver(observe2);
        subject.doSomething();
    }
}
