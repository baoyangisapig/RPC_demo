package com.usst.controller;

import com.usst.Client.RemoteClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import sun.awt.SunHints;

import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@RequestMapping("BOut")
public class BankOutController {
    @RequestMapping("index")
    public ModelAndView Login(ModelAndView mv)
    {
        mv.setViewName("bankpage/Out");
        return  mv;
    }
    @RequestMapping("Out")
    public  ModelAndView Out(ModelAndView mv,HttpSession session,@RequestParam(value="amount") String amount,  @RequestParam(value="password") String password) throws IOException, ClassNotFoundException {
        String password1=(String) session.getAttribute("password");
        String count= (String) session.getAttribute("count");
        if(password.equals(password1))
        {
            String amount1="-"+amount;
            RemoteClient remoteClient=new RemoteClient();
            remoteClient.BankClientSave("com.usst.BankService.BankImpl",
                    "SaveMoney",new Class[] {String.class,String.class},new Object[]{count,amount1});
        }
        mv.setViewName("bankpage/OutSuccess");
        return  mv;
    }
}
