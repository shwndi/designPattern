package creator.old.filterchain.chain2;

/**
 * @author czy
 * @date 2021/7/19
 */
public class Bike {
    String color;
    String size;
    String light;
    String name;

    public Bike(String name) {
        this.name = name;
        System.out.println("买了一辆自行车，名字叫："+ name);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println("刷了"+color+"的油漆");
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
        System.out.println("有"+ size+"高");
    }

    public String getLight() {
        return light;
    }

    public void setLight(String light) {
        this.light = light;
        System.out.println("安装点灯");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", light='" + light + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
