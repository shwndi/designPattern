package creator.buildermodel.lol;

/**
 * 操作
 *
 * @author czy
 * @date 2021/6/15
 */
public abstract class Rule {
    abstract void selectTopSolo(String name);
    abstract void selectMidSolo(String name);
    abstract void selectJungle(String name);
    abstract void selectADC(String name);
    abstract void selectSupport(String name);
    abstract void selectSquads(String name);
    abstract Team getTeam();
}
