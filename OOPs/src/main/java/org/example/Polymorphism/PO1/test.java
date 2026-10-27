package org.example.Polymorphism.PO1;

public class test {
    static void main() {

        System.out.println("=== Testing Compile-Time Polymorphism ===");
        PaymentProcessor processor = new PaymentProcessor();
        processor.process_payment(100.0);
        processor.process_payment(250.0, "EUR");
        processor.process_payment(200.0, "USD", true);

        System.out.println("\n=== Testing Runtime Polymorphism (Dynamic Dispatch) ===");
        PaymentMethod[] methods = new PaymentMethod[2];
        methods[0] = new CreditCard("1234-5678-9876-5432", "Alice Smith");
        methods[1] = new PayPal("alice@example.com");


        for (PaymentMethod method : methods) {
            method.pay(150.00);
        }
    }
}
