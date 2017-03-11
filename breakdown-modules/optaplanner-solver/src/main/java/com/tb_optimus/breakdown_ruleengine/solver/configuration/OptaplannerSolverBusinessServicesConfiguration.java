package com.tb_optimus.breakdown_ruleengine.solver.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({"classpath:META-INF/spring/optaplanner-solver-context.xml"})
public class OptaplannerSolverBusinessServicesConfiguration {

}
