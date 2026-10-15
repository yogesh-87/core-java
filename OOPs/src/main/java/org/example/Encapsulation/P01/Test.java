package org.example.Encapsulation.P01;

public class Test {
    static void main() {

        BankAccount Acc1 = new BankAccount("Yogesh",2000,345389);

        BankAccount Acc2 = new BankAccount("Yuvraj",1000,345387);


        try{
            Acc1.withDraw(2000);
        }catch (InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }

        Acc1.deposit(45667);

        Acc1.Details();


    }
}
