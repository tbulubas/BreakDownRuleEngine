package com.tb_optimus.breakdown;

import java.util.List;
import java.util.Map;

public interface ColourSizeOrder {

    List<Colour> getColours();

    void setColours(List<Colour> colours);

    Map<Colour, SizeOrder> getOrder();

    void setOrder(Map<Colour, SizeOrder> order);
}
