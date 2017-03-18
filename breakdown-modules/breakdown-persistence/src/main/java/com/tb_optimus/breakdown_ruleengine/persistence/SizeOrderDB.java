package com.tb_optimus.breakdown_ruleengine.persistence;

import com.tb_optimus.breakdown.domain.Size;
import com.tb_optimus.breakdown.domain.SizeOrder;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name = "SIZE_ORDERS")
public class SizeOrderDB implements SizeOrder{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "SIZE_ORDER_ID")
    private Long id;

//    @OneToMany(mappedBy = "name")
//    protected Set<SizeDB> sizeOrder = new HashSet<SizeDB>();

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
