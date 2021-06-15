package creator.buildermodel.lol;

/**
 * 大鹌鹑教练：
 * 导演：Director
 *
 * @author czy
 * @date 2021/6/15
 */
public class SLBCoach {
    /**
     * 四一分推
     *
     * @return
     */
    public Team fourPointPush(Rule rule) {
        rule.selectTopSolo("塔姆");
        rule.selectSquads("四一分推");
        return rule.getTeam();
    }

    /**
     * 五人抱团
     *
     * @return
     */
    public Team fivePushForward(Rule rule) {
        rule.selectADC("女警");
        rule.selectSquads("五人抱团");
        return rule.getTeam();
    }

    /**
     * 野辅联动
     *
     * @return
     */
    public Team jungleSupport(Rule rule) {
        rule.selectJungle("龙龟");
        rule.selectSupport("黑天使");
        rule.selectSquads("野辅联动");
        return rule.getTeam();
    }

    /**
     * 三叉戟
     *
     * @return
     */
    public Team trident(Rule rule) {
        rule.selectADC("寒冰");
        rule.selectMidSolo("鱼人");
        rule.selectTopSolo("剑魔");
        rule.selectADC("三叉戟");
        return rule.getTeam();
    }

    /**
     * 无敌法师
     *
     * @return
     */
    public Team invincibleMage(Rule rule) {
        rule.selectMidSolo("小法");
        rule.selectSquads("无敌法师");
        return rule.getTeam();
    }
}
