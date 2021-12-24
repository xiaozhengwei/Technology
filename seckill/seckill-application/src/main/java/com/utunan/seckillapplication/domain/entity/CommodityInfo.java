package com.utunan.seckillapplication.domain.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 商品信息
 * @author 
 */
@Data
public class CommodityInfo implements Serializable {
    private Long id;

    private Long commodityId;

    private String commodityName;

    private String commodityDesc;

}