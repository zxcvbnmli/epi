package cn.bdqn.epi.controller;

import cn.bdqn.epi.pojo.Backlog;
import cn.bdqn.epi.service.WorkService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @PackageName:cn.bdqn.epi.controller
 * @ClassName:WorkController
 * @Description:
 * @author:小田
 * @date:2020/7/12 21:48
 */
@Controller
@RequestMapping("/work")
public class WorkController {

    @Resource
    private WorkService workService;

}
