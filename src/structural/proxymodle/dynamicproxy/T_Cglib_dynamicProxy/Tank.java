package structural.proxymodle.dynamicproxy.T_Cglib_dynamicProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Tank {
    public static void main(String[] args) {

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Tank.class);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("start...");
                Object invoke = methodProxy.invokeSuper(o,objects);
                System.out.println("end...");
                return invoke;
            }
        });
        Tank tank=(Tank) enhancer.create();
        tank.move();


    }
    public void move(){
        System.out.println("claclacalcla......");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
