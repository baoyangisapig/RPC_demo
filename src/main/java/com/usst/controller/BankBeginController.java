package com.usst.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.method.annotation.ModelAttributeMethodProcessor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("NyBank")
@SessionAttributes(value={"count","password"})
public class BankBeginController {
    @RequestMapping("Begin")
    public ModelAndView Begining(ModelAndView mv)

    {
        mv.setViewName("welcomepage/hello");
        return  mv;
    }
    @RequestMapping("Choice")
    public  ModelAndView Login(HttpSession session,ModelAndView mv, @RequestParam(value="count")String count, @RequestParam(value="password") String password)
    {
        mv.addObject("count",count);
        mv.addObject("password",password);

        session.setAttribute("count",count);
        session.setAttribute("password",password);
        mv.setViewName("bankpage/Choice");
        return mv;
    }
}
