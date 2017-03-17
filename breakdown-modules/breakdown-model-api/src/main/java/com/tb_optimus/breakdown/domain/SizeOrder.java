package com.tb_optimus.breakdown.domain;

import java.util.Map;

public interface SizeOrder {

    Long getId();

    void setId(Long id);

    Map<Size, Integer> getSizeOrder();

    void setSizeOrder(Map<Size, Integer> sizeOrder);

}
