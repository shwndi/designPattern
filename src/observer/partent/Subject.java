package observer.partent;


import java.util.Vector;

public class Subject {
    //观察者数组
    private Vector<Observe> oVector = new Vector<>();

    //增加一个观察者，相当于观察者注册
    public void addObserver(Observe observer) {
        this.oVector.add(observer);
    }

    //删除一个观察者
    public void deleteObserver(Observe observer) {
        this.oVector.remove(observer);
    }

    //通知所有观察者，主题有变化时通知观察者
    public void notifyObserver() {
        for(Observe observer : this.oVector) {
            observer.response();
        }
    }
}
