package structural.proxymodle.staticproxy.demo;

/**
 * 中介
 * @author czy
 * @date 2021/6/21
 */
public class Proxy {
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void rent() {
        host.rent();
    }
    //看房
    public void seeHouse(){
        System.out.println("中介带你去看房子");
    }
    public void hetong(){
        System.out.println("中介带你签合同");
    }
    public void fare(){
        System.out.println("中介收费");
    }
}
