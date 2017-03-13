package com.tb_optimus.breakdown.domain;

import com.google.common.collect.Maps;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class ColourSizeOrderImpl implements ColourSizeOrder {

    private ColourOrder coloursOrder;

    private SizeOrder sizesOrder;

    private Map<Colour,SizeOrder> order;

    public ColourSizeOrderImpl(Map<Colour, SizeOrder> order) {
        coloursOrder = new ColourOrderImpl(Maps.<Colour, Integer>newHashMap());
        sizesOrder = new SizeOrderImpl(Maps.<Size, Integer>newHashMap());
        for( Map.Entry<Colour, SizeOrder> entryColour : order.entrySet()) {
            Colour colour = entryColour.getKey();
            int sizeCapacity = 0;
            int colourCapacity = 0;
            for( Map.Entry<Size, Integer> entrySize : entryColour.getValue().getSizeOrder().entrySet()) {
                if (sizesOrder.getSizeOrder().containsKey(colour)) {
                    sizeCapacity = coloursOrder.getColourOrder().get(colour);
                }
                sizesOrder.getSizeOrder().put(entrySize.getKey(),sizeCapacity + entrySize.getValue());
                colourCapacity += entrySize.getValue();
            }
            coloursOrder.getColourOrder().put(entryColour.getKey(), colourCapacity);

        }
        this.order = order;
    }

    @Override
    public ColourOrder getColoursOrder() {
        return coloursOrder;
    }

    @Override
    public SizeOrder getSizesOrder() {
        return sizesOrder;
    }

    public Map<Colour, SizeOrder> getOrder() {
        return order;
    }

    public void setOrder(Map<Colour, SizeOrder> order) {
        this.order = order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ColourSizeOrderImpl)) return false;

        ColourSizeOrderImpl that = (ColourSizeOrderImpl) o;

        return order.equals(that.order);
    }

    @Override
    public int hashCode() {
        return order.hashCode();
    }

    @Override
    public String toString() {
        return "ColourSizeOrderImpl{" +
                "coloursOrder=" + coloursOrder +
                ", sizesOrder=" + sizesOrder +
                ", order=" + order +
                '}';
    }
}
