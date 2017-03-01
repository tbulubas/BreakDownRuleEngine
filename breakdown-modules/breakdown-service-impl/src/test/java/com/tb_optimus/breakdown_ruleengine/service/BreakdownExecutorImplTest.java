package com.tb_optimus.breakdown_ruleengine.service;

import com.google.common.collect.Lists;
import com.tb_optimus.breakdown.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.fest.assertions.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class BreakdownExecutorImplTest {

    private BreakdownExecutor breakdownExecutor = new BreakdownExecutorImpl();

    @Test
    public void shouldExecuteBreakdown() {
        // given
        Colour red = new ColourImpl(1L, "red");
        Colour blue = new ColourImpl(2L, "blue");
        Colour green = new ColourImpl(3L, "green");
        List<Colour> colours = Lists.newArrayList(red, blue, green);
        Map<Colour, SizeOrder> orderMap = new HashMap<Colour, SizeOrder>();
        ColourSizeOrder order = new ColourSizeOrderImpl(orderMap);
        // when
        Boolean executeBreakdown = breakdownExecutor.executeBreakdown(order);
        // then
        assertThat(executeBreakdown).isNotNull();
    }
}