package com.usst.dao;

import com.usst.mapper.CostumerMapper;
import com.usst.pojo.Costumer;
import com.usst.pojo.SessionBuilder;
import org.apache.ibatis.session.SqlSession;

import java.security.PublicKey;

public class CostumerDao {
    public Costumer ByCount(String count) throws Exception {
        SessionBuilder builder= new SessionBuilder();
        SqlSession session=builder.SessionProducer();
        CostumerMapper costumerMapper=session.getMapper(CostumerMapper.class);
        Costumer costumer=costumerMapper.ByCount(count);
        return costumer;
    }

    public  void UpdateByCount(int amount,String count) throws Exception {
        SessionBuilder builder= new SessionBuilder();
        SqlSession session=builder.SessionProducer();
        CostumerMapper costumerMapper=session.getMapper(CostumerMapper.class);
        costumerMapper.UpdateByCount(amount,count);
        session.commit();
        session.close();
    }
}
