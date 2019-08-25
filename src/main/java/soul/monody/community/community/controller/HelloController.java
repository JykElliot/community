package soul.monody.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
* @Author jyk
* @Description 初始化项目
* @Date 13:04 2019/8/25
* @Param
* @return
**/
@Controller
public class HelloController {
    @GetMapping("/hello")
    public  String hello(@RequestParam(name ="name")  String name , Model model){
        model.addAttribute("name",name);
        return "hello";
    }
}

