package com.tb_optimus.breakdown_ruleengine.configuration;

import com.tb_optimus.breakdown_ruleengine.solver.configuration.OptaplannerSolverBusinessServicesConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {BreakDownRuleEngineBusinessServicesConfiguration.class,
        OptaplannerSolverBusinessServicesConfiguration.class}
)
public class BreakDownRuleEngineIntTestsConfiguration {

}
