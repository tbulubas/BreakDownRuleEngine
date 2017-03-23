package com.tb_optimus.breakdown.webapps.service.rest.api.ui;

import com.tb_optimus.breakdown.domain.BreakdownJob;
import org.apache.cxf.jaxrs.ext.PATCH;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import java.util.List;

import static com.tb_optimus.breakdown.webapps.service.rest.api.properties.RestInterfaceServices.BREAKDOWN_CTXT;

@Path(BREAKDOWN_CTXT)
public interface BreakdownController {

    String BREAKDOWN_ID = "breakdownId";

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path(BREAKDOWN_CTXT)
    List<BreakdownJob> getBreakdownJobs(@PathParam(BREAKDOWN_ID) Long breakdownJobId);

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path(BREAKDOWN_CTXT)
    Response createBreakdownJobs(List<BreakdownJob> breakdownJobs);

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path(BREAKDOWN_CTXT)
    Response createOrUpdateBreakdownJobs(List<BreakdownJob> breakdownJobs);

    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path(BREAKDOWN_CTXT)
    Response deleteBreakdownJobs(@PathParam(BREAKDOWN_ID) Long breakdownJobId);

    @PATCH
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path(BREAKDOWN_CTXT)
    Response updateBreakdownJobs(@PathParam(BREAKDOWN_ID) Long breakdownJobId, List<BreakdownJob> breakdownJobs);

}
