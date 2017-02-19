package com.tb_optimus.breakdown;

import java.util.Map;
import java.util.Vector;

public interface Order {
    @Override
    String toString();

    @Override
    int hashCode();

    Vector<Colour> getColours();

    void setColours(Vector<Colour> colours);

    Map<Colour, Vector<Long>> getOrder();

    void setOrder(Map<Colour, Vector<Long>> order);
}
