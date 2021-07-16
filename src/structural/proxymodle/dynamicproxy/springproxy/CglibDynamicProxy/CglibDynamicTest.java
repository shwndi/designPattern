package structural.proxymodle.dynamicproxy.springproxy.CglibDynamicProxy;

import net.sf.cglib.proxy.Enhancer;

/**
 * Cglib实现代理
 *
 * @author czy
 * @date 2021/7/16
 */
public class CglibDynamicTest {
    public static void main(String[] args) {
        AccountService service = new AccountService();
        AccountService proxy = (AccountService) Enhancer.create(service.getClass(),
                new AccountAdvice());
        proxy.transfer();
    }
}
