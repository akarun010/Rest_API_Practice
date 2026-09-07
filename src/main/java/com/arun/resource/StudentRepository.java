package com.arun.resource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    MySQLConnection DConnection = new MySQLConnection();
    Connection connection = DConnection.getConnection();
    List<Student> students = new ArrayList<>();

    public List<Student> getStudents(){
        try(
                PreparedStatement statement = connection.prepareStatement("select  * from students;");
                ResultSet resultSet = statement.executeQuery()) {
            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                Student student = new Student();
                student.setId(id);
                student.setName(name);
                student.setEmail(email);
                students.add(student);
            }
            return students;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Student getStudentById(int id){
        try(PreparedStatement statement = connection.prepareStatement("select  * from students where id = ?")) {
            statement.setInt(1,id);
            try(ResultSet resultSet = statement.executeQuery()){
                Student student = new Student();
                while(resultSet.next()){
                    String name = resultSet.getString("name");
                    String email = resultSet.getString("email");
                    student.setId(id);
                    student.setName(name);
                    student.setEmail(email);
                }
                return  student;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Student> createStudent(Student student) {
        try(PreparedStatement statement = connection.prepareStatement("insert into students values(?,?,?)")){
            statement.setInt(1,student.getId());
            statement.setString(2,student.getName());
            statement.setString(3,student.getEmail());
            statement.executeUpdate();
            students.add(student);
            return students;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
