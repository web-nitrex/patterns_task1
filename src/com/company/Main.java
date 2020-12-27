package com.company;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        CreditCardFactory digitCardFactory = CreditCardFactoryCreator.createCreditCardFactory(TypeCreditCard.DIGITAL);
        CreditCard digitCard = digitCardFactory.createCreditCard("Vasya","Ivanov");
        digitCard.addBalance(BigDecimal.valueOf(15000.0));
        System.out.println(digitCard);


        CreditCardFactory goldCardFactory = CreditCardFactoryCreator.createCreditCardFactory(TypeCreditCard.GOLD_CARD_AEROFLOT);
        CreditCard goldCard = goldCardFactory.createCreditCard("Mariya","Petrova");
        goldCard.addBalance(BigDecimal.valueOf(200000.0));
        System.out.println(goldCard);
        goldCard.subtractBalance(BigDecimal.valueOf(30000));
        System.out.println(goldCard);
    }
}
