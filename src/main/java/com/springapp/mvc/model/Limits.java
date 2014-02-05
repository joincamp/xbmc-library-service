package com.springapp.mvc.model;

/**
 * Created by jcamp on 2/5/14.
 */
public class Limits {
    private Integer start;
    private Integer end;
    private Integer total;

    public Limits(Integer start, Integer end, Integer total) {
        this.start = start;
        this.end = end;
        this.total = total;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getEnd() {
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
