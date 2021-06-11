package creator.abstracefactorymodel.myabstract;

/**
 * @author czy
 * @date 2021/6/9
 */
public class GLFactory implements RootFactory{


    @Override
    public IPhone getPhone() {
        return new GLIphone();
    }

    @Override
    public IPC getIPC() {
        return new GLPC();
    }
}
