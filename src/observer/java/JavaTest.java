package observer.java;

import observer.test.Subject;

import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.*;

/**
 * 线程安全问题
 */
public class JavaTest {
    public static void main(String[] args) {
        SubjectTest s = new SubjectTest();
        ObserveTest1 observeTest1 = new ObserveTest1();
        ObserveTest2 observeTest2 = new ObserveTest2();
        ObserveTest3 observeTest3 = new ObserveTest3();

        s.addObserver(observeTest1);
        s.addObserver(observeTest2);
        s.addObserver(observeTest3);

        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 2, 5, TimeUnit.SECONDS,
                new LinkedBlockingDeque<Runnable>());
        executor.execute(()->{
            String result = s.doSomething("母先莉在剪辑视频");
            System.out.println(result);
        });
        executor.execute(()->{
            String result = s.doSomething("剪完回家了");
            System.out.println(result);
        });

    }


}

class SubjectTest extends Observable {
    private String a;

    public String doSomething(String s) {
        System.out.println("被监听者执行方法：" + s);
        a = s;
        setChanged();
        notifyObservers(a);
        return "监听者执行结束";
    }
}

class ObserveTest1 implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("监听者执行方法1：" + (String) arg);
    }
}

class ObserveTest2 implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("监听者执行方法2：" + (String) arg);
    }
}

class ObserveTest3 implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("监听者执行方法3：" + (String) arg);
    }
}

