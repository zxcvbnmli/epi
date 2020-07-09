package cn.bdqn.epi.pojo;

import java.util.Date;

/**
 * @PackageName:cn.bdqn.epi.pojo
 * @ClassName:Line
 * @Description:
 * @author:木子羽
 * @date:2020/7/9 15:41
 */
//线路表
public class Line {
    private String lineId;//线路编号
    private String lineName;//线路名称
    private String lineLength;//线路长度
    private String loopLength;//回路长度
    private Integer taghNum;//塔基数
    private String firstTowerId;//起始杆塔编号
    private String finallyTowerId;//末尾杆塔编号
    private Date carryDate;//投运日期
    private Integer kv;//电压等级
    private Integer lineMode;//线路状态
    private Integer startMode;//启用状态默认为0 启用，停用为1
    private String comment;//备注

    public String getLineId() {
        return lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public String getLineLength() {
        return lineLength;
    }

    public void setLineLength(String lineLength) {
        this.lineLength = lineLength;
    }

    public String getLoopLength() {
        return loopLength;
    }

    public void setLoopLength(String loopLength) {
        this.loopLength = loopLength;
    }

    public Integer getTaghNum() {
        return taghNum;
    }

    public void setTaghNum(Integer taghNum) {
        this.taghNum = taghNum;
    }

    public String getFirstTowerId() {
        return firstTowerId;
    }

    public void setFirstTowerId(String firstTowerId) {
        this.firstTowerId = firstTowerId;
    }

    public String getFinallyTowerId() {
        return finallyTowerId;
    }

    public void setFinallyTowerId(String finallyTowerId) {
        this.finallyTowerId = finallyTowerId;
    }

    public Date getCarryDate() {
        return carryDate;
    }

    public void setCarryDate(Date carryDate) {
        this.carryDate = carryDate;
    }

    public Integer getKv() {
        return kv;
    }

    public void setKv(Integer kv) {
        this.kv = kv;
    }

    public Integer getLineMode() {
        return lineMode;
    }

    public void setLineMode(Integer lineMode) {
        this.lineMode = lineMode;
    }

    public Integer getStartMode() {
        return startMode;
    }

    public void setStartMode(Integer startMode) {
        this.startMode = startMode;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
