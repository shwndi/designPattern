package structural.proxymodle.dynamicproxy.springproxy.staticp;

import structural.proxymodle.dynamicproxy.springproxy.IAccountService;

/**
 * @author czy
 * @date 2021/7/16
 */
public class AccountProxy implements IAccountService {
    /**
     * 目标对象
     * 优先组合
     * 面向接口编程
     */
    private IAccountService accountService;

    /**
     * 构造器
     * 注入实例
     * @param accountService
     */
    public AccountProxy(IAccountService accountService) {
        this.accountService = accountService;
    }

    /**
     * 添油加醋
     */
    @Override
    public void transfer() {
        before();
        this.accountService.transfer();
    }

    /**
     * 前置增强
     */
    private void before() {
        System.out.println("转账前置处理");
    }

}
