package structural.proxymodle.dynamicproxy.springproxy.CglibDynamicProxy;


import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author czy
 * @date 2021/7/16
 */
public class AccountAdvice implements MethodInterceptor {
    /**
     * 代理方法, 每次调用目标方法时都会进到这里
     */
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        before();
        //return methodProxy.invokeSuper(obj,args);
        return methodProxy.invoke(obj,args);
    }
    /**
     * 前置增强
     */
    private void before() {
        System.out.println("对转账人身份进行验证.");
    }
}
