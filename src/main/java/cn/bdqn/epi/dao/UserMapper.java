package cn.bdqn.epi.dao;

import cn.bdqn.epi.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @PackageName:cn.bdqn.epi.dao
 * @ClassName:UserInterface
 * @Description:
 * @author:木子羽
 * @date:2020/7/9 16:05
 */
//用户接口
@Mapper
public interface UserMapper {
    /**
     *登录
     */
    public User checkLogin(@Param("userName") String userName, @Param("password")String password);

    /**
     * 查询用户信息
     */
    public User findUser(@Param("userName") String userName);
}
