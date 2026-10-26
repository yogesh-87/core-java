package org.example.repository;

import org.example.model.Student;

import java.sql.*;

public class StudentRepository {
    String url = "jdbc:mysql://localhost:3306/information_db";
    String username = "root";
    String password = "root";



//     public void createStudent(){
//         try
//         {
//             Connection connection = DriverManager.getConnection(url,username,password);
//
//             Statement statement = connection.createStatement();
//
//             String sql = "Insert INTO student(name,email,age)" +
//                     "VALUES('yogesh', 'y@gmail.com', 20)";
//
//             int result = statement.executeUpdate(sql);
//
//             if(result == 1){
//                 System.out.println("Student create Successfully");
//             }else{
//                 System.out.println("Connection failed");
//             }
//
//             connection.close();
//         }
//         catch (SQLException e){
//             System.out.println("Database Connection failed");
//             e.printStackTrace();
//         }
//     }


    // using prepared Statement
    public void createStudent(Student student){


        String sql = """
                        INSERT INTO student(name,email,age)
                        VALUES(?,?,?)
                     """;
        try(
                Connection connection = DriverManager.getConnection(url,username,password);


                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                )
        {
            preparedStatement.setString(1,student.getName());
            preparedStatement.setString(2, student.getEmail());
            preparedStatement.setInt(3,student.getAge());

            int result = preparedStatement.executeUpdate();

            if(result == 1){
                System.out.println("Student created successfully");
            }else{
                System.out.println("Creation failed");
            }

            connection.close();
        }
        catch (SQLException e){
            System.out.println("Database Connection failed");
            e.printStackTrace();
        }
    }

//     public void updateStudent(){
//
//         try
//         {
//             Connection connection = DriverManager.getConnection(url,username,password);
//
//             Statement statement = connection.createStatement();
//
//             String sql = "UPDATE student SET age = 21 " + "WHERE id = 1 ";
//
//             int result = statement.executeUpdate(sql);
//
//             if(result == 1){
//                 System.out.println("Update Operation Successfully");
//             }else{
//                 System.out.println("Update failed");
//             }
//
//             connection.close();
//         }
//         catch (SQLException e){
//             System.out.println("Database Connection failed");
//             e.printStackTrace();
//         }
//     }

    // prepared statement
    public void updateStudent(Student student, long id){

        String sql = """
                UPDATE student
              SET name = ?, email = ?, age = ?
              WHERE id = ?
                """;
        try(
                Connection connection = DriverManager.getConnection(url,username,password);

                PreparedStatement preparedStatement = connection.prepareStatement(sql);

        ) {

            preparedStatement.setString(1,student.getName());
            preparedStatement.setString(2, student.getEmail());
            preparedStatement.setInt(3,student.getAge());
            preparedStatement.setLong(4,id);


            int RowAffected = preparedStatement.executeUpdate();

            if(RowAffected == 1){
                System.out.println("Update Operation Successfully");
            }else{
                System.out.println("Update failed");
            }
        }
        catch (SQLException e){
            System.out.println("Database Connection failed");
            e.printStackTrace();
        }
    }

//     public void deleteStudent(){
//
//         try
//         {
//             Connection connection = DriverManager.getConnection(url,username,password);
//
//             Statement statement = connection.createStatement();
//
//             String sql = "DELETE FROM student WHERE id = 1";
//
//             int result = statement.executeUpdate(sql);
//
//             if(result == 1){
//                 System.out.println("Deletion Operation Successfully");
//             }else{
//                 System.out.println("Deletion failed");
//             }
//
//             connection.close();
//         }
//         catch (SQLException e){
//             System.out.println("Database Connection failed");
//             e.printStackTrace();
//         }
//     }

    //Prepared Statement
    public void deleteStudent(long id){

        String sql = """
                 DELETE FROM student WHERE id = ?
                """;
        try(
                Connection connection = DriverManager.getConnection(url,username,password);
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                )
        {

            preparedStatement.setLong(1,id);


            int rowAffected = preparedStatement.executeUpdate();

            if(rowAffected == 1){
                System.out.println("Deletion Operation Successfully");
            }else{
                System.out.println("Deletion failed");
            }
        }
        catch (SQLException e){
            System.out.println("Database Connection failed");
            e.printStackTrace();
        }
    }


     public void getStudentById(long id){

        String sql = """
                SELECT id, name,email,age FROM student
                WHERE id = ?
                """;
         try(
                 Connection connection = DriverManager.getConnection(url,username,password);

                 PreparedStatement preparedStatement = connection.prepareStatement(sql);
                 )
         {


            preparedStatement.setLong(1,id);

             try(ResultSet resultSet = preparedStatement.executeQuery()){
                if(resultSet.next()){
                    Student student = mapRow(resultSet);
                    System.out.println(student);
                }
             }

         }
         catch (SQLException e){
             System.out.println("Database Connection failed");
             e.printStackTrace();
         }
     }

    public void getStudent(){

        String sql = """
                SELECT id,  name,email,age FROM student
                """;
        try(
                Connection connection = DriverManager.getConnection(url,username,password);

                PreparedStatement preparedStatement = connection.prepareStatement(sql);
        )
        {
            try(ResultSet resultSet = preparedStatement.executeQuery()){
                while(resultSet.next()){
                    Student student = mapRow(resultSet);
                    System.out.println(student);
                }
            }

        }
        catch (SQLException e){
            System.out.println("Database Connection failed");
            e.printStackTrace();
        }
    }

     Student mapRow(ResultSet resultSet) throws SQLException {

         Student student = new Student();

         student.setId(resultSet.getLong("id"));
         student.setName(resultSet.getString("name"));
         student.setEmail(resultSet.getString("email"));
         student.setAge(resultSet.getInt("age"));


         return  student;


     }
}
