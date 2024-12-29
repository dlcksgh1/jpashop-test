package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    // 커밋테스트
    @GetMapping("hello")
    public String Hello(Model model){
        model.addAttribute("data", "hello!!!");
        return "hello";
    }

}
