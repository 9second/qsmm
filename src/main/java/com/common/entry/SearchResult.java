package com.common.entry;

import java.util.List;

/**
 * Created by admin on 2016/6/20.
 */
public class SearchResult<T> {

    private long totalRows;
    private List rows;

    public long getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(long totalRows) {
        this.totalRows = totalRows;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }
}
