package com.usst.controller;

import com.usst.Client.RemoteClient;
import com.usst.pojo.Costumer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@RequestMapping("BSearch")
public class BankSearchController {
    @RequestMapping("index")
    public ModelAndView Login(HttpSession session,ModelAndView mv) throws IOException, ClassNotFoundException {
        String count =(String)session.getAttribute("count");
        RemoteClient remoteClient=new RemoteClient();
        Costumer costumer=(Costumer) remoteClient.BankClientSave("com.usst.BankService.BankImpl",
                "Search",new Class[] {String.class},new Object[]{count});
        mv.setViewName("bankpage/SearchSuccess");
        mv.addObject("money",costumer.getMoney());
        mv.addObject("count",costumer.getCount());
        return  mv;
    }
}
