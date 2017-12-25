package com.tb_optimus.breakdown.domain;

import com.google.common.collect.Sets;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class ColourSizeOrderImpl implements ColourSizeOrder {

    private SizeOrder sizesOrder;

    private Map<Colour,SizeOrder> order;

    public ColourSizeOrderImpl(Map<Colour, SizeOrder> order) {
        sizesOrder = new SizeOrderImpl(Sets.<Size>newHashSet());
        // FIXME: 3/22/2017
//        for( Map.Entry<Colour, SizeOrder> entryColour : order.entrySet()) {
//            Colour colour = entryColour.getKey();
//            int sizeCapacity = 0;
//            int colourCapacity = 0;
//            for( Size size : entryColour.getValue().getSizeOrder()) {
//                sizesOrder.getSizeOrder().put(entrySize.getKey(),sizeCapacity + entrySize.getValue());
//                colourCapacity += entrySize.getValue();
//            }
//        }
        this.order = order;
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
                ", sizesOrder=" + sizesOrder +
                ", order=" + order +
                '}';
    }
}
