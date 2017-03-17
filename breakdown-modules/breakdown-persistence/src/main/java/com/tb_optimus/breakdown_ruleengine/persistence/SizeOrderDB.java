package com.tb_optimus.breakdown_ruleengine.persistence;

import com.tb_optimus.breakdown.domain.Size;
import com.tb_optimus.breakdown.domain.SizeOrder;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "SIZE_ORDER")
public class SizeOrderDB implements SizeOrder{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "SIZE_ORDER_ID")
    private Long id;

    @OneToMany(mappedBy = "name")
    protected Set<SizeDB> sizeOrder = new HashSet<SizeDB>();

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {

    }

    public Map<Size, Integer> getSizeOrder() {
        return null;
    }

    public void setSizeOrder(Map<Size, Integer> sizeOrder) {

    }
}
