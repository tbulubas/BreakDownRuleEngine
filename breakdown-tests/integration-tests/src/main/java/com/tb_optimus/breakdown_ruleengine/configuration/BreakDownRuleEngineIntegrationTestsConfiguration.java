package com.tb_optimus.breakdown_ruleengine.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(
        basePackageClasses = { BreakDownRuleEngineBusinessServicesConfiguration.class },
        basePackages = {""}
)
public class BreakDownRuleEngineIntegrationTestsConfiguration {

}
