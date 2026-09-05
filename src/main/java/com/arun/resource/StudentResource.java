package com.arun.resource;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.List;

@Path("/students")
public class StudentResource {
    StudentRepository repo = new StudentRepository();
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Student> getStudents(){
        List<Student> students = repo.getStudents();
        return students;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Student> createStudent(Student student){
        List<Student> students = repo.createStudent(student);
        return students;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public Student getStudentById(@PathParam("id") int id){
        Student student = repo.getStudentById(id);
        return student;
    }
}
