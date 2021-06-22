package structural.proxymodle.staticproxy.demo2;

/**
 * 真实方法
 * @author czy
 * @date 2021/6/21
 */
public class ServiceImpl implements Service{

    @Override
    public void add() {
        System.out.println("增加一个用户");
    }

    @Override
    public void del() {
        System.out.println("删除一个用户");

    }

    @Override
    public void upd() {
        System.out.println("修改一个用户");

    }

    @Override
    public void sel() {
        System.out.println("查询一个用户");

    }
}
