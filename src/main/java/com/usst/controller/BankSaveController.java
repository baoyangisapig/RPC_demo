package com.usst.controller;

import com.usst.BankService.BankImpl;
import com.usst.Client.RemoteClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.Serializable;
import java.net.Socket;
import java.rmi.Remote;

@Controller
@RequestMapping("BSave")
public class BankSaveController implements Serializable {
    @RequestMapping("index")
    public ModelAndView Login(ModelAndView mv)
    {
        mv.setViewName("bankpage/Save");
        return  mv;
    }
    @RequestMapping("Save")
    public ModelAndView SaveMoney(HttpSession session,ModelAndView mv, @RequestParam(value="amount") String amount, @RequestParam(value="password") String password) throws Exception {


//        BankImpl bank=new BankImpl();
//        mv=bank.SaveMoeny(mv,session,password,amount);
        String password1=(String) session.getAttribute("password");
        String count=(String) session.getAttribute("count");

        if(password1.equals(password))
        {
            RemoteClient remoteClient=new RemoteClient();
            remoteClient.BankClientSave("com.usst.BankService.BankImpl",
                    "SaveMoney",new Class[] {String.class,String.class},new Object[]{count,amount});

        }

        mv.setViewName("bankpage/SaveSuccess");
        return  mv;
    }
}
