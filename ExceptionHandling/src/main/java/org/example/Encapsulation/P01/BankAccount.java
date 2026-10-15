package org.example.Encapsulation.P01;

public class BankAccount {

    private String name;
    private double balance;
    private int acc_no;

    public BankAccount(){

    }

    public BankAccount(String name, double balance, int acc_no) {
        this.name = name;
        this.balance = balance;
        this.acc_no = acc_no;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withDraw(double amount){

        if(balance < amount){
            throw new InsufficientBalanceException("Insufficient Balance..............");
        }else{
            balance -= amount;
        }
    }

    public void Details(){
        System.out.println("Account Holder Name: " + this.name);
        System.out.println("Account  Number: " + this.acc_no);
        System.out.println("Account Balance: " + this.balance);
    }
}
