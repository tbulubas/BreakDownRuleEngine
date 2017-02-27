package com.tb_optimus.breakdown_ruleengine.service;

import com.tb_optimus.breakdown.ColourSizeOrder;
import com.tb_optimus.breakdown_ruleengine.solver.services.api.BreakdownSolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BreakdownExecutorImpl implements BreakdownExecutor
{

    @Autowired
    private BreakdownSolver breakdownSolver;

    public Boolean executeBreakdown(ColourSizeOrder order) {
        return null;
    }

}
