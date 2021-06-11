package creator.old.factrorymodel.bo;

import creator.old.factrorymodel.abstractbo.BaseAnimal;

/**
 * @author czy
 * @date 2020-6-13
 */
public class Lion extends BaseAnimal {

    public Lion() {
    }


    public Lion(String colour, String high, String height) {
        super(colour, high, height);
    }

    @Override
    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public void setHigh(String high) {
        this.high=high;
    }

    @Override
    public void setHeight(String height) {
        this.height=height;
    }


    @Override
    public String getColour() {
        return this.colour;
    }

    @Override
    public String getHigh() {
        return this.high;
    }

    @Override
    public String getHeight() {
        return this.height;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String eat(BaseAnimal T) {
        return BaseAnimal.class + "吃了" + T.getClass();
    }
}
