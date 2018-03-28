package com.usst.controller;

import com.usst.BankService.BankImpl;
import com.usst.Client.RemoteClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@RequestMapping("BGive")
public class BankGiveController {
    @RequestMapping("index")
    public ModelAndView Login(ModelAndView mv)
    {

       mv.setViewName("bankpage/Give");
       return mv;
    }

    @RequestMapping("Give")
    public  ModelAndView Out(ModelAndView mv,HttpSession session,@RequestParam(value="amount") String amount, @RequestParam(value="zzcount")String zzcount, @RequestParam(value="password") String password) throws IOException, ClassNotFoundException {
        String password1=(String) session.getAttribute("password");
        String count=(String) session.getAttribute("count");
        String amount1="-"+amount;
        if(password.equals(password1))
        {

            RemoteClient remoteClient=new RemoteClient();
            remoteClient.BankClientSave("com.usst.BankService.BankImpl",
                    "SaveMoney",new Class[] {String.class,String.class},new Object[]{zzcount,amount});
            remoteClient.BankClientSave("com.usst.BankService.BankImpl",
                    "SaveMoney",new Class[] {String.class,String.class},new Object[]{count,amount1});

        }
        mv.setViewName("bankpage/OutSuccess");
        return  mv;
    }
}
