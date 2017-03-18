package com.tb_optimus.breakdown_ruleengine.persistence;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class OrderDB {

    @Column
    Long order;
}
