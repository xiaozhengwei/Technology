package com.utunan.common.domain.model;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 分页
 *
 * @author xiaozhengwei
 * @since V1.0.0
 */
@Data
public class PageResult<T> implements Serializable {
    /**
     * 前一页
     */
    private Integer prePage;
    /**
     * 当前页
     */
    private Integer pages;
    /**
     * 下一页
     */
    private Integer nextPage;
    /**
     * 每页的数量
     */
    private int pageSize;
    /**
     * 总页数
     */
    private Integer pageNum;
    /**
     * 总数据
     */
    private Long total;
    /**
     * 当前页的数据
     */
    private List<T> pageData;
    /**
     * 是否为第一页
     */
    private boolean isFirstPage = false;
    /**
     * 是否为最后一页
     */
    private boolean isLastPage = false;
    /**
     * 判定页面边界
     */
    public void calculatePageBoundaries() {
        prePage = pageNum <= 1 ? pageNum : pageNum - 1;
        nextPage = pageNum >= total ? pageNum : pageNum + 1;
        isFirstPage = pageNum == 1;
        isLastPage = pageNum.equals(pages);
    }
}
