package creator.buildermodel.demo1;

/**
 * @author czy
 * @date 2021/6/11
 */
public class Test {
    public static void main(String[] args) {
        //指挥
        Manager manager = new Manager();
        //根据管理者命令顺序来让厨子干活
        /**
         * 聘请厨师的时候先炒股菜，
         * 然后听从指挥开始干活,
         * 最后厨师拿出炒好的菜。
         */
        Course course = manager.getCook1(new Cook());
        System.out.println(course.toString());
        System.out.println("==========================================");
        System.out.println("              我是华丽分割线");
        System.out.println("==========================================");
        Course course1c = manager.getCook2(new Cook());
        System.out.println(course1c.toString());
    }
}
