package com.arun.resource;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.List;

@Path("/students")
public class StudentResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Student> getStudents(){
        StudentRepository repo = new StudentRepository();
        List<Student> students = repo.getStudents();
        return students;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public Student getStudentById(@PathParam("id") int id){
        StudentRepository repo = new StudentRepository();
        Student student = repo.getStudentById(id);
        return student;
    }
}
