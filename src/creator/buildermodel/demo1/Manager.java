package creator.buildermodel.demo1;

/**
 * @author czy
 * @date 2021/6/11
 */
public class Manager {

    /**
     * 创建步骤
     *
     * @param recipe
     * @return
     */
    public Course getCook1(Recipe recipe){
        recipe.actionA();
        recipe.actionB();
        recipe.actionC();
        recipe.actionD();
        return recipe.getCase();
    }
    public Course getCook2(Recipe recipe){
        recipe.actionD();
        recipe.actionB();
        recipe.actionC();
        recipe.actionA();
        return recipe.getCase();
    }
}
