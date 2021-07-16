package structural.proxymodle.dynamicproxy.springproxy.springaop;

import java.lang.reflect.Method;

/**
 * 切面类
 * 类中配置切入点和增强.
 * @author czy
 * @date 2021/7/16
 */
public class AccountAspect  extends BaseAspect{
    /**
     * 切入点
     */
    @Override
    public boolean isIntercept(Method method, Object[] args) throws Throwable {
        return method.getName().equals("transfer");
    }

    /**
     * 前置增强
     */
    @Override
    public void before() throws Throwable {
        System.out.println("对转账人身份进行验证.");
    }
}
