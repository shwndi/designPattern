package structural.proxymodle.staticproxy.demo2;

/**
 * 为什么要用代理？
 * 不能再原有代码上加
 *
 * @author czy
 * @date 2021/6/21
 */
public class ServiceProxy implements Service {
    private ServiceImpl service;

    public void setService(ServiceImpl service) {
        this.service = service;
    }

    @Override
    public void add() {
        System.out.println("add");
        service.add();
    }

    @Override
    public void del() {
        System.out.println("del");
        service.del();
    }

    @Override
    public void upd() {
        System.out.println("upd");
        service.upd();
    }

    @Override
    public void sel() {
        System.out.println("sel");
        service.sel();
    }
}
