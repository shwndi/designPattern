package structural.proxymodle.dynamicproxy.springproxy.staticp;

import structural.proxymodle.dynamicproxy.springproxy.impl.AccountServiceImpl;

/**
 * 静态代理测试
 *
 * @author czy
 * @date 2021/7/16
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        AccountServiceImpl accountService = new AccountServiceImpl();
        AccountProxy accountProxy = new AccountProxy(accountService);
        accountProxy.transfer();
    }

}
/*~
        转账前置处理
        调用dao层，完成转账业务
*/