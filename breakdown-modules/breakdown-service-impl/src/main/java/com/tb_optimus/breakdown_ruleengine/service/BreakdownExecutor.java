package com.tb_optimus.breakdown_ruleengine.service;

import com.tb_optimus.breakdown.Order;
import org.springframework.stereotype.Service;

@Service
public interface BreakdownExecutor {

    Boolean executeBreakdown(Order order);

}
