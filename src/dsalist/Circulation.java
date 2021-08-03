package dsalist;

/**
 * 循环单链表
 *
 * @author czy
 * @date 2021/8/3
 */
public class Circulation<T> {
    static class Node<T> {
        private T t;
        private Node next;

        public Node(T t, Node next) {
            this.t = t;
            this.next = next;
        }

        public Node(T t) {
            this(t, null);
        }

        public T getT() {
            return t;
        }
    }

    private Node head;
    private Node least;
    private int currentIndex;

    public Circulation() {
    }

    /**
     * 首部添加
     * @param t
     */
    public void addFirst(T t) {
        Node<T> tNode = new Node<>(t);
        if (currentIndex == 0) {
            head = tNode;
            least = tNode;
            least.next = head;
            currentIndex ++;
            return;
        }
        tNode.next = head;
        head = tNode;
        least.next = tNode;
        currentIndex++;
        return;
    }

    /**
     * 尾部添加
     * @param t
     */
    public void addLeast(T t){
        Node<T> tNode = new Node<>(t);
        if (currentIndex == 0) {
            head = tNode;
            least = tNode;
            least.next = head;
            currentIndex ++;
            return;
        }
        least.next = tNode;
        tNode.next = head;
        currentIndex++;
    }

    /**
     * 删除首部
     */
    public void delFirst(){
        if (currentIndex<=0){
            throw new NullPointerException("the SentryList is empty");
        }
        if (currentIndex == 1){
            head = null;
            least = null;
            currentIndex--;
            return;
        }
        head = head.next;
        least.next = head;
        currentIndex--;
    }

    /**
     * 删除尾部
     */
    public void delLeast(){
        if (currentIndex<=0){
            throw new NullPointerException("the SentryList is empty");
        }
        if (currentIndex == 1){
            head = null;
            least = null;
            currentIndex--;
            return;
        }
        Node head = this.head;
        for (int i = 1; i <= currentIndex; i++) {
            if (i==currentIndex-1){
                least = head;
                least.next = this.head;
                currentIndex--;
                return;
            }
            head = head.next;
        }
    }

    @Override
    public String toString() {
        StringBuffer s = new StringBuffer();
        Node head = this.head;
        for (int i = 0; i < currentIndex; i++) {
            s.append(head.t.toString()+ "->");
            head=head.next;
        }
        s.append("NULL");
        return s.toString();
    }

    public static void main(String[] args) {
        Circulation<String> list = new Circulation<>();
        list.addFirst("a");
        list.addFirst("b");
        list.addFirst("c");
        list.addFirst("d");
        list.addLeast("e");
        //list.delFirst();
        list.delLeast();
        System.out.println(list.toString());
    }
}
