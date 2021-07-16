package structural.proxymodle.dynamicproxy.springproxy.springaop;


import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 定义一个切面抽象类,
 * 该类使用了模板方法的设计模式,
 * 为开始, 结束, 异常, 前置增强, 后置增强提供了默认实现,
 * 当我们定义切面类时只需要按需重写它们就行.
 * isIntercept() 方法用来判断切入点是否正确,
 * 切面类需要重写这个方法.
 *
 * @author czy
 * @date 2021/7/16
 */
public abstract class BaseAspect implements MethodInterceptor {


    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        Object result = null;
        begin();
        try {
            if (isIntercept(method, args)) {
                before();
                result = methodProxy.invokeSuper(obj, args);
                after();
            } else {
                result = methodProxy.invokeSuper(obj,args);
            }
        } catch (Exception e) {
            System.out.println("proxy failure: "+ e.getMessage());
            error(e);
            throw e;
        } finally {
            end();
        }
        return result;
    }

    /**
     * 开始增强
     */
    public void begin() {
    }

    /**
     * 切入点判断
     */
    public boolean isIntercept(Method method, Object[] args) throws Throwable {
        return true;
    }

    /**
     * 前置增强
     */
    public void before() throws Throwable {
    }

    /**
     * 后置增强
     */
    public void after() throws Throwable {
    }

    /**
     * 异常增强
     */
    public void error(Throwable e) {
    }

    /**
     * 最终增强
     */
    public void end() {
    }
}
