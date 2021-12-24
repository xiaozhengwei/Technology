package com.utunan.common.domain.model;

import com.sun.istack.NotNull;
import lombok.Data;

import java.io.Serializable;

/**
 * 分页请求实体类
 *
 * @author xiaozhengwei
 * @since V1.0.0
 */
@Data
public class PageRequest implements Serializable {

    public PageRequest(){
        this.pageNum=1;
        this.pageSize=20;
    }

    /**
     * 当前页
     */
    private Integer pageNum;
    /**
     * 每页的数量
     */
    private Integer pageSize;
    /**
     * 标志是否重新获取
     * Y:重新获取
     * N:从最后一条数据之后获取
     */
    private String isRestart;
    /**
     * 时间戳
     */
    private Long timestamp;
    /**
     * 最后一条数据id;
     */
    private Long id;
}
