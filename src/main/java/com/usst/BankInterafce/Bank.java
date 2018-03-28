package com.usst.BankInterafce;

import com.usst.pojo.Costumer;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public interface Bank {
    public void  SaveMoney(String count, String amount) throws Exception;
    public Costumer Search(String count) throws  Exception;
}
