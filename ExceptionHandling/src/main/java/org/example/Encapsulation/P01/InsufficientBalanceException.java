package org.example.Encapsulation.P01;

public class InsufficientBalanceException extends RuntimeException{

    public InsufficientBalanceException(String msg){
        super(msg);
    }
}
