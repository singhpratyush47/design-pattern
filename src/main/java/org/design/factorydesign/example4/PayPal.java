package org.design.factorydesign.example4;

public class PayPal implements PaymentType{
    @Override
    public String processPayment() {
        return "process paypal payment";
    }
}
