package com.tb_optimus.breakdown_ruleengine.persistence;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class OrderDB {

    @Column
    Integer sku;

    public Integer getSku() {
        return sku;
    }

    public void setSku(Integer order) {
        this.sku = order;
    }
}
