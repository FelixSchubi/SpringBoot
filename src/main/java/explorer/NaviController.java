package explorer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NaviController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", 
    required=false, defaultValue="You :)") 
       String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @GetMapping("/test")
    public String test( Model model) {
        return "testController";
    }
    

}