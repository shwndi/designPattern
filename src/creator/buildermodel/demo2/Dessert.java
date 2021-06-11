package creator.buildermodel.demo2;

/**
 * 甜点
 *
 * @author czy
 * @date 2021/6/11
 */
public class Dessert {
    private String water = "三斤水";
    private String oil = "四斤油";
    private String sugar = "六把糖";

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getOil() {
        return oil;
    }

    public void setOil(String oil) {
        this.oil = oil;
    }

    public String getSugar() {
        return sugar;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }

    @Override
    public String toString() {
        return "Dessert{" +
                "water='" + water + '\'' +
                ", oil='" + oil + '\'' +
                ", sugar='" + sugar + '\'' +
                '}';
    }
}
