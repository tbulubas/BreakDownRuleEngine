package com.tb_optimus.breakdown_ruleengine.service;

import com.google.common.collect.Lists;
import com.tb_optimus.breakdown.domain.ColourSizeOrder;
import com.tb_optimus.breakdown_ruleengine.solver.domain.api.Breakdown;
import com.tb_optimus.breakdown_ruleengine.solver.domain.api.BreakdownAssignment;
import com.tb_optimus.breakdown_ruleengine.solver.domain.api.BreakdownSolution;
import com.tb_optimus.breakdown_ruleengine.solver.services.api.BreakdownSolver;
import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("BreakdownExecutor")
public class BreakdownExecutorImpl implements BreakdownExecutor
{

    private static final org.slf4j.Logger LOG = LoggerFactory.getLogger(BreakdownExecutorImpl.class);

    @Autowired
    private BreakdownSolver breakdownSolver;

    @Autowired
    public BreakdownExecutorImpl() {
        LOG.info("Creating BreakdownExecutorImpl");
    }

    public Boolean executeBreakdown(ColourSizeOrder order) {

        BreakdownSolution inputSolution = new BreakdownSolution();
        List<Breakdown> breakdownList = Lists.newArrayList();
        inputSolution.setBreakdownList(breakdownList);
        List<BreakdownAssignment> breakdownAssignmentList = Lists.newArrayList();
        inputSolution.setBreakdownAssignmentList(breakdownAssignmentList);
        HardSoftScore hardSoftScore = HardSoftScore.valueOf(0, 0);
        inputSolution.setScore(hardSoftScore);
        BreakdownSolution outputSolution = breakdownSolver.solve(inputSolution);

        return Boolean.TRUE;
    }

}
