package org.example;

import org.example.model.Student;
import org.example.repository.StudentRepository;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        StudentRepository studentRepository = new StudentRepository();

      //  studentRepository.createUser();

//        studentRepository.updateUser();

       // studentRepository.deleteUser();

      //  studentRepository.getStudentById();

        //studentRepository.createStudent(new Student("ram","ram@gmail.com",23));

     studentRepository.updateStudent(new Student("yash","@gmiail.com",24),3);

    }
}
