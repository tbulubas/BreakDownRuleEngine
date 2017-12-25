package com.tb_optimus.breakdown_ruleengine.persistence;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class OrderDB {

    @Column
    Integer count;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer order) {
        this.count = order;
    }
}
