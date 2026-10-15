package org.example.Practice02;

public class BankTransaction {
    public static void processTransaction(Double amount){

        System.out.println("Opening Secure Conncetion.......");

        try {
            if (amount <= 0) {
                throw new IllegalArgumentException("Amout must be greater than Zero");
            }
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Closing Secure Connetion");
        }
    }
}
