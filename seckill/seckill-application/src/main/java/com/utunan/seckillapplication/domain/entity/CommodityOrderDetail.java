package com.utunan.seckillapplication.domain.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 商品订单详情
 * @author 
 */
@Data
public class CommodityOrderDetail implements Serializable {

    private Long id;

    private Long commodityOrderId;

    private Long commodityId;

}