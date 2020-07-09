package cn.bdqn.epi.pojo;

/**
 * @PackageName:cn.bdqn.epi.pojo
 * @ClassName:Defact
 * @Description:
 * @author:木子羽
 * @date:2020/7/9 15:49
 */
//缺陷类型
public class Defact {
    private Integer defactId;//缺陷类型编号
    private String defactName;//缺陷类型
    private Integer defactMode;//使用状态0为使用 1为冻结

    public Integer getDefactId() {
        return defactId;
    }

    public void setDefactId(Integer defactId) {
        this.defactId = defactId;
    }

    public String getDefactName() {
        return defactName;
    }

    public void setDefactName(String defactName) {
        this.defactName = defactName;
    }

    public Integer getDefactMode() {
        return defactMode;
    }

    public void setDefactMode(Integer defactMode) {
        this.defactMode = defactMode;
    }
}
