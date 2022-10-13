package structural.proxymodle.dynamicproxy.T_dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Random;

/**
 * @author czy
 * @date 2022/10/13
 */
public class Tank implements Moveble {


    @Override
    public void move() {
        System.out.println("clacalcal...");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Tank tank = new Tank();
        //这一句是保存生成的代理对象
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
//lambda 表达式
//        Moveble m = (Moveble) Proxy.newProxyInstance(tank.getClass().getClassLoader(),
//                new Class[]{Moveble.class}, (proxy, method, a) -> {
//                    System.out.println("method" + method.getName() + "start..");
//                    //通过反射执行tank对象的method方法，参数为a
//                    Object o = method.invoke(tank, a);
//                    System.out.println("method" + method.getName() + "end..");
//                    return o;
//                });
//通过实现类实现
        Moveble m = (Moveble) Proxy.newProxyInstance(tank.getClass().getClassLoader(),
                new Class[]{Moveble.class},
                new LogHandler(tank));
        m.move();
    }
}

class LogHandler implements InvocationHandler {
    Tank tank;

    public LogHandler(Tank tank) {
        this.tank = tank;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("method" + method.getName() + "start..");
        //通过反射执行tank对象的method方法，参数为a
        Object o = method.invoke(tank, args);
        System.out.println("method" + method.getName() + "end..");
        return o;
    }
}