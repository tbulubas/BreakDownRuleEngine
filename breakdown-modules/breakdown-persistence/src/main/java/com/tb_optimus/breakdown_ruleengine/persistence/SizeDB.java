package com.tb_optimus.breakdown_ruleengine.persistence;

import com.tb_optimus.breakdown.domain.Size;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "SIZE")
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

    }

//    @OneToOne(mappedBy = "size")
//    protected SizeOrderDB;
}
