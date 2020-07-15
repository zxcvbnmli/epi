package cn.bdqn.epi.controller;/**
 * @PackageName:cn.bdqn.epi.controller
 * @ClassName:TodoController
 * @Description:
 * @author 杰哥
 * @date 2020/7/14 17:54
 */

import cn.bdqn.epi.pojo.Backlog;
import cn.bdqn.epi.service.WorkService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 *@PackageName:cn.bdqn.epi.controller
 *@ClassName:TodoController
 *@Description:
 *@author 杰哥
 *@date 2020/7/14 17:54
 */
@Controller
@RequestMapping("/epi")
public class TodoController {

    @Resource
    private WorkService workService;

    @RequestMapping("/todo")
    public String todo(Model model){
        System.out.println("234");
        List<Backlog> list =  workService.fetchWork();
        model.addAttribute("list",list);
        return "to-dolist";
    }
}
