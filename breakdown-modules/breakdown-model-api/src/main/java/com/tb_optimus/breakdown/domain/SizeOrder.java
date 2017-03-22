package com.tb_optimus.breakdown.domain;

import java.util.Set;

public interface SizeOrder {

    Long getId();

    void setId(Long id);

    Set<Size> getSizeOrder();

    void setSizeOrder(Set<Size> sizeOrder);

}
