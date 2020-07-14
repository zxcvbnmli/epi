package cn.bdqn.epi.controller;/**
 * @PackageName:cn.bdqn.epi.controller
 * @ClassName:TodoController
 * @Description:
 * @author 杰哥
 * @date 2020/7/14 17:54
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *@PackageName:cn.bdqn.epi.controller
 *@ClassName:TodoController
 *@Description:
 *@author 杰哥
 *@date 2020/7/14 17:54
 */
@Controller
public class TodoController {
    @RequestMapping("/todo")
    public String todo(){
        System.out.println("234");
        return "to-dolist";
    }
}
