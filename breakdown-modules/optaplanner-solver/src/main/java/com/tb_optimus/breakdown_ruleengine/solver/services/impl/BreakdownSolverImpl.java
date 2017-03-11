package com.tb_optimus.breakdown_ruleengine.solver.services.impl;

import com.tb_optimus.breakdown_ruleengine.solver.domain.api.BreakdownSolution;
import com.tb_optimus.breakdown_ruleengine.solver.services.api.BreakdownSolver;
import org.optaplanner.core.api.solver.Solver;
import org.optaplanner.core.api.solver.SolverFactory;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service("BreakdownSolver")
public class BreakdownSolverImpl implements BreakdownSolver {

    private static final org.slf4j.Logger LOG = LoggerFactory.getLogger(BreakdownSolverImpl.class);

    private SolverFactory<BreakdownSolution> solverFactory;

    private Solver<BreakdownSolution> solver;

    private String solverConfigResource;

    @Autowired
    public BreakdownSolverImpl(@Value("configuration/breakdownSolverConfig.xml") String solverConfigResource) {
        LOG.info("Creating BreakdownSolverImpl 3");
        this.solverConfigResource = solverConfigResource;
    }

    @PostConstruct
    public void initialise() {
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

    public String getSolverConfigResource() {
        return solverConfigResource;
    }

    public void setSolverConfigResource(String solverConfigResource) {
        this.solverConfigResource = solverConfigResource;
    }
}
