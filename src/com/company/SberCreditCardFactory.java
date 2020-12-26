package com.company;

public class SberCreditCardFactory implements CreditCardFactory{
    @Override
    public CreditCard createCreditCard(String firstName, String lastName, TypeCreditCard typeCreditCard)
    {
        CreditCard card=null;

        switch (typeCreditCard)
        {
            case DIGITAL:
                card = new DigitalCreditCard(firstName,lastName);
                break;
            case GOLD_CARD_AEROFLOT:
                card = new GoldCardAeroflot(firstName,lastName);
                break;
            case CLASSIC:
                card = new ClassicCreditCard(firstName,lastName);
                break;
        }

        return card;
    }
}
