package dsalist;

/**
 * 哨兵队列
 *
 * @author czy
 * @date 2021/8/3
 */
public class SentryList<T> {
    static class Node<T> {
        private T t;
        private Node<T> next;

        public Node() {
        }

        public Node(T t, Node next) {
            this.t = t;
            this.next = next;
        }

        public Node(T t) {
            this(t, null);

        }
    }

    private Node head = new Node(new Object());
    private int currentSize;

    public SentryList() {
    }

    public void addFirst(T t) {
        Node tNode = new Node<>(t);
        tNode.next = head.next;
        head.next = tNode;
        currentSize++;
    }

    public void addLeast(T t) {
        Node node = new Node(t);
        Node head = this.head;
        while (head.next != null) {
            head = head.next;
        }
        head.next = node;
        currentSize++;
    }

    public void delFirst() {
        Node head = this.head;
        if (currentSize <= 0) {
            throw new NullPointerException("the SentryList is empty");
        }
        head.next = head.next.next;
        currentSize--;
    }

    public void delLeast() {
        if (currentSize <= 0) {
            throw new NullPointerException("the SentryList is empty");
        }
        Node head = this.head;
        while (head.next.next != null) {
            head = head.next;
        }
        head.next = null;
        currentSize--;
    }

    /**
     * 存在则删除返回1
     * 不存在则返回-1
     *
     * @param t
     * @return
     */
    public int delObj(T t) {
        Node head = this.head;
        while(head.next!=null){
            if (head.next.t.equals(t)){
                head.next=head.next.next;
                currentSize--;
                return 1;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuffer s = new StringBuffer();
        Node head = this.head;
        while (head.next != null) {
            s.append(head.next.t.toString() + "->");
            head = head.next;
        }
        s.append("NULL");
        return s.toString();
    }


    /**
     * 测试哨兵方法
     *
     * @param args
     */
    public static void main(String[] args) {
        SentryList<String> list = new SentryList<>();
        list.delObj("c");
        System.out.println(list.toString());
        //list.delFirst();
        list.addFirst("a");
//        System.out.println(list.toString());
//        list.delLeast();
        list.addFirst("b");
        list.addFirst("c");
//        System.out.println(list.toString());
        list.addLeast("h");
        list.delObj("c");
        System.out.println(list.toString());
        System.out.println(list.currentSize);
    }
}
