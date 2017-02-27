package com.tb_optimus.breakdown_ruleengine.solver.services.api;

import com.tb_optimus.breakdown_ruleengine.solver.domain.api.BreakdownSolution;
import org.optaplanner.core.api.solver.Solver;
import org.optaplanner.core.api.solver.SolverFactory;

public interface BreakdownSolver {

    void initialise(String solverConfigResource);

    BreakdownSolution solve(BreakdownSolution solution);

    SolverFactory<BreakdownSolution> getSolverFactory();

    Solver<BreakdownSolution> getSolver();

}
