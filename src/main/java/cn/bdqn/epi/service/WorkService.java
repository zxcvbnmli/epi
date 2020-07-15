package cn.bdqn.epi.service;

import java.util.List;

/**
 * @PackageName:cn.bdqn.epi.service
 * @ClassName:WorkService
 * @Description:
 * @author:小田
 * @date:2020/7/14 22:05
 */
public interface WorkService {

    /**
     * 查询待办任务列表
     */
    public List fetchWork();
}
