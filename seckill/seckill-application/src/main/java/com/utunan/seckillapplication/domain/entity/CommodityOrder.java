package com.utunan.seckillapplication.domain.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 商品订单
 *
 * @author
 */
@Data
public class CommodityOrder implements Serializable {

    private Long id;
    private Long orderId;

}