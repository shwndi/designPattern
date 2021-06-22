package structural.proxymodle.staticproxy.demo;

/**
 * 代理模式的好处：
 * 1、可以是真实角色操作更加纯粹，不用去关注一些公共的业务
 * 2、公共的业务交给代理角色，实现了业务的分工
 * 3、公共业务发生扩展的时候，方便集中管理
 *
 * 缺点;
 * 一个真是角色就会产生一个代理角色；代码量会翻倍~开发效率会变低
 *
 * @author czy
 * @date 2021/6/21
 */
public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        host.rent();
        System.out.println("|+++++++++++++++++++++++++++++|");
        /**
         * 代理，中介帮房东租房子，但是，中介还有其他附属的操作。
         */
        Proxy proxy = new Proxy(new Host());
        proxy.rent();
    }
}
