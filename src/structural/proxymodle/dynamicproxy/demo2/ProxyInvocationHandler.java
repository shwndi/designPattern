package structural.proxymodle.dynamicproxy.demo2;

import structural.proxymodle.dynamicproxy.demo1.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态处理器
 * 使用这个类，自动生成代理类。
 * @author czy
 * @date 2021/6/22
 */
public class ProxyInvocationHandler implements InvocationHandler {
    /**
     * 被代理的接口
     */
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }
    /**
     * 生成得到代理类
     * @return
     */
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);
    }
    /**
     * 处理代理实例，并返回结果
     * @param o
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object o, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(rent, args);
        return result;
    }


}
