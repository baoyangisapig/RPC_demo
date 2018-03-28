package com.usst.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping("Back")
public class BackController {
    @RequestMapping("comeback")
    public ModelAndView comeback(ModelAndView mv)
    {
        mv.setViewName("bankpage/Choice");
        return mv;
    }
}
