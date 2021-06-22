package structural.proxymodle.dynamicproxy.demo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 万能的动态代理类
 *
 * @author czy
 * @date 2021/6/22
 */
public class ProxyForAnything implements InvocationHandler {
    /**
     * 被代理的接口
     */
    private Object interfaceObject;

    public void setObject(Object interfaceObject) {
        this.interfaceObject = interfaceObject;
    }

    /**
     * 生成动态代理实例的
     * @return
     */
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                interfaceObject.getClass().getInterfaces(),
                this);
    }

    /**
     * 调用一个处理程序，并返回结果的
     *
     * @param o
     * @param method
     * @param objects
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        log(method.getName());
        Object result = method.invoke(interfaceObject, objects);
        return result;
    }
    public void log(String msg){
        System.out.println("执行了"+msg+"方法");
    }
}
