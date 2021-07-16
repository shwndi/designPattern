package structural.proxymodle.dynamicproxy.springproxy.impl;

import structural.proxymodle.dynamicproxy.springproxy.IAccountService;

/**
 * @author czy
 * @date 2021/7/16
 */
public class AccountServiceImpl implements IAccountService {
    @Override
    public void transfer() {
        System.out.println("调用dao层，完成转账业务");
    }
}
