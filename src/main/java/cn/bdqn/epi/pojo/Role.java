package cn.bdqn.epi.pojo;

import java.util.Date;

/**
 * @PackageName:cn.bdqn.epi.pojo
 * @ClassName:Role
 * @Description:
 * @author:木子羽
 * @date:2020/7/9 14:51
 */
public class Role {
    private Integer roleId;//角色id
    private String roleName;//角色名称
    private Integer userId;//创建人id
    private Date createDate;//创建日期
    private Integer roleMode;//角色状态

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getRoleMode() {
        return roleMode;
    }

    public void setRoleMode(Integer roleMode) {
        this.roleMode = roleMode;
    }
}
