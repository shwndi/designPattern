package dsalist;

/**
 * 使用单链表实现lru算法
 * 
 * @author czy
 * @date 2021/8/3
 */
public class LRUList {
    /**
     * 链表
     */
    private final static MyList<Object> list = new MyList();
    /**
     * 容量
     */
    private  static int CAPACITY_SIZE = 9;
    private static int currentSize;

    public LRUList() {
        currentSize = 0;
    }

    /**
     * 初始化容量
     *
     * @param s
     */
    public LRUList(int s){
        CAPACITY_SIZE = s;
        currentSize = 0;
    }

    /**
     * 设置容量
     *
     * @param s
     */
    public void setCapacity(int s){
        CAPACITY_SIZE = s;
    }

    /**
     * 获取容量
     * @return
     */
    public int getCapacity(){
        return CAPACITY_SIZE;
    }

    /**
     * 元素新增
     *
     * 1：遍历查找，将节点移动到头部
     * 2：不存在的时候
     *  1）：链表不满放在头部
     *  2）：链表满了凡在头部并删除
     * @param o
     */
    public void addElement(Object o){
        //列表已存在
        for (int i = 0; i < currentSize; i++) {
            Object thisIndex = list.getThisIndex(i);
            if(thisIndex.equals(o)){
                list.del(i);
                list.addFirst(o);
                return;
            }
        }
        //列表不存在,未满
        if(currentSize < CAPACITY_SIZE){
            list.addFirst(o);
            currentSize++;
            return;
        }
        //列表不存在，满了
        list.delLeast();
        list.addFirst(o);
    }
    @Override
    public String toString(){
       return list.toString();
    }
    public static void main(String[] args){
        LRUList lruList = new LRUList(3);
        lruList.addElement("1");
        lruList.addElement("2");
        lruList.addElement("2");
        lruList.addElement("4");
        lruList.addElement("3");
        System.out.println(lruList);
    }
}
