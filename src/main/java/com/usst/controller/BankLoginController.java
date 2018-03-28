package com.usst.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("BLogin")
public class BankLoginController {
    @RequestMapping("In")
    public ModelAndView Login(ModelAndView mv)
    {
        mv.setViewName("bankpage/Choice");
        return  mv;
    }
}
