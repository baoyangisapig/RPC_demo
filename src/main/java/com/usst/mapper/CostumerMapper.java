package com.usst.mapper;

import com.usst.pojo.Costumer;

public interface CostumerMapper {
    Costumer ByCount(String count);
    void UpdateByCount(int amount,String count);

}
