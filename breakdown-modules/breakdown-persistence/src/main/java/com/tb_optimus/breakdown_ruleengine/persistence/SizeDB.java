package com.tb_optimus.breakdown_ruleengine.persistence;

import com.tb_optimus.breakdown.domain.Size;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "SIZES")
public class SizeDB implements Size{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "SIZE_ID")
    private Long id;

    @NotNull
    @javax.validation.constraints.Size(min = 2, max = 16)
    @Column(name = "SIZE_NM")
    protected String name;

//    @Embedded
//    @AttributeOverrides({
//            @AttributeOverride(name = "order", column = @Column(name = "SIZE_ORDER")),
//    })
//    private OrderDB order;

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

}
