package org.example.Polymorphism.PO1;

public class PaymentProcessor {
    void process_payment(double amount){
        System.out.println("Processing standard payment of " + amount + " USD.");
    }

    void process_payment(double amount, String currency){
        System.out.println("Processing Payment of " + amount + " " + currency + " .");
    }

    void process_payment(double amount, String currency, boolean applyDiscount){
        if (applyDiscount) {
            amount = amount * 0.9; // 10% discount
            System.out.println("Processing discounted payment of " + amount + " " + currency + " (Loyalty discount applied).");
        } else {
            process_payment(amount, currency);
        }
    }



}
