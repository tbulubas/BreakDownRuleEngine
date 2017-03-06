package com.tb_optimus.breakdown_ruleengine.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {BreakDownRuleEngineBusinessConfiguration.class}, basePackages = {"com.tb_optimus.breakdown_ruleengine.configurations.impl"})}
public class BreakDownRuleEngineIntegrationTestsConfiguration {

}
