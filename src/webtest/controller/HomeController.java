package webtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by king on 2017/6/26.
 */
@Controller
@RequestMapping({"/","/homePage"})
public class HomeController {
//    @RequestMapping(value="/",method=GET)
    @RequestMapping(method=GET)
    public String home(){
        return "home";
    }
}
