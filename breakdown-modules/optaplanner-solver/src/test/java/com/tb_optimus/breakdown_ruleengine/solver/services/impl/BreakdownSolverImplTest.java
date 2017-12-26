package com.tb_optimus.breakdown_ruleengine.solver.services.impl;

import com.google.common.collect.Lists;
import com.tb_optimus.breakdown_ruleengine.solver.domain.api.Breakdown;
import com.tb_optimus.breakdown_ruleengine.solver.domain.api.BreakdownAssignment;
import com.tb_optimus.breakdown_ruleengine.solver.domain.api.BreakdownSolution;
import com.tb_optimus.breakdown_ruleengine.solver.services.api.BreakdownSolver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.optaplanner.core.api.solver.Solver;

import java.util.ArrayList;
import java.util.List;

import static org.fest.assertions.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class BreakdownSolverImplTest {

    private BreakdownSolver breakdownSolver = new BreakdownSolverImpl(null);

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
        breakdownSolver.setSolverConfigResource(solverConfigResource);
        breakdownSolver.initialise();
        Solver<BreakdownSolution> solver = breakdownSolver.getSolver();
        // then
        assertThat(solver).isNotNull();
        assertThat(solver.getBestSolution()).isNull();
    }

    @Test
    public void solve() {
        // given
        String solverConfigResource = "configuration/breakdownSolverConfig.xml";
        breakdownSolver.setSolverConfigResource(solverConfigResource);
        breakdownSolver.initialise();
        BreakdownSolution startSolution = new BreakdownSolution();
        List<BreakdownAssignment> breakdownAssignments = new ArrayList<BreakdownAssignment>();
        List<Breakdown> breakdownTargets = new ArrayList<Breakdown>();
        breakdownAssignments.add(new BreakdownAssignment(new Breakdown(1, new int[]{1,1,1})));
        breakdownTargets.add(new Breakdown(1, new int[]{3,3,3}));
        startSolution.setBreakdownTargets(breakdownTargets);
        startSolution.setBreakdownAssignments(breakdownAssignments);
        startSolution.setAssignments(Lists.newArrayList(0,1,2,3));
        // when
        BreakdownSolution solve = breakdownSolver.solve(startSolution);
        // then
        assertThat(solve).isNotNull();

    }

}