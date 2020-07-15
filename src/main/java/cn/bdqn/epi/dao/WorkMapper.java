package cn.bdqn.epi.dao;

import cn.bdqn.epi.pojo.Backlog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @PackageName:cn.bdqn.epi.dao
 * @ClassName:WorkMapper
 * @Description:
 * @author:小田
 * @date:2020/7/14 22:22
 */
@Mapper
public interface WorkMapper {

    /**
     * 查询待办任务列表
     */
    public List<Backlog> fetchWork();

}
