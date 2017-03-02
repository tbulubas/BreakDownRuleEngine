package com.tb_optimus.breakdown;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class ColourOrderImpl implements ColourOrder {

    private Map<Colour, Integer> colourOrder;

    public ColourOrderImpl(Map<Colour, Integer> colourOrder) {
        this.colourOrder = colourOrder;
    }

    @Override
    public Map<Colour, Integer> getColourOrder() {
        return colourOrder;
    }

    @Override
    public void setColourOrder(Map<Colour, Integer> colourOrder) {
        this.colourOrder = colourOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ColourOrderImpl)) return false;

        ColourOrderImpl colourOrder1 = (ColourOrderImpl) o;

        return colourOrder.equals(colourOrder1.colourOrder);
    }

    @Override
    public int hashCode() {
        return colourOrder.hashCode();
    }

    @Override
    public String toString() {
        return "ColourOrderImpl{" +
                "colourOrder=" + colourOrder +
                '}';
    }
}
