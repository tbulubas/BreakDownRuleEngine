package com.tb_optimus.breakdown;

public class ColourImpl implements Colour {

    private Long id;
    private String name;

    public ColourImpl(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "Colour{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ColourImpl)) {
            return false;
        }

        ColourImpl colour = (ColourImpl) o;

        if (!id.equals(colour.id)) {
            return false;
        }
        return name.equals(colour.name);
    }

    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        return result;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
