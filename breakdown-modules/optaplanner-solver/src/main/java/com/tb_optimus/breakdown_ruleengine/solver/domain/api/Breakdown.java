package com.tb_optimus.breakdown_ruleengine.solver.domain.api;

public class Breakdown {

    private Long id;
    private int dimension;
    private int[] breakdown;

    public Breakdown(int dimension) {
        this.id = -1L;
        this.dimension = dimension;
        this.breakdown = new int [dimension];
    }

    public Breakdown(int dimension, int[] breakdown) {
        this(dimension);
        this.breakdown = breakdown;
    }

    public int[] getBreakdown() {
        return breakdown;
    }

    public void setBreakdown(int[] breakdown) {
        this.breakdown = breakdown;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Breakdown)) return false;

        Breakdown that = (Breakdown) o;

        return breakdown != null ? breakdown.equals(that.breakdown) : that.breakdown == null;
    }

    @Override
    public int hashCode() {
        return breakdown != null ? breakdown.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Breakdown{" +
                "breakdown=" + breakdown +
                '}';
    }
}
