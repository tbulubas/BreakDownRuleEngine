package com.tb_optimus.breakdown.domain;

import org.springframework.stereotype.Component;

@Component
public class SizeImpl implements Size {

    private Long id;

    private String name;

    public SizeImpl() {
        this.id = -1L;
        this.name = "unknown";
    }

    private Integer count;

    public SizeImpl(String name, Integer count) {
        this();
        this.name = name;
        this.count = count;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
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
        return count.equals(size.count);
    }

    @Override
    public String toString() {
        return "SizeImpl{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", count=" + count +
                '}';
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + count.hashCode();
        return result;
    }
}
