package jp.co.yahoo.manager.tools;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("tools")
public class ToolsController {

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("message", "Hello Thymeleaf!!");
        return "tools/index";
    }
}
