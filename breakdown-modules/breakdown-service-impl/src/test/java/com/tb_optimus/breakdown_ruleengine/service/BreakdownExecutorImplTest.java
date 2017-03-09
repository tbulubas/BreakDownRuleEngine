package com.tb_optimus.breakdown_ruleengine.service;

import com.google.common.collect.ImmutableMap;
import com.tb_optimus.breakdown.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import java.util.HashMap;
import java.util.Map;

import static org.fest.assertions.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class BreakdownExecutorImplTest extends AbstractJUnit4SpringContextTests {

    private Colour red = new ColourImpl(1L, "red");
    private Colour blue = new ColourImpl(2L, "blue");
    private Colour green = new ColourImpl(3L, "green");
    private Size s32 = new SizeImpl(1L, "32");
    private Size s34 = new SizeImpl(2L, "34");
    private Size s36 = new SizeImpl(3L, "36");
    private Size s38 = new SizeImpl(4L, "38");
    private Size s40 = new SizeImpl(5L, "40");
    private Size s42 = new SizeImpl(6L, "42");

    private BreakdownExecutor breakdownExecutor;

    @Test
    public void shouldExecuteBreakdown() {
        // given
        Map<Size, Integer> redSizesOrder = ImmutableMap.<Size, Integer>builder()
                .put(s32, 10)
                .put(s34, 10)
                .put(s36, 10)
                .put(s38, 10)
                .put(s40, 10)
                .put(s42, 10).build();
        SizeOrder redOrder = new SizeOrderImpl(redSizesOrder);
        Map<Size, Integer> blueSizesOrder = ImmutableMap.<Size, Integer>builder()
                .put(s32, 20)
                .put(s34, 20)
                .put(s36, 20)
                .put(s38, 20)
                .put(s40, 20)
                .put(s42, 20).build();
        SizeOrder blueOrder = new SizeOrderImpl(blueSizesOrder);
        Map<Size, Integer> greenSizesOrder = ImmutableMap.<Size, Integer>builder()
                .put(s32, 30)
                .put(s34, 30)
                .put(s36, 30)
                .put(s38, 30)
                .put(s40, 30)
                .put(s42, 30).build();
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