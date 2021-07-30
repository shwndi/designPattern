package structural.proxymodle.dynamicproxy.springproxy.springaop;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

/**
 * 代理对象工厂
 *
 * @author czy
 * @date 2021/7/16
 */
public class ProxyFactory {
    @SuppressWarnings("unchecked")
    public static <T> T createProxy(final Class<?> targetClass, final MethodInterceptor methodInterceptor) {
        T t = (T) Enhancer.create(targetClass, methodInterceptor);
        return t;
    }
}
