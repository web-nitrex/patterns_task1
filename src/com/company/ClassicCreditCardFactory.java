package com.company;

public class ClassicCreditCardFactory implements CreditCardFactory{

    @Override
    public CreditCard createCreditCard(String firstName, String lastName)
    {
        return new ClassicCreditCard(lastName,firstName);
    }
}
