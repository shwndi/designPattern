package structural.proxymodle.dynamicproxy.springproxy.jdkdynamicproxy;

import structural.proxymodle.dynamicproxy.springproxy.IAccountService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 这是一个代理工具
 * 没有代理类
 * 功能是动态代理对象
 *
 * jdk动态代理
 * 又称作增强
 *
 *
 * @author czy
 * @date 2021/7/15
 */
public class ServiceAdvice implements InvocationHandler {
    private IAccountService service;

    public ServiceAdvice(IAccountService service) {
        this.service = service;
    }

    /**
     * 代理方法, 每次调用目标方法时都会进到这里
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        return method.invoke(service,args);
    }

    /**
     * 常见代理对象
     * @return
     */
    public IAccountService getProxyObject(){
         return (IAccountService) Proxy.newProxyInstance(
                 service.getClass().getClassLoader(),
                 service.getClass().getInterfaces(),
                this
        );
    }
    /**
     * 前置增强
     */
    private void before() {
        System.out.println("转账前置处理");
    }

}
