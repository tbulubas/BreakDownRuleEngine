package com.tb_optimus.breakdown.domain;

import java.util.Map;

public interface ColourSizeOrder {

    ColourOrder getColoursOrder();

    SizeOrder getSizesOrder();

    Map<Colour, SizeOrder> getOrder();

    void setOrder(Map<Colour, SizeOrder> order);
}
