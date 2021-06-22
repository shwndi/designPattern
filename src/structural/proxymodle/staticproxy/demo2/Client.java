package structural.proxymodle.staticproxy.demo2;

/**
 * 客户端
 *
 * @author czy
 * @date 2021/6/21
 */
public class Client {
    public static void main(String[] args) {
        ServiceImpl service = new ServiceImpl();
        service.add();
        service.del();
        service.upd();
        service.sel();

        System.out.println("+++++++++++++++++++++++++");
        ServiceProxy serviceProxy = new ServiceProxy();
        serviceProxy.setService(service);
        serviceProxy.add();
        serviceProxy.del();
        serviceProxy.upd();
        serviceProxy.sel();

    }
}
