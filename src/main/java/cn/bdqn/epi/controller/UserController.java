package cn.bdqn.epi.controller;

import cn.bdqn.epi.pojo.User;
import cn.bdqn.epi.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

/**
 * @PackageName:cn.bdqn.epi.controller
 * @ClassName:UserController
 * @Description:
 * @author:木子羽
 * @date:2020-7-17 15:01
 */
@Controller
@RequestMapping("/epi")
public class UserController {
    @Resource
    private UserServiceImpl userService;
@RequestMapping("/geren")
    public String findUser(@RequestParam(value="userName",required = false) String userName,
                            Model model){
    User user = userService.findUser(userName);
    model.addAttribute("user",user);
        return "gerenzl";
    }

}
