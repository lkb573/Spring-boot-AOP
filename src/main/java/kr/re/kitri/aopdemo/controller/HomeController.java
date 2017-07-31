package kr.re.kitri.aopdemo.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    public static Logger log =
            LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/")
    public String index(){
        log.info("logging check!");
        log.debug("debug check....");

        return "index";
    }
}