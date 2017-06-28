package webtest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import webtest.data.SpittleRepository;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by king on 2017/6/27.
 */
@Controller
@RequestMapping("/spittles")
public class SpittleController {
    private SpittleRepository spittleRepository;
    @Autowired
    public SpittleController(SpittleRepository spittleRepository){
        this.spittleRepository=spittleRepository;
    }

    @RequestMapping(method=GET)
    public String spittles(Model model){
        model.addAttribute(
                spittleRepository.findSpittles(Long.MAX_VALUE,20));
        return "spittles";
    }
}
