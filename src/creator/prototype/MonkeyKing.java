package creator.prototype;

import jdk.jfr.DataAmount;

/**
 * 原型模式
 * 1：实现接口Cloneable
 * 2:重写clone（）方法
 * 凤翅紫金冠 锁子黄金甲 藕丝步云履 如意金箍棒
 * @author czy
 * @date 2021/6/15
 */

public class MonkeyKing implements Cloneable {
    private String hat;
    private String clothing;
    private String shoe;
    private String weapon;
    private int age;
    private Integer lookLength;
    private Friend friend;

    public MonkeyKing() {
    }

    public MonkeyKing(String hat, String clothing, String shoe, String weapon, int age, Integer lookLength, Friend friend) {
        this.hat = hat;
        this.clothing = clothing;
        this.shoe = shoe;
        this.weapon = weapon;
        this.age = age;
        this.lookLength = lookLength;
        this.friend = friend;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getHat() {
        return hat;
    }

    public void setHat(String hat) {
        this.hat = hat;
    }

    public String getClothing() {
        return clothing;
    }

    public void setClothing(String clothing) {
        this.clothing = clothing;
    }

    public String getShoe() {
        return shoe;
    }

    public void setShoe(String shoe) {
        this.shoe = shoe;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public Integer getLookLength() {
        return lookLength;
    }

    public void setLookLength(Integer lookLength) {
        this.lookLength = lookLength;
    }

    public Friend getFriend() {
        return friend;
    }

    public void setFriend(Friend friend) {
        this.friend = friend;
    }

    @Override
    public String toString() {
        return "MonkeyKing{" +
                "hat='" + hat + '\'' +
                ", clothing='" + clothing + '\'' +
                ", shoe='" + shoe + '\'' +
                ", weapon='" + weapon + '\'' +
                ", age=" + age +
                ", lookLength=" + lookLength +
                ", friend=" + friend +
                '}';
    }
}
class Friend{
    String name;

    public Friend() {
    }

    public Friend(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                '}';
    }
}
