package com.tb_optimus.breakdown;

import java.util.Map;
import java.util.Vector;

public interface ColourSizeOrder {

    Vector<Colour> getColours();

    void setColours(Vector<Colour> colours);

    Map<Colour, SizeOrder> getOrder();

    void setOrder(Map<Colour, SizeOrder> order);
}
