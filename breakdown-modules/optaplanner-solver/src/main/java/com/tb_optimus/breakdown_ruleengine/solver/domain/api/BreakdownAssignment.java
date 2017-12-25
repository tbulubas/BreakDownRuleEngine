package com.tb_optimus.breakdown_ruleengine.solver.domain.api;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.optaplanner.core.api.domain.entity.PlanningEntity;
import org.optaplanner.core.api.domain.valuerange.CountableValueRange;
import org.optaplanner.core.api.domain.valuerange.ValueRangeFactory;
import org.optaplanner.core.api.domain.valuerange.ValueRangeProvider;
import org.optaplanner.core.api.domain.variable.PlanningVariable;

import java.io.Serializable;

@PlanningEntity(difficultyComparatorClass = BreakAssignmentDifficultyComparator.class)
public class BreakdownAssignment implements Serializable, Comparable<Breakdown> {

    private Long id = -1L;

    private Integer assignment = 1;

    private Breakdown breakdown;

    public BreakdownAssignment() {
    }

    @PlanningVariable(valueRangeProviderRefs = {"breakdownRange"})
    public Breakdown getBreakdown() {
        return breakdown;
    }

//    @PlanningVariable(valueRangeProviderRefs = {"assignmentRange"})
    public Integer getAssignment() {
        return assignment;
    }

//    @ValueRangeProvider(id = "assignmentRange")
//    public CountableValueRange<Integer> getStartPeriodRange() {
//        return ValueRangeFactory.createIntValueRange(1, 100);
//    }

    public void setBreakdown(Breakdown breakdown) {
        this.breakdown = breakdown;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BreakdownAssignment)) return false;

        BreakdownAssignment that = (BreakdownAssignment) o;

        if (breakdown != null ? !breakdown.equals(that.breakdown) : that.breakdown != null) return false;
        return assignment != null ? assignment.equals(that.assignment) : that.assignment == null;
    }

    @Override
    public int hashCode() {
        int result = breakdown != null ? breakdown.hashCode() : 0;
        result = 31 * result + (assignment != null ? assignment.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BreakdownAssignment{" +
                "breakdown=" + breakdown +
                ", assignment=" + assignment +
                '}';
    }

    public int compareTo(Breakdown other) {
        return new CompareToBuilder()
                .append(getClass().getName(), other.getClass().getName())
                .append(id, other.getId())
                .toComparison();
    }

}
