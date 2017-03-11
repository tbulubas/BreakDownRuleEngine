package com.tb_optimus.breakdown_ruleengine.service;

import com.google.common.collect.ImmutableMap;
import com.tb_optimus.breakdown.*;
import com.tb_optimus.breakdown_ruleengine.configuration.BreakDownRuleEngineIntTestsConfiguration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.Map;

import static org.fest.assertions.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {BreakDownRuleEngineIntTestsConfiguration.class})
public class BreakdownExecutorImplITSTest extends AbstractJUnit4SpringContextTests implements ApplicationContextAware {

    private static final Logger LOG = LoggerFactory.getLogger(BreakdownExecutorImplITSTest.class);

    private Colour red = new ColourImpl(1L, "red");
    private Colour blue = new ColourImpl(2L, "blue");
    private Colour green = new ColourImpl(3L, "green");
    private Size s32 = new SizeImpl(1L, "32");
    private Size s34 = new SizeImpl(2L, "34");
    private Size s36 = new SizeImpl(3L, "36");
    private Size s38 = new SizeImpl(4L, "38");
    private Size s40 = new SizeImpl(5L, "40");
    private Size s42 = new SizeImpl(6L, "42");

    @Autowired
    private BreakdownExecutor breakdownExecutor;

    @Before
    public void startUp() {
        LOG.info("Starting test ...");
    }

    @After
    public void tearDown() {
        LOG.info("Finishing test ...");
    }

    @Test
    public void shouldExecuteBreakdown() {
        // given
        Map<Size, Integer> redSizesOrder = ImmutableMap.<Size, Integer>builder()
                .put(s32, 10)
                .put(s34, 20)
                .put(s36, 30)
                .put(s38, 40)
                .put(s40, 30)
                .put(s42, 20).build();
        SizeOrder redOrder = new SizeOrderImpl(redSizesOrder);
        Map<Size, Integer> blueSizesOrder = ImmutableMap.<Size, Integer>builder()
                .put(s32, 10)
                .put(s34, 10)
                .put(s36, 20)
                .put(s38, 20)
                .put(s40, 30)
                .put(s42, 30).build();
        SizeOrder blueOrder = new SizeOrderImpl(blueSizesOrder);
        Map<Size, Integer> greenSizesOrder = ImmutableMap.<Size, Integer>builder()
                .put(s32, 30)
                .put(s34, 20)
                .put(s36, 30)
                .put(s38, 20)
                .put(s40, 30)
                .put(s42, 20).build();
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