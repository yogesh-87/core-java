package org.example.Polymorphism.PO1;

public class PayPal implements PaymentMethod {
   private String email;

   PayPal(String email){
       this.email = email;
   }

    @Override
    public void pay(double amount) {
        System.out.println("Amount is successfully Transfered to This " + email + " Address");
    }
}
