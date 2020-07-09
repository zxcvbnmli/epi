package cn.bdqn.epi.pojo;/**
 * @PackageName:cn.bdqn.epi.pojo
 * @ClassName:Patrol
 * @Description:
 * @author 杰哥
 * @date 2020/7/9 15:50
 */

import java.util.Date;

/**
 *@PackageName:cn.bdqn.epi.pojo
 *@ClassName:Patrol
 *@Description:
 *@author 杰哥
 *@date 2020/7/9 15:50
 */
public class Patrol {
    private String taskNum;//任务编号
    private String taskName;//任务名称
    private String lineId;//完好率
    private String firstTowerId;//起始杆塔标号
    private String finallyTowerId;//结尾杆塔编号
    private Integer userId;//任务发布人 只能是线路管理员
    private String iPQC;//巡检员
    private Date publishDate;//任务发布时间
    private String taskStatus;//任务状态
    private String exists;//任务是否取消  默认为否

    public String getTaskNum() {
        return taskNum;
    }

    public void setTaskNum(String taskNum) {
        this.taskNum = taskNum;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getLineId() {
        return lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId;
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getiPQC() {
        return iPQC;
    }

    public void setiPQC(String iPQC) {
        this.iPQC = iPQC;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getExists() {
        return exists;
    }

    public void setExists(String exists) {
        this.exists = exists;
    }
}
