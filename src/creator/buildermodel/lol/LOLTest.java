package creator.buildermodel.lol;

/**
 * lol测试
 *
 * @author czy
 * @date 2021/6/15
 */
public class LOLTest {
    public static void main(String[] args) {
        DACRule player = new DACRule();
        Team coach = new SLBCoach().fourPointPush(player);
        System.out.println(coach);
    }
}
