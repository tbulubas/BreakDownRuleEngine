package com.tb_optimus.breakdown_ruleengine.service;

import com.tb_optimus.breakdown.domain.*;
import com.tb_optimus.breakdown_ruleengine.configuration.BreakDownRuleEngineIntTestsConfiguration;
import org.assertj.core.util.Sets;
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

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.fest.assertions.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {BreakDownRuleEngineIntTestsConfiguration.class})
public class BreakdownExecutorImplITSTest extends AbstractJUnit4SpringContextTests implements ApplicationContextAware {

    private static final Logger LOG = LoggerFactory.getLogger(BreakdownExecutorImplITSTest.class);

    private Colour red = new ColourImpl(1L, "red");
    private Colour blue = new ColourImpl(2L, "blue");
    private Colour green = new ColourImpl(3L, "green");
    private Size s32 = new SizeImpl("32", 10);
    private Size s34 = new SizeImpl("34", 10);
    private Size s36 = new SizeImpl("36", 10);
    private Size s38 = new SizeImpl("38", 10);
    private Size s40 = new SizeImpl("40", 10);
    private Size s42 = new SizeImpl("42", 10);

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
        Set<Size> blueSizesOrder = Sets.newHashSet(Arrays.asList(s32, s36, s38, s40, s42));
        SizeOrder blueOrder = new SizeOrderImpl(blueSizesOrder);
        Set<Size> greenSizesOrder = Sets.newHashSet(Arrays.asList(s32, s34, s38, s40, s42));
        SizeOrder greenOrder = new SizeOrderImpl(greenSizesOrder);
        Set<Size> redSizesOrder = Sets.newHashSet(Arrays.asList(s32, s34, s36, s38, s40));
        SizeOrder redOrder = new SizeOrderImpl(redSizesOrder);
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