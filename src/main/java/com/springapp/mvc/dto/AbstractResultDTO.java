package com.springapp.mvc.dto;

import com.springapp.mvc.model.Limits;

public class AbstractResultDTO {
    public Limits limits;

    public AbstractResultDTO(Limits limits) {
        this.limits = limits;
    }

    public Limits getLimits() {
        return limits;
    }

    public void setLimits(Limits limits) {
        this.limits = limits;
    }
}
