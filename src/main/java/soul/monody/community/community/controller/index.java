package soul.monody.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*
* @Author jyk
* @Description 初始化项目
* @Date 13:04 2019/8/25
* @Param
* @return
**/
@Controller
class IndexController {
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
