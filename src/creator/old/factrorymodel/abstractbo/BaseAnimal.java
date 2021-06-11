package creator.old.factrorymodel.abstractbo;

/**
 * @author czy
 * @date 2020-6-13
 */
public abstract class BaseAnimal {
    protected String colour;
    protected String high;
    protected String height;
    public  BaseAnimal(){};

    public BaseAnimal(String colour, String high, String height){
        this.colour=colour;
        this.high=high;
        this.height=height;
    }

    /**
     * 设置颜色
     * @param colour
     * @return
     */
    public abstract void setColour(String colour);

    /**
     * 设置身高
     * @param high
     * @return
     */
    public abstract void setHigh(String high);

    /**
     * 设置体重
     * @param height
     * @return
     */
    public abstract void setHeight(String height);
    /**
     * 获取颜色
     *
     * @return
     */
    public abstract String getColour();

    /**
     * 获取身高
     *
     * @return
     */
    public abstract String getHigh();

    /**
     * 获取体重
     *
     * @return
     */
    public abstract String getHeight();

    @Override
    public String toString() {
        return this.getClass()+"\tcolour=" + this.getColour() + "\thigh=" + this.getHigh() + "\theight=" + this.getHeight();
    }
}
