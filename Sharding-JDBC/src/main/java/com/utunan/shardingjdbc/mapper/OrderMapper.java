package com.utunan.shardingjdbc.mapper;

import com.utunan.shardingjdbc.domain.entity.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {

    int save(Order order);
}
