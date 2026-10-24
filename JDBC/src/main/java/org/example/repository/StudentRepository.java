package org.example.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentRepository {
    String url = "jdbc:mysql://localhost:3306/information_db";
    String username = "root";
    String password = "root";

     public void createUser(){

         try
         {
             Connection connection = DriverManager.getConnection(url,username,password);

             Statement statement = connection.createStatement();

             String sql = "Insert INTO student(name,email,age)" +
                     "VALUES('yogesh', 'y@gmail.com', 20)";

             int result = statement.executeUpdate(sql);

             if(result == 1){
                 System.out.println("Student create Successfully");
             }else{
                 System.out.println("Connection failed");
             }

             connection.close();
         }
         catch (SQLException e){
             System.out.println("Database Connection failed");
             e.printStackTrace();
         }
     }

     public void updateUser(){

         try
         {
             Connection connection = DriverManager.getConnection(url,username,password);

             Statement statement = connection.createStatement();

             String sql = "UPDATE student SET age = 21 " + "WHERE id = 1 ";

             int result = statement.executeUpdate(sql);

             if(result == 1){
                 System.out.println("Update Operation Successfully");
             }else{
                 System.out.println("Update failed");
             }

             connection.close();
         }
         catch (SQLException e){
             System.out.println("Database Connection failed");
             e.printStackTrace();
         }
     }

     public void deleteUser(){

         try
         {
             Connection connection = DriverManager.getConnection(url,username,password);

             Statement statement = connection.createStatement();

             String sql = "DELETE FROM student WHERE id = 1";

             int result = statement.executeUpdate(sql);

             if(result == 1){
                 System.out.println("Deletion Operation Successfully");
             }else{
                 System.out.println("Deletion failed");
             }

             connection.close();
         }
         catch (SQLException e){
             System.out.println("Database Connection failed");
             e.printStackTrace();
         }
     }
}
