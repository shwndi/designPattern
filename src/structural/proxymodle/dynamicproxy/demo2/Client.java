package structural.proxymodle.dynamicproxy.demo2;

import structural.proxymodle.dynamicproxy.demo1.ProxyForAnything;
import structural.proxymodle.staticproxy.demo2.Service;
import structural.proxymodle.staticproxy.demo2.ServiceImpl;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author czy
 * @date 2021/6/22
 */
public class Client {
    public static void main(String[] args) {
        //真实角色
        ServiceImpl service = new ServiceImpl();
        //代理角色，不存在
        ProxyForAnything proxyForAnything = new ProxyForAnything();
        //设置要代理的对象
        proxyForAnything.setObject(service);
        //真实di
        Service proxy = (Service) proxyForAnything.getProxy();

        proxy.add();
        proxy.del();
        proxy.sel();
        proxy.upd();
    }
}
