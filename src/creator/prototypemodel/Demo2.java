package creator.prototypemodel;

import java.util.Date;

/**
 * @author czy
 * @date 2021/6/15
 */
//实现接口
public class Demo2 implements Cloneable {
    private String name;
    private Date date;

    public Demo2() {
    }

    public Demo2(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * 重写方法
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object clone = super.clone();
        //实现深克隆
        Demo2 demo2 = (Demo2) clone;
        demo2.date = (Date) this.date.clone();
        return clone;
    }

    @Override
    public String toString() {
        return "Demo2{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Demo2 demo2 = new Demo2();
        Date date = new Date();
        demo2.setDate(date);
        demo2.setName("唐僧");
        Demo2 clone = (Demo2)demo2.clone();
        System.out.println(demo2);
        System.out.println(clone);
        date = new Date(1111111);
        clone.setDate(date);
        System.out.println("===========================");
        System.out.println(demo2);
        System.out.println(clone);
    }
}
