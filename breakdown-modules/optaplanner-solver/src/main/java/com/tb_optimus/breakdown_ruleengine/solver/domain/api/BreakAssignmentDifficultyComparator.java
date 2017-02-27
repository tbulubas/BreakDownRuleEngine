package com.tb_optimus.breakdown_ruleengine.solver.domain.api;

import org.apache.commons.lang3.builder.CompareToBuilder;

import java.io.Serializable;
import java.util.Comparator;

public class BreakAssignmentDifficultyComparator implements Comparator<BreakdownAssignment>, Serializable {

    public int compare(BreakdownAssignment a, BreakdownAssignment b) {
//        Task aTask = a.getTask();
//        Task bTask = b.getTask();
        return new CompareToBuilder()
//                .append(aTask.getResourceUsageMultiplicand(), bTask.getResourceUsageMultiplicand())
//                .append(aTask.getPowerConsumptionMicros(), bTask.getPowerConsumptionMicros())
//                .append(aTask.getDuration(), bTask.getDuration())
//                .append(a.getId(), b.getId())
                .toComparison();
    }

}
