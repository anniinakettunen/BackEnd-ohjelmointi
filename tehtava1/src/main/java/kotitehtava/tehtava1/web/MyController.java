package kotitehtava.tehtava1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @GetMapping("/index")
    @ResponseBody
    public String index() {
        return "This is the main page";
    }

    @GetMapping("/contact")
    @ResponseBody
    public String contact() {
        return "This is the contact page";
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello(@RequestParam String location, @RequestParam String name) {
        return "Welcome to the " + location + " " + name + "!";
    }
}

