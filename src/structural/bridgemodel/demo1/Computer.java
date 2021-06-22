package structural.bridgemodel.demo1;

/**
 * 电脑抽象类
 *
 * @author czy
 * @date 2021/6/21
 */
public abstract class Computer {
    protected Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }

    public void info() {
        brand.info();
    }
}
//三类电脑

/**
 * 笔记本
 */
class Laptop extends Computer{

    public Laptop(Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        super.info();
        System.out.print("笔记本");
    }
}

/**
 * 台式机
 */
class Desktop extends Computer{
    public Desktop(Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        super.info();
        System.out.print("笔记本");
    }
}

class Ipad extends  Computer{
    public Ipad(Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("平板");
    }
}