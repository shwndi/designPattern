package observer;

import observer.partent.Subject;

public class ConcerteSubject extends Subject {

    public void doSomething(){
        System.out.println("具体目标发生改变...");
        System.out.println("--------------");
        super.notifyObserver();
    }
}
