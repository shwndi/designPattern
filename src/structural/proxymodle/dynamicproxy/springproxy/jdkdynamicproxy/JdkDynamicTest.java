package structural.proxymodle.dynamicproxy.springproxy.jdkdynamicproxy;

import structural.proxymodle.dynamicproxy.springproxy.IAccountService;
import structural.proxymodle.dynamicproxy.springproxy.impl.AccountServiceImpl;

import java.lang.reflect.Proxy;

/**
 * jdk动态代理
 *
 * @author czy
 * @date 2021/7/16
 */
public class JdkDynamicTest {
    public static void main(String[] args) {
        AccountServiceImpl accountService = new AccountServiceImpl();
        //创建代理工具对象
        ServiceAdvice serviceAdvice = new ServiceAdvice(accountService);
        //创建代理对象
        IAccountService proxyObject = serviceAdvice.getProxyObject();
        //对象方法运行
        proxyObject.transfer();
    }
}
