package com.utunan.seckillapplication.domain.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 商品库存
 *
 * @author xiaozhengwei
 */
@Data
public class CommodityStock implements Serializable {
    private Long id;

    private Long commodityId;

    private String commodityName;

    private String commodityDesc;

    private static final long serialVersionUID = 1L;
}