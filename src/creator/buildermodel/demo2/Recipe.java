package creator.buildermodel.demo2;

/**
 * 配方
 *
 * @author czy
 * @date 2021/6/11
 */
public abstract class Recipe {
    /**
     * 加水
     *
     * @return
     */
    abstract creator.buildermodel.demo2.Cook actionA();

    /**
     * 加油
     * @return
     */
    abstract creator.buildermodel.demo2.Cook actionB();

    /**
     * 加盐
     * @return
     */
    abstract creator.buildermodel.demo2.Cook actionC();

    /**
     * 加糖
     * @return
     */
    abstract creator.buildermodel.demo2.Cook actionD();

    /**
     * 获得产品
     *
     * @return
     */
    abstract Course getCase();
}
