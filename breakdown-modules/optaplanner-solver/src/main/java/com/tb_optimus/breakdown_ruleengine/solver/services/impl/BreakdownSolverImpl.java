package com.tb_optimus.breakdown_ruleengine.solver.services.impl;

import com.tb_optimus.breakdown_ruleengine.solver.domain.api.BreakdownSolution;
import com.tb_optimus.breakdown_ruleengine.solver.services.api.BreakdownSolver;
import org.optaplanner.core.api.solver.Solver;
import org.optaplanner.core.api.solver.SolverFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class BreakdownSolverImpl implements BreakdownSolver {

    private SolverFactory<BreakdownSolution> solverFactory;

    private Solver<BreakdownSolution> solver;

    private String solverConfigResource;

    @Autowired
    public BreakdownSolverImpl(SolverFactory<BreakdownSolution> solverFactory, Solver<BreakdownSolution> solver) {
        this.solverFactory = solverFactory;
        this.solver = solver;
    }

    @Autowired
    public BreakdownSolverImpl(String solverConfigResource) {
        this.solverConfigResource = solverConfigResource;
        initialise(solverConfigResource);
    }

    public void initialise(String solverConfigResource) {
        this.solverFactory = SolverFactory.createFromXmlResource(solverConfigResource);
        this.solver = this.solverFactory.buildSolver();
    }

    @Override
    public BreakdownSolution solve(BreakdownSolution solution) {
        return solver.solve(solution);
    }

    public SolverFactory<BreakdownSolution> getSolverFactory() {
        return solverFactory;
    }

    public Solver<BreakdownSolution> getSolver() {
        return solver;
    }

}
