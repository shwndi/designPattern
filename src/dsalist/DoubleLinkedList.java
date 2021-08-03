package dsalist;

/**
 * 双向链表
 *
 * @author czy
 * @date 2021/8/3
 */
public class DoubleLinkedList<T> {
    static class Node<T> {
        private Node prev;
        private T t;
        private Node next;

        public Node(Node prev, T t, Node next) {
            this.prev = prev;
            this.t = t;
            this.next = next;
        }

        public Node(T t) {
            this(null, t, null);
        }

        public T getT() {
            return t;
        }
    }

    private Node head;
    private int currentSize = 0;
    private Node least;

    public DoubleLinkedList() {
    }

    public void addFirst(T t) {
        Node<T> tNode = new Node<>(t);
        if (head == null) {
            head = tNode;
            least = tNode;
            return;
        }
        head.prev = tNode;
        tNode.next = head;
        head = tNode;
    }

    public void addLeast(T t) {
        Node<T> tNode = new Node<>(t);
        if (head == null) {
            head = tNode;
            least = tNode;
            currentSize++;
            return;
        }
        least.next = tNode;
        tNode.prev = least;
        least = tNode;
        currentSize++;
    }

    public void delFirst() {
        if (currentSize < 1) {
            throw new NullPointerException("the list is empty");
        }
        if (currentSize == 1) {
            head = null;
            least = null;
            currentSize = 0;
            return;
        }
        head = head.next;
        head.prev = null;
        currentSize--;
    }

    public void delLeast() {
        if (currentSize < 1) {
            throw new NullPointerException("the list is empty");
        }
        if (currentSize == 1) {
            head = null;
            least = null;
            currentSize = 0;
            return;
        }
        Node prev = least.prev;
        prev.next=null;
        least = prev;
        currentSize--;
    }

    @Override
    public String toString() {
        StringBuffer s = new StringBuffer();
        Node head = this.head;
        while (head!=null) {
            s.append(head.t.toString()+"->");
            head = head.next;
        }
        return s.toString();
    }

    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        list.addLeast("a");
        list.addFirst("b");
        System.out.println(list.toString());
        list.addLeast("c");
        list.addLeast("d");
        list.addLeast("e");
        System.out.println(list.toString());
        list.delFirst();
        System.out.println(list.toString());
        list.delLeast();
        System.out.println(list.toString());
    }
}
