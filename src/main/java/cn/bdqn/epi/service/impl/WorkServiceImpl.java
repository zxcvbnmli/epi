package cn.bdqn.epi.service.impl;

import cn.bdqn.epi.dao.WorkMapper;
import cn.bdqn.epi.service.WorkService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @PackageName:cn.bdqn.epi.service.impl
 * @ClassName:WorkServiceImpl
 * @Description:
 * @author:小田
 * @date:2020/7/14 22:20
 */
@Service("workService")
public class WorkServiceImpl implements WorkService {

    @Resource
    private WorkMapper workMapper;

    @Override
    public List fetchWork() {
        return workMapper.fetchWork();
    }
}
