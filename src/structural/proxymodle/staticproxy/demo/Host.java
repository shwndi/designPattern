package structural.proxymodle.staticproxy.demo;

/**
 * 房东
 * @author czy
 * @date 2021/6/21
 */
public class Host implements Rent{
    @Override
    public void rent(){
        System.out.println("房东要租房子！");
    }
}
