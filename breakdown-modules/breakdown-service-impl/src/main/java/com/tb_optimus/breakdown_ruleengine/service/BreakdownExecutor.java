package com.tb_optimus.breakdown_ruleengine.service;

import com.tb_optimus.breakdown.ColourSizeOrder;
import org.springframework.stereotype.Service;

@Service
public interface BreakdownExecutor {

    Boolean executeBreakdown(ColourSizeOrder order);

}
