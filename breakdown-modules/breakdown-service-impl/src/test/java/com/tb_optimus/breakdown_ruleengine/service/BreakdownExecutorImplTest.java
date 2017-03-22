package com.tb_optimus.breakdown_ruleengine.service;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.tb_optimus.breakdown.domain.*;
import com.tb_optimus.breakdown_ruleengine.solver.services.api.BreakdownSolver;
import org.assertj.core.util.Sets;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.fest.assertions.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class BreakdownExecutorImplTest {

    private Colour red = new ColourImpl(1L, "red");
    private Colour blue = new ColourImpl(2L, "blue");
    private Colour green = new ColourImpl(3L, "green");
    private Size s32 = new SizeImpl("32", 10);
    private Size s34 = new SizeImpl("34", 20);
    private Size s36 = new SizeImpl("36", 10);
    private Size s38 = new SizeImpl("38", 20);
    private Size s40 = new SizeImpl("40", 10);
    private Size s42 = new SizeImpl("42", 20);

    @Mock
    private BreakdownSolver breakdownSolver;

    @InjectMocks
    private BreakdownExecutor breakdownExecutor = new BreakdownExecutorImpl();

    @Test
    public void shouldExecuteBreakdown() {
        // given
        // FIXME: 3/22/2017
        Set<Size> redSizesOrder = Sets.newHashSet(Arrays.asList(s32, s34, s36, s38, s40, s42));
        SizeOrder redOrder = new SizeOrderImpl(redSizesOrder);
        Set<Size> blueSizesOrder = Sets.newHashSet(Arrays.asList(s32, s34, s36, s38, s40, s42));
        SizeOrder blueOrder = new SizeOrderImpl(blueSizesOrder);
        Set<Size> greenSizesOrder = Sets.newHashSet(Arrays.asList(s32, s34, s36, s38, s40, s42));
        SizeOrder greenOrder = new SizeOrderImpl(greenSizesOrder);
        Map<Colour, SizeOrder> orderMap = new HashMap<Colour, SizeOrder>();
        orderMap.put(red, redOrder);
        orderMap.put(blue, blueOrder);
        orderMap.put(green, greenOrder);
        ColourSizeOrder order = new ColourSizeOrderImpl(orderMap);
        // when
        Boolean executeBreakdown = breakdownExecutor.executeBreakdown(order);
        // then
        assertThat(executeBreakdown).isNotNull();
    }
}