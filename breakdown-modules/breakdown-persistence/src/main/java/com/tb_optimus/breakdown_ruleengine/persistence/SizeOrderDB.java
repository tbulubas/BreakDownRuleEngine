package com.tb_optimus.breakdown_ruleengine.persistence;

import com.tb_optimus.breakdown.domain.Size;
import com.tb_optimus.breakdown.domain.SizeOrder;

import javax.persistence.*;
import java.util.Map;
import java.util.Set;

@Entity
@Table(name = "SIZE_ORDER")
public class SizeOrderDB implements SizeOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Long id;

    @javax.validation.constraints.Size(min = 2, max = 16)
    @Column(name = "NAME", nullable = true)
    private String name;

    @ElementCollection(targetClass = SizeDB.class, fetch = FetchType.EAGER)
    @JoinTable(name = "SIZE", joinColumns = @JoinColumn(name="SIZE_ORDER_ID"))
    private Set<Size> sizes;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {

    }

    public Set<Size> getSizeOrder() {
        return null;
    }

    public void setSizeOrder(Set<Size> sizeOrder) {

    }
}
