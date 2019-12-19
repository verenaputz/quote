package com.verenaputz.services;

import com.verenaputz.model.DatabaseAccessor;
import com.verenaputz.model.Quote;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/quotes")
public class QuoteService {
    private DatabaseAccessor databaseAccessor;

    public QuoteService(){
        this.databaseAccessor = new DatabaseAccessor();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getQuotes(){
        List<Quote> quotes = this.databaseAccessor.getQuotes();
        return Response.ok().entity(quotes).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response createQuote(){
        List<Quote> quotes = this.databaseAccessor.getQuotes();
        return Response.ok().entity(quotes).build();
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateQuote(){
        List<Quote> quotes = this.databaseAccessor.getQuotes();
        return Response.ok().entity(quotes).build();
    }


}
