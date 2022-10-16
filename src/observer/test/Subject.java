package observer.test;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class Subject{
    private CopyOnWriteArrayList<Observer> list = new CopyOnWriteArrayList();
    public void add(Observer observer){
        list.add(observer);
    }
    public void delete(Observer observer){
        list.remove(observer);
    }
    public void notifyedAll(){
        for (Observer observer : list) {
            System.out.println("观察者遍历到："+observer.getClass().getName());
            observer.response();
            System.out.println("观察者："+observer.getClass().getName()+"结束任务");
        }
    }

}
