package creationmodel.factrorymodel.abstractme;

/**
 * @author czy
 * @date 2021/6/9
 */
public class DMFactory implements RootFactory{

    @Override
    public IPhone getPhone() {
        return new DMPhone();
    }

    @Override
    public IPC getIPC() {
        return new DMPC();
    }
}
