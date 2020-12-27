package com.company;

public class DigitalCreditCardFactory implements CreditCardFactory{

    @Override
    public CreditCard createCreditCard(String firstName, String lastName)
    {
        return new DigitalCreditCard(lastName,firstName);
    }
}
