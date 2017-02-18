package com.tb_optimus.breakdown;

import java.util.Map;
import java.util.Vector;

public class Order {

    private Vector<Colour> colours;
    private Map<Colour,Vector<Long>> order;

    public Order(Vector<Colour> colours, Map<Colour, Vector<Long>> order) {
        this.colours = colours;
        this.order = order;
    }

    @Override
    public String toString() {
        return "Order{" +
                "colours=" + colours +
                ", order=" + order +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;

        Order order1 = (Order) o;

        if (!colours.equals(order1.colours)) return false;
        return order.equals(order1.order);
    }

    @Override
    public int hashCode() {
        int result = colours.hashCode();
        result = 31 * result + order.hashCode();
        return result;
    }

    public Vector<Colour> getColours() {
        return colours;
    }

    public void setColours(Vector<Colour> colours) {
        this.colours = colours;
    }

    public Map<Colour, Vector<Long>> getOrder() {
        return order;
    }

    public void setOrder(Map<Colour, Vector<Long>> order) {
        this.order = order;
    }
}
