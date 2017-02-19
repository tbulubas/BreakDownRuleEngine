package com.tb_optimus.breakdown;

public interface Colour {
    @Override
    String toString();

    @Override
    boolean equals(Object o);

    @Override
    int hashCode();

    Long getId();

    void setId(Long id);

    String getName();

    void setName(String name);
}
