package cn.bdqn.epi.controller;

import cn.bdqn.epi.pojo.User;
import cn.bdqn.epi.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

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
    /*登录*/
    @RequestMapping(value="/doLogin",method=RequestMethod.POST)
    public String doLogin(@RequestParam String userName,
                          @RequestParam String password,
                          HttpSession session,
                          Model model){

        User user = userService.Login(userName,password);
        if(null!=user){//验证通过==重定向到首页并且用户信息写入到session
            session.setAttribute("user", user);//将用户对象放到session作用域中
            //重定向到首页的一个请求并不是一个页面。
            return "redirect:/epi/main";
        }else{//验证失败
            model.addAttribute("message", "用户名或密码不正确！");
            //模拟出现了异常
            //throw new RuntimeException("用户名或密码不正确！");
            //回到登录页面
            return "epi/login";
        }
    }
    /**
     * 跳转到主页
     */
    @RequestMapping("/main")
    public String main(){
        return "index";
    }
}
