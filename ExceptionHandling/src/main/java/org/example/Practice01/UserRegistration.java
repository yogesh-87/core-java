package org.example.Practice01;

public class UserRegistration {
    public void registerUser(String name, int age) throws InvalidAgeException {

        if(age < 18){
            throw new InvalidAgeException("Invalid Age");
        }else{
            System.out.println("Successfully registered");
        }
    }
}
