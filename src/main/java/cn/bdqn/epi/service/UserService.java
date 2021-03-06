package cn.bdqn.epi.service;

import cn.bdqn.epi.pojo.User;

import java.util.List;

/**
 * @PackageName:cn.bdqn.epi.service
 * @ClassName:UserService
 * @Description:
 * @author:木子羽
 * @date:2020/7/10 8:02
 */
public interface UserService {
    /**
     * 登录
     * @param userName
     * @param password
     * @return
     */
    public User Login(String userName, String password);
    /**
     * 查询用户信息
  */
    public User findUser(String userName);
}
