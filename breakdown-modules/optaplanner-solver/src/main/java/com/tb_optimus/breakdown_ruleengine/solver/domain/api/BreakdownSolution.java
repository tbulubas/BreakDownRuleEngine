package com.tb_optimus.breakdown_ruleengine.solver.domain.api;

import com.google.common.collect.Lists;
import org.optaplanner.core.api.domain.solution.PlanningEntityCollectionProperty;
import org.optaplanner.core.api.domain.solution.PlanningScore;
import org.optaplanner.core.api.domain.solution.PlanningSolution;
import org.optaplanner.core.api.domain.solution.drools.ProblemFactCollectionProperty;
import org.optaplanner.core.api.domain.valuerange.ValueRangeProvider;
import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@PlanningSolution
public class BreakdownSolution {

    private Long id;

    private HardSoftScore score;

    /* upper constraints */
    private List<Breakdown> breakdownTargets;

    /* possible breakdowns assignments 0,1, ... N times*/
    private List<Integer> assignments;

    /* solution */
    private List<BreakdownAssignment> breakdownAssignments;

    public BreakdownSolution() {
        this.id = -1L;
        this.score = HardSoftScore.valueOfUninitialized(-2147483648,-2147483648,-2147483648);
        this.breakdownAssignments = Lists.newArrayList();
        this.assignments = Lists.newArrayList();
        this.breakdownTargets = Lists.newArrayList();
    }

    @ValueRangeProvider(id = "assignmentRange")
    @ProblemFactCollectionProperty
    public List<Integer> getAssignments() {
        return assignments;
    }

    public void setAssignments(List<Integer> assignments) {
        this.assignments = assignments;
    }

    @PlanningEntityCollectionProperty
    public List<BreakdownAssignment> getBreakdownAssignments() {
        return breakdownAssignments;
    }

    @PlanningScore
    public HardSoftScore getScore() {
        return score;
    }

    public void setScore(HardSoftScore score) {
        this.score = score;
    }

    public List<Breakdown> getBreakdownTargets() {
        return breakdownTargets;
    }

    public void setBreakdownTargets(List<Breakdown> breakdownTargets) {
        this.breakdownTargets = breakdownTargets;
    }

    public void setBreakdownAssignments(List<BreakdownAssignment> breakdownAssignments) {
        this.breakdownAssignments = breakdownAssignments;
    }

    public Collection<?> getProblemFacts() {
        List<Object> facts = new ArrayList<Object>();
        facts.addAll(breakdownAssignments);
        facts.addAll(assignments);
        // Do not add the planning entity's (matchList) because that will be done automatically
        return facts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BreakdownSolution)) return false;

        BreakdownSolution that = (BreakdownSolution) o;

        if (score != null ? !score.equals(that.score) : that.score != null) return false;
        if (assignments != null ? !assignments.equals(that.assignments) : that.assignments != null)
            return false;
        return breakdownAssignments != null ? breakdownAssignments.equals(that.breakdownAssignments) : that.breakdownAssignments == null;
    }

    @Override
    public int hashCode() {
        int result = score != null ? score.hashCode() : 0;
        result = 31 * result + (assignments != null ? assignments.hashCode() : 0);
        result = 31 * result + (breakdownAssignments != null ? breakdownAssignments.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BreakdownSolution{" +
                "score=" + score +
                ", breakdowns=" + assignments +
                ", breakdownAssignments=" + breakdownAssignments +
                '}';
    }

}
