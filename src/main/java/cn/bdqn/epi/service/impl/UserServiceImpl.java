package cn.bdqn.epi.service.impl;

import cn.bdqn.epi.dao.UserMapper;
import cn.bdqn.epi.pojo.User;
import cn.bdqn.epi.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @PackageName:cn.bdqn.epi.service.impl
 * @ClassName:UserServiceImpl
 * @Description:
 * @author:木子羽
 * @date:2020/7/10 8:03
 */
@Transactional
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    public UserMapper getUserMapper() {
        return userMapper;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
    @Override
    public User Login(String userName, String password) {
        return userMapper.checkLogin(userName,password);
    }
}
