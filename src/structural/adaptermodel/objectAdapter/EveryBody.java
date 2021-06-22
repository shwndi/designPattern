package structural.adaptermodel.objectAdapter;

/**
 * 每个人
 *  每个人的信念心中都有迪迦，通过希望之光操作迪迦打怪兽
 * @author czy
 * @date 2021/6/21
 */
public class EveryBody implements Light{
    private UltramanTiga ultramanTiga;

    public EveryBody(UltramanTiga ultramanTiga) {
        this.ultramanTiga = ultramanTiga;
    }

    @Override
    public void becomeBigPerson() {
        ultramanTiga.action();
    }
}
