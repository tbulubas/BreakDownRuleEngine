package com.tb_optimus.breakdown.domain;

import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Set;

@Component
public class SizeOrderImpl implements SizeOrder {

    private Long id;

    private Set<Size> sizeOrder;

    public SizeOrderImpl(Set<Size> sizeOrder) {
        this.sizeOrder = sizeOrder;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public Set<Size> getSizeOrder() {
        return sizeOrder;
    }

    @Override
    public void setSizeOrder(Set<Size> sizeOrder) {
        this.sizeOrder = sizeOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SizeOrderImpl sizeOrder1 = (SizeOrderImpl) o;

        if (id != null ? !id.equals(sizeOrder1.id) : sizeOrder1.id != null) return false;
        return sizeOrder != null ? sizeOrder.equals(sizeOrder1.sizeOrder) : sizeOrder1.sizeOrder == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (sizeOrder != null ? sizeOrder.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "SizeOrderImpl{" +
                "id=" + id +
                ", sizeOrder=" + sizeOrder +
                '}';
    }
}
