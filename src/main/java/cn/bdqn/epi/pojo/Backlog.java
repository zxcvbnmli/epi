package cn.bdqn.epi.pojo;


public class Backlog {

  private long id;
  private String taskTypes;
  private String backlogName;
  private java.sql.Date arrivalTime;


  public long getId() {
    return id;
  }

  public void setId(long id) {
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


  public java.sql.Date getArrivalTime() {
    return arrivalTime;
  }

  public void setArrivalTime(java.sql.Date arrivalTime) {
    this.arrivalTime = arrivalTime;
  }

}
