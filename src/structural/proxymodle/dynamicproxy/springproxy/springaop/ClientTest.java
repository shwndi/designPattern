package structural.proxymodle.dynamicproxy.springproxy.springaop;

import structural.proxymodle.dynamicproxy.springproxy.IAccountService;
import structural.proxymodle.dynamicproxy.springproxy.impl.AccountServiceImpl;

/**
 * spring AOP测试
 *
 * @author czy
 * @date 2021/7/16
 */
public class ClientTest {
    public static void main(String[] args) {
        //创建目标对象
        AccountServiceImpl accountService = new AccountServiceImpl();
        //切面
        AccountAspect aspect = new AccountAspect();
        //创建代理对象
        IAccountService proxy = (IAccountService) ProxyFactory.createProxy(accountService.getClass(), aspect);
        proxy.transfer();
    }
}
