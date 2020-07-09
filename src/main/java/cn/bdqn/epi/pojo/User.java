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
    private Integer userId;//用户id
    private String userName;//用户名
    private String password;//密码
    private Integer userMode;//状态
    private Integer roleId;//角色id
    private Integer sex;//性别
    private Integer age;//年龄
    private String email;//邮箱
    private String tel;//联系电话
    private Date entryDate;//入职日期
    private Date leaveDate;//离职日期
    private Date createDate;//创建日期
    public User(Integer userId,String userName, String password,
                Integer userMode,Integer roleId,Integer sex,Integer age,
                String email,String tel,Date entryDate,Date leaveDate,Date createDate){
        this.userId=userId;
        this.userName=userName;
        this.password=password;
        this.userMode=userMode;
        this.roleId=roleId;
        this.sex=sex;
        this.age=age;
        this.email=email;
        this.tel=tel;
        this.entryDate=entryDate;
        this.leaveDate=leaveDate;
        this.createDate=createDate;
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
