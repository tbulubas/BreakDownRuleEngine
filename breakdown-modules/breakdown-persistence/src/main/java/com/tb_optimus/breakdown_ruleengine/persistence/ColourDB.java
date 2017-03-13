package com.tb_optimus.breakdown_ruleengine.persistence;

import com.tb_optimus.breakdown.domain.Colour;
import com.tb_optimus.breakdown.domain.ColourImpl;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COLOUR")
public class ColourDB extends ColourImpl implements Colour {

    public ColourDB(Long id, String name) {
        super(id, name);
    }

    public ColourDB() {
    }

    @Id
    @GeneratedValue
    public Long getId() {
        return super.getId();
    }

    public void setId(Long id) {
        super.setId(id);
    }
}
