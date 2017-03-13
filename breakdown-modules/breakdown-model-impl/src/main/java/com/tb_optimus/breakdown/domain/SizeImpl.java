package com.tb_optimus.breakdown.domain;

import org.springframework.stereotype.Component;

@Component
public class SizeImpl implements Size {

    private Long id;

    private String name;

    public SizeImpl(Long id, String name) {
        this.id = id;
        this.name = name;
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
        if (!(o instanceof SizeImpl)) return false;

        SizeImpl size = (SizeImpl) o;

        if (!id.equals(size.id)) return false;
        return name.equals(size.name);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "SizeImpl{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
