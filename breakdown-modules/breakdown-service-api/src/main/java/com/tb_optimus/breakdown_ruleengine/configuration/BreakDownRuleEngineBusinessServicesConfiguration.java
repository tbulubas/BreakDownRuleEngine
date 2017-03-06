package com.tb_optimus.breakdown_ruleengine.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({ "classpath:META-INF/spring/breakdown-ruleengine-context.xml" })
@ComponentScan(basePackages = { "com.tb_optimus.breakdown_ruleengine" } )
public class BreakDownRuleEngineBusinessServicesConfiguration {

}
