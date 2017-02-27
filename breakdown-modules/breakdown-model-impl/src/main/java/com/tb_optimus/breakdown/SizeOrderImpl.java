package com.tb_optimus.breakdown;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class SizeOrderImpl implements SizeOrder {

    private Map<Size, Integer> sizeOrder;

    public SizeOrderImpl(Map<Size, Integer> sizeOrder) {
        this.sizeOrder = sizeOrder;
    }

    @Override
    public Map<Size, Integer> getSizeOrder() {
        return sizeOrder;
    }

    @Override
    public void setSizeOrder(Map<Size, Integer> sizeOrder) {
        this.sizeOrder = sizeOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SizeOrderImpl)) return false;

        SizeOrderImpl sizeOrder1 = (SizeOrderImpl) o;

        return sizeOrder.equals(sizeOrder1.sizeOrder);
    }

    @Override
    public int hashCode() {
        return sizeOrder.hashCode();
    }

    @Override
    public String toString() {
        return "SizeOrderImpl{" +
                "sizeOrder=" + sizeOrder +
                '}';
    }
}
