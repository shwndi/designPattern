package dsalist;

import java.util.Arrays;

/**
 * 数组lru算法
 *
 * @author czy
 * @date 2021/8/3
 */
public class LRUArray {
    private Object[] arr;
    private int CAPACITY_SIZE;
    private int currentSize;

    public LRUArray() {
        CAPACITY_SIZE = 9;
        arr = new Object[CAPACITY_SIZE];
        currentSize = 0;
    }

    public LRUArray(int n) {
        CAPACITY_SIZE = n;
        arr = new Object[CAPACITY_SIZE];
        currentSize = 0;
    }

    /**
     * 数组节点循环向前,数组值向后位移，自后一个放在开始的位置。
     * example:
     * {a,c,d,b,f}
     * {b,a,c,d,f}
     *
     * @param objs 数组
     * @param a    起始位置
     * @param b    结束位置
     * @return
     */
    public Object[] arrCirculationFront(Object[] objs, int a, int b) {
        if (a < 0 || b > objs.length || a > b) {
            throw new IllegalArgumentException("out of index err!");
        }
        if (a == b) {
            return objs;
        }
        Object obj = null;
        if (b <= objs.length - 1) {
            obj = objs[b];
        }
        Object next = null;
        for (int i = a; i <=b; i++) {
            next = objs[i];
            objs[i] = obj;
            obj = next;
        }
        return objs;
    }

    public void addElement(Object o) {
        //处理对象存在的情况
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].equals(o)) {
                //位移
                arrCirculationFront(arr, 0, i);
                return;
            }
        }
        //处理对象不存在的情况，未满
        if (currentSize < CAPACITY_SIZE) {
            arrCirculationFront(arr, 0, currentSize);
            arr[0] = o;
            currentSize++;
            return;
        }
        //处理对象不存在的情况，满了
        arrCirculationFront(arr, 0, CAPACITY_SIZE - 1);
        arr[0] = o;
    }

    @Override
    public String toString() {
        return "LRUArray{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    public static void main(String[] args) {
        LRUArray array = new LRUArray(5);
        array.addElement(1);
        array.addElement(2);
        array.addElement(3);
        array.addElement(4);
        array.addElement(5);
        array.addElement(6);
        System.out.println(array);
    }
}
