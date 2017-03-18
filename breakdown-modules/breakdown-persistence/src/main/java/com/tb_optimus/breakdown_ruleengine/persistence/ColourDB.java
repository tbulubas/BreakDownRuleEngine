package com.tb_optimus.breakdown_ruleengine.persistence;

import com.tb_optimus.breakdown.domain.Colour;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "COLOURS")
public class ColourDB implements Colour {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "COLOUR_ID")
    private Long id;

    @NotNull
    @javax.validation.constraints.Size(min = 2, max = 16)
    @Column(name = "COLOUR_NM" )
    protected String name;

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
