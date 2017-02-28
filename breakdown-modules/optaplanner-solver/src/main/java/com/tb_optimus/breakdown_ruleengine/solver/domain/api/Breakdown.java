package com.tb_optimus.breakdown_ruleengine.solver.domain.api;

import org.optaplanner.core.api.domain.entity.PlanningEntity;
import org.optaplanner.core.api.domain.variable.PlanningVariable;

import java.util.List;

@PlanningEntity
public class Breakdown {

    private Long id;

    @PlanningVariable(valueRangeProviderRefs = {"breakdown"})
    private List<Integer> breakdown;

    public Breakdown(List<Integer> breakdown) {
        this.breakdown = breakdown;
    }

    public List<Integer> getBreakdown() {
        return breakdown;
    }

    public void setBreakdown(List<Integer> breakdown) {
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
