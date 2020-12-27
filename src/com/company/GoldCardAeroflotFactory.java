package com.company;

public class GoldCardAeroflotFactory implements CreditCardFactory{

    @Override
    public CreditCard createCreditCard(String firstName, String lastName)
    {
        return new GoldCardAeroflot(lastName,firstName);
    }
}
