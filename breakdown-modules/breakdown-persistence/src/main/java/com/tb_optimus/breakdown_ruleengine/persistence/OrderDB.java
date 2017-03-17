package com.tb_optimus.breakdown_ruleengine.persistence;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@Embeddable
public class OrderDB {

    @NotNull
    protected Long order;
}
