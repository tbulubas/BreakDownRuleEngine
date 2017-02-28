package com.tb_optimus.breakdown_ruleengine.solver.services.impl;

import com.google.common.collect.Lists;
import com.tb_optimus.breakdown_ruleengine.solver.domain.api.Breakdown;
import com.tb_optimus.breakdown_ruleengine.solver.domain.api.BreakdownSolution;
import com.tb_optimus.breakdown_ruleengine.solver.services.api.BreakdownSolver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.optaplanner.core.api.solver.Solver;
import org.optaplanner.core.api.solver.SolverFactory;

import java.util.ArrayList;
import java.util.List;

import static org.fest.assertions.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class BreakdownSolverImplTest {

    private SolverFactory<BreakdownSolution> solverFactory;
    private Solver<BreakdownSolution> solver;
    private BreakdownSolver breakdownSolver = new BreakdownSolverImpl(null, null);

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void initialise() throws Exception {
        // given
        String solverConfigResource = "configuration/breakdownSolverConfig.xml";
        // when
        breakdownSolver.initialise(solverConfigResource);
        Solver<BreakdownSolution> solver = breakdownSolver.getSolver();
        // then
        assertThat(solver).isNotNull();
        assertThat(solver.getBestSolution()).isNull();
    }

    @Test
    public void solve() throws Exception {
        // given
        String solverConfigResource = "configuration/breakdownSolverConfig.xml";
        breakdownSolver.initialise(solverConfigResource);
        Solver<BreakdownSolution> solver = breakdownSolver.getSolver();
        BreakdownSolution startSolution = new BreakdownSolution();
        List<Breakdown> breakdownList = new ArrayList<Breakdown>();
        Breakdown breakdown = new Breakdown(Lists.newArrayList(1,1,1));
        breakdownList.add(breakdown);
        startSolution.setBreakdownList(breakdownList);
        // when
        BreakdownSolution solve = breakdownSolver.solve(startSolution);
        // then
        assertThat(solve).isNotNull();

    }

}