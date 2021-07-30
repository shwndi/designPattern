package creator.old.filterchain.chain2;


import java.util.LinkedList;
import java.util.List;

/**
 * @author czy
 * @date 2021/7/19
 */
public class MainChain {
    List<Chain> chains;
    int size = 0;

    public MainChain() {
        this.chains = new LinkedList<>();
    }
    public void add(Chain chain){
        chains.add(chain);
    }
    public void doChain(Bike bike){
        System.out.println(size);
        System.out.println("进入责任链");
        if (size<chains.size()){
            chains.get(size++).doChain(bike,this);
        }
        System.out.println("退出责任链");
        System.out.println(size);
    }
}
