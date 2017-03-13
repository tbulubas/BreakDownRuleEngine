package com.tb_optimus.breakdown.domain;

import java.util.Map;

public interface ColourOrder {

    Map<Colour, Integer> getColourOrder();

    void setColourOrder(Map<Colour, Integer> colourOrder);

}
