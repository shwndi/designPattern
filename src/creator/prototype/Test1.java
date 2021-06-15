package creator.prototype;

import java.util.Date;

/**
 * @author czy
 * @date 2021/6/15
 */
public class Test1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        MonkeyKing king = new MonkeyKing();
        String hat = "凤翅紫金冠";
        king.setHat(hat);
        String clothing = "锁子黄金甲";
        king.setClothing(clothing);
        String shoe = "藕丝步云履";
        king.setShoe(shoe);
        String weapon = "如意金箍棒";
        king.setWeapon(weapon);
        int age = 520;
        king.setAge(age);
        Integer length = 10000;
        king.setLookLength(length);
        Friend friend = new Friend("八戒");
        king.setFriend(friend);
        System.out.println(king);
        new Date();
/**
 * 通过比较发现，修改实例2的内部属性对实例1有影响
 * 当属性为引用类型的时候会产生，这种拷贝是一种浅拷贝
 * 而我们想要的的实例2应该是一种独立的个体，不想与实例一牵扯不清
 * 这时就要用到深拷贝
 */
        MonkeyKing king2 = (MonkeyKing) king.clone();
        System.out.println(king2);
        hat= "灭世者的死亡之帽";
        king2.setHat(hat);
        age = 620;
        king2.setAge(age);
        length = 22222;
        king2.setLookLength(length);
        friend.setName("沙和尚");
        System.out.println("king:"+king);
        System.out.println("king2:"+king2);
    }
}
