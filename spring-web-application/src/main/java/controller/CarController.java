package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: feizuo
 * @since: 1.0.0
 */
@Controller
@RequestMapping("/index")
public class CarController {
    @RequestMapping("/hello.do")
    public String hello(){
        return "index";
    }
}
