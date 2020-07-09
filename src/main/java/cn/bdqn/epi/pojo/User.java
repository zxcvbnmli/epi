package cn.bdqn.epi.pojo;

import java.util.Date;

/**
 * @PackageName:cn.bdqn.epi.pojo
 * @ClassName:user
 * @Description:
 * @author:木子羽
 * @date:2020/7/9 11:56
 */
public class User {
    private Integer userId;
    private String userName;
    private String password;
    private Integer userMode;
    private Integer roleId;
    private Integer sex;
    private Integer age;
    private String email;
    private String tel;
    private Date entryDate;
    private Date leaveDate;
    private Date createDate;
    public User(Integer userId,String userName, String password,
                Integer userMode,Integer roleId,Integer sex,Integer age,
                String email,String tel,Date entryDate,Date leaveDate,Date createDate){
        this.userId=userId;
        this.userName=userName;
        this.password=password;
        this.userMode=userMode;
    }


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getUserMode() {
        return userMode;
    }

    public void setUserMode(Integer userMode) {
        this.userMode = userMode;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Date getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(Date leaveDate) {
        this.leaveDate = leaveDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
