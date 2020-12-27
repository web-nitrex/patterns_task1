package com.company;

public class CreditCardFactoryCreator{

    public static CreditCardFactory createCreditCardFactory(TypeCreditCard typeCreditCard)
    {
        switch (typeCreditCard)
        {
            case DIGITAL:
                return new DigitalCreditCardFactory();
            case GOLD_CARD_AEROFLOT:
                return new GoldCardAeroflotFactory();
            case CLASSIC:
                return new ClassicCreditCardFactory();
            default:
                throw new RuntimeException("Unkown type Credit Card");
        }
    }
}
