package creator.buildermodel.demo1;

/**
 * 厨子
 *
 * @author czy
 * @date 2021/6/11
 */
public class Cook extends Recipe{
    private Course course;

    public Cook(){
        course = new Course();
    }

    @Override
    public void actionA() {
        course.setWater("兑水");
        System.out.println("对水");
    }

    @Override
    public void actionB() {
        course.setOil("兑油");
        System.out.println("兑油");
    }

    @Override
    public void actionC() {
        course.setSalt("兑盐");
        System.out.println("兑盐");
    }

    @Override
    public void actionD() {
        course.setSugar("兑糖");
        System.out.println("兑糖");
    }

    @Override
    public Course getCase() {
        return course;
    }

}
