package com.usst.BankService;

import com.usst.BankInterafce.Bank;
import com.usst.dao.CostumerDao;
import com.usst.pojo.Costumer;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class BankImpl implements Bank {
    public void SaveMoney(String count, String amount ) throws Exception {

        CostumerDao CD=new CostumerDao();
        int amount1=Integer.parseInt(amount);
        CD.UpdateByCount(amount1,count);
        System.out.println("调用成功");
        }

    public Costumer Search(String count) throws Exception {
        CostumerDao Cd=new CostumerDao();
        Costumer costumer=Cd.ByCount(count);
        return  costumer;
    }


}
