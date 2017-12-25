package com.tb_optimus.breakdown_ruleengine.persistence;

import com.tb_optimus.breakdown.domain.Size;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Embeddable
@Table(name = "SIZE")
public class SizeDB implements Size{

//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE)
//    @Column(name = "ID")
    private Long id;

    @NotNull
    @javax.validation.constraints.Size(min = 2, max = 16)
    @Column(name = "NAME")
    protected String name;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "count", column = @Column(name = "SIZE_ORDER")),
    })
    private OrderDB order;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Integer getCount() {
        return order.getCount();
    }

    @Override
    public void setCount(Integer count) {

    }

    public OrderDB getOrder() {
        return order;
    }

    public void setOrder(OrderDB order) {
        this.order = order;
    }

}
