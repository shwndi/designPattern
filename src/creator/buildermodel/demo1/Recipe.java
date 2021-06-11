package creator.buildermodel.demo1;

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
    abstract void actionA();

    /**
     * 加油
     */
    abstract void actionB();

    /**
     * 加盐
     */
    abstract void actionC();

    /**
     * 加糖
     */
    abstract void actionD();

    /**
     * 获得产品
     *
     * @return
     */
    abstract Course getCase();
}
