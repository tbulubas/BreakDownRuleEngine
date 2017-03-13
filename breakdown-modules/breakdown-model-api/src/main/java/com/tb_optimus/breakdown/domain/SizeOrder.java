package com.tb_optimus.breakdown.domain;

import java.util.Map;

public interface SizeOrder {

    Map<Size, Integer> getSizeOrder();

    void setSizeOrder(Map<Size, Integer> sizeOrder);

}
