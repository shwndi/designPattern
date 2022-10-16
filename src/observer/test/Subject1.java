package observer.test;

public class Subject1 extends Subject{
    public void doSomething(){
        System.out.println("我是被观察者");
        System.out.println("下面给观察者门传递信号");
        super.notifyedAll();
        System.out.println("观察任务结束");
    }
}
