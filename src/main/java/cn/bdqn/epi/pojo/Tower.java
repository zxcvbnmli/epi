package cn.bdqn.epi.pojo;

/**
 * @PackageName:cn.bdqn.epi.pojo
 * @ClassName:Tower
 * @Description:
 * @author:木子羽
 * @date:2020/7/9 15:36
 */
//杆塔表
public class Tower {
    private String towerId;//杆塔编号
    private String lineId;//线路编号
    private Integer towerMode;//杆塔状态

    public String getTowerId() {
        return towerId;
    }

    public void setTowerId(String towerId) {
        this.towerId = towerId;
    }

    public String getLineId() {
        return lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId;
    }

    public Integer getTowerMode() {
        return towerMode;
    }

    public void setTowerMode(Integer towerMode) {
        this.towerMode = towerMode;
    }
}
