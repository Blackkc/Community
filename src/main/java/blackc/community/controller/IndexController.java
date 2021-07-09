package blackc.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Blackc
 */
@Controller
public class IndexController {
//    @GetMapping("/hello")
//    public String hello(@RequestParam(name = "name") String name, Model model){
//        model.addAttribute("name",name);
//        return "index";
//    }
    @GetMapping("/")
    public String  index(){
        return "index";
    }
}
