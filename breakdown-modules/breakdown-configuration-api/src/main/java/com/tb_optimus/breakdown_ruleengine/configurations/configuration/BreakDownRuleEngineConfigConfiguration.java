package com.tb_optimus.breakdown_ruleengine.configuration.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {SeplIntBusinessConfiguration.class}, basePackages = {"com.tb_optimus.breakdown_ruleengine.configurations.impl"})

}
