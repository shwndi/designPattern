package creator.buildermodel.demo2;

/**
 * 厨子
 *
 * @author czy
 * @date 2021/6/11
 */
public class Cook extends Recipe {
    private Course course;

    public Cook(){
        course = new Course();
    }

    @Override
    public Cook actionA() {
        course.setWater("兑水");
        return this;
    }

    @Override
    public Cook actionB() {
        course.setOil("兑油");
        return this;
    }

    @Override
    public Cook actionC() {
        course.setSalt("兑盐");
        return this;
    }

    @Override
    public Cook actionD() {
        course.setSugar("兑糖");
        return this;
    }

    @Override
    public Course getCase() {
        return course;
    }

}
