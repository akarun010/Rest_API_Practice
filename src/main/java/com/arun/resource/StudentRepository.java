package com.arun.resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentRepository {
    List<Student> students = new ArrayList<>();
    public StudentRepository() {
        Student s1 = new Student(); s1.setId(1); s1.setName("Arun"); s1.setEmail("akarunff90@gmail.com");
        Student s2 = new Student(); s2.setId(2); s2.setName("Harsh"); s2.setEmail("harsh567@gmail.com");
        Student s3 = new Student(); s3.setId(3); s3.setName("Kavya"); s3.setEmail("kavikaviya@gmail.com");
        Student s4 = new Student(); s4.setId(4); s4.setName("Arya"); s4.setEmail("akaryakumar89@gmail.com");
        Student s5 = new Student(); s5.setId(5); s5.setName("Sowmiya"); s5.setEmail("chachowsomiya@gmail.com");
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

    }
    public List<Student> getStudents(){
        return students;
    }
    public Student getStudentById(int id){
        for(Student s : students){
            if(s.getId() == id){
                return  s;
            }
        }
        return null;
    }

    public List<Student> createStudent(Student student) {
        students.add(student);
        return students;
    }
}
