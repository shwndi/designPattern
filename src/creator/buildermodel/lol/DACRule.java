package creator.buildermodel.lol;

/**
 * 东北大鹌鹑战队：选手
 * 实际玩的人
 *
 * @author czy
 * @date 2021/6/15
 */
public class DACRule extends Rule {
    private Team team;
    public DACRule(){
        this.team = new Team();
    }


    @Override
    void selectTopSolo(String name) {
        System.out.println("上路选择："+name);
        team.setTopSolo(name);
    }

    @Override
    void selectMidSolo(String name) {
        System.out.println("中路选择："+name);
        team.setMidSolo(name);
    }

    @Override
    void selectJungle(String name) {
        System.out.println("打野选择："+name);
        team.setJungle(name);
    }

    @Override
    void selectADC(String name) {
        System.out.println("ADC选择："+name);
        team.setADC(name);
    }

    @Override
    void selectSupport(String name) {
        System.out.println("辅助选择："+name);
        team.setSupport(name);
    }
    @Override
    void selectSquads(String name){
        System.out.println("战术选择："+name);
        team.setSquads(name);
    }


    @Override
    Team getTeam() {
        return team;
    }
}
