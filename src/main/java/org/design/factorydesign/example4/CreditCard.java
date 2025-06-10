package org.design.factorydesign.example4;

public class CreditCard implements PaymentType{
    @Override
    public String processPayment() {
        return "process credit card payment";
    }
}
