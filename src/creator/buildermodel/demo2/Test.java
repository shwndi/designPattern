package creator.buildermodel.demo2;

/**
 * @author czy
 * @date 2021/6/11
 */
public class Test {
    public static void main(String[] args) {
        Recipe cook = new Cook();
        Course aCase = cook.actionA().actionC().getCase();
        System.out.println(aCase.toString());
        Cook cook1 = new Cook();
        System.out.println(cook1.getCase().toString());
    }
}
