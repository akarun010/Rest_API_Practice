package com.arun.resource;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/student")
public class StudentResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getMessage(){
        return  "Student API Working!";
    }
}
