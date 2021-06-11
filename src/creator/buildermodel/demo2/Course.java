package creator.buildermodel.demo2;

/**
 * 菜的模板
 *
 * @author czy
 * @date 2021/6/11
 */
public class Course {
    private String water = "三斤水";
    private String oil = "四斤油";
    private String salt = "五勺盐";
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

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getSugar() {
        return sugar;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }

    @Override
    public String toString() {
        return "Case{" +
                "water='" + water + '\'' +
                ", oil='" + oil + '\'' +
                ", salt='" + salt + '\'' +
                ", sugar='" + sugar + '\'' +
                '}';
    }
}
