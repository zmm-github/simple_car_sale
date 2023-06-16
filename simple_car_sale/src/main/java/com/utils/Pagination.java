package com.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author 阿毛
 * @date 2021/5/26 18:51
 */
public class Pagination {
    private int currPage = 1;
    private Long totalRow;
    private Long totalPage;
    private int pageRow = 5;

    public int getCurrPage() {
        return currPage;
    }

    public void setCurrPage(int currPage) {
        this.currPage = currPage;
    }

    public Long getTotalRow() {
        return totalRow;
    }

    public void setTotalRow(Long totalRow) {
        this.totalRow = totalRow;
    }

    public Long getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Long totalRow) {
        if (totalRow % pageRow == 0) {
            this.totalPage = totalRow / pageRow;
        } else {
            this.totalPage = totalRow / pageRow + 1;
        }
    }

    public int getPageRow() {
        return pageRow;
    }

    public void setPageRow(int pageRow) {
        this.pageRow = pageRow;
    }
}
