package com.tb_optimus.breakdown.domain;

import org.springframework.stereotype.Component;

@Component
public class SizeImpl implements Size {

    private Long id;

    private String name;

    public Integer getSku() {
        return sku;
    }

    public void setSku(Integer sku) {
        this.sku = sku;
    }

    private Integer sku;

    public SizeImpl(String name, Integer sku) {
        this.id = -1L;
        this.name = name;
        this.sku = sku;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SizeImpl size = (SizeImpl) o;

        if (!id.equals(size.id)) return false;
        if (!name.equals(size.name)) return false;
        return sku.equals(size.sku);
    }

    @Override
    public String toString() {
        return "SizeImpl{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sku=" + sku +
                '}';
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + sku.hashCode();
        return result;
    }
}
