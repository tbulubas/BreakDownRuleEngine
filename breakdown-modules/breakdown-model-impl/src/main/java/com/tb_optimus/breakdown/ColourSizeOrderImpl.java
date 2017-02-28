package com.tb_optimus.breakdown;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class ColourSizeOrderImpl implements ColourSizeOrder {

    private List<Colour> colours;

    private Map<Colour,SizeOrder> order;

    public ColourSizeOrderImpl(List<Colour> colours, Map<Colour, SizeOrder> order) {
        this.colours = colours;
        this.order = order;
    }

    public String toString() {
        return "Order{" +
                "colours=" + colours +
                ", order=" + order +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ColourSizeOrderImpl)) return false;

        ColourSizeOrderImpl order1 = (ColourSizeOrderImpl) o;

        if (!colours.equals(order1.colours)) return false;
        return order.equals(order1.order);
    }

    public int hashCode() {
        int result = colours.hashCode();
        result = 31 * result + order.hashCode();
        return result;
    }

    public List<Colour> getColours() {
        return colours;
    }

    public void setColours(List<Colour> colours) {
        this.colours = colours;
    }

    public Map<Colour, SizeOrder> getOrder() {
        return order;
    }

    public void setOrder(Map<Colour, SizeOrder> order) {
        this.order = order;
    }
}
