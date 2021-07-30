package creator.old.filterchain.chain2;

/**
 * @author czy
 * @date 2021/7/19
 */
public class Client {
    public static void main(String[] args) {
        MainChain mainChain = new MainChain();
        Chain1 chain1 = new Chain1();
        Chain2 chain2 = new Chain2();
        mainChain.add(chain1);
        mainChain.add(chain2);
        Bike bike = new Bike("凤凰");
        mainChain.doChain(bike);
    }
}
