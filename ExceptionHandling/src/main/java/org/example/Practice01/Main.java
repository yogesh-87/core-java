package org.example.Practice01;

public class Main {
    static void main() throws InvalidAgeException {

        UserRegistration u = new UserRegistration();

        try{
            u.registerUser("yogesh",15);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
