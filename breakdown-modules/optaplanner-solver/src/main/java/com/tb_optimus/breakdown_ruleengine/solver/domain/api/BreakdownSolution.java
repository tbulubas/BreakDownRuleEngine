package com.tb_optimus.breakdown_ruleengine.solver.domain.api;

import org.optaplanner.core.api.domain.solution.PlanningEntityCollectionProperty;
import org.optaplanner.core.api.domain.solution.PlanningScore;
import org.optaplanner.core.api.domain.solution.PlanningSolution;
//import org.optaplanner.core.api.domain.solution.Solution;
import org.optaplanner.core.api.domain.solution.drools.ProblemFactCollectionProperty;
import org.optaplanner.core.api.domain.valuerange.ValueRangeProvider;
import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@PlanningSolution
public class BreakdownSolution //implements Solution<HardSoftScore>
{

    private HardSoftScore score;

    private List<Breakdown> breakdownList;

    private List<BreakdownAssignment> breakdownAssignmentList;

    @PlanningEntityCollectionProperty
    public List<BreakdownAssignment> getBreakdownAssignmentList() {
        return breakdownAssignmentList;
    }

    @ValueRangeProvider(id = "breakdownRange")
    @ProblemFactCollectionProperty
    public List<Breakdown> getBreakdownList() {
        return breakdownList;
    }

    public void setBreakdownList(List<Breakdown> breakdownList) {
        this.breakdownList = breakdownList;
    }

    @PlanningScore
    public HardSoftScore getScore() {
        return score;
    }

    public void setScore(HardSoftScore score) {
        this.score = score;
    }

    public void setBreakdownAssignmentList(List<BreakdownAssignment> breakdownAssignmentList) {
        this.breakdownAssignmentList = breakdownAssignmentList;
    }

    public Collection<?> getProblemFacts() {
        List<Object> facts = new ArrayList<Object>();
        facts.addAll(breakdownAssignmentList);
        facts.addAll(breakdownList);
        // Do not add the planning entity's (matchList) because that will be done automatically
        return facts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BreakdownSolution)) return false;

        BreakdownSolution that = (BreakdownSolution) o;

        if (score != null ? !score.equals(that.score) : that.score != null) return false;
        if (breakdownList != null ? !breakdownList.equals(that.breakdownList) : that.breakdownList != null)
            return false;
        return breakdownAssignmentList != null ? breakdownAssignmentList.equals(that.breakdownAssignmentList) : that.breakdownAssignmentList == null;
    }

    @Override
    public int hashCode() {
        int result = score != null ? score.hashCode() : 0;
        result = 31 * result + (breakdownList != null ? breakdownList.hashCode() : 0);
        result = 31 * result + (breakdownAssignmentList != null ? breakdownAssignmentList.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BreakdownSolution{" +
                "score=" + score +
                ", breakdownList=" + breakdownList +
                ", breakdownAssignmentList=" + breakdownAssignmentList +
                '}';
    }

}
