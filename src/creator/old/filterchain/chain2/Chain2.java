package creator.old.filterchain.chain2;

/**
 * @author czy
 * @date 2021/7/19
 */
public class Chain2 implements Chain{
    @Override
    public void doChain(Bike bike, MainChain chain) {
        System.out.println("第二节点开始");
        chain.doChain(bike);
        System.out.println("第二节点结束");
    }
}
