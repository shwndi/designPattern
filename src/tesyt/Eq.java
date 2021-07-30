package tesyt;

/**
 * @author czy
 * @date 2021/7/24
 */
public class Eq {
    public static void main(String[] args) {
        String a = "disease= dis&zhengzhuangJson= zhengzhuangJson&name= name&age= age&userId= yhid";
        String[] split = a.split("&");
        for (String s : split) {
            System.out.println(s);
            String b = s.substring(0, s.indexOf("= "));
            System.out.println(b);
            String c = s.substring(s.indexOf("= ") + 2, s.length());
            System.out.println(c);
        }


    }
}
