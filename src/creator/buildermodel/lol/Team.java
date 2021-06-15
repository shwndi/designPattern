package creator.buildermodel.lol;

/**
 * 阵容
 *
 * @author czy
 * @date 2021/6/15
 */
public class Team {
    /**
     * 上单
     */
    private String topSolo = "自主选择";
    /**
     * 中单
     */
    private String midSolo = "自主选择";
    /**
     * 打野
     */
    private String jungle = "自主选择";
    /**
     * ADC
     */
    private String ADC = "自主选择";
    /**
     * 辅助
     */
    private String support = "自主选择";
    /**
     * 阵容
     */
    private String squads;

    public String getTopSolo() {
        return topSolo;
    }

    public void setTopSolo(String topSolo) {
        this.topSolo = topSolo;
    }

    public String getMidSolo() {
        return midSolo;
    }

    public void setMidSolo(String midSolo) {
        this.midSolo = midSolo;
    }

    public String getJungle() {
        return jungle;
    }

    public void setJungle(String jungle) {
        this.jungle = jungle;
    }

    public String getADC() {
        return ADC;
    }

    public void setADC(String ADC) {
        this.ADC = ADC;
    }

    public String getSupport() {
        return support;
    }

    public void setSupport(String support) {
        this.support = support;
    }

    public String getSquads() {
        return squads;
    }

    public void setSquads(String squads) {
        this.squads = squads;
    }

    @Override
    public String toString() {
        return "Team{" +
                "topSolo='" + topSolo + '\'' +
                ", midSolo='" + midSolo + '\'' +
                ", jungle='" + jungle + '\'' +
                ", ADC='" + ADC + '\'' +
                ", support='" + support + '\'' +
                ", squads='" + squads + '\'' +
                '}';
    }
}
