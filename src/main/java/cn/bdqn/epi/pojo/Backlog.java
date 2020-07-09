package cn.bdqn.epi.pojo;/**
 * @PackageName:cn.bdqn.epi.pojo
 * @ClassName:Backlog
 * @Description:
 * @author 杰哥
 * @date 2020/7/9 16:01
 */

import java.util.Date;

/**
 *@PackageName:cn.bdqn.epi.pojo
 *@ClassName:Backlog
 *@Description:
 *@author 杰哥
 *@date 2020/7/9 16:01
 */
public class Backlog {
    private String id;//待办任务的序列编号
    private String taskTypes;//待办任务类型
    private String backlogName;//待办任务名称
    private Date arrivalTime;//到达时间

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTaskTypes() {
        return taskTypes;
    }

    public void setTaskTypes(String taskTypes) {
        this.taskTypes = taskTypes;
    }

    public String getBacklogName() {
        return backlogName;
    }

    public void setBacklogName(String backlogName) {
        this.backlogName = backlogName;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
}
