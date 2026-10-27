package org.example.Polymorphism.PO1;

import javax.smartcardio.Card;

public class CreditCard implements PaymentMethod{

    private String cardNo;
    private String CardHolderName;
    private double balance;


   CreditCard(String cardNo, String CardHolderName){
        this.CardHolderName = CardHolderName;
        this.cardNo = cardNo;
   }

    @Override
    public void pay(double amount) {
        System.out.println("Successfully Charged to " + cardNo + " Name : " + CardHolderName);
    }




}
