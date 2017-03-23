package com.tb_optimus.breakdown.webapps.service.rest.com.tb_optimus.breakdown.webapps.service.rest.api.ui.impl.ui;

import com.tb_optimus.breakdown.domain.BreakdownJob;
import com.tb_optimus.breakdown.webapps.service.rest.api.ui.BreakdownController;
import org.springframework.stereotype.Component;

import javax.ws.rs.core.Response;
import java.util.List;

@Component
public class BreakdownControllerImpl implements BreakdownController {
    @Override
    public List<BreakdownJob> getBreakdownJobs(Long breakdownJobId) {
        return null;
    }

    @Override
    public Response createBreakdownJobs(List<BreakdownJob> breakdownJobs) {
        return null;
    }

    @Override
    public Response createOrUpdateBreakdownJobs(List<BreakdownJob> breakdownJobs) {
        return null;
    }

    @Override
    public Response deleteBreakdownJobs(Long breakdownJobId) {
        return null;
    }

    @Override
    public Response updateBreakdownJobs(Long breakdownJobId, List<BreakdownJob> breakdownJobs) {
        return null;
    }
}
