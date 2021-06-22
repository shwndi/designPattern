package structural.proxymodle.dynamicproxy.demo1;

import structural.proxymodle.dynamicproxy.demo2.ProxyInvocationHandler;

/**
 * @author czy
 * @date 2021/6/22
 */
public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();
        //代理角色
        ProxyInvocationHandler handler = new ProxyInvocationHandler();
        //通过调用程序处理角色来处理我们要调用的接口对象
        handler.setRent(host);

        Rent proxy = (Rent)handler.getProxy();//这里的proxy是动态生成的

        proxy.rent();

    }
}
