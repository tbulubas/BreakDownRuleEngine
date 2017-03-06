/*
 * tb-optimus.com Confidential Information:
 * Unauthorized use and disclosure strictly forbidden.
 * @2017 - tb-optimus - All Rights Reserved.
 */
package com.tb_optimus.breakdown_ruleengine.integration.configuration;

import com.tb_optimus.breakdown_ruleengine.integration.configuration.common.BreakDownRuleEngineIntTestConfigConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {BreakDownRuleEngineIntTestConfigConfiguration.class},
        basePackages = {"com.tb_optimus.breakdown_ruleengine.integration.test.impl"})
public class BreakDownRuleEngineIntegrationTestsConfiguration {

}
