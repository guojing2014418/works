package com.bootdo.common.utils;

import java.io.Serializable;

public class DataResult implements Serializable {

    private String code;
    private String msg;
    private String date;
    private int totalCount;
    private int page;
    private int limit;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "DataResult{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", date='" + date + '\'' +
                ", totalCount=" + totalCount +
                ", page=" + page +
                ", limit=" + limit +
                '}';
    }
}
