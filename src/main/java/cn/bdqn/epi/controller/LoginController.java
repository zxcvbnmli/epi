package cn.bdqn.epi.controller;

import cn.bdqn.epi.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @PackageName:cn.bdqn.epi.controller
 * @ClassName:LoginController
 * @Description:
 * @author:木子羽
 * @date:2020/7/10 7:53
 */
@Controller
@RequestMapping("/epi")
public class LoginController {
    @Resource
    private UserServiceImpl userService;
    /*跳转到登录页*/
    @RequestMapping("/login")
    public String toLogin(){
        return "login";
    }
}
