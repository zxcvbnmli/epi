package cn.bdqn.epi.pojo;

import java.util.Date;

/**
 * @PackageName:cn.bdqn.epi.pojo
 * @ClassName:HandleTak
 * @Description:
 * @author:木子羽
 * @date:2020/7/9 15:28
 */
public class HandleTak {
    //消缺任务表
    private Integer id;//消缺编号
    private String taskNum;//任务编号
    private String taskName;//任务名称
    private Integer workTicket;//工作单据  0任务单 1第一种单据 2第二种单据
    private String issuer;//任务下发人  只能是线路管理员  谁下发谁负责
    private Date issuedTime;//下发时间
    private String pirncrpal;//负责人
    private String taskIntro;//任务描述
    private String comment;//备注
    private String iPQC;//巡检员
    private Date finishTime;//任务完成时间
    private String pExamine;//负责人审查意见
    private String issuerExamine;//下发人审核意见
    private String completionStatus;//完成状态描述
    private String intactRate;//完好率
    private String exists;//任务是否取消  默认为否

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Integer getWorkTicket() {
        return workTicket;
    }

    public void setWorkTicket(Integer workTicket) {
        this.workTicket = workTicket;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public Date getIssuedTime() {
        return issuedTime;
    }

    public void setIssuedTime(Date issuedTime) {
        this.issuedTime = issuedTime;
    }

    public String getPirncrpal() {
        return pirncrpal;
    }

    public void setPirncrpal(String pirncrpal) {
        this.pirncrpal = pirncrpal;
    }

    public String getTaskIntro() {
        return taskIntro;
    }

    public void setTaskIntro(String taskIntro) {
        this.taskIntro = taskIntro;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getiPQC() {
        return iPQC;
    }

    public void setiPQC(String iPQC) {
        this.iPQC = iPQC;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public String getpExamine() {
        return pExamine;
    }

    public void setpExamine(String pExamine) {
        this.pExamine = pExamine;
    }

    public String getIssuerExamine() {
        return issuerExamine;
    }

    public void setIssuerExamine(String issuerExamine) {
        this.issuerExamine = issuerExamine;
    }

    public String getCompletionStatus() {
        return completionStatus;
    }

    public void setCompletionStatus(String completionStatus) {
        this.completionStatus = completionStatus;
    }

    public String getIntactRate() {
        return intactRate;
    }

    public void setIntactRate(String intactRate) {
        this.intactRate = intactRate;
    }

    public String getExists() {
        return exists;
    }

    public void setExists(String exists) {
        this.exists = exists;
    }
}
