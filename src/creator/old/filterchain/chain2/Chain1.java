package creator.old.filterchain.chain2;

/**
 * @author czy
 * @date 2021/7/19
 */
public class Chain1 implements Chain{
    @Override
    public void doChain(Bike bike, MainChain chain) {
        System.out.println("第一节点开始");
        chain.doChain(bike);
        System.out.println("第一节点结束");
    }
}
