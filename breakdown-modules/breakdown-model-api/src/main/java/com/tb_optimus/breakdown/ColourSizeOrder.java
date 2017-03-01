package com.tb_optimus.breakdown;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface ColourSizeOrder {

    Set<Colour> getColours();

    Map<Colour, SizeOrder> getOrder();

    void setOrder(Map<Colour, SizeOrder> order);
}
