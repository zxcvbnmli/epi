package cn.bdqn.epi.pojo;

/**
 * @PackageName:cn.bdqn.epi.pojo
 * @ClassName:DefactLevels
 * @Description:
 * @author:木子羽
 * @date:2020/7/9 15:53
 */
//缺陷等级表
public class DefactLevels {
    private Integer id;//缺陷等级id
    private String levelsName;//缺陷等级
    private String intactRat;//完好率

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLevelsName() {
        return levelsName;
    }

    public void setLevelsName(String levelsName) {
        this.levelsName = levelsName;
    }

    public String getIntactRat() {
        return intactRat;
    }

    public void setIntactRat(String intactRat) {
        this.intactRat = intactRat;
    }
}
