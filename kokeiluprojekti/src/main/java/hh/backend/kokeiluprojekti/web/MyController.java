package hh.backend.kokeiluprojekti.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @RequestMapping("/main")
    @ResponseBody
    public String returnMessage() {
        return "Eka SB sovellukseni";
    }


    @RequestMapping("/hello")
    @ResponseBody
    public String sayGreeting(
            @RequestParam(name = "nimesi", required = false, defaultValue = "Muumi") String nimi) {
        return "Hei " + nimi;
    }

    @RequestMapping("/sayHelloAndAge")
    @ResponseBody
    public String sayHelloAndAge(
            @RequestParam(name = "nimesi", required = false, defaultValue = "Muumi") String nimi,
            @RequestParam int age) {
        return "Hei " + nimi + ", " + age + " vuotta";
    }
}

