package com.company;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CreditCardFactory factoryCard = new SberCreditCardFactory();

        CreditCard digitCard = factoryCard.createCreditCard("Vasya","Ivanov",TypeCreditCard.DIGITAL);
        digitCard.addBalance(BigDecimal.valueOf(15000.0));
        System.out.println(digitCard);

        CreditCard goldCard = factoryCard.createCreditCard("Mariya","Petrova",TypeCreditCard.GOLD_CARD_AEROFLOT);
        goldCard.addBalance(BigDecimal.valueOf(200000.0));
        System.out.println(goldCard);
        goldCard.subtractBalance(BigDecimal.valueOf(30000));
        System.out.println(goldCard);
    }
}
