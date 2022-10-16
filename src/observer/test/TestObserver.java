package observer.test;

public class TestObserver {
    public static void main(String[] args) {
        //新建一个被观察者
        Subject1 s = new Subject1();
        //新建观察者
        Observer1 observer1 = new Observer1();
        Observer2 observer2 = new Observer2();
        //将观察者作为属性放在被观察者的触发列表中
        s.add(observer1);
        s.add(observer2);
        //执行被观察者的被观察方法
        //doSomething()中有super.notifyed()方法被执行，这时触发观察者运行特定的方法response（）
        s.doSomething();
    }
}
