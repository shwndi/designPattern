package dsalist;

/**
 * @author czy
 * @date 2021/7/30
 */
public class test06 {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.addFirst("a");
        list.add("b", 1);
        list.addLeast("c");
        list.addLeast("D");
        list.addLeast("E");
        try {
            list.update(2, "K");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
//        list.del(3);
//        int e = list.getFirstIndex("a");
//        Object thisIndex = list.getThisIndex(0);
//        System.out.println(thisIndex);

        System.out.println(list.toString());
    }
}

class Node<T> {
    public T t;
    public Node next;

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

 class MyList<T> {
    private Node head;//头结点
    private int size;//元素个数

    public MyList() {
        this.head = null;
        this.size = 0;
    }

    //头部插入
    public void addFirst(T t) {
        Node<T> tNode = new Node<>(t);
        tNode.next = this.head;
        this.head = tNode;
        this.size++;
    }

    //尾部插入
    public void addLeast(T t) {
        Node<Object> objectNode = new Node<>();
        this.add(t, size);
    }

    //中间插入
    public void add(T t, int index) {
        if (index < 0 || index > this.size) {
            throw new IllegalArgumentException("index id err");
        }
        if (index == 0) {
            addFirst(t);
            return;
        }
        Node preNode = this.head;
        //插入前找第一个节点
        for (int i = 0; i < index - 1; i++) {
            preNode = preNode.next;
        }
        Node node = new Node(t);
        //插入下一个节点
        node.next = preNode.next;
        preNode.next = node;
        this.size++;
    }

    //头部删除
    public void delFirst() {
        if (head == null) {
            throw new NullPointerException("the list is null");
        }
        this.head = this.head.next;
        this.size--;
    }

    //尾部删除
    public void delLeast() {
        if (this.head == null) {
            throw new NullPointerException("there is no instance");
        }
        Node head1 = this.head;
        for (int i = 0; i < size; i++) {
            head1 = head.next;
        }
        head1.next = null;

    }

    //删除第n个节点
    public void del(int index) {
        if (head == null) {
            throw new NullPointerException("the list is null");
        }
        if (index < 0 | index > size - 1) {
            throw new IllegalArgumentException("index is err");
        }
        if (index == 0) {
            this.delFirst();
            return;
        }
        if (index == size - 1) {
            this.delLeast();
        }
        //找到该位置的前一个节点，让这个节点的下一节点为该位置的下一个节点。
        Node head = this.head;
        for (int i = 0; i < index - 1; i++) {
            head = head.next;
        }
        head.next = head.next.next==null?null:head.next.next;
        this.size--;
        return;
    }


    public int getFirstIndex(T t) {
        Node head = this.head;
        for (int i = 0; i < size; i++) {
            Object t1 = head.t;
            if (t instanceof MyList) {
                if (t.equals(t1)) {
                    return i;
                }
                head = head.next;
            }
        }
        return -1;
    }

    //获取第n个位置的值
    public <T> Object getThisIndex(int n) {
        if (n < 0 || n > size - 1) {
            throw new IllegalArgumentException("out of index");
        }
        Node node = this.head;
        for (int i = 0; i < size; i++) {
            if (n == i) {
                return node.t;
            }
            node = node.next;
        }
        return null;
    }

    //修改
    public MyList update(int n, T t) throws ClassNotFoundException {
        if (n < 0 || n > size - 1) {
            throw new IllegalArgumentException("out of index");
        }
        Node head = this.head;
        for (int i = 0; i < n; i++) {
            head = head.next;
        }
        head.t = t;
        return this;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        Node cur = this.head;
        while (cur != null) {
            sb.append(cur.t + "->");
            cur = cur.next;
        }
        sb.append("NULL");
        return sb.toString();
    }

    /**
     * 回文字符串检查
     * 空间复杂度：O(n)
     * 时间复杂度：O(n)
     * -
     *
     * @param s
     * @return
     */
    public static boolean checkABA(String s) {
        if (s == null) {
            throw new NullPointerException("there is null value");
        }

        int length = s.length();
        float mid = (float) (length - 1) / 2;
        MyList<String> list = new MyList<>();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (i < mid) {
                list.addFirst(String.valueOf(c));
            }
            if (i > mid) {
                String ss = (String) list.getThisIndex(0);
                if (!ss.equals(String.valueOf(c))) {
                    return false;
                }
                list.delFirst();
            }
        }
        return true;
    }

    public void reversed() {
        Node head = this.head;
        for (int i = 0; i < size; i++) {

        }
    }

    public static boolean hasLoopV1(Node headNode) {

        if (headNode == null) {
            return false;
        }

        Node p = headNode;
        Node q = headNode.next;

        // 快指针未能遍历完所有节点
        while (q != null && q.next != null) {
            p = p.next; // 遍历一个节点
            q = q.next.next; // 遍历两个个节点

            // 已到链表末尾
            if (q == null) {
                return false;
            } else if (p == q) {
                // 快慢指针相遇，存在环
                return true;
            }
        }

        return false;
    }


    public static void main(String[] args) {
//        String s = "aasasdqdsa";
//        boolean b = MyList.checkABA(s);
//        System.out.println(b);
        Node node5 = new Node(5, null);
        Node node4 = new Node(4, node5);
        Node node3 = new Node(3, node4);
        Node node2 = new Node(2, node3);
        Node node1 = new Node(1, node2);
        node5.next = node3;
        MyList<Integer> list = new MyList<>();
        list.head=node1;
        list.size = 5;
        System.out.println(list.toString());

    }

}
